package com.bupt.utkvr.module_division.model.classDeclaration;

import com.alibaba.fastjson.annotation.JSONField;
import com.bupt.utkvr.module_division.model.classDeclaration.FileTypeDeclaration;
import lombok.Data;

import java.util.List;

@Data
//文件总体
public class CompilationUnit {

    //当前文件所在包
    @JSONField(name = "package")
    private String filePackage;

    //引入的包
    @JSONField(name = "import")
    private List<String> importList;


    private String fileType;  // class , interface , enum

    private FileTypeDeclaration fileTypeDeclaration;

    private String fileName;
}
