package com.bupt.utkvr.module_division.controller;

import com.bupt.utkvr.module_division.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileContoller {

    @Autowired
    private FileServiceImpl fileService;


    @RequestMapping("/md")
    public String moduleDivision() {
        String path = "E:\\module_division\\src\\main\\java\\com\\bupt\\utkvr\\module_division\\service";
        String res = fileService.processingFolder(path);
        return res;
    }

}
