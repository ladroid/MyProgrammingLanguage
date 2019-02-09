// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/main/java/com/ladroid/julesvernepl/JulesVerne.g4 by ANTLR 4.7.2
package com.ladroid.julesvernepl;

    import java.text.SimpleDateFormat;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JulesVerneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, ASSIGN=34, INTEGER=35, STRING=36, IF=37, ELSE=38, 
		OBRACE=39, CBRACE=40, LSCOPE=41, RSCOPE=42, ARROW=43, TRUE=44, FALSE=45, 
		INEQUALITY=46, GRTTHEN=47, LESTHEN=48, GRTTHENEQUL=49, LESTHENEQUL=50, 
		EQUALITY=51, TRIPLEEQUAL=52, COMMENT=53, LINE_COMMENT=54, ID=55, CYRILLIC=56, 
		JAPANESE=57, KOREAN=58, FLOAT=59, DOT=60, NUMBER=61, OCTAL=62, HEXADECIMAL=63, 
		Space=64, OTHER=65, WS=66;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declare_var = 2, RULE_array_init = 3, 
		RULE_concatenation = 4, RULE_comparison = 5, RULE_comparisonRef = 6, RULE_whileLoop = 7, 
		RULE_forLoop = 8, RULE_forLoopReverse = 9, RULE_forArray = 10, RULE_open = 11, 
		RULE_let = 12, RULE_varInt = 13, RULE_varFloat = 14, RULE_varString = 15, 
		RULE_assignment = 16, RULE_print = 17, RULE_add = 18, RULE_minus = 19, 
		RULE_multiply = 20, RULE_divide = 21, RULE_mod = 22, RULE_increment = 23, 
		RULE_incrementPostfix = 24, RULE_decrement = 25, RULE_decrementPostfix = 26, 
		RULE_shl = 27, RULE_shr = 28, RULE_xorV = 29, RULE_orV = 30, RULE_andV = 31, 
		RULE_notV = 32, RULE_function = 33, RULE_params = 34, RULE_param = 35, 
		RULE_typ = 36, RULE_smth = 37, RULE_expr = 38, RULE_stat_block = 39, RULE_if_stat = 40, 
		RULE_condition_block = 41, RULE_block = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declare_var", "array_init", "concatenation", 
			"comparison", "comparisonRef", "whileLoop", "forLoop", "forLoopReverse", 
			"forArray", "open", "let", "varInt", "varFloat", "varString", "assignment", 
			"print", "add", "minus", "multiply", "divide", "mod", "increment", "incrementPostfix", 
			"decrement", "decrementPostfix", "shl", "shr", "xorV", "orV", "andV", 
			"notV", "function", "params", "param", "typ", "smth", "expr", "stat_block", 
			"if_stat", "condition_block", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func main'", "'['", "']'", "','", "'concat'", "'while'", "'for'", 
			"'in'", "'reversed'", "'.length'", "'open'", "'let'", "'var: Int'", "'var: Float'", 
			"'var: String'", "'print'", "'+'", "'to'", "'-'", "'*'", "'/'", "'%'", 
			"'++'", "'--'", "'<<'", "'>>'", "'^'", "'|'", "'&'", "'~'", "'func'", 
			"':'", "'Int'", "'='", "'int'", null, "'if'", "'else'", "'{'", "'}'", 
			"'('", "')'", "'->'", "'true'", "'false'", null, "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'==='", null, null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ASSIGN", 
			"INTEGER", "STRING", "IF", "ELSE", "OBRACE", "CBRACE", "LSCOPE", "RSCOPE", 
			"ARROW", "TRUE", "FALSE", "INEQUALITY", "GRTTHEN", "LESTHEN", "GRTTHENEQUL", 
			"LESTHENEQUL", "EQUALITY", "TRIPLEEQUAL", "COMMENT", "LINE_COMMENT", 
			"ID", "CYRILLIC", "JAPANESE", "KOREAN", "FLOAT", "DOT", "NUMBER", "OCTAL", 
			"HEXADECIMAL", "Space", "OTHER", "WS"
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
	public String getGrammarFileName() { return "JulesVerne.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
	    String date = sdf.format(new Date());

	public JulesVerneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			match(LSCOPE);
			setState(88);
			match(RSCOPE);
			setState(89);
			match(OBRACE);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(95);
			match(CBRACE);
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
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public VarIntContext varInt() {
			return getRuleContext(VarIntContext.class,0);
		}
		public VarFloatContext varFloat() {
			return getRuleContext(VarFloatContext.class,0);
		}
		public VarStringContext varString() {
			return getRuleContext(VarStringContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonRefContext comparisonRef() {
			return getRuleContext(ComparisonRefContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForLoopReverseContext forLoopReverse() {
			return getRuleContext(ForLoopReverseContext.class,0);
		}
		public ForArrayContext forArray() {
			return getRuleContext(ForArrayContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public DivideContext divide() {
			return getRuleContext(DivideContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncrementPostfixContext incrementPostfix() {
			return getRuleContext(IncrementPostfixContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public DecrementPostfixContext decrementPostfix() {
			return getRuleContext(DecrementPostfixContext.class,0);
		}
		public ShlContext shl() {
			return getRuleContext(ShlContext.class,0);
		}
		public ShrContext shr() {
			return getRuleContext(ShrContext.class,0);
		}
		public XorVContext xorV() {
			return getRuleContext(XorVContext.class,0);
		}
		public OrVContext orV() {
			return getRuleContext(OrVContext.class,0);
		}
		public AndVContext andV() {
			return getRuleContext(AndVContext.class,0);
		}
		public NotVContext notV() {
			return getRuleContext(NotVContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SmthContext smth() {
			return getRuleContext(SmthContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				let();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				varInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				varFloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				varString();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				open();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				declare_var();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				concatenation();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				comparison();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				comparisonRef();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				whileLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
				forLoop();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(109);
				forLoopReverse();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(110);
				forArray();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(111);
				add();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(112);
				print();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(113);
				minus();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(114);
				multiply();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(115);
				divide();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(116);
				mod();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(117);
				increment();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(118);
				incrementPostfix();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(119);
				decrement();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(120);
				decrementPostfix();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(121);
				shl();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(122);
				shr();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(123);
				xorV();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(124);
				orV();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(125);
				andV();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(126);
				notV();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(127);
				function();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(128);
				smth();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(129);
				if_stat();
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

	public static class Declare_varContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JulesVerneParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public Declare_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterDeclare_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitDeclare_var(this);
		}
	}

	public final Declare_varContext declare_var() throws RecognitionException {
		Declare_varContext _localctx = new Declare_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(INTEGER);
			setState(133);
			match(ID);
			setState(134);
			match(T__1);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(135);
				match(NUMBER);
				}
			}

			setState(138);
			match(T__2);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(139);
				match(ASSIGN);
				setState(140);
				match(OBRACE);
				setState(141);
				array_init();
				setState(142);
				match(CBRACE);
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

	public static class Array_initContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public Array_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterArray_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitArray_init(this);
		}
	}

	public final Array_initContext array_init() throws RecognitionException {
		Array_initContext _localctx = new Array_initContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(147);
				match(T__3);
				setState(148);
				match(NUMBER);
				}
				}
				setState(153);
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

	public static class ConcatenationContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(JulesVerneParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JulesVerneParser.STRING, i);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitConcatenation(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_concatenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(STRING);
			setState(155);
			match(T__4);
			setState(156);
			match(STRING);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode INEQUALITY() { return getToken(JulesVerneParser.INEQUALITY, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JulesVerneParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JulesVerneParser.STRING, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(INEQUALITY);
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
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

	public static class ComparisonRefContext extends ParserRuleContext {
		public TerminalNode INEQUALITY() { return getToken(JulesVerneParser.INEQUALITY, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JulesVerneParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JulesVerneParser.STRING, i);
		}
		public ComparisonRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterComparisonRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitComparisonRef(this);
		}
	}

	public final ComparisonRefContext comparisonRef() throws RecognitionException {
		ComparisonRefContext _localctx = new ComparisonRefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparisonRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(INEQUALITY);
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public TerminalNode INEQUALITY() { return getToken(JulesVerneParser.INEQUALITY, 0); }
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
			setState(167);
			match(LSCOPE);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(INEQUALITY);
			setState(170);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			match(RSCOPE);
			setState(172);
			match(OBRACE);
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(178);
			match(CBRACE);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__6);
			setState(181);
			match(LSCOPE);
			setState(182);
			match(ID);
			setState(183);
			match(T__7);
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			match(RSCOPE);
			setState(186);
			match(OBRACE);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(192);
			match(CBRACE);
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

	public static class ForLoopReverseContext extends ParserRuleContext {
		public List<TerminalNode> LSCOPE() { return getTokens(JulesVerneParser.LSCOPE); }
		public TerminalNode LSCOPE(int i) {
			return getToken(JulesVerneParser.LSCOPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> RSCOPE() { return getTokens(JulesVerneParser.RSCOPE); }
		public TerminalNode RSCOPE(int i) {
			return getToken(JulesVerneParser.RSCOPE, i);
		}
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopReverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopReverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterForLoopReverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitForLoopReverse(this);
		}
	}

	public final ForLoopReverseContext forLoopReverse() throws RecognitionException {
		ForLoopReverseContext _localctx = new ForLoopReverseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forLoopReverse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__6);
			setState(195);
			match(LSCOPE);
			setState(196);
			match(ID);
			setState(197);
			match(T__7);
			setState(198);
			match(T__8);
			setState(199);
			match(LSCOPE);
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(201);
			match(RSCOPE);
			setState(202);
			match(RSCOPE);
			setState(203);
			match(OBRACE);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(209);
			match(CBRACE);
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

	public static class ForArrayContext extends ParserRuleContext {
		public List<TerminalNode> LSCOPE() { return getTokens(JulesVerneParser.LSCOPE); }
		public TerminalNode LSCOPE(int i) {
			return getToken(JulesVerneParser.LSCOPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> RSCOPE() { return getTokens(JulesVerneParser.RSCOPE); }
		public TerminalNode RSCOPE(int i) {
			return getToken(JulesVerneParser.RSCOPE, i);
		}
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterForArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitForArray(this);
		}
	}

	public final ForArrayContext forArray() throws RecognitionException {
		ForArrayContext _localctx = new ForArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__6);
			setState(212);
			match(LSCOPE);
			setState(213);
			match(ID);
			setState(214);
			match(T__7);
			setState(215);
			match(ID);
			setState(216);
			match(T__9);
			setState(217);
			match(LSCOPE);
			setState(218);
			match(RSCOPE);
			setState(219);
			match(RSCOPE);
			setState(220);
			match(OBRACE);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(226);
			match(CBRACE);
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

	public static class OpenContext extends ParserRuleContext {
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitOpen(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__10);
			setState(229);
			match(LSCOPE);
			{
			setState(230);
			match(STRING);
			}
			setState(231);
			match(RSCOPE);
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

	public static class LetContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode OCTAL() { return getToken(JulesVerneParser.OCTAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(JulesVerneParser.HEXADECIMAL, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitLet(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__11);
			setState(234);
			match(ID);
			setState(235);
			match(ASSIGN);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(236);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(237);
				match(OCTAL);
				}
				break;
			case 3:
				{
				setState(238);
				match(HEXADECIMAL);
				}
				break;
			case 4:
				{
				setState(239);
				match(ID);
				}
				break;
			case 5:
				{
				setState(240);
				match(FLOAT);
				}
				break;
			case 6:
				{
				setState(241);
				match(STRING);
				}
				break;
			case 7:
				{
				setState(242);
				concatenation();
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

	public static class VarIntContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public VarIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterVarInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitVarInt(this);
		}
	}

	public final VarIntContext varInt() throws RecognitionException {
		VarIntContext _localctx = new VarIntContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__12);
			setState(246);
			match(ID);
			setState(247);
			match(ASSIGN);
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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

	public static class VarFloatContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public VarFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterVarFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitVarFloat(this);
		}
	}

	public final VarFloatContext varFloat() throws RecognitionException {
		VarFloatContext _localctx = new VarFloatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__13);
			setState(251);
			match(ID);
			setState(252);
			match(ASSIGN);
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==FLOAT) ) {
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

	public static class VarStringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public VarStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterVarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitVarString(this);
		}
	}

	public final VarStringContext varString() throws RecognitionException {
		VarStringContext _localctx = new VarStringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__14);
			setState(256);
			match(ID);
			setState(257);
			match(ASSIGN);
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(258);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(259);
				match(ID);
				}
				break;
			case 3:
				{
				setState(260);
				concatenation();
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(JulesVerneParser.ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(264);
			match(ASSIGN);
			setState(265);
			match(ID);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode OCTAL() { return getToken(JulesVerneParser.OCTAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(JulesVerneParser.HEXADECIMAL, 0); }
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public TerminalNode CYRILLIC() { return getToken(JulesVerneParser.CYRILLIC, 0); }
		public TerminalNode JAPANESE() { return getToken(JulesVerneParser.JAPANESE, 0); }
		public TerminalNode KOREAN() { return getToken(JulesVerneParser.KOREAN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__15);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(268);
				match(NUMBER);
				}
				break;
			case OCTAL:
				{
				setState(269);
				match(OCTAL);
				}
				break;
			case HEXADECIMAL:
				{
				setState(270);
				match(HEXADECIMAL);
				}
				break;
			case ID:
				{
				setState(271);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(272);
				match(FLOAT);
				}
				break;
			case INTEGER:
				{
				setState(273);
				declare_var();
				}
				break;
			case STRING:
				{
				setState(274);
				match(STRING);
				}
				break;
			case CYRILLIC:
				{
				setState(275);
				match(CYRILLIC);
				}
				break;
			case JAPANESE:
				{
				setState(276);
				match(JAPANESE);
				}
				break;
			case KOREAN:
				{
				setState(277);
				match(KOREAN);
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

	public static class AddContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__16);
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
			match(T__17);
			setState(283);
			match(ID);
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

	public static class MinusContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__18);
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			match(T__17);
			setState(288);
			match(ID);
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

	public static class MultiplyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__19);
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(292);
			match(T__17);
			setState(293);
			match(ID);
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

	public static class DivideContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public DivideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitDivide(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__20);
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(297);
			match(T__17);
			setState(298);
			match(ID);
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

	public static class ModContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__21);
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(302);
			match(T__17);
			setState(303);
			match(ID);
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

	public static class IncrementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__22);
			{
			setState(306);
			match(ID);
			}
			setState(307);
			match(T__17);
			setState(308);
			match(ID);
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

	public static class IncrementPostfixContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public IncrementPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterIncrementPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitIncrementPostfix(this);
		}
	}

	public final IncrementPostfixContext incrementPostfix() throws RecognitionException {
		IncrementPostfixContext _localctx = new IncrementPostfixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_incrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			match(ID);
			}
			setState(311);
			match(T__17);
			setState(312);
			match(ID);
			setState(313);
			match(T__22);
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

	public static class DecrementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitDecrement(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__23);
			{
			setState(316);
			match(ID);
			}
			setState(317);
			match(T__17);
			setState(318);
			match(ID);
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

	public static class DecrementPostfixContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public DecrementPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrementPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterDecrementPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitDecrementPostfix(this);
		}
	}

	public final DecrementPostfixContext decrementPostfix() throws RecognitionException {
		DecrementPostfixContext _localctx = new DecrementPostfixContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_decrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320);
			match(ID);
			}
			setState(321);
			match(T__17);
			setState(322);
			match(ID);
			setState(323);
			match(T__22);
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

	public static class ShlContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public ShlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterShl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitShl(this);
		}
	}

	public final ShlContext shl() throws RecognitionException {
		ShlContext _localctx = new ShlContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__24);
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(327);
			match(T__17);
			setState(328);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class ShrContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public ShrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterShr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitShr(this);
		}
	}

	public final ShrContext shr() throws RecognitionException {
		ShrContext _localctx = new ShrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_shr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__25);
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(332);
			match(T__17);
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class XorVContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public XorVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterXorV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitXorV(this);
		}
	}

	public final XorVContext xorV() throws RecognitionException {
		XorVContext _localctx = new XorVContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_xorV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__26);
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			match(T__17);
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class OrVContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public OrVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterOrV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitOrV(this);
		}
	}

	public final OrVContext orV() throws RecognitionException {
		OrVContext _localctx = new OrVContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_orV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__27);
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
			match(T__17);
			setState(343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class AndVContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public AndVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterAndV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitAndV(this);
		}
	}

	public final AndVContext andV() throws RecognitionException {
		AndVContext _localctx = new AndVContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_andV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__28);
			setState(346);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
			match(T__17);
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class NotVContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(JulesVerneParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(JulesVerneParser.FLOAT, i);
		}
		public NotVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterNotV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitNotV(this);
		}
	}

	public final NotVContext notV() throws RecognitionException {
		NotVContext _localctx = new NotVContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__29);
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(352);
			match(T__17);
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JulesVerneParser.ARROW, 0); }
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__30);
			setState(356);
			match(ID);
			setState(357);
			match(LSCOPE);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(358);
				params();
				}
			}

			setState(361);
			match(RSCOPE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(362);
				match(ARROW);
				setState(363);
				typ();
				}
			}

			setState(366);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			param();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(369);
				match(T__3);
				setState(370);
				param();
				}
				}
				setState(375);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TypContext typ() {
			return getRuleContext(TypContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(ID);
			setState(377);
			match(T__31);
			setState(378);
			typ();
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

	public static class TypContext extends ParserRuleContext {
		public TypContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterTyp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitTyp(this);
		}
	}

	public final TypContext typ() throws RecognitionException {
		TypContext _localctx = new TypContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__32);
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

	public static class SmthContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JulesVerneParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(JulesVerneParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public SmthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterSmth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitSmth(this);
		}
	}

	public final SmthContext smth() throws RecognitionException {
		SmthContext _localctx = new SmthContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_smth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IF);
			{
			setState(383);
			expr();
			}
			setState(384);
			match(ELSE);
			{
			setState(385);
			stat_block();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LSCOPE() { return getToken(JulesVerneParser.LSCOPE, 0); }
		public TerminalNode INEQUALITY() { return getToken(JulesVerneParser.INEQUALITY, 0); }
		public TerminalNode RSCOPE() { return getToken(JulesVerneParser.RSCOPE, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(JulesVerneParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(JulesVerneParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(JulesVerneParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JulesVerneParser.STRING, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LSCOPE);
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(389);
			match(INEQUALITY);
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			match(RSCOPE);
			setState(392);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitStat_block(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stat_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(OBRACE);
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				statement();
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(400);
			match(CBRACE);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(JulesVerneParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(JulesVerneParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(JulesVerneParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(JulesVerneParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IF);
			setState(403);
			condition_block();
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(ELSE);
					setState(405);
					match(IF);
					setState(406);
					condition_block();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(412);
				match(ELSE);
				setState(413);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			expr();
			setState(417);
			stat_block();
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
		public TerminalNode OBRACE() { return getToken(JulesVerneParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OBRACE);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << INTEGER) | (1L << STRING) | (1L << IF) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(420);
				statement();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CBRACE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\6\2^\n\2\r\2\16\2_\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3\3\4\3\4\3\4"+
		"\3\4\5\4\u008b\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\5\3\5\3\5\7"+
		"\5\u0098\n\5\f\5\16\5\u009b\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00b1\n\t\r\t\16\t\u00b2"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00bf\n\n\r\n\16\n\u00c0"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00d0"+
		"\n\13\r\13\16\13\u00d1\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\6\f\u00e1\n\f\r\f\16\f\u00e2\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f6\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0108\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0119\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u016a\n#\3#\3#\3#"+
		"\5#\u016f\n#\3#\3#\3$\3$\3$\7$\u0176\n$\f$\16$\u0179\13$\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\6)\u018f\n)\r)\16"+
		")\u0190\3)\3)\3*\3*\3*\3*\3*\7*\u019a\n*\f*\16*\u019d\13*\3*\3*\5*\u01a1"+
		"\n*\3+\3+\3+\3,\3,\7,\u01a8\n,\f,\16,\u01ab\13,\3,\3,\3,\2\2-\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2"+
		"\7\4\299??\5\2&&99??\4\299==\6\2&&99==??\5\299==??\2\u01c3\2X\3\2\2\2"+
		"\4\u0084\3\2\2\2\6\u0086\3\2\2\2\b\u0094\3\2\2\2\n\u009c\3\2\2\2\f\u00a0"+
		"\3\2\2\2\16\u00a4\3\2\2\2\20\u00a8\3\2\2\2\22\u00b6\3\2\2\2\24\u00c4\3"+
		"\2\2\2\26\u00d5\3\2\2\2\30\u00e6\3\2\2\2\32\u00eb\3\2\2\2\34\u00f7\3\2"+
		"\2\2\36\u00fc\3\2\2\2 \u0101\3\2\2\2\"\u0109\3\2\2\2$\u010d\3\2\2\2&\u011a"+
		"\3\2\2\2(\u011f\3\2\2\2*\u0124\3\2\2\2,\u0129\3\2\2\2.\u012e\3\2\2\2\60"+
		"\u0133\3\2\2\2\62\u0138\3\2\2\2\64\u013d\3\2\2\2\66\u0142\3\2\2\28\u0147"+
		"\3\2\2\2:\u014c\3\2\2\2<\u0151\3\2\2\2>\u0156\3\2\2\2@\u015b\3\2\2\2B"+
		"\u0160\3\2\2\2D\u0165\3\2\2\2F\u0172\3\2\2\2H\u017a\3\2\2\2J\u017e\3\2"+
		"\2\2L\u0180\3\2\2\2N\u0185\3\2\2\2P\u018c\3\2\2\2R\u0194\3\2\2\2T\u01a2"+
		"\3\2\2\2V\u01a5\3\2\2\2XY\7\3\2\2YZ\7+\2\2Z[\7,\2\2[]\7)\2\2\\^\5\4\3"+
		"\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7*\2\2b\3\3\2"+
		"\2\2c\u0085\5\32\16\2d\u0085\5\34\17\2e\u0085\5\36\20\2f\u0085\5 \21\2"+
		"g\u0085\5\"\22\2h\u0085\5\30\r\2i\u0085\5\6\4\2j\u0085\5\n\6\2k\u0085"+
		"\5\f\7\2l\u0085\5\16\b\2m\u0085\5\20\t\2n\u0085\5\22\n\2o\u0085\5\24\13"+
		"\2p\u0085\5\26\f\2q\u0085\5&\24\2r\u0085\5$\23\2s\u0085\5(\25\2t\u0085"+
		"\5*\26\2u\u0085\5,\27\2v\u0085\5.\30\2w\u0085\5\60\31\2x\u0085\5\62\32"+
		"\2y\u0085\5\64\33\2z\u0085\5\66\34\2{\u0085\58\35\2|\u0085\5:\36\2}\u0085"+
		"\5<\37\2~\u0085\5> \2\177\u0085\5@!\2\u0080\u0085\5B\"\2\u0081\u0085\5"+
		"D#\2\u0082\u0085\5L\'\2\u0083\u0085\5R*\2\u0084c\3\2\2\2\u0084d\3\2\2"+
		"\2\u0084e\3\2\2\2\u0084f\3\2\2\2\u0084g\3\2\2\2\u0084h\3\2\2\2\u0084i"+
		"\3\2\2\2\u0084j\3\2\2\2\u0084k\3\2\2\2\u0084l\3\2\2\2\u0084m\3\2\2\2\u0084"+
		"n\3\2\2\2\u0084o\3\2\2\2\u0084p\3\2\2\2\u0084q\3\2\2\2\u0084r\3\2\2\2"+
		"\u0084s\3\2\2\2\u0084t\3\2\2\2\u0084u\3\2\2\2\u0084v\3\2\2\2\u0084w\3"+
		"\2\2\2\u0084x\3\2\2\2\u0084y\3\2\2\2\u0084z\3\2\2\2\u0084{\3\2\2\2\u0084"+
		"|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080"+
		"\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\5\3\2\2\2\u0086\u0087\7%\2\2\u0087\u0088\79\2\2\u0088\u008a\7\4\2\2\u0089"+
		"\u008b\7?\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0092\7\5\2\2\u008d\u008e\7$\2\2\u008e\u008f\7)\2\2\u008f\u0090"+
		"\5\b\5\2\u0090\u0091\7*\2\2\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\7\3\2\2\2\u0094\u0099\t\2\2\2\u0095\u0096\7\6\2\2"+
		"\u0096\u0098\7?\2\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\t\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7&\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7&\2\2\u009f\13\3\2\2\2"+
		"\u00a0\u00a1\t\3\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3\t\3\2\2\u00a3\r"+
		"\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00a6\7\60\2\2\u00a6\u00a7\t\3\2\2"+
		"\u00a7\17\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\t"+
		"\2\2\2\u00ab\u00ac\7\60\2\2\u00ac\u00ad\t\2\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00b0\7)\2\2\u00af\u00b1\5\4\3\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\7*\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7+\2\2"+
		"\u00b8\u00b9\79\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00bc"+
		"\7,\2\2\u00bc\u00be\7)\2\2\u00bd\u00bf\5\4\3\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7*\2\2\u00c3\23\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6"+
		"\7+\2\2\u00c6\u00c7\79\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\13\2\2\u00c9"+
		"\u00ca\7+\2\2\u00ca\u00cb\t\2\2\2\u00cb\u00cc\7,\2\2\u00cc\u00cd\7,\2"+
		"\2\u00cd\u00cf\7)\2\2\u00ce\u00d0\5\4\3\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7*\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\7+\2\2"+
		"\u00d7\u00d8\79\2\2\u00d8\u00d9\7\n\2\2\u00d9\u00da\79\2\2\u00da\u00db"+
		"\7\f\2\2\u00db\u00dc\7+\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7,\2\2\u00de"+
		"\u00e0\7)\2\2\u00df\u00e1\5\4\3\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7*\2\2\u00e5\27\3\2\2\2\u00e6\u00e7\7\r\2\2\u00e7\u00e8\7+\2\2"+
		"\u00e8\u00e9\7&\2\2\u00e9\u00ea\7,\2\2\u00ea\31\3\2\2\2\u00eb\u00ec\7"+
		"\16\2\2\u00ec\u00ed\79\2\2\u00ed\u00f5\7$\2\2\u00ee\u00f6\7?\2\2\u00ef"+
		"\u00f6\7@\2\2\u00f0\u00f6\7A\2\2\u00f1\u00f6\79\2\2\u00f2\u00f6\7=\2\2"+
		"\u00f3\u00f6\7&\2\2\u00f4\u00f6\5\n\6\2\u00f5\u00ee\3\2\2\2\u00f5\u00ef"+
		"\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\33\3\2\2\2\u00f7\u00f8\7\17\2"+
		"\2\u00f8\u00f9\79\2\2\u00f9\u00fa\7$\2\2\u00fa\u00fb\t\2\2\2\u00fb\35"+
		"\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\79\2\2\u00fe\u00ff\7$\2\2\u00ff"+
		"\u0100\t\4\2\2\u0100\37\3\2\2\2\u0101\u0102\7\21\2\2\u0102\u0103\79\2"+
		"\2\u0103\u0107\7$\2\2\u0104\u0108\7&\2\2\u0105\u0108\79\2\2\u0106\u0108"+
		"\5\n\6\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"!\3\2\2\2\u0109\u010a\79\2\2\u010a\u010b\7$\2\2\u010b\u010c\79\2\2\u010c"+
		"#\3\2\2\2\u010d\u0118\7\22\2\2\u010e\u0119\7?\2\2\u010f\u0119\7@\2\2\u0110"+
		"\u0119\7A\2\2\u0111\u0119\79\2\2\u0112\u0119\7=\2\2\u0113\u0119\5\6\4"+
		"\2\u0114\u0119\7&\2\2\u0115\u0119\7:\2\2\u0116\u0119\7;\2\2\u0117\u0119"+
		"\7<\2\2\u0118\u010e\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2"+
		"\2\2\u0118\u0115\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"%\3\2\2\2\u011a\u011b\7\23\2\2\u011b\u011c\t\5\2\2\u011c\u011d\7\24\2"+
		"\2\u011d\u011e\79\2\2\u011e\'\3\2\2\2\u011f\u0120\7\25\2\2\u0120\u0121"+
		"\t\6\2\2\u0121\u0122\7\24\2\2\u0122\u0123\79\2\2\u0123)\3\2\2\2\u0124"+
		"\u0125\7\26\2\2\u0125\u0126\t\6\2\2\u0126\u0127\7\24\2\2\u0127\u0128\7"+
		"9\2\2\u0128+\3\2\2\2\u0129\u012a\7\27\2\2\u012a\u012b\t\6\2\2\u012b\u012c"+
		"\7\24\2\2\u012c\u012d\79\2\2\u012d-\3\2\2\2\u012e\u012f\7\30\2\2\u012f"+
		"\u0130\t\6\2\2\u0130\u0131\7\24\2\2\u0131\u0132\79\2\2\u0132/\3\2\2\2"+
		"\u0133\u0134\7\31\2\2\u0134\u0135\79\2\2\u0135\u0136\7\24\2\2\u0136\u0137"+
		"\79\2\2\u0137\61\3\2\2\2\u0138\u0139\79\2\2\u0139\u013a\7\24\2\2\u013a"+
		"\u013b\79\2\2\u013b\u013c\7\31\2\2\u013c\63\3\2\2\2\u013d\u013e\7\32\2"+
		"\2\u013e\u013f\79\2\2\u013f\u0140\7\24\2\2\u0140\u0141\79\2\2\u0141\65"+
		"\3\2\2\2\u0142\u0143\79\2\2\u0143\u0144\7\24\2\2\u0144\u0145\79\2\2\u0145"+
		"\u0146\7\31\2\2\u0146\67\3\2\2\2\u0147\u0148\7\33\2\2\u0148\u0149\t\6"+
		"\2\2\u0149\u014a\7\24\2\2\u014a\u014b\t\6\2\2\u014b9\3\2\2\2\u014c\u014d"+
		"\7\34\2\2\u014d\u014e\t\6\2\2\u014e\u014f\7\24\2\2\u014f\u0150\t\6\2\2"+
		"\u0150;\3\2\2\2\u0151\u0152\7\35\2\2\u0152\u0153\t\6\2\2\u0153\u0154\7"+
		"\24\2\2\u0154\u0155\t\6\2\2\u0155=\3\2\2\2\u0156\u0157\7\36\2\2\u0157"+
		"\u0158\t\6\2\2\u0158\u0159\7\24\2\2\u0159\u015a\t\6\2\2\u015a?\3\2\2\2"+
		"\u015b\u015c\7\37\2\2\u015c\u015d\t\6\2\2\u015d\u015e\7\24\2\2\u015e\u015f"+
		"\t\6\2\2\u015fA\3\2\2\2\u0160\u0161\7 \2\2\u0161\u0162\t\6\2\2\u0162\u0163"+
		"\7\24\2\2\u0163\u0164\t\6\2\2\u0164C\3\2\2\2\u0165\u0166\7!\2\2\u0166"+
		"\u0167\79\2\2\u0167\u0169\7+\2\2\u0168\u016a\5F$\2\u0169\u0168\3\2\2\2"+
		"\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e\7,\2\2\u016c\u016d"+
		"\7-\2\2\u016d\u016f\5J&\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\5V,\2\u0171E\3\2\2\2\u0172\u0177\5H%\2\u0173"+
		"\u0174\7\6\2\2\u0174\u0176\5H%\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2"+
		"\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178G\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u017a\u017b\79\2\2\u017b\u017c\7\"\2\2\u017c\u017d\5J&\2\u017d"+
		"I\3\2\2\2\u017e\u017f\7#\2\2\u017fK\3\2\2\2\u0180\u0181\7\'\2\2\u0181"+
		"\u0182\5N(\2\u0182\u0183\7(\2\2\u0183\u0184\5P)\2\u0184M\3\2\2\2\u0185"+
		"\u0186\7+\2\2\u0186\u0187\t\3\2\2\u0187\u0188\7\60\2\2\u0188\u0189\t\3"+
		"\2\2\u0189\u018a\7,\2\2\u018a\u018b\5P)\2\u018bO\3\2\2\2\u018c\u018e\7"+
		")\2\2\u018d\u018f\5\4\3\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7*"+
		"\2\2\u0193Q\3\2\2\2\u0194\u0195\7\'\2\2\u0195\u019b\5T+\2\u0196\u0197"+
		"\7(\2\2\u0197\u0198\7\'\2\2\u0198\u019a\5T+\2\u0199\u0196\3\2\2\2\u019a"+
		"\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a0\3\2"+
		"\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7(\2\2\u019f\u01a1\5P)\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1S\3\2\2\2\u01a2\u01a3\5N(\2\u01a3\u01a4"+
		"\5P)\2\u01a4U\3\2\2\2\u01a5\u01a9\7)\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7*\2\2\u01adW\3\2\2\2\25"+
		"_\u0084\u008a\u0092\u0099\u00b2\u00c0\u00d1\u00e2\u00f5\u0107\u0118\u0169"+
		"\u016e\u0177\u0190\u019b\u01a0\u01a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}