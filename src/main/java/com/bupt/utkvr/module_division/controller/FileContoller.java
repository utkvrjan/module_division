package com.bupt.utkvr.module_division.controller;

import com.alibaba.fastjson.JSONObject;
import com.bupt.utkvr.module_division.model.Folder;
import com.bupt.utkvr.module_division.service.impl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileContoller {

    @Autowired
    private FileServiceImpl fileService;


    @RequestMapping("/tree")
    @ResponseBody
    public Object moduleDivision(Integer roleId) {
        JSONObject jsonObject = new JSONObject();
        String path1 = "E:\\module_division\\src\\main\\java\\com\\bupt\\utkvr\\module_division";
        String path2 = "E:\\module_division\\src\\main\\java\\com\\bupt\\utkvr\\module_division\\antlr";
        String path3 = "E:\\module_division\\src\\main\\java\\com\\bupt\\utkvr\\module_division\\model";
        Folder res = fileService.processingFolder(path3);
        return JSONObject.toJSON(res);

    }

    @RequestMapping("/1")
    public String display(){
        return "index";
    }

    @RequestMapping("/2")
    public String display2(){
        return "display";
    }

}
