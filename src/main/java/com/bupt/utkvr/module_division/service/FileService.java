package com.bupt.utkvr.module_division.service;

import com.bupt.utkvr.module_division.model.Folder;
import com.bupt.utkvr.module_division.model.JavaFile;

import java.io.File;
import java.io.IOException;

public interface FileService {

    public Folder traverseFolder(String path) throws IOException;

    public JavaFile filePartition(File file) throws IOException;

    public String processingFolder(String path);
}
