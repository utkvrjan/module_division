package com.bupt.utkvr.module_division.model.classBodyDeclaration;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

//构造函数类
@Data
public class ConstructorDeclaration implements ClassBodyMember {

    //修饰符
    @JSONField(name = "构造函数修饰符",ordinal = 1)
    private String modifiers;

    //泛型类型
    @JSONField(name = "构造函数泛型",ordinal = 2)
    private String typeParameters;

    //名称
    @JSONField(name = "构造函数名",ordinal = 3)
    private String name;

    //参数
    @JSONField(name = "构造函数参数",ordinal = 4)
    private String parameters;

    //函数体
    @JSONField(name = "构造函数体",ordinal = 5)
    private String constructorBody;

}
