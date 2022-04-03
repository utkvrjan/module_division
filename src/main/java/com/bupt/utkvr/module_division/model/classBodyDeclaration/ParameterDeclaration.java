package com.bupt.utkvr.module_division.model.classBodyDeclaration;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ParameterDeclaration {

    @JSONField(name = "参数类型",ordinal = 1)
    private String type;

    @JSONField(name = "参数名",ordinal = 2)
    private String parameterName;

    public ParameterDeclaration(String type, String parameterName) {
        this.type = type;
        this.parameterName = parameterName;
    }

    public ParameterDeclaration() {

    }
}
