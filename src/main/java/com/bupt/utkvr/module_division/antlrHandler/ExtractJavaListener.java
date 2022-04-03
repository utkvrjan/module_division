package com.bupt.utkvr.module_division.antlrHandler;

import com.alibaba.fastjson.JSONObject;
import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaBaseListener;
import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaParser;
import com.bupt.utkvr.module_division.model.JavaFile;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.MethodDeclaration;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ParameterDeclaration;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.TokenStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class ExtractJavaListener extends JavaBaseListener {

    private JavaParser parser;

    private JavaFile javaFile;

    public ExtractJavaListener(JavaParser parser, JavaFile javaFile) {
        this.parser = parser;
        this.javaFile = javaFile;
    }

    public JavaParser getParser() {
        return parser;
    }

    public void setParser(JavaParser parser) {
        this.parser = parser;
    }

    public JavaFile getJavaFile() {
        return javaFile;
    }

    public void setJavaFile(JavaFile javaFile) {
        this.javaFile = javaFile;
    }

    public ExtractJavaListener(JavaParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        log.info("enterClassDeclaration : "+ctx.Identifier().getText());
        TokenStream tokenStream = parser.getTokenStream();
        String type = "无";
        if(ctx.type() != null) {
            type = tokenStream.getText(ctx.type());
        }
        javaFile.setClassDeclaration(type);
        javaFile.setFileName(ctx.Identifier().getText());
    }

    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        log.info(ctx.Identifier().getText()+"解析完成");
    }

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();
        methodDeclaration.setMethodName(ctx.Identifier().getText());
        TokenStream tokenStream = parser.getTokenStream();
        String type = "void";
        if(ctx.type() != null) {
            type = tokenStream.getText(ctx.type());
        }
        log.info("遍历到方法：\t"+type+" "+ctx.Identifier());
        methodDeclaration.setType(type);
        ArrayList<ParameterDeclaration> list = new ArrayList<>();
        JavaParser.FormalParameterDeclsContext formalParameterDeclsContext = ctx.formalParameters().formalParameterDecls();
        List<ParameterDeclaration> parameterList = new ArrayList<>();
        if(formalParameterDeclsContext != null) {
            parameterList = ExtractJavaTool.getParameterByDecls(formalParameterDeclsContext, parser, list);
        }
        //todo 监听器这个位置需要改。
        methodDeclaration.setParameters(JSONObject.toJSONString(parameterList));
        javaFile.getMethodDeclarations().add(methodDeclaration);
    }


}
