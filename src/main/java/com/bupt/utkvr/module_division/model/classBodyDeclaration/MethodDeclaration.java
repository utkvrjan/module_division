package com.bupt.utkvr.module_division.model.classBodyDeclaration;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MethodDeclaration implements ClassBodyMember {

    //修饰符
    @JSONField(name = "函数修饰符",ordinal = 1)
    private String modifiers;

    //返回类型
    @JSONField(name = "函数返回类型",ordinal = 2)
    private String type;

    //方法名
    @JSONField(name = "函数名称",ordinal = 3)
    private String methodName;

    //入参
    //private List<ParameterDeclaration> parameters;
    @JSONField(name = "函数入参",ordinal = 4)
    private String parameters;

    //函数体
    @JSONField(name = "函数体",ordinal = 5)
    private String methodBody;



}
