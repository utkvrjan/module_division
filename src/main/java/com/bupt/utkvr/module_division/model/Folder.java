package com.bupt.utkvr.module_division.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Folder implements Serializable {

    private String folderName;

    private List<Folder> childFolders;

    private List<JavaFile> documents;

    public Folder(String folderName) {
        this.folderName = folderName;
    }
    public Folder() {

    }

}
