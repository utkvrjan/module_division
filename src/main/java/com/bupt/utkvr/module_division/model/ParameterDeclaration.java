package com.bupt.utkvr.module_division.model;

import lombok.Data;

@Data
public class ParameterDeclaration {

    private String type;

    private String parameterName;

    public ParameterDeclaration(String type, String parameterName) {
        this.type = type;
        this.parameterName = parameterName;
    }

    public ParameterDeclaration() {

    }
}
