package com.bupt.utkvr.module_division.service;

import com.bupt.utkvr.module_division.model.Folder;
import com.bupt.utkvr.module_division.model.JavaFile;
import com.bupt.utkvr.module_division.model.classDeclaration.CompilationUnit;

import java.io.File;
import java.io.IOException;

public interface FileService {

    public Folder traverseFolder(String path) throws IOException;

    public CompilationUnit filePartition(File file) throws IOException;

    public String processingFolder(String path);
}
