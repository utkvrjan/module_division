package com.bupt.utkvr.module_division.model.classDeclaration;

import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBody;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBodyMember;
import lombok.Data;

@Data
//Java类定义
public class ClassDeclaration implements FileTypeDeclaration, ClassBodyMember {

    //修饰符
    private String modifiers;

    //类名
    private String className;

    //类运用的泛型
    private String genericType;

    //父类名称
    private String superClassName;

    //实现的接口名称
    private String[] implInterFaces;

    //类体
    private ClassBody classBody;
}
