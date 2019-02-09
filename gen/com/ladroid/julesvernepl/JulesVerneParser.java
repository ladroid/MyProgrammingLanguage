// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/main/java/com/ladroid/julesvernepl/JulesVerne.g4 by ANTLR 4.7
package com.ladroid.julesvernepl;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ASSIGN=31, 
		INTEGER=32, STRING=33, IF=34, ELSE=35, OBRACE=36, CBRACE=37, TRUE=38, 
		FALSE=39, COMMENT=40, LINE_COMMENT=41, ID=42, CYRILLIC=43, FLOAT=44, NUMBER=45, 
		Space=46, OTHER=47, WS=48;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declare_var = 2, RULE_array_init = 3, 
		RULE_open = 4, RULE_let = 5, RULE_varInt = 6, RULE_varFloat = 7, RULE_print = 8, 
		RULE_add = 9, RULE_minus = 10, RULE_multiply = 11, RULE_divide = 12, RULE_mod = 13, 
		RULE_increment = 14, RULE_incrementPostfix = 15, RULE_decrement = 16, 
		RULE_decrementPostfix = 17, RULE_shl = 18, RULE_shr = 19, RULE_xorV = 20, 
		RULE_orV = 21, RULE_andV = 22, RULE_notV = 23, RULE_function = 24, RULE_params = 25, 
		RULE_param = 26, RULE_typ = 27, RULE_smth = 28, RULE_expr = 29, RULE_exprtr = 30, 
		RULE_exprsmth = 31, RULE_if_stat = 32, RULE_condition_block = 33, RULE_stat_block = 34, 
		RULE_block = 35;
	public static final String[] ruleNames = {
		"program", "statement", "declare_var", "array_init", "open", "let", "varInt", 
		"varFloat", "print", "add", "minus", "multiply", "divide", "mod", "increment", 
		"incrementPostfix", "decrement", "decrementPostfix", "shl", "shr", "xorV", 
		"orV", "andV", "notV", "function", "params", "param", "typ", "smth", "expr", 
		"exprtr", "exprsmth", "if_stat", "condition_block", "stat_block", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'['", "']'", "','", "'open ('", "')'", "'let'", 
		"'var: Int'", "'var: Float'", "'print'", "'+'", "'to'", "'-'", "'*'", 
		"'/'", "'%'", "'++'", "'--'", "'<<'", "'>>'", "'^'", "'|'", "'&'", "'~'", 
		"'func'", "'('", "'->'", "':'", "'Int'", "'is'", "'='", "'int'", null, 
		"'if'", "'else'", "'{'", "'}'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "ASSIGN", "INTEGER", "STRING", 
		"IF", "ELSE", "OBRACE", "CBRACE", "TRUE", "FALSE", "COMMENT", "LINE_COMMENT", 
		"ID", "CYRILLIC", "FLOAT", "NUMBER", "Space", "OTHER", "WS"
	};
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

	public JulesVerneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
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
			setState(72);
			match(T__0);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				statement();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INTEGER) | (1L << IF) | (1L << ID))) != 0) );
			setState(78);
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
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				let();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				varInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				varFloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				open();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				declare_var();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				add();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				print();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				minus();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				multiply();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				divide();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(90);
				mod();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				increment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(92);
				incrementPostfix();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				decrement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(94);
				decrementPostfix();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(95);
				shl();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(96);
				shr();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(97);
				xorV();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(98);
				orV();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(99);
				andV();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(100);
				notV();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(101);
				function();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(102);
				smth();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(103);
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
		public Array_initContext array_init() {
			return getRuleContext(Array_initContext.class,0);
		}
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
			setState(106);
			match(INTEGER);
			setState(107);
			match(ID);
			setState(108);
			match(T__1);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(109);
				match(NUMBER);
				}
			}

			setState(112);
			match(T__2);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(113);
				match(ASSIGN);
				setState(114);
				match(OBRACE);
				setState(115);
				array_init();
				setState(116);
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
			setState(120);
			match(NUMBER);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(121);
				match(T__3);
				setState(122);
				match(NUMBER);
				}
				}
				setState(127);
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

	public static class OpenContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__4);
			{
			setState(129);
			match(STRING);
			}
			setState(130);
			match(T__5);
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
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
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
		enterRule(_localctx, 10, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__6);
			setState(133);
			match(ID);
			setState(134);
			match(ASSIGN);
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
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

	public static class VarIntContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
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
		enterRule(_localctx, 12, RULE_varInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__7);
			setState(138);
			match(ID);
			setState(139);
			match(ASSIGN);
			setState(140);
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
		enterRule(_localctx, 14, RULE_varFloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			match(ID);
			setState(144);
			match(ASSIGN);
			setState(145);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public Declare_varContext declare_var() {
			return getRuleContext(Declare_varContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JulesVerneParser.STRING, 0); }
		public TerminalNode CYRILLIC() { return getToken(JulesVerneParser.CYRILLIC, 0); }
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
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__9);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(148);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(149);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(150);
				match(FLOAT);
				}
				break;
			case INTEGER:
				{
				setState(151);
				declare_var();
				}
				break;
			case STRING:
				{
				setState(152);
				match(STRING);
				}
				break;
			case CYRILLIC:
				{
				setState(153);
				match(CYRILLIC);
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
		enterRule(_localctx, 18, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__10);
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			match(T__11);
			setState(159);
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
		enterRule(_localctx, 20, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__12);
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
			match(T__11);
			setState(164);
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
		enterRule(_localctx, 22, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__13);
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(T__11);
			setState(169);
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
		enterRule(_localctx, 24, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__14);
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			match(T__11);
			setState(174);
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
		enterRule(_localctx, 26, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__15);
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			match(T__11);
			setState(179);
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
		enterRule(_localctx, 28, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__16);
			{
			setState(182);
			match(ID);
			}
			setState(183);
			match(T__11);
			setState(184);
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
		enterRule(_localctx, 30, RULE_incrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(186);
			match(ID);
			}
			setState(187);
			match(T__11);
			setState(188);
			match(ID);
			setState(189);
			match(T__16);
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
		enterRule(_localctx, 32, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__17);
			{
			setState(192);
			match(ID);
			}
			setState(193);
			match(T__11);
			setState(194);
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
		enterRule(_localctx, 34, RULE_decrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(196);
			match(ID);
			}
			setState(197);
			match(T__11);
			setState(198);
			match(ID);
			setState(199);
			match(T__16);
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
		enterRule(_localctx, 36, RULE_shl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__18);
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(203);
			match(T__11);
			setState(204);
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
		enterRule(_localctx, 38, RULE_shr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__19);
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			match(T__11);
			setState(209);
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
		enterRule(_localctx, 40, RULE_xorV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__20);
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			match(T__11);
			setState(214);
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
		enterRule(_localctx, 42, RULE_orV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__21);
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(218);
			match(T__11);
			setState(219);
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
		enterRule(_localctx, 44, RULE_andV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__22);
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
			match(T__11);
			setState(224);
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
		enterRule(_localctx, 46, RULE_notV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__23);
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			match(T__11);
			setState(229);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__24);
			setState(232);
			match(ID);
			setState(233);
			match(T__25);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(234);
				params();
				}
			}

			setState(237);
			match(T__5);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(238);
				match(T__26);
				setState(239);
				typ();
				}
			}

			setState(242);
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
		enterRule(_localctx, 50, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			param();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(245);
				match(T__3);
				setState(246);
				param();
				}
				}
				setState(251);
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
		enterRule(_localctx, 52, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID);
			setState(253);
			match(T__27);
			setState(254);
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
		enterRule(_localctx, 54, RULE_typ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__28);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
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
		enterRule(_localctx, 56, RULE_smth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IF);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(259);
				expr();
				}
				break;
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case INTEGER:
			case IF:
			case OBRACE:
			case ID:
				{
				setState(260);
				stat_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			match(ELSE);
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(264);
				expr();
				}
				break;
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case INTEGER:
			case IF:
			case OBRACE:
			case ID:
				{
				setState(265);
				stat_block();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprtrContext exprtr() {
			return getRuleContext(ExprtrContext.class,0);
		}
		public ExprsmthContext exprsmth() {
			return getRuleContext(ExprsmthContext.class,0);
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
		enterRule(_localctx, 58, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__25);
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(269);
				exprtr();
				}
				break;
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				{
				setState(270);
				exprsmth();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			match(T__5);
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

	public static class ExprtrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(JulesVerneParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JulesVerneParser.FALSE, 0); }
		public ExprtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprtr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterExprtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitExprtr(this);
		}
	}

	public final ExprtrContext exprtr() throws RecognitionException {
		ExprtrContext _localctx = new ExprtrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprtr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			setState(276);
			match(T__29);
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class ExprsmthContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
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
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ExprsmthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsmth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterExprsmth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitExprsmth(this);
		}
	}

	public final ExprsmthContext exprsmth() throws RecognitionException {
		ExprsmthContext _localctx = new ExprsmthContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprsmth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(279);
				add();
				}
				break;
			case T__12:
				{
				setState(280);
				minus();
				}
				break;
			case T__13:
				{
				setState(281);
				multiply();
				}
				break;
			case T__14:
				{
				setState(282);
				divide();
				}
				break;
			case T__15:
				{
				setState(283);
				mod();
				}
				break;
			case T__16:
				{
				setState(284);
				increment();
				}
				break;
			case T__17:
				{
				setState(285);
				decrement();
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
		enterRule(_localctx, 64, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IF);
			setState(289);
			condition_block();
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(ELSE);
					setState(291);
					match(IF);
					setState(292);
					condition_block();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(298);
				match(ELSE);
				setState(299);
				stat_block();
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
		enterRule(_localctx, 66, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			expr();
			setState(303);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(JulesVerneParser.CBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 68, RULE_stat_block);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(OBRACE);
				setState(306);
				block();
				setState(307);
				match(CBRACE);
				}
				break;
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case INTEGER:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				statement();
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

	public static class BlockContext extends ParserRuleContext {
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
		enterRule(_localctx, 70, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(OBRACE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << INTEGER) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0144\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\4\3\4\3\4\3\4\5\4q\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4y\n\4\3\5\3\5\3\5\7\5~\n\5\f\5\16\5\u0081\13\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\5\32\u00ee\n\32\3\32\3\32\3\32\5\32\u00f3\n\32\3\32\3\32\3\33\3\33"+
		"\3\33\7\33\u00fa\n\33\f\33\16\33\u00fd\13\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\5\36\u0108\n\36\3\36\3\36\3\36\5\36\u010d\n\36\3"+
		"\37\3\37\3\37\5\37\u0112\n\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\5!\u0121\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0128\n\"\f\"\16\"\u012b\13\""+
		"\3\"\3\"\5\"\u012f\n\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0139\n$\3%\3%\7%\u013d"+
		"\n%\f%\16%\u0140\13%\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\5\2##,,./\4\2,,//\4\2,,..\4\2,,"+
		"./\3\2()\2\u014f\2J\3\2\2\2\4j\3\2\2\2\6l\3\2\2\2\bz\3\2\2\2\n\u0082\3"+
		"\2\2\2\f\u0086\3\2\2\2\16\u008b\3\2\2\2\20\u0090\3\2\2\2\22\u0095\3\2"+
		"\2\2\24\u009e\3\2\2\2\26\u00a3\3\2\2\2\30\u00a8\3\2\2\2\32\u00ad\3\2\2"+
		"\2\34\u00b2\3\2\2\2\36\u00b7\3\2\2\2 \u00bc\3\2\2\2\"\u00c1\3\2\2\2$\u00c6"+
		"\3\2\2\2&\u00cb\3\2\2\2(\u00d0\3\2\2\2*\u00d5\3\2\2\2,\u00da\3\2\2\2."+
		"\u00df\3\2\2\2\60\u00e4\3\2\2\2\62\u00e9\3\2\2\2\64\u00f6\3\2\2\2\66\u00fe"+
		"\3\2\2\28\u0102\3\2\2\2:\u0104\3\2\2\2<\u010e\3\2\2\2>\u0115\3\2\2\2@"+
		"\u0120\3\2\2\2B\u0122\3\2\2\2D\u0130\3\2\2\2F\u0138\3\2\2\2H\u013a\3\2"+
		"\2\2JL\7\3\2\2KM\5\4\3\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2"+
		"\2\2PQ\7\'\2\2Q\3\3\2\2\2Rk\5\f\7\2Sk\5\16\b\2Tk\5\20\t\2Uk\5\n\6\2Vk"+
		"\5\6\4\2Wk\5\24\13\2Xk\5\22\n\2Yk\5\26\f\2Zk\5\30\r\2[k\5\32\16\2\\k\5"+
		"\34\17\2]k\5\36\20\2^k\5 \21\2_k\5\"\22\2`k\5$\23\2ak\5&\24\2bk\5(\25"+
		"\2ck\5*\26\2dk\5,\27\2ek\5.\30\2fk\5\60\31\2gk\5\62\32\2hk\5:\36\2ik\5"+
		"B\"\2jR\3\2\2\2jS\3\2\2\2jT\3\2\2\2jU\3\2\2\2jV\3\2\2\2jW\3\2\2\2jX\3"+
		"\2\2\2jY\3\2\2\2jZ\3\2\2\2j[\3\2\2\2j\\\3\2\2\2j]\3\2\2\2j^\3\2\2\2j_"+
		"\3\2\2\2j`\3\2\2\2ja\3\2\2\2jb\3\2\2\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2j"+
		"f\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\5\3\2\2\2lm\7\"\2\2mn\7,\2\2"+
		"np\7\4\2\2oq\7/\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rx\7\5\2\2st\7!\2\2t"+
		"u\7&\2\2uv\5\b\5\2vw\7\'\2\2wy\3\2\2\2xs\3\2\2\2xy\3\2\2\2y\7\3\2\2\2"+
		"z\177\7/\2\2{|\7\6\2\2|~\7/\2\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\t\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\7\2"+
		"\2\u0083\u0084\7#\2\2\u0084\u0085\7\b\2\2\u0085\13\3\2\2\2\u0086\u0087"+
		"\7\t\2\2\u0087\u0088\7,\2\2\u0088\u0089\7!\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\r\3\2\2\2\u008b\u008c\7\n\2\2\u008c\u008d\7,\2\2\u008d\u008e\7!\2\2\u008e"+
		"\u008f\t\3\2\2\u008f\17\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7,\2"+
		"\2\u0092\u0093\7!\2\2\u0093\u0094\t\4\2\2\u0094\21\3\2\2\2\u0095\u009c"+
		"\7\f\2\2\u0096\u009d\7/\2\2\u0097\u009d\7,\2\2\u0098\u009d\7.\2\2\u0099"+
		"\u009d\5\6\4\2\u009a\u009d\7#\2\2\u009b\u009d\7-\2\2\u009c\u0096\3\2\2"+
		"\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\7\r\2\2\u009f"+
		"\u00a0\t\2\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\7,\2\2\u00a2\25\3\2\2"+
		"\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\t\5\2\2\u00a5\u00a6\7\16\2\2\u00a6"+
		"\u00a7\7,\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\t\5\2"+
		"\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\7,\2\2\u00ac\31\3\2\2\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00af\t\5\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7,\2\2"+
		"\u00b1\33\3\2\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4\t\5\2\2\u00b4\u00b5"+
		"\7\16\2\2\u00b5\u00b6\7,\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8"+
		"\u00b9\7,\2\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\7,\2\2\u00bb\37\3\2\2\2"+
		"\u00bc\u00bd\7,\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\7,\2\2\u00bf\u00c0"+
		"\7\23\2\2\u00c0!\3\2\2\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\7,\2\2\u00c3"+
		"\u00c4\7\16\2\2\u00c4\u00c5\7,\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7"+
		"\u00c8\7\16\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\23\2\2\u00ca%\3\2\2\2"+
		"\u00cb\u00cc\7\25\2\2\u00cc\u00cd\t\5\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf"+
		"\t\5\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d2\t\5\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\u00d4\t\5\2\2\u00d4)\3\2\2\2\u00d5\u00d6\7\27\2"+
		"\2\u00d6\u00d7\t\5\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\t\5\2\2\u00d9"+
		"+\3\2\2\2\u00da\u00db\7\30\2\2\u00db\u00dc\t\5\2\2\u00dc\u00dd\7\16\2"+
		"\2\u00dd\u00de\t\5\2\2\u00de-\3\2\2\2\u00df\u00e0\7\31\2\2\u00e0\u00e1"+
		"\t\5\2\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3\t\5\2\2\u00e3/\3\2\2\2\u00e4"+
		"\u00e5\7\32\2\2\u00e5\u00e6\t\5\2\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\t"+
		"\5\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb\7,\2\2\u00eb"+
		"\u00ed\7\34\2\2\u00ec\u00ee\5\64\33\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\7\b\2\2\u00f0\u00f1\7\35\2\2"+
		"\u00f1\u00f3\58\35\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\5H%\2\u00f5\63\3\2\2\2\u00f6\u00fb\5\66\34\2\u00f7"+
		"\u00f8\7\6\2\2\u00f8\u00fa\5\66\34\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\65\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100\7\36\2\2\u0100\u0101\58"+
		"\35\2\u0101\67\3\2\2\2\u0102\u0103\7\37\2\2\u01039\3\2\2\2\u0104\u0107"+
		"\7$\2\2\u0105\u0108\5<\37\2\u0106\u0108\5F$\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\7%\2\2\u010a\u010d\5<\37"+
		"\2\u010b\u010d\5F$\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d;\3"+
		"\2\2\2\u010e\u0111\7\34\2\2\u010f\u0112\5> \2\u0110\u0112\5@!\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\b"+
		"\2\2\u0114=\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7 \2\2\u0117\u0118"+
		"\t\6\2\2\u0118?\3\2\2\2\u0119\u0121\5\24\13\2\u011a\u0121\5\26\f\2\u011b"+
		"\u0121\5\30\r\2\u011c\u0121\5\32\16\2\u011d\u0121\5\34\17\2\u011e\u0121"+
		"\5\36\20\2\u011f\u0121\5\"\22\2\u0120\u0119\3\2\2\2\u0120\u011a\3\2\2"+
		"\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e"+
		"\3\2\2\2\u0120\u011f\3\2\2\2\u0121A\3\2\2\2\u0122\u0123\7$\2\2\u0123\u0129"+
		"\5D#\2\u0124\u0125\7%\2\2\u0125\u0126\7$\2\2\u0126\u0128\5D#\2\u0127\u0124"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012e\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7%\2\2\u012d\u012f\5F$"+
		"\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012fC\3\2\2\2\u0130\u0131"+
		"\5<\37\2\u0131\u0132\5F$\2\u0132E\3\2\2\2\u0133\u0134\7&\2\2\u0134\u0135"+
		"\5H%\2\u0135\u0136\7\'\2\2\u0136\u0139\3\2\2\2\u0137\u0139\5\4\3\2\u0138"+
		"\u0133\3\2\2\2\u0138\u0137\3\2\2\2\u0139G\3\2\2\2\u013a\u013e\7&\2\2\u013b"+
		"\u013d\5\4\3\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7\'\2\2\u0142I\3\2\2\2\23Njpx\177\u009c\u00ed\u00f2\u00fb\u0107"+
		"\u010c\u0111\u0120\u0129\u012e\u0138\u013e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}