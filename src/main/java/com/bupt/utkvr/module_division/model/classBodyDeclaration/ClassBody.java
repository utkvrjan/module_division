package com.bupt.utkvr.module_division.model.classBodyDeclaration;

import com.bupt.utkvr.module_division.model.classDeclaration.ClassDeclaration;
import com.bupt.utkvr.module_division.model.classDeclaration.InterfaceDeclaration;
import lombok.Data;

import java.util.List;

@Data
public class ClassBody {
    //内部类定义
    private List<ClassDeclaration> innerClassList;

    //内部接口定义
    //private List<InterfaceDeclaration> innerInterfaceList;

    //构造函数
    private List<ConstructorDeclaration> constructorList;

    //静态函数
    private List<MethodDeclaration> staticMethodList;

    //非静态函数
    private List<MethodDeclaration> nonStaticMethodList;
}