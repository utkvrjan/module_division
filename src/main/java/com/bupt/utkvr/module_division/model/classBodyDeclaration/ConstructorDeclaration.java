package com.bupt.utkvr.module_division.model.classBodyDeclaration;


import lombok.Data;

//构造函数类
@Data
public class ConstructorDeclaration implements ClassBodyMember {

    //修饰符
    private String modifiers;

    //泛型类型
    private String typeParameters;

    //名称
    private String name;

    //参数
    private String parameters;

    //函数体
    private String constructorBody;

    @Override
    public void setModifiers(String str) {

    }
}
