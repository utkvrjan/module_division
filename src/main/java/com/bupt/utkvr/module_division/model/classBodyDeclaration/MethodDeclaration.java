package com.bupt.utkvr.module_division.model.classBodyDeclaration;

import com.bupt.utkvr.module_division.model.ParameterDeclaration;
import lombok.Data;

import java.util.List;

@Data
public class MethodDeclaration implements ClassBodyMember {

    //修饰符
    private String modifiers;

    //返回类型
    private String type;

    //方法名
    private String methodName;

    //入参
    private List<ParameterDeclaration> parameters;

}
