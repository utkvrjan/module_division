package com.bupt.utkvr.module_division.antlrHandler;

import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaBaseVisitor;
import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaParser;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBody;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBodyMember;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ConstructorDeclaration;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.MethodDeclaration;
import com.bupt.utkvr.module_division.model.classDeclaration.ClassDeclaration;
import com.bupt.utkvr.module_division.model.classDeclaration.CompilationUnit;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ExtractJavaVisitor extends JavaBaseVisitor {

    private CompilationUnit compilationUnit;

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }

    public void setCompilationUnit(CompilationUnit compilationUnit) {
        this.compilationUnit = compilationUnit;
    }

    public ExtractJavaVisitor(CompilationUnit compilationUnit) {
        this.compilationUnit = compilationUnit;
    }

    @Override
    public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        List<String> importList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.PackageDeclarationContext) {
                String str = ((JavaParser.PackageDeclarationContext) child).qualifiedName().getText();
                compilationUnit.setFilePackage(str);
            }
            if(child instanceof JavaParser.ImportDeclarationContext) {
                String str = ((JavaParser.ImportDeclarationContext) child).qualifiedName().getText();
                importList.add(str);
            }
            if(child instanceof JavaParser.TypeDeclarationContext) {
                ClassDeclaration classDeclaration =(ClassDeclaration) visit(child);
                compilationUnit.setFileTypeDeclaration(classDeclaration);
            }
        }
        compilationUnit.setImportList(importList);
        return compilationUnit;
    }

    @Override
    public String visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
        return ctx.qualifiedName().getText();
    }

    @Override
    public String visitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        return ctx.qualifiedName().getText();
    }

    @Override
    public ClassDeclaration visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {

        //todo
        boolean isPublic = false;

        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.ClassOrInterfaceModifierContext) {
                JavaParser.ClassOrInterfaceModifierContext context = (JavaParser.ClassOrInterfaceModifierContext)child;
                if(context.getText().equals("public")) isPublic = true;
            }
            if(child instanceof JavaParser.ClassDeclarationContext) {
                compilationUnit.setFileType("class");
                JavaParser.ClassDeclarationContext context = (JavaParser.ClassDeclarationContext) child;
                return (ClassDeclaration) visit(context);
            }
            //?????????????????????
            if(child instanceof JavaParser.InterfaceDeclarationContext) {
                compilationUnit.setFileType("interface");
                JavaParser.InterfaceDeclarationContext context = (JavaParser.InterfaceDeclarationContext) child;
                visit(context);
                return null;
            }
            //?????????????????????
            if(child instanceof JavaParser.EnumDeclarationContext) {
                compilationUnit.setFileType("enum");
                JavaParser.EnumDeclarationContext context = (JavaParser.EnumDeclarationContext) child;
                visit(context);
                return null;
            }
        }
        return null;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        classDeclaration.setClassName(ctx.Identifier().getText());
        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.TypeParametersContext) {
                JavaParser.TypeParametersContext context = (JavaParser.TypeParametersContext) child;
                String str = ExtractJavaTool.textToString(context);
                classDeclaration.setGenericType(str);
            }
            if(child instanceof JavaParser.TypeContext) {
                JavaParser.TypeContext context = (JavaParser.TypeContext) child;
                classDeclaration.setSuperClassName(context.getText());
            }
            if(child instanceof JavaParser.TypeListContext) {
                JavaParser.TypeListContext context = (JavaParser.TypeListContext) child;
                classDeclaration.setImplInterFaces(context.getText().split(","));
            }
            if(child instanceof JavaParser.ClassBodyContext) {
                JavaParser.ClassBodyContext context = (JavaParser.ClassBodyContext) child;
                ClassBody classBody = (ClassBody) visit(context);
                classDeclaration.setClassBody(classBody);
            }
        }
        return classDeclaration;
    }

    @Override
    public ClassBody visitClassBody(JavaParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();
        for (JavaParser.ClassBodyDeclarationContext classBodyDeclarationContext : ctx.classBodyDeclaration()) {
            String modifiers = new String();
            for (ParseTree child : classBodyDeclarationContext.children) {
                if(child instanceof JavaParser.ModifiersContext) {
                    JavaParser.ModifiersContext context = (JavaParser.ModifiersContext) child;
                    modifiers = ExtractJavaTool.textToString(context);
                }
                if(child instanceof JavaParser.MemberContext) {
                    JavaParser.MemberContext context = (JavaParser.MemberContext) child;
                    Object visit = visit(context);
                    if(visit != null) {
                        ClassBodyMember classBodyMember =(ClassBodyMember) visit;
                        classBodyMember.setModifiers(modifiers);
                        boolean re = classBody.addMember(classBodyMember);
                        if(!re) log.error("??????"+compilationUnit.getFileName()+"???member:"+classBodyMember+":??????classBody??????");
                    }
                    modifiers = new String();
                }
                if(child instanceof JavaParser.BlockContext) {
                    JavaParser.BlockContext context = (JavaParser.BlockContext) child;
                    Object visit = visit(context);
                    if(visit != null) {
                        ClassBodyMember classBodyMember =(ClassBodyMember) visit;
                        boolean re = classBody.addMember(classBodyMember);
                        if(!re) log.error("??????"+compilationUnit.getFileName()+"???block:"+classBodyMember+":??????classBody??????");
                    }
                }
            }
        }
        return classBody;
    }

    @Override
    public ClassBodyMember visitMember(JavaParser.MemberContext ctx) {
        ClassBodyMember member;
        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.GenericMethodDeclarationContext) {
                JavaParser.GenericMethodDeclarationContext context = (JavaParser.GenericMethodDeclarationContext) child;
                member = (MethodDeclaration) visit(context.methodDeclaration());
                return member;
            }
            if(child instanceof JavaParser.MethodDeclarationContext) {
                JavaParser.MethodDeclarationContext context = (JavaParser.MethodDeclarationContext) child;
                member = (MethodDeclaration) visit(context);
                return member;
            }
            if(child instanceof JavaParser.ConstructorDeclarationContext) {
                JavaParser.ConstructorDeclarationContext context = (JavaParser.ConstructorDeclarationContext) child;
                member = (ConstructorDeclaration) visit(context);
                return member;
            }
            if(child instanceof JavaParser.ClassDeclarationContext) {
                JavaParser.ClassDeclarationContext context = (JavaParser.ClassDeclarationContext) child;
                member = (ClassDeclaration) visit(context);
                return member;
            }
            if(child instanceof JavaParser.FieldDeclarationContext) {
                JavaParser.FieldDeclarationContext context = (JavaParser.FieldDeclarationContext) child;
                visit(context);
            }
            if(child instanceof JavaParser.InterfaceDeclarationContext) {
                JavaParser.InterfaceDeclarationContext context = (JavaParser.InterfaceDeclarationContext) child;
                visit(context);
            }
        }
        return null;
    }

    @Override
    public ClassBodyMember visitBlock(JavaParser.BlockContext ctx) {
        ClassBodyMember member;
        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.BlockStatementContext) {
                JavaParser.BlockStatementContext context = (JavaParser.BlockStatementContext) child;
                member = (ClassBodyMember) visit(context);
                return member;
            }
        }
        return null;

    }

    @Override
    public ClassBodyMember visitBlockStatement(JavaParser.BlockStatementContext ctx) {
        ClassBodyMember member;
        for (ParseTree child : ctx.children) {
            if(child instanceof JavaParser.ClassDeclarationContext) {
                JavaParser.ClassDeclarationContext context = (JavaParser.ClassDeclarationContext) child;
                member = (ClassBodyMember) visit(context);
                return member;
            }
            if(child instanceof JavaParser.LocalVariableDeclarationStatementContext) {
                JavaParser.LocalVariableDeclarationStatementContext context = (JavaParser.LocalVariableDeclarationStatementContext) child;
                visit(context);
            }
            if(child instanceof JavaParser.InterfaceDeclarationContext) {
                JavaParser.InterfaceDeclarationContext context = (JavaParser.InterfaceDeclarationContext) child;
                visit(context);
            }
            if(child instanceof JavaParser.StatementContext) {
                JavaParser.StatementContext context = (JavaParser.StatementContext) child;
                visit(context);
            }
        }
        return null;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        visitChildren(ctx);
        MethodDeclaration method = new MethodDeclaration();
        if(ctx.type() == null) {
            method.setType("void");
        } else {
            method.setType(ctx.type().getText());
        }
        method.setMethodName(ctx.Identifier().getText());
        String formalParameter = ExtractJavaTool.textToString(ctx.formalParameters());
        method.setParameters(formalParameter);
        JavaParser.MethodBodyContext methodBodyContext = ctx.methodDeclarationRest().methodBody();
        if(methodBodyContext != null) {
            String body = ExtractJavaTool.textToString(methodBodyContext);
            method.setMethodBody(body);
        }
        return method;
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        visitChildren(ctx);
        ConstructorDeclaration constructor = new ConstructorDeclaration();
        JavaParser.TypeParametersContext typeParameters = ctx.typeParameters();
        if(typeParameters != null) {
            constructor.setTypeParameters(typeParameters.getText());
        }
        constructor.setName(ctx.Identifier().getText());
        constructor.setParameters(ctx.formalParameters().getText());
        String constructorBody = ExtractJavaTool.textToString(ctx.constructorBody());
        constructor.setConstructorBody(constructorBody);
        return constructor;
    }

}
