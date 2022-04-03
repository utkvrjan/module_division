// Generated from E:/module_division/src/main/resources/antlr/javaAntlr\Java.g4 by ANTLR 4.9.2
package com.bupt.utkvr.module_division.antlr.javaAntlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, HexLiteral=90, DecimalLiteral=91, OctalLiteral=92, 
		FloatingPointLiteral=93, CharacterLiteral=94, StringLiteral=95, ENUM=96, 
		ASSERT=97, Identifier=98, COMMENT=99, WS=100, LINE_COMMENT=101;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classDeclaration = 4, RULE_enumDeclaration = 5, 
		RULE_interfaceDeclaration = 6, RULE_classOrInterfaceModifier = 7, RULE_modifiers = 8, 
		RULE_typeParameters = 9, RULE_typeParameter = 10, RULE_typeBound = 11, 
		RULE_enumBody = 12, RULE_enumConstants = 13, RULE_enumConstant = 14, RULE_enumBodyDeclarations = 15, 
		RULE_normalInterfaceDeclaration = 16, RULE_typeList = 17, RULE_classBody = 18, 
		RULE_interfaceBody = 19, RULE_classBodyDeclaration = 20, RULE_member = 21, 
		RULE_methodDeclaration = 22, RULE_methodDeclarationRest = 23, RULE_genericMethodDeclaration = 24, 
		RULE_fieldDeclaration = 25, RULE_constructorDeclaration = 26, RULE_interfaceBodyDeclaration = 27, 
		RULE_interfaceMemberDecl = 28, RULE_interfaceMethodOrFieldDecl = 29, RULE_interfaceMethodOrFieldRest = 30, 
		RULE_voidMethodDeclaratorRest = 31, RULE_interfaceMethodDeclaratorRest = 32, 
		RULE_interfaceGenericMethodDecl = 33, RULE_voidInterfaceMethodDeclaratorRest = 34, 
		RULE_constantDeclarator = 35, RULE_variableDeclarators = 36, RULE_variableDeclarator = 37, 
		RULE_constantDeclaratorsRest = 38, RULE_constantDeclaratorRest = 39, RULE_variableDeclaratorId = 40, 
		RULE_variableInitializer = 41, RULE_arrayInitializer = 42, RULE_modifier = 43, 
		RULE_packageOrTypeName = 44, RULE_enumConstantName = 45, RULE_typeName = 46, 
		RULE_type = 47, RULE_classOrInterfaceType = 48, RULE_primitiveType = 49, 
		RULE_variableModifier = 50, RULE_typeArguments = 51, RULE_typeArgument = 52, 
		RULE_qualifiedNameList = 53, RULE_formalParameters = 54, RULE_formalParameterDecls = 55, 
		RULE_formalParameterDeclsRest = 56, RULE_methodBody = 57, RULE_constructorBody = 58, 
		RULE_explicitConstructorInvocation = 59, RULE_qualifiedName = 60, RULE_literal = 61, 
		RULE_integerLiteral = 62, RULE_booleanLiteral = 63, RULE_annotations = 64, 
		RULE_annotation = 65, RULE_annotationName = 66, RULE_elementValuePairs = 67, 
		RULE_elementValuePair = 68, RULE_elementValue = 69, RULE_elementValueArrayInitializer = 70, 
		RULE_annotationTypeDeclaration = 71, RULE_annotationTypeBody = 72, RULE_annotationTypeElementDeclaration = 73, 
		RULE_annotationTypeElementRest = 74, RULE_annotationMethodOrConstantRest = 75, 
		RULE_annotationMethodRest = 76, RULE_annotationConstantRest = 77, RULE_defaultValue = 78, 
		RULE_block = 79, RULE_blockStatement = 80, RULE_localVariableDeclarationStatement = 81, 
		RULE_localVariableDeclaration = 82, RULE_variableModifiers = 83, RULE_statement = 84, 
		RULE_catches = 85, RULE_catchClause = 86, RULE_formalParameter = 87, RULE_switchBlock = 88, 
		RULE_switchBlockStatementGroup = 89, RULE_switchLabel = 90, RULE_forControl = 91, 
		RULE_forInit = 92, RULE_enhancedForControl = 93, RULE_forUpdate = 94, 
		RULE_parExpression = 95, RULE_expressionList = 96, RULE_statementExpression = 97, 
		RULE_constantExpression = 98, RULE_expression = 99, RULE_primary = 100, 
		RULE_creator = 101, RULE_createdName = 102, RULE_innerCreator = 103, RULE_explicitGenericInvocation = 104, 
		RULE_arrayCreatorRest = 105, RULE_classCreatorRest = 106, RULE_nonWildcardTypeArguments = 107, 
		RULE_arguments = 108;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classDeclaration", "enumDeclaration", "interfaceDeclaration", "classOrInterfaceModifier", 
			"modifiers", "typeParameters", "typeParameter", "typeBound", "enumBody", 
			"enumConstants", "enumConstant", "enumBodyDeclarations", "normalInterfaceDeclaration", 
			"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "member", 
			"methodDeclaration", "methodDeclarationRest", "genericMethodDeclaration", 
			"fieldDeclaration", "constructorDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDecl", "interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", 
			"voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", "interfaceGenericMethodDecl", 
			"voidInterfaceMethodDeclaratorRest", "constantDeclarator", "variableDeclarators", 
			"variableDeclarator", "constantDeclaratorsRest", "constantDeclaratorRest", 
			"variableDeclaratorId", "variableInitializer", "arrayInitializer", "modifier", 
			"packageOrTypeName", "enumConstantName", "typeName", "type", "classOrInterfaceType", 
			"primitiveType", "variableModifier", "typeArguments", "typeArgument", 
			"qualifiedNameList", "formalParameters", "formalParameterDecls", "formalParameterDeclsRest", 
			"methodBody", "constructorBody", "explicitConstructorInvocation", "qualifiedName", 
			"literal", "integerLiteral", "booleanLiteral", "annotations", "annotation", 
			"annotationName", "elementValuePairs", "elementValuePair", "elementValue", 
			"elementValueArrayInitializer", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeElementDeclaration", "annotationTypeElementRest", "annotationMethodOrConstantRest", 
			"annotationMethodRest", "annotationConstantRest", "defaultValue", "block", 
			"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"variableModifiers", "statement", "catches", "catchClause", "formalParameter", 
			"switchBlock", "switchBlockStatementGroup", "switchLabel", "forControl", 
			"forInit", "enhancedForControl", "forUpdate", "parExpression", "expressionList", 
			"statementExpression", "constantExpression", "expression", "primary", 
			"creator", "createdName", "innerCreator", "explicitGenericInvocation", 
			"arrayCreatorRest", "classCreatorRest", "nonWildcardTypeArguments", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "';'", "'import'", "'static'", "'.'", "'*'", "'class'", 
			"'extends'", "'implements'", "'public'", "'protected'", "'private'", 
			"'abstract'", "'final'", "'strictfp'", "'<'", "','", "'>'", "'&'", "'{'", 
			"'}'", "'interface'", "'['", "']'", "'void'", "'throws'", "'='", "'native'", 
			"'synchronized'", "'transient'", "'volatile'", "'boolean'", "'char'", 
			"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", 
			"'super'", "'('", "')'", "'...'", "'this'", "'null'", "'true'", "'false'", 
			"'@'", "'default'", "':'", "'if'", "'else'", "'for'", "'while'", "'do'", 
			"'try'", "'finally'", "'switch'", "'return'", "'throw'", "'break'", "'continue'", 
			"'catch'", "'case'", "'new'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'/'", "'%'", "'instanceof'", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", 
			"'^='", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'%='", null, 
			null, null, null, null, null, "'enum'", "'assert'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "HexLiteral", "DecimalLiteral", "OctalLiteral", 
			"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "ENUM", 
			"ASSERT", "Identifier", "COMMENT", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(218);
				packageDeclaration();
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(221);
				importDeclaration();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__21) | (1L << T__48))) != 0) || _la==ENUM) {
				{
				{
				setState(227);
				typeDeclaration();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__0);
			setState(236);
			qualifiedName();
			setState(237);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__2);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(240);
				match(T__3);
				}
			}

			setState(243);
			qualifiedName();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(244);
				match(T__4);
				setState(245);
				match(T__5);
				}
			}

			setState(248);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		try {
			int _alt;
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__21:
			case T__48:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						classOrInterfaceModifier();
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(259);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(256);
					classDeclaration();
					}
					break;
				case T__21:
				case T__48:
					{
					setState(257);
					interfaceDeclaration();
					}
					break;
				case ENUM:
					{
					setState(258);
					enumDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__6);
			setState(265);
			match(Identifier);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(266);
				typeParameters();
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(269);
				match(T__7);
				setState(270);
				type();
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(273);
				match(T__8);
				setState(274);
				typeList();
				}
			}

			setState(277);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ENUM);
			setState(280);
			match(Identifier);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(281);
				match(T__8);
				setState(282);
				typeList();
				}
			}

			setState(285);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDeclaration);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				normalInterfaceDeclaration();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceModifier);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				annotation();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(T__12);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(T__3);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				match(T__13);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					modifier();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__15);
			setState(308);
			typeParameter();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(309);
				match(T__16);
				setState(310);
				typeParameter();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Identifier);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(319);
				match(T__7);
				setState(320);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			type();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(324);
				match(T__18);
				setState(325);
				type();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__19);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48 || _la==Identifier) {
				{
				setState(332);
				enumConstants();
				}
			}

			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(335);
				match(T__16);
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(338);
				enumBodyDeclarations();
				}
			}

			setState(341);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			enumConstant();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					match(T__16);
					setState(345);
					enumConstant();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(351);
				annotations();
				}
			}

			setState(354);
			match(Identifier);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(355);
				arguments();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(358);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__1);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__48))) != 0) || _la==Identifier) {
				{
				{
				setState(362);
				classBodyDeclaration();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__21);
			setState(369);
			match(Identifier);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(370);
				typeParameters();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(373);
				match(T__7);
				setState(374);
				typeList();
				}
			}

			setState(377);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			type();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(380);
				match(T__16);
				setState(381);
				type();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__19);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__48))) != 0) || _la==Identifier) {
				{
				{
				setState(388);
				classBodyDeclaration();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__19);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__21) | (1L << T__24) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__48))) != 0) || _la==Identifier) {
				{
				{
				setState(397);
				interfaceBodyDeclaration();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(406);
					match(T__3);
					}
				}

				setState(409);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				modifiers();
				setState(411);
				member();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_member);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				genericMethodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(420);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodDeclarationRestContext methodDeclarationRest() {
			return getRuleContext(MethodDeclarationRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodDeclaration);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				type();
				setState(424);
				match(Identifier);
				setState(425);
				formalParameters();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(426);
					match(T__22);
					setState(427);
					match(T__23);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				methodDeclarationRest();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(T__24);
				setState(436);
				match(Identifier);
				setState(437);
				formalParameters();
				setState(438);
				methodDeclarationRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationRestContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarationRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclarationRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclarationRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclarationRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationRestContext methodDeclarationRest() throws RecognitionException {
		MethodDeclarationRestContext _localctx = new MethodDeclarationRestContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodDeclarationRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(442);
				match(T__25);
				setState(443);
				qualifiedNameList();
				}
			}

			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				{
				setState(446);
				methodBody();
				}
				break;
			case T__1:
				{
				setState(447);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			typeParameters();
			setState(451);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			type();
			setState(454);
			variableDeclarators();
			setState(455);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(457);
				typeParameters();
				}
			}

			setState(460);
			match(Identifier);
			setState(461);
			formalParameters();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(462);
				match(T__25);
				setState(463);
				qualifiedNameList();
				}
			}

			setState(466);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__21:
			case T__24:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__48:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				modifiers();
				setState(469);
				interfaceMemberDecl();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDecl);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				interfaceMethodOrFieldDecl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				interfaceGenericMethodDecl();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(T__24);
				setState(477);
				match(Identifier);
				setState(478);
				voidInterfaceMethodDeclaratorRest();
				}
				break;
			case T__21:
			case T__48:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				interfaceDeclaration();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			type();
			setState(484);
			match(Identifier);
			setState(485);
			interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodOrFieldRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodOrFieldRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodOrFieldRest);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				constantDeclaratorsRest();
				setState(488);
				match(T__1);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			formalParameters();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(494);
				match(T__25);
				setState(495);
				qualifiedNameList();
				}
			}

			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				{
				setState(498);
				methodBody();
				}
				break;
			case T__1:
				{
				setState(499);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			formalParameters();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(503);
				match(T__22);
				setState(504);
				match(T__23);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(510);
				match(T__25);
				setState(511);
				qualifiedNameList();
				}
			}

			setState(514);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceGenericMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceGenericMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceGenericMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			typeParameters();
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				{
				setState(517);
				type();
				}
				break;
			case T__24:
				{
				setState(518);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(521);
			match(Identifier);
			setState(522);
			interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVoidInterfaceMethodDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			formalParameters();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(525);
				match(T__25);
				setState(526);
				qualifiedNameList();
				}
			}

			setState(529);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(Identifier);
			setState(532);
			constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			variableDeclarator();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(535);
				match(T__16);
				setState(536);
				variableDeclarator();
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			variableDeclaratorId();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(543);
				match(T__26);
				setState(544);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			constantDeclaratorRest();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(548);
				match(T__16);
				setState(549);
				constantDeclarator();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclaratorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclaratorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(555);
				match(T__22);
				setState(556);
				match(T__23);
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			match(T__26);
			setState(563);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(Identifier);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(566);
				match(T__22);
				setState(567);
				match(T__23);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableInitializer);
		try {
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				arrayInitializer();
				}
				break;
			case T__24:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__19);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(578);
				variableInitializer();
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(579);
						match(T__16);
						setState(580);
						variableInitializer();
						}
						} 
					}
					setState(585);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(586);
					match(T__16);
					}
				}

				}
			}

			setState(591);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_modifier);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				annotation();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				match(T__11);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(597);
				match(T__3);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(598);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(599);
				match(T__13);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 8);
				{
				setState(600);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(601);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(602);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 11);
				{
				setState(603);
				match(T__30);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 12);
				{
				setState(604);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageOrTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type);
		try {
			int _alt;
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				classOrInterfaceType();
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(614);
						match(T__22);
						setState(615);
						match(T__23);
						}
						} 
					}
					setState(620);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				primitiveType();
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(622);
						match(T__22);
						setState(623);
						match(T__23);
						}
						} 
					}
					setState(628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(Identifier);
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(632);
				typeArguments();
				}
				break;
			}
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(T__4);
					setState(636);
					match(Identifier);
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(637);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableModifier);
		try {
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(T__13);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(T__15);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || _la==Identifier) {
				{
				setState(652);
				typeArgument();
				}
			}

			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(655);
				match(T__16);
				setState(656);
				typeArgument();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_typeArgument);
		int _la;
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				type();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(T__39);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7 || _la==T__40) {
					{
					setState(666);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__40) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(667);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			qualifiedName();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(673);
				match(T__16);
				setState(674);
				qualifiedName();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(T__41);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__48))) != 0) || _la==Identifier) {
				{
				setState(681);
				formalParameterDecls();
				}
			}

			setState(684);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			variableModifiers();
			setState(687);
			type();
			setState(688);
			formalParameterDeclsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterDeclsRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterDeclsRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				variableDeclaratorId();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(691);
					match(T__16);
					setState(692);
					formalParameterDecls();
					}
				}

				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(T__43);
				setState(696);
				variableDeclaratorId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__19);
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(702);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__13) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (ASSERT - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(705);
				blockStatement();
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(713);
					nonWildcardTypeArguments();
					}
				}

				setState(716);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==T__44) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(717);
				arguments();
				setState(718);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				primary();
				setState(721);
				match(T__4);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(722);
					nonWildcardTypeArguments();
					}
				}

				setState(725);
				match(T__40);
				setState(726);
				arguments();
				setState(727);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(Identifier);
			setState(736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(732);
					match(T__4);
					setState(733);
					match(Identifier);
					}
					} 
				}
				setState(738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_literal);
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				integerLiteral();
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(FloatingPointLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				match(StringLiteral);
				}
				break;
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				booleanLiteral();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(744);
				match(T__45);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(JavaParser.HexLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(JavaParser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(JavaParser.DecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (HexLiteral - 90)) | (1L << (DecimalLiteral - 90)) | (1L << (OctalLiteral - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(751);
				annotation();
				}
				}
				setState(754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__48 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__48);
			setState(757);
			annotationName();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(758);
				match(T__41);
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(759);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(760);
					elementValue();
					}
					break;
				}
				setState(763);
				match(T__42);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(Identifier);
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(767);
				match(T__4);
				setState(768);
				match(Identifier);
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			elementValuePair();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(775);
				match(T__16);
				setState(776);
				elementValuePair();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(Identifier);
			setState(783);
			match(T__26);
			setState(784);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementValue);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				expression(0);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				annotation();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T__19);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(792);
				elementValue();
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(793);
						match(T__16);
						setState(794);
						elementValue();
						}
						} 
					}
					setState(799);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
				}
				}
			}

			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(802);
				match(T__16);
				}
			}

			setState(805);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(T__48);
			setState(808);
			match(T__21);
			setState(809);
			match(Identifier);
			setState(810);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(T__19);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__48))) != 0) || _la==ENUM || _la==Identifier) {
				{
				{
				setState(813);
				annotationTypeElementDeclaration();
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotationTypeElementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			modifiers();
			setState(822);
			annotationTypeElementRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationTypeElementRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationTypeElementRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationTypeElementRest);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				type();
				setState(825);
				annotationMethodOrConstantRest();
				setState(826);
				match(T__1);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				classDeclaration();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(829);
					match(T__1);
					}
				}

				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				normalInterfaceDeclaration();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(833);
					match(T__1);
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(836);
				enumDeclaration();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(837);
					match(T__1);
					}
				}

				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 5);
				{
				setState(840);
				annotationTypeDeclaration();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(841);
					match(T__1);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodOrConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodOrConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationMethodOrConstantRest);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationMethodRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationMethodRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(Identifier);
			setState(851);
			match(T__41);
			setState(852);
			match(T__42);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(853);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterAnnotationConstantRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitAnnotationConstantRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(T__49);
			setState(859);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(T__19);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__13) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (ASSERT - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(862);
				blockStatement();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_blockStatement);
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
				classDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(872);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			localVariableDeclaration();
			setState(877);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			variableModifiers();
			setState(880);
			type();
			setState(881);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__48) {
				{
				{
				setState(883);
				variableModifier();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statement);
		int _la;
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(ASSERT);
				setState(891);
				expression(0);
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(892);
					match(T__50);
					setState(893);
					expression(0);
					}
				}

				setState(896);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(898);
				match(T__51);
				setState(899);
				parExpression();
				setState(900);
				statement();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(901);
					match(T__52);
					setState(902);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				match(T__53);
				setState(906);
				match(T__41);
				setState(907);
				forControl();
				setState(908);
				match(T__42);
				setState(909);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(911);
				match(T__54);
				setState(912);
				parExpression();
				setState(913);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(915);
				match(T__55);
				setState(916);
				statement();
				setState(917);
				match(T__54);
				setState(918);
				parExpression();
				setState(919);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(921);
				match(T__56);
				setState(922);
				block();
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(923);
					catches();
					setState(924);
					match(T__57);
					setState(925);
					block();
					}
					break;
				case 2:
					{
					setState(927);
					catches();
					}
					break;
				case 3:
					{
					setState(928);
					match(T__57);
					setState(929);
					block();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(932);
				match(T__58);
				setState(933);
				parExpression();
				setState(934);
				switchBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(936);
				match(T__28);
				setState(937);
				parExpression();
				setState(938);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(940);
				match(T__59);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(941);
					expression(0);
					}
				}

				setState(944);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(945);
				match(T__60);
				setState(946);
				expression(0);
				setState(947);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(949);
				match(T__61);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(950);
					match(Identifier);
					}
				}

				setState(953);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(954);
				match(T__62);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(955);
					match(Identifier);
					}
				}

				setState(958);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(959);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(960);
				statementExpression();
				setState(961);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(963);
				match(Identifier);
				setState(964);
				match(T__50);
				setState(965);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			catchClause();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__63) {
				{
				{
				setState(969);
				catchClause();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(T__63);
			setState(976);
			match(T__41);
			setState(977);
			formalParameter();
			setState(978);
			match(T__42);
			setState(979);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			variableModifiers();
			setState(982);
			type();
			setState(983);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(T__19);
			setState(989);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(986);
					switchBlockStatementGroup();
					}
					} 
				}
				setState(991);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49 || _la==T__64) {
				{
				{
				setState(992);
				switchLabel();
				}
				}
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(998);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1001); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1000);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1003); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__6) | (1L << T__13) | (1L << T__19) | (1L << T__21) | (1L << T__24) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (ASSERT - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				{
				setState(1005);
				blockStatement();
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_switchLabel);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(T__64);
				setState(1012);
				constantExpression();
				setState(1013);
				match(T__50);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				match(T__64);
				setState(1016);
				enumConstantName();
				setState(1017);
				match(T__50);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1019);
				match(T__49);
				setState(1020);
				match(T__50);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_forControl);
		int _la;
		try {
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1024);
					forInit();
					}
				}

				setState(1027);
				match(T__1);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1028);
					expression(0);
					}
				}

				setState(1031);
				match(T__1);
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(1032);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_forInit);
		try {
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			variableModifiers();
			setState(1042);
			type();
			setState(1043);
			match(Identifier);
			setState(1044);
			match(T__50);
			setState(1045);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(T__41);
			setState(1050);
			expression(0);
			setState(1051);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			expression(0);
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(1054);
				match(T__16);
				setState(1055);
				expression(0);
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 198;
		enterRecursionRule(_localctx, 198, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1066);
				primary();
				}
				break;
			case 2:
				{
				setState(1067);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1068);
				expression(17);
				}
				break;
			case 3:
				{
				setState(1069);
				_la = _input.LA(1);
				if ( !(_la==T__70 || _la==T__71) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1070);
				expression(16);
				}
				break;
			case 4:
				{
				setState(1071);
				match(T__41);
				setState(1072);
				type();
				setState(1073);
				match(T__42);
				setState(1074);
				expression(15);
				}
				break;
			case 5:
				{
				setState(1076);
				match(T__65);
				setState(1077);
				creator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1080);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1081);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__72 || _la==T__73) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1082);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1083);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1084);
						_la = _input.LA(1);
						if ( !(_la==T__68 || _la==T__69) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1085);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1086);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1094);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
						case 1:
							{
							setState(1087);
							match(T__15);
							setState(1088);
							match(T__15);
							}
							break;
						case 2:
							{
							setState(1089);
							match(T__17);
							setState(1090);
							match(T__17);
							setState(1091);
							match(T__17);
							}
							break;
						case 3:
							{
							setState(1092);
							match(T__17);
							setState(1093);
							match(T__17);
							}
							break;
						}
						setState(1096);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1097);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1104);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
						case 1:
							{
							setState(1098);
							match(T__15);
							setState(1099);
							match(T__26);
							}
							break;
						case 2:
							{
							setState(1100);
							match(T__17);
							setState(1101);
							match(T__26);
							}
							break;
						case 3:
							{
							setState(1102);
							match(T__17);
							}
							break;
						case 4:
							{
							setState(1103);
							match(T__15);
							}
							break;
						}
						setState(1106);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1107);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1108);
						_la = _input.LA(1);
						if ( !(_la==T__75 || _la==T__76) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1109);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1110);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1111);
						match(T__18);
						setState(1112);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1113);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1114);
						match(T__77);
						setState(1115);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1116);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1117);
						match(T__78);
						setState(1118);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1119);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1120);
						match(T__79);
						setState(1121);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1123);
						match(T__80);
						setState(1124);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1126);
						match(T__39);
						setState(1127);
						expression(0);
						setState(1128);
						match(T__50);
						setState(1129);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1131);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1151);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
						case 1:
							{
							setState(1132);
							match(T__81);
							}
							break;
						case 2:
							{
							setState(1133);
							match(T__82);
							}
							break;
						case 3:
							{
							setState(1134);
							match(T__83);
							}
							break;
						case 4:
							{
							setState(1135);
							match(T__84);
							}
							break;
						case 5:
							{
							setState(1136);
							match(T__85);
							}
							break;
						case 6:
							{
							setState(1137);
							match(T__86);
							}
							break;
						case 7:
							{
							setState(1138);
							match(T__87);
							}
							break;
						case 8:
							{
							setState(1139);
							match(T__26);
							}
							break;
						case 9:
							{
							setState(1140);
							match(T__17);
							setState(1141);
							match(T__17);
							setState(1142);
							match(T__26);
							}
							break;
						case 10:
							{
							setState(1143);
							match(T__17);
							setState(1144);
							match(T__17);
							setState(1145);
							match(T__17);
							setState(1146);
							match(T__26);
							}
							break;
						case 11:
							{
							setState(1147);
							match(T__15);
							setState(1148);
							match(T__15);
							setState(1149);
							match(T__26);
							}
							break;
						case 12:
							{
							setState(1150);
							match(T__88);
							}
							break;
						}
						setState(1153);
						expression(2);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1154);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1155);
						match(T__4);
						setState(1156);
						match(Identifier);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1157);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1158);
						match(T__4);
						setState(1159);
						match(T__44);
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1160);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1161);
						match(T__4);
						setState(1162);
						match(T__40);
						setState(1163);
						match(T__41);
						setState(1165);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
							{
							setState(1164);
							expressionList();
							}
						}

						setState(1167);
						match(T__42);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1168);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1169);
						match(T__4);
						setState(1170);
						match(T__65);
						setState(1171);
						match(Identifier);
						setState(1172);
						match(T__41);
						setState(1174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
							{
							setState(1173);
							expressionList();
							}
						}

						setState(1176);
						match(T__42);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1177);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1178);
						match(T__4);
						setState(1179);
						match(T__40);
						setState(1180);
						match(T__4);
						setState(1181);
						match(Identifier);
						setState(1183);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
						case 1:
							{
							setState(1182);
							arguments();
							}
							break;
						}
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1185);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1186);
						match(T__4);
						setState(1187);
						explicitGenericInvocation();
						}
						break;
					case 19:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1188);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1189);
						match(T__22);
						setState(1190);
						expression(0);
						setState(1191);
						match(T__23);
						}
						break;
					case 20:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1193);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1194);
						match(T__41);
						setState(1196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
							{
							setState(1195);
							expressionList();
							}
						}

						setState(1198);
						match(T__42);
						}
						break;
					case 21:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1199);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1200);
						_la = _input.LA(1);
						if ( !(_la==T__66 || _la==T__67) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 22:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1201);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1202);
						match(T__74);
						setState(1203);
						type();
						}
						break;
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_primary);
		try {
			setState(1224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				match(T__41);
				setState(1210);
				expression(0);
				setState(1211);
				match(T__42);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1213);
				match(T__44);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
				match(T__40);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1215);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1216);
				match(Identifier);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1217);
				type();
				setState(1218);
				match(T__4);
				setState(1219);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1221);
				match(T__24);
				setState(1222);
				match(T__4);
				setState(1223);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_creator);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(1226);
				nonWildcardTypeArguments();
				setState(1227);
				createdName();
				setState(1228);
				classCreatorRest();
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1230);
				createdName();
				setState(1233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(1231);
					arrayCreatorRest();
					}
					break;
				case T__41:
					{
					setState(1232);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_createdName);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1237);
				classOrInterfaceType();
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(1238);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(1241);
				nonWildcardTypeArguments();
				}
			}

			setState(1244);
			match(Identifier);
			setState(1245);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			nonWildcardTypeArguments();
			setState(1248);
			match(Identifier);
			setState(1249);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(T__22);
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(1252);
				match(T__23);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(1253);
					match(T__22);
					setState(1254);
					match(T__23);
					}
					}
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1260);
				arrayInitializer();
				}
				break;
			case T__24:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__40:
			case T__41:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case HexLiteral:
			case DecimalLiteral:
			case OctalLiteral:
			case FloatingPointLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case Identifier:
				{
				setState(1261);
				expression(0);
				setState(1262);
				match(T__23);
				setState(1269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1263);
						match(T__22);
						setState(1264);
						expression(0);
						setState(1265);
						match(T__23);
						}
						} 
					}
					setState(1271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				setState(1276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1272);
						match(T__22);
						setState(1273);
						match(T__23);
						}
						} 
					}
					setState(1278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			arguments();
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1282);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(T__15);
			setState(1286);
			typeList();
			setState(1287);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(T__41);
			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (HexLiteral - 66)) | (1L << (DecimalLiteral - 66)) | (1L << (OctalLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(1290);
				expressionList();
				}
			}

			setState(1293);
			match(T__42);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 99:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 26);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		case 18:
			return precpred(_ctx, 20);
		case 19:
			return precpred(_ctx, 19);
		case 20:
			return precpred(_ctx, 18);
		case 21:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u0512\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\5\2\u00de\n\2\3\2\7\2\u00e1\n\2\f\2\16\2\u00e4"+
		"\13\2\3\2\7\2\u00e7\n\2\f\2\16\2\u00ea\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\5\4\u00f4\n\4\3\4\3\4\3\4\5\4\u00f9\n\4\3\4\3\4\3\5\7\5\u00fe\n"+
		"\5\f\5\16\5\u0101\13\5\3\5\3\5\3\5\5\5\u0106\n\5\3\5\5\5\u0109\n\5\3\6"+
		"\3\6\3\6\5\6\u010e\n\6\3\6\3\6\5\6\u0112\n\6\3\6\3\6\5\6\u0116\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7\u011e\n\7\3\7\3\7\3\b\3\b\5\b\u0124\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u012e\n\t\3\n\7\n\u0131\n\n\f\n\16\n\u0134"+
		"\13\n\3\13\3\13\3\13\3\13\7\13\u013a\n\13\f\13\16\13\u013d\13\13\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u0144\n\f\3\r\3\r\3\r\7\r\u0149\n\r\f\r\16\r\u014c"+
		"\13\r\3\16\3\16\5\16\u0150\n\16\3\16\5\16\u0153\n\16\3\16\5\16\u0156\n"+
		"\16\3\16\3\16\3\17\3\17\3\17\7\17\u015d\n\17\f\17\16\17\u0160\13\17\3"+
		"\20\5\20\u0163\n\20\3\20\3\20\5\20\u0167\n\20\3\20\5\20\u016a\n\20\3\21"+
		"\3\21\7\21\u016e\n\21\f\21\16\21\u0171\13\21\3\22\3\22\3\22\5\22\u0176"+
		"\n\22\3\22\3\22\5\22\u017a\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u0181\n"+
		"\23\f\23\16\23\u0184\13\23\3\24\3\24\7\24\u0188\n\24\f\24\16\24\u018b"+
		"\13\24\3\24\3\24\3\25\3\25\7\25\u0191\n\25\f\25\16\25\u0194\13\25\3\25"+
		"\3\25\3\26\3\26\5\26\u019a\n\26\3\26\3\26\3\26\3\26\5\26\u01a0\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a8\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u01af\n\30\f\30\16\30\u01b2\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u01bb\n\30\3\31\3\31\5\31\u01bf\n\31\3\31\3\31\5\31\u01c3\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\5\34\u01cd\n\34\3\34\3\34"+
		"\3\34\3\34\5\34\u01d3\n\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01db\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01e4\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \5 \u01ee\n \3!\3!\3!\5!\u01f3\n!\3!\3!\5!\u01f7\n!\3"+
		"\"\3\"\3\"\7\"\u01fc\n\"\f\"\16\"\u01ff\13\"\3\"\3\"\5\"\u0203\n\"\3\""+
		"\3\"\3#\3#\3#\5#\u020a\n#\3#\3#\3#\3$\3$\3$\5$\u0212\n$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\7&\u021c\n&\f&\16&\u021f\13&\3\'\3\'\3\'\5\'\u0224\n\'\3(\3"+
		"(\3(\7(\u0229\n(\f(\16(\u022c\13(\3)\3)\7)\u0230\n)\f)\16)\u0233\13)\3"+
		")\3)\3)\3*\3*\3*\7*\u023b\n*\f*\16*\u023e\13*\3+\3+\5+\u0242\n+\3,\3,"+
		"\3,\3,\7,\u0248\n,\f,\16,\u024b\13,\3,\5,\u024e\n,\5,\u0250\n,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0260\n-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\61\7\61\u026b\n\61\f\61\16\61\u026e\13\61\3\61\3\61\3\61\7"+
		"\61\u0273\n\61\f\61\16\61\u0276\13\61\5\61\u0278\n\61\3\62\3\62\5\62\u027c"+
		"\n\62\3\62\3\62\3\62\5\62\u0281\n\62\7\62\u0283\n\62\f\62\16\62\u0286"+
		"\13\62\3\63\3\63\3\64\3\64\5\64\u028c\n\64\3\65\3\65\5\65\u0290\n\65\3"+
		"\65\3\65\7\65\u0294\n\65\f\65\16\65\u0297\13\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\5\66\u029f\n\66\5\66\u02a1\n\66\3\67\3\67\3\67\7\67\u02a6\n\67"+
		"\f\67\16\67\u02a9\13\67\38\38\58\u02ad\n8\38\38\39\39\39\39\3:\3:\3:\5"+
		":\u02b8\n:\3:\3:\5:\u02bc\n:\3;\3;\3<\3<\5<\u02c2\n<\3<\7<\u02c5\n<\f"+
		"<\16<\u02c8\13<\3<\3<\3=\5=\u02cd\n=\3=\3=\3=\3=\3=\3=\3=\5=\u02d6\n="+
		"\3=\3=\3=\3=\5=\u02dc\n=\3>\3>\3>\7>\u02e1\n>\f>\16>\u02e4\13>\3?\3?\3"+
		"?\3?\3?\3?\5?\u02ec\n?\3@\3@\3A\3A\3B\6B\u02f3\nB\rB\16B\u02f4\3C\3C\3"+
		"C\3C\3C\5C\u02fc\nC\3C\5C\u02ff\nC\3D\3D\3D\7D\u0304\nD\fD\16D\u0307\13"+
		"D\3E\3E\3E\7E\u030c\nE\fE\16E\u030f\13E\3F\3F\3F\3F\3G\3G\3G\5G\u0318"+
		"\nG\3H\3H\3H\3H\7H\u031e\nH\fH\16H\u0321\13H\5H\u0323\nH\3H\5H\u0326\n"+
		"H\3H\3H\3I\3I\3I\3I\3I\3J\3J\7J\u0331\nJ\fJ\16J\u0334\13J\3J\3J\3K\3K"+
		"\3K\3L\3L\3L\3L\3L\3L\5L\u0341\nL\3L\3L\5L\u0345\nL\3L\3L\5L\u0349\nL"+
		"\3L\3L\5L\u034d\nL\5L\u034f\nL\3M\3M\5M\u0353\nM\3N\3N\3N\3N\5N\u0359"+
		"\nN\3O\3O\3P\3P\3P\3Q\3Q\7Q\u0362\nQ\fQ\16Q\u0365\13Q\3Q\3Q\3R\3R\3R\3"+
		"R\5R\u036d\nR\3S\3S\3S\3T\3T\3T\3T\3U\7U\u0377\nU\fU\16U\u037a\13U\3V"+
		"\3V\3V\3V\3V\5V\u0381\nV\3V\3V\3V\3V\3V\3V\3V\5V\u038a\nV\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u03a5"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u03b1\nV\3V\3V\3V\3V\3V\3V\3V\5V"+
		"\u03ba\nV\3V\3V\3V\5V\u03bf\nV\3V\3V\3V\3V\3V\3V\3V\3V\5V\u03c9\nV\3W"+
		"\3W\7W\u03cd\nW\fW\16W\u03d0\13W\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\7"+
		"Z\u03de\nZ\fZ\16Z\u03e1\13Z\3Z\7Z\u03e4\nZ\fZ\16Z\u03e7\13Z\3Z\3Z\3[\6"+
		"[\u03ec\n[\r[\16[\u03ed\3[\7[\u03f1\n[\f[\16[\u03f4\13[\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0400\n\\\3]\3]\5]\u0404\n]\3]\3]\5]\u0408"+
		"\n]\3]\3]\5]\u040c\n]\5]\u040e\n]\3^\3^\5^\u0412\n^\3_\3_\3_\3_\3_\3_"+
		"\3`\3`\3a\3a\3a\3a\3b\3b\3b\7b\u0423\nb\fb\16b\u0426\13b\3c\3c\3d\3d\3"+
		"e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0439\ne\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\3e\3e\5e\u0449\ne\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0453\n"+
		"e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5"+
		"e\u0482\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u0490\ne\3e\3e\3e\3"+
		"e\3e\3e\3e\5e\u0499\ne\3e\3e\3e\3e\3e\3e\3e\5e\u04a2\ne\3e\3e\3e\3e\3"+
		"e\3e\3e\3e\3e\3e\3e\5e\u04af\ne\3e\3e\3e\3e\3e\3e\7e\u04b7\ne\fe\16e\u04ba"+
		"\13e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u04cb\nf\3g\3g\3"+
		"g\3g\3g\3g\3g\5g\u04d4\ng\5g\u04d6\ng\3h\3h\5h\u04da\nh\3i\5i\u04dd\n"+
		"i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\7k\u04ea\nk\fk\16k\u04ed\13k\3k\3k"+
		"\3k\3k\3k\3k\3k\7k\u04f6\nk\fk\16k\u04f9\13k\3k\3k\7k\u04fd\nk\fk\16k"+
		"\u0500\13k\5k\u0502\nk\3l\3l\5l\u0506\nl\3m\3m\3m\3m\3n\3n\5n\u050e\n"+
		"n\3n\3n\3n\2\3\u00c8o\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\2\r\3\2\")\4\2\n\n++\4\2++//\3\2"+
		"\\^\3\2\61\62\3\2EH\3\2IJ\4\2\b\bKL\3\2GH\3\2NO\3\2EF\2\u058e\2\u00dd"+
		"\3\2\2\2\4\u00ed\3\2\2\2\6\u00f1\3\2\2\2\b\u0108\3\2\2\2\n\u010a\3\2\2"+
		"\2\f\u0119\3\2\2\2\16\u0123\3\2\2\2\20\u012d\3\2\2\2\22\u0132\3\2\2\2"+
		"\24\u0135\3\2\2\2\26\u0140\3\2\2\2\30\u0145\3\2\2\2\32\u014d\3\2\2\2\34"+
		"\u0159\3\2\2\2\36\u0162\3\2\2\2 \u016b\3\2\2\2\"\u0172\3\2\2\2$\u017d"+
		"\3\2\2\2&\u0185\3\2\2\2(\u018e\3\2\2\2*\u019f\3\2\2\2,\u01a7\3\2\2\2."+
		"\u01ba\3\2\2\2\60\u01be\3\2\2\2\62\u01c4\3\2\2\2\64\u01c7\3\2\2\2\66\u01cc"+
		"\3\2\2\28\u01da\3\2\2\2:\u01e3\3\2\2\2<\u01e5\3\2\2\2>\u01ed\3\2\2\2@"+
		"\u01ef\3\2\2\2B\u01f8\3\2\2\2D\u0206\3\2\2\2F\u020e\3\2\2\2H\u0215\3\2"+
		"\2\2J\u0218\3\2\2\2L\u0220\3\2\2\2N\u0225\3\2\2\2P\u0231\3\2\2\2R\u0237"+
		"\3\2\2\2T\u0241\3\2\2\2V\u0243\3\2\2\2X\u025f\3\2\2\2Z\u0261\3\2\2\2\\"+
		"\u0263\3\2\2\2^\u0265\3\2\2\2`\u0277\3\2\2\2b\u0279\3\2\2\2d\u0287\3\2"+
		"\2\2f\u028b\3\2\2\2h\u028d\3\2\2\2j\u02a0\3\2\2\2l\u02a2\3\2\2\2n\u02aa"+
		"\3\2\2\2p\u02b0\3\2\2\2r\u02bb\3\2\2\2t\u02bd\3\2\2\2v\u02bf\3\2\2\2x"+
		"\u02db\3\2\2\2z\u02dd\3\2\2\2|\u02eb\3\2\2\2~\u02ed\3\2\2\2\u0080\u02ef"+
		"\3\2\2\2\u0082\u02f2\3\2\2\2\u0084\u02f6\3\2\2\2\u0086\u0300\3\2\2\2\u0088"+
		"\u0308\3\2\2\2\u008a\u0310\3\2\2\2\u008c\u0317\3\2\2\2\u008e\u0319\3\2"+
		"\2\2\u0090\u0329\3\2\2\2\u0092\u032e\3\2\2\2\u0094\u0337\3\2\2\2\u0096"+
		"\u034e\3\2\2\2\u0098\u0352\3\2\2\2\u009a\u0354\3\2\2\2\u009c\u035a\3\2"+
		"\2\2\u009e\u035c\3\2\2\2\u00a0\u035f\3\2\2\2\u00a2\u036c\3\2\2\2\u00a4"+
		"\u036e\3\2\2\2\u00a6\u0371\3\2\2\2\u00a8\u0378\3\2\2\2\u00aa\u03c8\3\2"+
		"\2\2\u00ac\u03ca\3\2\2\2\u00ae\u03d1\3\2\2\2\u00b0\u03d7\3\2\2\2\u00b2"+
		"\u03db\3\2\2\2\u00b4\u03eb\3\2\2\2\u00b6\u03ff\3\2\2\2\u00b8\u040d\3\2"+
		"\2\2\u00ba\u0411\3\2\2\2\u00bc\u0413\3\2\2\2\u00be\u0419\3\2\2\2\u00c0"+
		"\u041b\3\2\2\2\u00c2\u041f\3\2\2\2\u00c4\u0427\3\2\2\2\u00c6\u0429\3\2"+
		"\2\2\u00c8\u0438\3\2\2\2\u00ca\u04ca\3\2\2\2\u00cc\u04d5\3\2\2\2\u00ce"+
		"\u04d9\3\2\2\2\u00d0\u04dc\3\2\2\2\u00d2\u04e1\3\2\2\2\u00d4\u04e5\3\2"+
		"\2\2\u00d6\u0503\3\2\2\2\u00d8\u0507\3\2\2\2\u00da\u050b\3\2\2\2\u00dc"+
		"\u00de\5\4\3\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\3\2"+
		"\2\2\u00df\u00e1\5\6\4\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e7\5\b\5\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\7\2\2\3\u00ec\3\3\2\2\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef"+
		"\5z>\2\u00ef\u00f0\7\4\2\2\u00f0\5\3\2\2\2\u00f1\u00f3\7\5\2\2\u00f2\u00f4"+
		"\7\6\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f8\5z>\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\7\b\2\2\u00f8\u00f6\3\2\2"+
		"\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\4\2\2\u00fb\7"+
		"\3\2\2\2\u00fc\u00fe\5\20\t\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0105\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0106\5\n\6\2\u0103\u0106\5\16\b\2\u0104\u0106\5\f\7\2"+
		"\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0109\7\4\2\2\u0108\u00ff\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\t\3\2\2\2\u010a\u010b\7\t\2\2\u010b\u010d\7d\2\2\u010c\u010e\5\24\13"+
		"\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u0110"+
		"\7\n\2\2\u0110\u0112\5`\61\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0116\5$\23\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\5&\24\2\u0118"+
		"\13\3\2\2\2\u0119\u011a\7b\2\2\u011a\u011d\7d\2\2\u011b\u011c\7\13\2\2"+
		"\u011c\u011e\5$\23\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\5\32\16\2\u0120\r\3\2\2\2\u0121\u0124\5\"\22\2\u0122"+
		"\u0124\5\u0090I\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\17\3\2"+
		"\2\2\u0125\u012e\5\u0084C\2\u0126\u012e\7\f\2\2\u0127\u012e\7\r\2\2\u0128"+
		"\u012e\7\16\2\2\u0129\u012e\7\17\2\2\u012a\u012e\7\6\2\2\u012b\u012e\7"+
		"\20\2\2\u012c\u012e\7\21\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\21\3\2\2\2\u012f\u0131"+
		"\5X-\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\23\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\22\2"+
		"\2\u0136\u013b\5\26\f\2\u0137\u0138\7\23\2\2\u0138\u013a\5\26\f\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\24\2\2\u013f"+
		"\25\3\2\2\2\u0140\u0143\7d\2\2\u0141\u0142\7\n\2\2\u0142\u0144\5\30\r"+
		"\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\27\3\2\2\2\u0145\u014a"+
		"\5`\61\2\u0146\u0147\7\25\2\2\u0147\u0149\5`\61\2\u0148\u0146\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\31"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\26\2\2\u014e\u0150\5\34\17"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153"+
		"\7\23\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2"+
		"\u0154\u0156\5 \21\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\7\27\2\2\u0158\33\3\2\2\2\u0159\u015e\5\36\20\2\u015a"+
		"\u015b\7\23\2\2\u015b\u015d\5\36\20\2\u015c\u015a\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\35\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0163\5\u0082B\2\u0162\u0161\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7d\2\2\u0165\u0167\5\u00dan\2"+
		"\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u016a"+
		"\5&\24\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\37\3\2\2\2\u016b"+
		"\u016f\7\4\2\2\u016c\u016e\5*\26\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170!\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0173\7\30\2\2\u0173\u0175\7d\2\2\u0174\u0176\5\24\13\2"+
		"\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178"+
		"\7\n\2\2\u0178\u017a\5$\23\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\5(\25\2\u017c#\3\2\2\2\u017d\u0182\5`\61\2"+
		"\u017e\u017f\7\23\2\2\u017f\u0181\5`\61\2\u0180\u017e\3\2\2\2\u0181\u0184"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183%\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0189\7\26\2\2\u0186\u0188\5*\26\2\u0187\u0186\3"+
		"\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\27\2\2\u018d\'\3\2\2"+
		"\2\u018e\u0192\7\26\2\2\u018f\u0191\58\35\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\27\2\2\u0196)\3\2\2\2\u0197\u01a0"+
		"\7\4\2\2\u0198\u019a\7\6\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u01a0\5\u00a0Q\2\u019c\u019d\5\22\n\2\u019d\u019e"+
		"\5,\27\2\u019e\u01a0\3\2\2\2\u019f\u0197\3\2\2\2\u019f\u0199\3\2\2\2\u019f"+
		"\u019c\3\2\2\2\u01a0+\3\2\2\2\u01a1\u01a8\5\62\32\2\u01a2\u01a8\5.\30"+
		"\2\u01a3\u01a8\5\64\33\2\u01a4\u01a8\5\66\34\2\u01a5\u01a8\5\16\b\2\u01a6"+
		"\u01a8\5\n\6\2\u01a7\u01a1\3\2\2\2\u01a7\u01a2\3\2\2\2\u01a7\u01a3\3\2"+
		"\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"-\3\2\2\2\u01a9\u01aa\5`\61\2\u01aa\u01ab\7d\2\2\u01ab\u01b0\5n8\2\u01ac"+
		"\u01ad\7\31\2\2\u01ad\u01af\7\32\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b4\5\60\31\2\u01b4\u01bb\3\2\2\2\u01b5\u01b6\7"+
		"\33\2\2\u01b6\u01b7\7d\2\2\u01b7\u01b8\5n8\2\u01b8\u01b9\5\60\31\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01a9\3\2\2\2\u01ba\u01b5\3\2\2\2\u01bb/\3\2\2\2"+
		"\u01bc\u01bd\7\34\2\2\u01bd\u01bf\5l\67\2\u01be\u01bc\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c3\5t;\2\u01c1\u01c3\7\4\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\61\3\2\2\2\u01c4\u01c5\5\24\13"+
		"\2\u01c5\u01c6\5.\30\2\u01c6\63\3\2\2\2\u01c7\u01c8\5`\61\2\u01c8\u01c9"+
		"\5J&\2\u01c9\u01ca\7\4\2\2\u01ca\65\3\2\2\2\u01cb\u01cd\5\24\13\2\u01cc"+
		"\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7d"+
		"\2\2\u01cf\u01d2\5n8\2\u01d0\u01d1\7\34\2\2\u01d1\u01d3\5l\67\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5v"+
		"<\2\u01d5\67\3\2\2\2\u01d6\u01d7\5\22\n\2\u01d7\u01d8\5:\36\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01db\7\4\2\2\u01da\u01d6\3\2\2\2\u01da\u01d9\3\2\2\2\u01db"+
		"9\3\2\2\2\u01dc\u01e4\5<\37\2\u01dd\u01e4\5D#\2\u01de\u01df\7\33\2\2\u01df"+
		"\u01e0\7d\2\2\u01e0\u01e4\5F$\2\u01e1\u01e4\5\16\b\2\u01e2\u01e4\5\n\6"+
		"\2\u01e3\u01dc\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01de\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4;\3\2\2\2\u01e5\u01e6\5`\61\2\u01e6"+
		"\u01e7\7d\2\2\u01e7\u01e8\5> \2\u01e8=\3\2\2\2\u01e9\u01ea\5N(\2\u01ea"+
		"\u01eb\7\4\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ee\5B\"\2\u01ed\u01e9\3\2"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee?\3\2\2\2\u01ef\u01f2\5n8\2\u01f0\u01f1"+
		"\7\34\2\2\u01f1\u01f3\5l\67\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\u01f6\3\2\2\2\u01f4\u01f7\5t;\2\u01f5\u01f7\7\4\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7A\3\2\2\2\u01f8\u01fd\5n8\2\u01f9\u01fa"+
		"\7\31\2\2\u01fa\u01fc\7\32\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2"+
		"\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0202\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u0200\u0201\7\34\2\2\u0201\u0203\5l\67\2\u0202\u0200\3\2\2\2"+
		"\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\7\4\2\2\u0205C\3"+
		"\2\2\2\u0206\u0209\5\24\13\2\u0207\u020a\5`\61\2\u0208\u020a\7\33\2\2"+
		"\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\7d\2\2\u020c\u020d\5B\"\2\u020dE\3\2\2\2\u020e\u0211\5n8\2\u020f\u0210"+
		"\7\34\2\2\u0210\u0212\5l\67\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2"+
		"\u0212\u0213\3\2\2\2\u0213\u0214\7\4\2\2\u0214G\3\2\2\2\u0215\u0216\7"+
		"d\2\2\u0216\u0217\5P)\2\u0217I\3\2\2\2\u0218\u021d\5L\'\2\u0219\u021a"+
		"\7\23\2\2\u021a\u021c\5L\'\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021eK\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0223\5R*\2\u0221\u0222\7\35\2\2\u0222\u0224\5T+\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224M\3\2\2\2\u0225\u022a\5P)\2\u0226\u0227"+
		"\7\23\2\2\u0227\u0229\5H%\2\u0228\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022bO\3\2\2\2\u022c\u022a\3\2\2\2"+
		"\u022d\u022e\7\31\2\2\u022e\u0230\7\32\2\2\u022f\u022d\3\2\2\2\u0230\u0233"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0235\7\35\2\2\u0235\u0236\5T+\2\u0236Q\3\2\2\2\u0237"+
		"\u023c\7d\2\2\u0238\u0239\7\31\2\2\u0239\u023b\7\32\2\2\u023a\u0238\3"+
		"\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"S\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0242\5V,\2\u0240\u0242\5\u00c8e\2"+
		"\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242U\3\2\2\2\u0243\u024f\7"+
		"\26\2\2\u0244\u0249\5T+\2\u0245\u0246\7\23\2\2\u0246\u0248\5T+\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024e\7\23\2\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0244\3\2"+
		"\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7\27\2\2\u0252"+
		"W\3\2\2\2\u0253\u0260\5\u0084C\2\u0254\u0260\7\f\2\2\u0255\u0260\7\r\2"+
		"\2\u0256\u0260\7\16\2\2\u0257\u0260\7\6\2\2\u0258\u0260\7\17\2\2\u0259"+
		"\u0260\7\20\2\2\u025a\u0260\7\36\2\2\u025b\u0260\7\37\2\2\u025c\u0260"+
		"\7 \2\2\u025d\u0260\7!\2\2\u025e\u0260\7\21\2\2\u025f\u0253\3\2\2\2\u025f"+
		"\u0254\3\2\2\2\u025f\u0255\3\2\2\2\u025f\u0256\3\2\2\2\u025f\u0257\3\2"+
		"\2\2\u025f\u0258\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2\2\2\u025f"+
		"\u025b\3\2\2\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2"+
		"\2\2\u0260Y\3\2\2\2\u0261\u0262\5z>\2\u0262[\3\2\2\2\u0263\u0264\7d\2"+
		"\2\u0264]\3\2\2\2\u0265\u0266\5z>\2\u0266_\3\2\2\2\u0267\u026c\5b\62\2"+
		"\u0268\u0269\7\31\2\2\u0269\u026b\7\32\2\2\u026a\u0268\3\2\2\2\u026b\u026e"+
		"\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0278\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0274\5d\63\2\u0270\u0271\7\31\2\2\u0271\u0273\7"+
		"\32\2\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0267\3\2"+
		"\2\2\u0277\u026f\3\2\2\2\u0278a\3\2\2\2\u0279\u027b\7d\2\2\u027a\u027c"+
		"\5h\65\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0284\3\2\2\2\u027d"+
		"\u027e\7\7\2\2\u027e\u0280\7d\2\2\u027f\u0281\5h\65\2\u0280\u027f\3\2"+
		"\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u027d\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285c\3\2\2\2"+
		"\u0286\u0284\3\2\2\2\u0287\u0288\t\2\2\2\u0288e\3\2\2\2\u0289\u028c\7"+
		"\20\2\2\u028a\u028c\5\u0084C\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2"+
		"\u028cg\3\2\2\2\u028d\u028f\7\22\2\2\u028e\u0290\5j\66\2\u028f\u028e\3"+
		"\2\2\2\u028f\u0290\3\2\2\2\u0290\u0295\3\2\2\2\u0291\u0292\7\23\2\2\u0292"+
		"\u0294\5j\66\2\u0293\u0291\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298"+
		"\u0299\7\24\2\2\u0299i\3\2\2\2\u029a\u02a1\5`\61\2\u029b\u029e\7*\2\2"+
		"\u029c\u029d\t\3\2\2\u029d\u029f\5`\61\2\u029e\u029c\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029a\3\2\2\2\u02a0\u029b\3\2\2\2\u02a1"+
		"k\3\2\2\2\u02a2\u02a7\5z>\2\u02a3\u02a4\7\23\2\2\u02a4\u02a6\5z>\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8m\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ac\7,\2\2\u02ab\u02ad"+
		"\5p9\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02af\7-\2\2\u02afo\3\2\2\2\u02b0\u02b1\5\u00a8U\2\u02b1\u02b2\5`\61"+
		"\2\u02b2\u02b3\5r:\2\u02b3q\3\2\2\2\u02b4\u02b7\5R*\2\u02b5\u02b6\7\23"+
		"\2\2\u02b6\u02b8\5p9\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bc"+
		"\3\2\2\2\u02b9\u02ba\7.\2\2\u02ba\u02bc\5R*\2\u02bb\u02b4\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bcs\3\2\2\2\u02bd\u02be\5\u00a0Q\2\u02beu\3\2\2\2\u02bf"+
		"\u02c1\7\26\2\2\u02c0\u02c2\5x=\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2"+
		"\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c5\5\u00a2R\2\u02c4\u02c3\3\2\2\2\u02c5"+
		"\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7\27\2\2\u02caw\3\2\2\2\u02cb\u02cd"+
		"\5\u00d8m\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2"+
		"\2\u02ce\u02cf\t\4\2\2\u02cf\u02d0\5\u00dan\2\u02d0\u02d1\7\4\2\2\u02d1"+
		"\u02dc\3\2\2\2\u02d2\u02d3\5\u00caf\2\u02d3\u02d5\7\7\2\2\u02d4\u02d6"+
		"\5\u00d8m\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2"+
		"\2\u02d7\u02d8\7+\2\2\u02d8\u02d9\5\u00dan\2\u02d9\u02da\7\4\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02cc\3\2\2\2\u02db\u02d2\3\2\2\2\u02dcy\3\2\2\2"+
		"\u02dd\u02e2\7d\2\2\u02de\u02df\7\7\2\2\u02df\u02e1\7d\2\2\u02e0\u02de"+
		"\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"{\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02ec\5~@\2\u02e6\u02ec\7_\2\2\u02e7"+
		"\u02ec\7`\2\2\u02e8\u02ec\7a\2\2\u02e9\u02ec\5\u0080A\2\u02ea\u02ec\7"+
		"\60\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb\u02e7\3\2\2\2\u02eb"+
		"\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec}\3\2\2\2"+
		"\u02ed\u02ee\t\5\2\2\u02ee\177\3\2\2\2\u02ef\u02f0\t\6\2\2\u02f0\u0081"+
		"\3\2\2\2\u02f1\u02f3\5\u0084C\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4\3\2\2"+
		"\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u0083\3\2\2\2\u02f6\u02f7"+
		"\7\63\2\2\u02f7\u02fe\5\u0086D\2\u02f8\u02fb\7,\2\2\u02f9\u02fc\5\u0088"+
		"E\2\u02fa\u02fc\5\u008cG\2\u02fb\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7-\2\2\u02fe\u02f8\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0085\3\2\2\2\u0300\u0305\7d\2\2\u0301"+
		"\u0302\7\7\2\2\u0302\u0304\7d\2\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0087\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u030d\5\u008aF\2\u0309\u030a\7\23\2\2\u030a\u030c"+
		"\5\u008aF\2\u030b\u0309\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2"+
		"\2\u030d\u030e\3\2\2\2\u030e\u0089\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0311"+
		"\7d\2\2\u0311\u0312\7\35\2\2\u0312\u0313\5\u008cG\2\u0313\u008b\3\2\2"+
		"\2\u0314\u0318\5\u00c8e\2\u0315\u0318\5\u0084C\2\u0316\u0318\5\u008eH"+
		"\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318\u008d"+
		"\3\2\2\2\u0319\u0322\7\26\2\2\u031a\u031f\5\u008cG\2\u031b\u031c\7\23"+
		"\2\2\u031c\u031e\5\u008cG\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0322\u031a\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\3\2\2\2\u0324"+
		"\u0326\7\23\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3"+
		"\2\2\2\u0327\u0328\7\27\2\2\u0328\u008f\3\2\2\2\u0329\u032a\7\63\2\2\u032a"+
		"\u032b\7\30\2\2\u032b\u032c\7d\2\2\u032c\u032d\5\u0092J\2\u032d\u0091"+
		"\3\2\2\2\u032e\u0332\7\26\2\2\u032f\u0331\5\u0094K\2\u0330\u032f\3\2\2"+
		"\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336\7\27\2\2\u0336\u0093\3\2\2\2"+
		"\u0337\u0338\5\22\n\2\u0338\u0339\5\u0096L\2\u0339\u0095\3\2\2\2\u033a"+
		"\u033b\5`\61\2\u033b\u033c\5\u0098M\2\u033c\u033d\7\4\2\2\u033d\u034f"+
		"\3\2\2\2\u033e\u0340\5\n\6\2\u033f\u0341\7\4\2\2\u0340\u033f\3\2\2\2\u0340"+
		"\u0341\3\2\2\2\u0341\u034f\3\2\2\2\u0342\u0344\5\"\22\2\u0343\u0345\7"+
		"\4\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u034f\3\2\2\2\u0346"+
		"\u0348\5\f\7\2\u0347\u0349\7\4\2\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034f\3\2\2\2\u034a\u034c\5\u0090I\2\u034b\u034d\7\4\2\2\u034c"+
		"\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u033a\3\2"+
		"\2\2\u034e\u033e\3\2\2\2\u034e\u0342\3\2\2\2\u034e\u0346\3\2\2\2\u034e"+
		"\u034a\3\2\2\2\u034f\u0097\3\2\2\2\u0350\u0353\5\u009aN\2\u0351\u0353"+
		"\5\u009cO\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2\2\2\u0353\u0099\3\2\2"+
		"\2\u0354\u0355\7d\2\2\u0355\u0356\7,\2\2\u0356\u0358\7-\2\2\u0357\u0359"+
		"\5\u009eP\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u009b\3\2\2"+
		"\2\u035a\u035b\5J&\2\u035b\u009d\3\2\2\2\u035c\u035d\7\64\2\2\u035d\u035e"+
		"\5\u008cG\2\u035e\u009f\3\2\2\2\u035f\u0363\7\26\2\2\u0360\u0362\5\u00a2"+
		"R\2\u0361\u0360\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0367\7\27"+
		"\2\2\u0367\u00a1\3\2\2\2\u0368\u036d\5\u00a4S\2\u0369\u036d\5\n\6\2\u036a"+
		"\u036d\5\16\b\2\u036b\u036d\5\u00aaV\2\u036c\u0368\3\2\2\2\u036c\u0369"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036d\u00a3\3\2\2\2\u036e"+
		"\u036f\5\u00a6T\2\u036f\u0370\7\4\2\2\u0370\u00a5\3\2\2\2\u0371\u0372"+
		"\5\u00a8U\2\u0372\u0373\5`\61\2\u0373\u0374\5J&\2\u0374\u00a7\3\2\2\2"+
		"\u0375\u0377\5f\64\2\u0376\u0375\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u00a9\3\2\2\2\u037a\u0378\3\2\2\2\u037b"+
		"\u03c9\5\u00a0Q\2\u037c\u037d\7c\2\2\u037d\u0380\5\u00c8e\2\u037e\u037f"+
		"\7\65\2\2\u037f\u0381\5\u00c8e\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2"+
		"\2\u0381\u0382\3\2\2\2\u0382\u0383\7\4\2\2\u0383\u03c9\3\2\2\2\u0384\u0385"+
		"\7\66\2\2\u0385\u0386\5\u00c0a\2\u0386\u0389\5\u00aaV\2\u0387\u0388\7"+
		"\67\2\2\u0388\u038a\5\u00aaV\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2"+
		"\u038a\u03c9\3\2\2\2\u038b\u038c\78\2\2\u038c\u038d\7,\2\2\u038d\u038e"+
		"\5\u00b8]\2\u038e\u038f\7-\2\2\u038f\u0390\5\u00aaV\2\u0390\u03c9\3\2"+
		"\2\2\u0391\u0392\79\2\2\u0392\u0393\5\u00c0a\2\u0393\u0394\5\u00aaV\2"+
		"\u0394\u03c9\3\2\2\2\u0395\u0396\7:\2\2\u0396\u0397\5\u00aaV\2\u0397\u0398"+
		"\79\2\2\u0398\u0399\5\u00c0a\2\u0399\u039a\7\4\2\2\u039a\u03c9\3\2\2\2"+
		"\u039b\u039c\7;\2\2\u039c\u03a4\5\u00a0Q\2\u039d\u039e\5\u00acW\2\u039e"+
		"\u039f\7<\2\2\u039f\u03a0\5\u00a0Q\2\u03a0\u03a5\3\2\2\2\u03a1\u03a5\5"+
		"\u00acW\2\u03a2\u03a3\7<\2\2\u03a3\u03a5\5\u00a0Q\2\u03a4\u039d\3\2\2"+
		"\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03c9\3\2\2\2\u03a6\u03a7"+
		"\7=\2\2\u03a7\u03a8\5\u00c0a\2\u03a8\u03a9\5\u00b2Z\2\u03a9\u03c9\3\2"+
		"\2\2\u03aa\u03ab\7\37\2\2\u03ab\u03ac\5\u00c0a\2\u03ac\u03ad\5\u00a0Q"+
		"\2\u03ad\u03c9\3\2\2\2\u03ae\u03b0\7>\2\2\u03af\u03b1\5\u00c8e\2\u03b0"+
		"\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03c9\7\4"+
		"\2\2\u03b3\u03b4\7?\2\2\u03b4\u03b5\5\u00c8e\2\u03b5\u03b6\7\4\2\2\u03b6"+
		"\u03c9\3\2\2\2\u03b7\u03b9\7@\2\2\u03b8\u03ba\7d\2\2\u03b9\u03b8\3\2\2"+
		"\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c9\7\4\2\2\u03bc\u03be"+
		"\7A\2\2\u03bd\u03bf\7d\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c9\7\4\2\2\u03c1\u03c9\7\4\2\2\u03c2\u03c3\5\u00c4"+
		"c\2\u03c3\u03c4\7\4\2\2\u03c4\u03c9\3\2\2\2\u03c5\u03c6\7d\2\2\u03c6\u03c7"+
		"\7\65\2\2\u03c7\u03c9\5\u00aaV\2\u03c8\u037b\3\2\2\2\u03c8\u037c\3\2\2"+
		"\2\u03c8\u0384\3\2\2\2\u03c8\u038b\3\2\2\2\u03c8\u0391\3\2\2\2\u03c8\u0395"+
		"\3\2\2\2\u03c8\u039b\3\2\2\2\u03c8\u03a6\3\2\2\2\u03c8\u03aa\3\2\2\2\u03c8"+
		"\u03ae\3\2\2\2\u03c8\u03b3\3\2\2\2\u03c8\u03b7\3\2\2\2\u03c8\u03bc\3\2"+
		"\2\2\u03c8\u03c1\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8\u03c5\3\2\2\2\u03c9"+
		"\u00ab\3\2\2\2\u03ca\u03ce\5\u00aeX\2\u03cb\u03cd\5\u00aeX\2\u03cc\u03cb"+
		"\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u00ad\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d2\7B\2\2\u03d2\u03d3\7,\2"+
		"\2\u03d3\u03d4\5\u00b0Y\2\u03d4\u03d5\7-\2\2\u03d5\u03d6\5\u00a0Q\2\u03d6"+
		"\u00af\3\2\2\2\u03d7\u03d8\5\u00a8U\2\u03d8\u03d9\5`\61\2\u03d9\u03da"+
		"\5R*\2\u03da\u00b1\3\2\2\2\u03db\u03df\7\26\2\2\u03dc\u03de\5\u00b4[\2"+
		"\u03dd\u03dc\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0"+
		"\3\2\2\2\u03e0\u03e5\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2\u03e4\5\u00b6\\"+
		"\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6"+
		"\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e9\7\27\2\2"+
		"\u03e9\u00b3\3\2\2\2\u03ea\u03ec\5\u00b6\\\2\u03eb\u03ea\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f2\3\2"+
		"\2\2\u03ef\u03f1\5\u00a2R\2\u03f0\u03ef\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2"+
		"\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u00b5\3\2\2\2\u03f4\u03f2\3\2"+
		"\2\2\u03f5\u03f6\7C\2\2\u03f6\u03f7\5\u00c6d\2\u03f7\u03f8\7\65\2\2\u03f8"+
		"\u0400\3\2\2\2\u03f9\u03fa\7C\2\2\u03fa\u03fb\5\\/\2\u03fb\u03fc\7\65"+
		"\2\2\u03fc\u0400\3\2\2\2\u03fd\u03fe\7\64\2\2\u03fe\u0400\7\65\2\2\u03ff"+
		"\u03f5\3\2\2\2\u03ff\u03f9\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400\u00b7\3\2"+
		"\2\2\u0401\u040e\5\u00bc_\2\u0402\u0404\5\u00ba^\2\u0403\u0402\3\2\2\2"+
		"\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0407\7\4\2\2\u0406\u0408"+
		"\5\u00c8e\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2"+
		"\2\u0409\u040b\7\4\2\2\u040a\u040c\5\u00be`\2\u040b\u040a\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040e\3\2\2\2\u040d\u0401\3\2\2\2\u040d\u0403\3\2"+
		"\2\2\u040e\u00b9\3\2\2\2\u040f\u0412\5\u00a6T\2\u0410\u0412\5\u00c2b\2"+
		"\u0411\u040f\3\2\2\2\u0411\u0410\3\2\2\2\u0412\u00bb\3\2\2\2\u0413\u0414"+
		"\5\u00a8U\2\u0414\u0415\5`\61\2\u0415\u0416\7d\2\2\u0416\u0417\7\65\2"+
		"\2\u0417\u0418\5\u00c8e\2\u0418\u00bd\3\2\2\2\u0419\u041a\5\u00c2b\2\u041a"+
		"\u00bf\3\2\2\2\u041b\u041c\7,\2\2\u041c\u041d\5\u00c8e\2\u041d\u041e\7"+
		"-\2\2\u041e\u00c1\3\2\2\2\u041f\u0424\5\u00c8e\2\u0420\u0421\7\23\2\2"+
		"\u0421\u0423\5\u00c8e\2\u0422\u0420\3\2\2\2\u0423\u0426\3\2\2\2\u0424"+
		"\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u00c3\3\2\2\2\u0426\u0424\3\2"+
		"\2\2\u0427\u0428\5\u00c8e\2\u0428\u00c5\3\2\2\2\u0429\u042a\5\u00c8e\2"+
		"\u042a\u00c7\3\2\2\2\u042b\u042c\be\1\2\u042c\u0439\5\u00caf\2\u042d\u042e"+
		"\t\7\2\2\u042e\u0439\5\u00c8e\23\u042f\u0430\t\b\2\2\u0430\u0439\5\u00c8"+
		"e\22\u0431\u0432\7,\2\2\u0432\u0433\5`\61\2\u0433\u0434\7-\2\2\u0434\u0435"+
		"\5\u00c8e\21\u0435\u0439\3\2\2\2\u0436\u0437\7D\2\2\u0437\u0439\5\u00cc"+
		"g\2\u0438\u042b\3\2\2\2\u0438\u042d\3\2\2\2\u0438\u042f\3\2\2\2\u0438"+
		"\u0431\3\2\2\2\u0438\u0436\3\2\2\2\u0439\u04b8\3\2\2\2\u043a\u043b\f\17"+
		"\2\2\u043b\u043c\t\t\2\2\u043c\u04b7\5\u00c8e\20\u043d\u043e\f\16\2\2"+
		"\u043e\u043f\t\n\2\2\u043f\u04b7\5\u00c8e\17\u0440\u0448\f\r\2\2\u0441"+
		"\u0442\7\22\2\2\u0442\u0449\7\22\2\2\u0443\u0444\7\24\2\2\u0444\u0445"+
		"\7\24\2\2\u0445\u0449\7\24\2\2\u0446\u0447\7\24\2\2\u0447\u0449\7\24\2"+
		"\2\u0448\u0441\3\2\2\2\u0448\u0443\3\2\2\2\u0448\u0446\3\2\2\2\u0449\u044a"+
		"\3\2\2\2\u044a\u04b7\5\u00c8e\16\u044b\u0452\f\f\2\2\u044c\u044d\7\22"+
		"\2\2\u044d\u0453\7\35\2\2\u044e\u044f\7\24\2\2\u044f\u0453\7\35\2\2\u0450"+
		"\u0453\7\24\2\2\u0451\u0453\7\22\2\2\u0452\u044c\3\2\2\2\u0452\u044e\3"+
		"\2\2\2\u0452\u0450\3\2\2\2\u0452\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u04b7\5\u00c8e\r\u0455\u0456\f\n\2\2\u0456\u0457\t\13\2\2\u0457\u04b7"+
		"\5\u00c8e\13\u0458\u0459\f\t\2\2\u0459\u045a\7\25\2\2\u045a\u04b7\5\u00c8"+
		"e\n\u045b\u045c\f\b\2\2\u045c\u045d\7P\2\2\u045d\u04b7\5\u00c8e\t\u045e"+
		"\u045f\f\7\2\2\u045f\u0460\7Q\2\2\u0460\u04b7\5\u00c8e\b\u0461\u0462\f"+
		"\6\2\2\u0462\u0463\7R\2\2\u0463\u04b7\5\u00c8e\7\u0464\u0465\f\5\2\2\u0465"+
		"\u0466\7S\2\2\u0466\u04b7\5\u00c8e\6\u0467\u0468\f\4\2\2\u0468\u0469\7"+
		"*\2\2\u0469\u046a\5\u00c8e\2\u046a\u046b\7\65\2\2\u046b\u046c\5\u00c8"+
		"e\5\u046c\u04b7\3\2\2\2\u046d\u0481\f\3\2\2\u046e\u0482\7T\2\2\u046f\u0482"+
		"\7U\2\2\u0470\u0482\7V\2\2\u0471\u0482\7W\2\2\u0472\u0482\7X\2\2\u0473"+
		"\u0482\7Y\2\2\u0474\u0482\7Z\2\2\u0475\u0482\7\35\2\2\u0476\u0477\7\24"+
		"\2\2\u0477\u0478\7\24\2\2\u0478\u0482\7\35\2\2\u0479\u047a\7\24\2\2\u047a"+
		"\u047b\7\24\2\2\u047b\u047c\7\24\2\2\u047c\u0482\7\35\2\2\u047d\u047e"+
		"\7\22\2\2\u047e\u047f\7\22\2\2\u047f\u0482\7\35\2\2\u0480\u0482\7[\2\2"+
		"\u0481\u046e\3\2\2\2\u0481\u046f\3\2\2\2\u0481\u0470\3\2\2\2\u0481\u0471"+
		"\3\2\2\2\u0481\u0472\3\2\2\2\u0481\u0473\3\2\2\2\u0481\u0474\3\2\2\2\u0481"+
		"\u0475\3\2\2\2\u0481\u0476\3\2\2\2\u0481\u0479\3\2\2\2\u0481\u047d\3\2"+
		"\2\2\u0481\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u04b7\5\u00c8e\4\u0484"+
		"\u0485\f\34\2\2\u0485\u0486\7\7\2\2\u0486\u04b7\7d\2\2\u0487\u0488\f\33"+
		"\2\2\u0488\u0489\7\7\2\2\u0489\u04b7\7/\2\2\u048a\u048b\f\32\2\2\u048b"+
		"\u048c\7\7\2\2\u048c\u048d\7+\2\2\u048d\u048f\7,\2\2\u048e\u0490\5\u00c2"+
		"b\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u04b7\7-\2\2\u0492\u0493\f\31\2\2\u0493\u0494\7\7\2\2\u0494\u0495\7D"+
		"\2\2\u0495\u0496\7d\2\2\u0496\u0498\7,\2\2\u0497\u0499\5\u00c2b\2\u0498"+
		"\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u04b7\7-"+
		"\2\2\u049b\u049c\f\30\2\2\u049c\u049d\7\7\2\2\u049d\u049e\7+\2\2\u049e"+
		"\u049f\7\7\2\2\u049f\u04a1\7d\2\2\u04a0\u04a2\5\u00dan\2\u04a1\u04a0\3"+
		"\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04b7\3\2\2\2\u04a3\u04a4\f\27\2\2\u04a4"+
		"\u04a5\7\7\2\2\u04a5\u04b7\5\u00d2j\2\u04a6\u04a7\f\26\2\2\u04a7\u04a8"+
		"\7\31\2\2\u04a8\u04a9\5\u00c8e\2\u04a9\u04aa\7\32\2\2\u04aa\u04b7\3\2"+
		"\2\2\u04ab\u04ac\f\25\2\2\u04ac\u04ae\7,\2\2\u04ad\u04af\5\u00c2b\2\u04ae"+
		"\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b7\7-"+
		"\2\2\u04b1\u04b2\f\24\2\2\u04b2\u04b7\t\f\2\2\u04b3\u04b4\f\13\2\2\u04b4"+
		"\u04b5\7M\2\2\u04b5\u04b7\5`\61\2\u04b6\u043a\3\2\2\2\u04b6\u043d\3\2"+
		"\2\2\u04b6\u0440\3\2\2\2\u04b6\u044b\3\2\2\2\u04b6\u0455\3\2\2\2\u04b6"+
		"\u0458\3\2\2\2\u04b6\u045b\3\2\2\2\u04b6\u045e\3\2\2\2\u04b6\u0461\3\2"+
		"\2\2\u04b6\u0464\3\2\2\2\u04b6\u0467\3\2\2\2\u04b6\u046d\3\2\2\2\u04b6"+
		"\u0484\3\2\2\2\u04b6\u0487\3\2\2\2\u04b6\u048a\3\2\2\2\u04b6\u0492\3\2"+
		"\2\2\u04b6\u049b\3\2\2\2\u04b6\u04a3\3\2\2\2\u04b6\u04a6\3\2\2\2\u04b6"+
		"\u04ab\3\2\2\2\u04b6\u04b1\3\2\2\2\u04b6\u04b3\3\2\2\2\u04b7\u04ba\3\2"+
		"\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u00c9\3\2\2\2\u04ba"+
		"\u04b8\3\2\2\2\u04bb\u04bc\7,\2\2\u04bc\u04bd\5\u00c8e\2\u04bd\u04be\7"+
		"-\2\2\u04be\u04cb\3\2\2\2\u04bf\u04cb\7/\2\2\u04c0\u04cb\7+\2\2\u04c1"+
		"\u04cb\5|?\2\u04c2\u04cb\7d\2\2\u04c3\u04c4\5`\61\2\u04c4\u04c5\7\7\2"+
		"\2\u04c5\u04c6\7\t\2\2\u04c6\u04cb\3\2\2\2\u04c7\u04c8\7\33\2\2\u04c8"+
		"\u04c9\7\7\2\2\u04c9\u04cb\7\t\2\2\u04ca\u04bb\3\2\2\2\u04ca\u04bf\3\2"+
		"\2\2\u04ca\u04c0\3\2\2\2\u04ca\u04c1\3\2\2\2\u04ca\u04c2\3\2\2\2\u04ca"+
		"\u04c3\3\2\2\2\u04ca\u04c7\3\2\2\2\u04cb\u00cb\3\2\2\2\u04cc\u04cd\5\u00d8"+
		"m\2\u04cd\u04ce\5\u00ceh\2\u04ce\u04cf\5\u00d6l\2\u04cf\u04d6\3\2\2\2"+
		"\u04d0\u04d3\5\u00ceh\2\u04d1\u04d4\5\u00d4k\2\u04d2\u04d4\5\u00d6l\2"+
		"\u04d3\u04d1\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d6\3\2\2\2\u04d5\u04cc"+
		"\3\2\2\2\u04d5\u04d0\3\2\2\2\u04d6\u00cd\3\2\2\2\u04d7\u04da\5b\62\2\u04d8"+
		"\u04da\5d\63\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da\u00cf\3\2"+
		"\2\2\u04db\u04dd\5\u00d8m\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04df\7d\2\2\u04df\u04e0\5\u00d6l\2\u04e0\u00d1\3"+
		"\2\2\2\u04e1\u04e2\5\u00d8m\2\u04e2\u04e3\7d\2\2\u04e3\u04e4\5\u00dan"+
		"\2\u04e4\u00d3\3\2\2\2\u04e5\u0501\7\31\2\2\u04e6\u04eb\7\32\2\2\u04e7"+
		"\u04e8\7\31\2\2\u04e8\u04ea\7\32\2\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\3"+
		"\2\2\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\3\2\2\2\u04ed"+
		"\u04eb\3\2\2\2\u04ee\u0502\5V,\2\u04ef\u04f0\5\u00c8e\2\u04f0\u04f7\7"+
		"\32\2\2\u04f1\u04f2\7\31\2\2\u04f2\u04f3\5\u00c8e\2\u04f3\u04f4\7\32\2"+
		"\2\u04f4\u04f6\3\2\2\2\u04f5\u04f1\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fe\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa"+
		"\u04fb\7\31\2\2\u04fb\u04fd\7\32\2\2\u04fc\u04fa\3\2\2\2\u04fd\u0500\3"+
		"\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0502\3\2\2\2\u0500"+
		"\u04fe\3\2\2\2\u0501\u04e6\3\2\2\2\u0501\u04ef\3\2\2\2\u0502\u00d5\3\2"+
		"\2\2\u0503\u0505\5\u00dan\2\u0504\u0506\5&\24\2\u0505\u0504\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u00d7\3\2\2\2\u0507\u0508\7\22\2\2\u0508\u0509\5"+
		"$\23\2\u0509\u050a\7\24\2\2\u050a\u00d9\3\2\2\2\u050b\u050d\7,\2\2\u050c"+
		"\u050e\5\u00c2b\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f"+
		"\3\2\2\2\u050f\u0510\7-\2\2\u0510\u00db\3\2\2\2\u008f\u00dd\u00e2\u00e8"+
		"\u00f3\u00f8\u00ff\u0105\u0108\u010d\u0111\u0115\u011d\u0123\u012d\u0132"+
		"\u013b\u0143\u014a\u014f\u0152\u0155\u015e\u0162\u0166\u0169\u016f\u0175"+
		"\u0179\u0182\u0189\u0192\u0199\u019f\u01a7\u01b0\u01ba\u01be\u01c2\u01cc"+
		"\u01d2\u01da\u01e3\u01ed\u01f2\u01f6\u01fd\u0202\u0209\u0211\u021d\u0223"+
		"\u022a\u0231\u023c\u0241\u0249\u024d\u024f\u025f\u026c\u0274\u0277\u027b"+
		"\u0280\u0284\u028b\u028f\u0295\u029e\u02a0\u02a7\u02ac\u02b7\u02bb\u02c1"+
		"\u02c6\u02cc\u02d5\u02db\u02e2\u02eb\u02f4\u02fb\u02fe\u0305\u030d\u0317"+
		"\u031f\u0322\u0325\u0332\u0340\u0344\u0348\u034c\u034e\u0352\u0358\u0363"+
		"\u036c\u0378\u0380\u0389\u03a4\u03b0\u03b9\u03be\u03c8\u03ce\u03df\u03e5"+
		"\u03ed\u03f2\u03ff\u0403\u0407\u040b\u040d\u0411\u0424\u0438\u0448\u0452"+
		"\u0481\u048f\u0498\u04a1\u04ae\u04b6\u04b8\u04ca\u04d3\u04d5\u04d9\u04dc"+
		"\u04eb\u04f7\u04fe\u0501\u0505\u050d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}