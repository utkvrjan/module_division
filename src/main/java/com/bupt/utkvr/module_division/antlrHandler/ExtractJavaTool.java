package com.bupt.utkvr.module_division.antlrHandler;

import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaLexer;
import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaParser;
import com.bupt.utkvr.module_division.model.JavaFile;
import com.bupt.utkvr.module_division.model.ParameterDeclaration;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExtractJavaTool {
    public static JavaFile getfilePartiton(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
        ANTLRInputStream input = new ANTLRInputStream(fileInputStream);
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        JavaFile javaFile = new JavaFile(file.getName(),new ArrayList<>());
        ExtractJavaListener javaListener = new ExtractJavaListener(parser,javaFile);
        walker.walk(javaListener,tree);
        return javaListener.getJavaFile();
    }

    public static List<ParameterDeclaration> getParameterByDecls(JavaParser.FormalParameterDeclsContext formalParameterDeclsContext,
                                                                 JavaParser parser, List<ParameterDeclaration> list) {
        TokenStream tokenStream = parser.getTokenStream();
        String type = tokenStream.getText(formalParameterDeclsContext.type());
        JavaParser.FormalParameterDeclsRestContext formalParameterDeclsRestContext = formalParameterDeclsContext.formalParameterDeclsRest();
        String parameterName = tokenStream.getText(formalParameterDeclsRestContext.variableDeclaratorId());
        ParameterDeclaration parameter = new ParameterDeclaration(type,parameterName);
        list.add(parameter);
        JavaParser.FormalParameterDeclsContext paramDecls  = formalParameterDeclsRestContext.formalParameterDecls();
        if(paramDecls == null)  return list;
        return getParameterByDecls(paramDecls,parser,list);
    }
}
