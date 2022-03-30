package com.bupt.utkvr.module_division.antlrHandler;

import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaBaseVisitor;
import com.bupt.utkvr.module_division.antlr.javaAntlr.JavaParser;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBody;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ClassBodyMember;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.ConstructorDeclaration;
import com.bupt.utkvr.module_division.model.classBodyDeclaration.MethodDeclaration;
import com.bupt.utkvr.module_division.model.classDeclaration.ClassDeclaration;
import com.bupt.utkvr.module_division.model.classDeclaration.CompilationUnit;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class ExtractJavaVisitor extends JavaBaseVisitor {

    CompilationUnit compilationUnit = new CompilationUnit();

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
            //如果是接口文件
            if(child instanceof JavaParser.InterfaceDeclarationContext) {
                compilationUnit.setFileType("interface");
                return null;
            }
            //如果是枚举文件
            if(child instanceof JavaParser.EnumDeclarationContext) {
                compilationUnit.setFileType("enum");
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
                classDeclaration.setGenericType(context.getText());
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
                    modifiers = context.getText();
                }
                if(child instanceof JavaParser.MemberContext) {
                    JavaParser.MemberContext context = (JavaParser.MemberContext) child;
                    Object visit = visit(context);
                    if(visit != null) {
                        ClassBodyMember classBodyMember =(ClassBodyMember) visit(context);
                    }
                }
                if(child instanceof JavaParser.BlockContext) {
                    JavaParser.BlockContext context = (JavaParser.BlockContext) child;

                }
            }
        }
        return null;
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
        }
        return null;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {


        return null;
    }

    @Override
    public Object visitMethodDeclarationRest(JavaParser.MethodDeclarationRestContext ctx) {
        return super.visitMethodDeclarationRest(ctx);
    }

    @Override
    public Object visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
        return super.visitGenericMethodDeclaration(ctx);
    }

    @Override
    public Object visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public Object visitVoidMethodDeclaratorRest(JavaParser.VoidMethodDeclaratorRestContext ctx) {
        return super.visitVoidMethodDeclaratorRest(ctx);
    }
}
