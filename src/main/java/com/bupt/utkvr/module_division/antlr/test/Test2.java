package com.bupt.utkvr.module_division.antlr.test;

import com.alibaba.fastjson.JSONObject;
import com.bupt.utkvr.module_division.antlrHandler.ExtractJavaTool;
import com.bupt.utkvr.module_division.model.Folder;
import com.bupt.utkvr.module_division.model.classDeclaration.CompilationUnit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static Folder traverseFolder(String path) throws IOException {
        File folder = new File(path);
        if(!folder.exists()) {
            //log.error("文件夹不存在！");
            return null;
        }
        Folder resFolder = new Folder(folder.getName());
        File[] files = folder.listFiles();
        if (null == files || files.length == 0) {
            //log.warn("文件夹是空的!");
        }
        List<Folder> childFolders = new ArrayList();
        List<CompilationUnit> documents = new ArrayList<CompilationUnit>();
        for (File file : files) {
            if (file.isDirectory()) {
                //log.info("遍历到文件夹:" + file.getAbsolutePath());
                Folder children = traverseFolder(file.getAbsolutePath());
                childFolders.add(children);
            }
            if(file.isFile()) {
                //log.info("遍历到文件:" + file.getAbsolutePath());
                CompilationUnit compilationUnit = filePartition(file);
                documents.add(compilationUnit);
            }
        }
        resFolder.setChildFolders(childFolders);
        resFolder.setDocuments(documents);
        return resFolder;
    }

    public static CompilationUnit filePartition(File file) throws IOException {
        if(!file.getName().endsWith(".java")) return new CompilationUnit(file.getName());
        CompilationUnit compilationUnit = ExtractJavaTool.getfilePartiton(file);
        return compilationUnit;
    }


    public synchronized String processingFolder(String path) {
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
