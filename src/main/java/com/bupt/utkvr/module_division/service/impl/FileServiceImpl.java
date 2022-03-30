package com.bupt.utkvr.module_division.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bupt.utkvr.module_division.antlrHandler.ExtractJavaTool;
import com.bupt.utkvr.module_division.model.Folder;
import com.bupt.utkvr.module_division.model.JavaFile;
import com.bupt.utkvr.module_division.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FileServiceImpl implements FileService {
    @Override
    public Folder traverseFolder(String path) throws IOException {
        File folder = new File(path);
        if(!folder.exists()) {
            log.error("文件夹不存在！");
            return null;
        }
        Folder resFolder = new Folder(folder.getName());
        File[] files = folder.listFiles();
        if (null == files || files.length == 0) {
            log.warn("文件夹是空的!");
        }
        List<Folder> childFolders = new ArrayList<>();
        List<JavaFile> documents = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                log.info("遍历到文件夹:" + file.getAbsolutePath());
                Folder children = traverseFolder(file.getAbsolutePath());
                childFolders.add(children);
            }
            if(file.isFile()) {
                log.info("遍历到文件:" + file.getAbsolutePath());
                JavaFile javaFile = filePartition(file);
                documents.add(javaFile);
            }
        }
        resFolder.setChildFolders(childFolders);
        resFolder.setDocuments(documents);
        return resFolder;
    }

    @Override
    public JavaFile filePartition(File file) throws IOException {
        if(!file.getName().endsWith(".java")) return new JavaFile(file.getName(),new ArrayList<>());
        JavaFile javaFile = ExtractJavaTool.getfilePartiton(file);
        return javaFile;
    }


    @Override
    public String processingFolder(String path) {
        Folder folder = new Folder();
        try {
            folder = traverseFolder(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String res = JSONObject.toJSONString(folder);
        return res;
    }
}
