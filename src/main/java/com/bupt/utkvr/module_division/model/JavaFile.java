package com.bupt.utkvr.module_division.model;

import com.bupt.utkvr.module_division.model.classBodyDeclaration.ConstructorDeclaration;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.MethodDeclaration;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class JavaFile implements Serializable {

    private String fileName;

    private String classDeclaration;

    private List<MethodDeclaration> methodDeclarations;

    private List<ConstructorDeclaration> constructorDeclarations;

    public JavaFile(String fileName,List<MethodDeclaration> methodDeclarations) {
        this.fileName = fileName;
        this.methodDeclarations = methodDeclarations;
    }

    public JavaFile() {

    }
}
