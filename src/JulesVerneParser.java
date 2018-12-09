// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
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
		IF=25, ELSE=26, OBRACE=27, CBRACE=28, TRUE=29, FALSE=30, COMMENT=31, LINE_COMMENT=32, 
		ID=33, CYRILLIC=34, FLOAT=35, NUMBER=36, Space=37, WS=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_print = 3, 
		RULE_add = 4, RULE_minus = 5, RULE_multiply = 6, RULE_divide = 7, RULE_mod = 8, 
		RULE_increment = 9, RULE_incrementPostfix = 10, RULE_decrement = 11, RULE_decrementPostfix = 12, 
		RULE_shl = 13, RULE_shr = 14, RULE_xorV = 15, RULE_orV = 16, RULE_andV = 17, 
		RULE_notV = 18, RULE_string = 19, RULE_function = 20, RULE_smth = 21, 
		RULE_expr = 22, RULE_exprtr = 23, RULE_exprsmth = 24, RULE_if_stat = 25, 
		RULE_condition_block = 26, RULE_stat_block = 27, RULE_block = 28;
	public static final String[] ruleNames = {
		"program", "statement", "assign", "print", "add", "minus", "multiply", 
		"divide", "mod", "increment", "incrementPostfix", "decrement", "decrementPostfix", 
		"shl", "shr", "xorV", "orV", "andV", "notV", "string", "function", "smth", 
		"expr", "exprtr", "exprsmth", "if_stat", "condition_block", "stat_block", 
		"block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'let'", "'='", "'print'", "'+'", "'to'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'<<'", "'>>'", "'^'", "'|'", "'&'", 
		"'~'", "'\"'", "'\n'", "'func'", "'('", "')'", "'is'", "'if'", "'else'", 
		"'{'", "'}'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IF", "ELSE", "OBRACE", "CBRACE", "TRUE", "FALSE", "COMMENT", "LINE_COMMENT", 
		"ID", "CYRILLIC", "FLOAT", "NUMBER", "Space", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << IF) | (1L << ID))) != 0) );
			setState(64);
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				minus();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				multiply();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				divide();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				mod();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				increment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				incrementPostfix();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				decrement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				decrementPostfix();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				shl();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				shr();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				xorV();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(80);
				orV();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(81);
				andV();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(82);
				notV();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(83);
				function();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(84);
				smth();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(85);
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__1);
			setState(89);
			match(ID);
			setState(90);
			match(T__2);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(91);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(92);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(93);
				match(FLOAT);
				}
				break;
			case T__18:
				{
				setState(94);
				string();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JulesVerneParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(JulesVerneParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(JulesVerneParser.FLOAT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(98);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(99);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(100);
				match(FLOAT);
				}
				break;
			case T__18:
				{
				setState(101);
				string();
				}
				break;
			case CYRILLIC:
				{
				setState(102);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(106);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(107);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(108);
				match(FLOAT);
				}
				break;
			case T__18:
				{
				setState(109);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			match(T__5);
			setState(113);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_minus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__6);
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			match(T__5);
			setState(118);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			match(T__5);
			setState(123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivideContext divide() throws RecognitionException {
		DivideContext _localctx = new DivideContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__8);
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(T__5);
			setState(128);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__9);
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			match(T__5);
			setState(133);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__10);
			{
			setState(136);
			match(ID);
			}
			setState(137);
			match(T__5);
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitIncrementPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementPostfixContext incrementPostfix() throws RecognitionException {
		IncrementPostfixContext _localctx = new IncrementPostfixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_incrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			match(ID);
			}
			setState(141);
			match(T__5);
			setState(142);
			match(ID);
			setState(143);
			match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			{
			setState(146);
			match(ID);
			}
			setState(147);
			match(T__5);
			setState(148);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitDecrementPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementPostfixContext decrementPostfix() throws RecognitionException {
		DecrementPostfixContext _localctx = new DecrementPostfixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrementPostfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(150);
			match(ID);
			}
			setState(151);
			match(T__5);
			setState(152);
			match(ID);
			setState(153);
			match(T__10);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitShl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShlContext shl() throws RecognitionException {
		ShlContext _localctx = new ShlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_shl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__12);
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(T__5);
			setState(158);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitShr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShrContext shr() throws RecognitionException {
		ShrContext _localctx = new ShrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_shr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__13);
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			match(T__5);
			setState(163);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitXorV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorVContext xorV() throws RecognitionException {
		XorVContext _localctx = new XorVContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_xorV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__14);
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			match(T__5);
			setState(168);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitOrV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrVContext orV() throws RecognitionException {
		OrVContext _localctx = new OrVContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__15);
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
			match(T__5);
			setState(173);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitAndV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndVContext andV() throws RecognitionException {
		AndVContext _localctx = new AndVContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_andV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__16);
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			match(T__5);
			setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitNotV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotVContext notV() throws RecognitionException {
		NotVContext _localctx = new NotVContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_notV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__17);
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			match(T__5);
			setState(183);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JulesVerneListener ) ((JulesVerneListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__18);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << IF) | (1L << ELSE) | (1L << OBRACE) | (1L << CBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << ID) | (1L << CYRILLIC) | (1L << FLOAT) | (1L << NUMBER) | (1L << Space) | (1L << WS))) != 0)) {
				{
				{
				setState(186);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__18);
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__20);
			setState(195);
			match(ID);
			setState(196);
			match(OBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__3) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(197);
					assign();
					}
					break;
				case T__3:
					{
					setState(198);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitSmth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SmthContext smth() throws RecognitionException {
		SmthContext _localctx = new SmthContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_smth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IF);
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(207);
				expr();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case IF:
			case OBRACE:
			case ID:
				{
				setState(208);
				stat_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(211);
			match(ELSE);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(212);
				expr();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case IF:
			case OBRACE:
			case ID:
				{
				setState(213);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__21);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(217);
				exprtr();
				}
				break;
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				{
				setState(218);
				exprsmth();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitExprtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprtrContext exprtr() throws RecognitionException {
		ExprtrContext _localctx = new ExprtrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exprtr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			match(T__23);
			setState(225);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitExprsmth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsmthContext exprsmth() throws RecognitionException {
		ExprsmthContext _localctx = new ExprsmthContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exprsmth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(227);
				add();
				}
				break;
			case T__6:
				{
				setState(228);
				minus();
				}
				break;
			case T__7:
				{
				setState(229);
				multiply();
				}
				break;
			case T__8:
				{
				setState(230);
				divide();
				}
				break;
			case T__9:
				{
				setState(231);
				mod();
				}
				break;
			case T__10:
				{
				setState(232);
				increment();
				}
				break;
			case T__11:
				{
				setState(233);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IF);
			setState(237);
			condition_block();
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					match(ELSE);
					setState(239);
					match(IF);
					setState(240);
					condition_block();
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(246);
				match(ELSE);
				setState(247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expr();
			setState(251);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stat_block);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(OBRACE);
				setState(254);
				block();
				setState(255);
				match(CBRACE);
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__20:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JulesVerneVisitor ) return ((JulesVerneVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(260);
				statement();
				}
				}
				setState(265);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\6\2?\n\2\r"+
		"\2\16\2@\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\5\6q\n\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00be"+
		"\n\25\f\25\16\25\u00c1\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u00ca"+
		"\n\26\f\26\16\26\u00cd\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u00d4\n\27"+
		"\3\27\3\27\3\27\5\27\u00d9\n\27\3\30\3\30\3\30\5\30\u00de\n\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ed"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\7\33\u00f4\n\33\f\33\16\33\u00f7\13\33"+
		"\3\33\3\33\5\33\u00fb\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0105\n\35\3\36\7\36\u0108\n\36\f\36\16\36\u010b\13\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2#"+
		"#%&\3\2\25\26\3\2\37 \2\u011d\2<\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\bc\3\2"+
		"\2\2\nk\3\2\2\2\fu\3\2\2\2\16z\3\2\2\2\20\177\3\2\2\2\22\u0084\3\2\2\2"+
		"\24\u0089\3\2\2\2\26\u008e\3\2\2\2\30\u0093\3\2\2\2\32\u0098\3\2\2\2\34"+
		"\u009d\3\2\2\2\36\u00a2\3\2\2\2 \u00a7\3\2\2\2\"\u00ac\3\2\2\2$\u00b1"+
		"\3\2\2\2&\u00b6\3\2\2\2(\u00bb\3\2\2\2*\u00c4\3\2\2\2,\u00d0\3\2\2\2."+
		"\u00da\3\2\2\2\60\u00e1\3\2\2\2\62\u00ec\3\2\2\2\64\u00ee\3\2\2\2\66\u00fc"+
		"\3\2\2\28\u0104\3\2\2\2:\u0109\3\2\2\2<>\7\3\2\2=?\5\4\3\2>=\3\2\2\2?"+
		"@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\36\2\2C\3\3\2\2\2DY\5\6\4"+
		"\2EY\5\n\6\2FY\5\b\5\2GY\5\f\7\2HY\5\16\b\2IY\5\20\t\2JY\5\22\n\2KY\5"+
		"\24\13\2LY\5\26\f\2MY\5\30\r\2NY\5\32\16\2OY\5\34\17\2PY\5\36\20\2QY\5"+
		" \21\2RY\5\"\22\2SY\5$\23\2TY\5&\24\2UY\5*\26\2VY\5,\27\2WY\5\64\33\2"+
		"XD\3\2\2\2XE\3\2\2\2XF\3\2\2\2XG\3\2\2\2XH\3\2\2\2XI\3\2\2\2XJ\3\2\2\2"+
		"XK\3\2\2\2XL\3\2\2\2XM\3\2\2\2XN\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2"+
		"XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\5\3\2\2"+
		"\2Z[\7\4\2\2[\\\7#\2\2\\a\7\5\2\2]b\7&\2\2^b\7#\2\2_b\7%\2\2`b\5(\25\2"+
		"a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\7\3\2\2\2ci\7\6\2\2dj\7&\2\2"+
		"ej\7#\2\2fj\7%\2\2gj\5(\25\2hj\7$\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig"+
		"\3\2\2\2ih\3\2\2\2j\t\3\2\2\2kp\7\7\2\2lq\7&\2\2mq\7#\2\2nq\7%\2\2oq\5"+
		"(\25\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2qr\3\2\2\2rs\7\b\2\2st\7"+
		"#\2\2t\13\3\2\2\2uv\7\t\2\2vw\t\2\2\2wx\7\b\2\2xy\7#\2\2y\r\3\2\2\2z{"+
		"\7\n\2\2{|\t\2\2\2|}\7\b\2\2}~\7#\2\2~\17\3\2\2\2\177\u0080\7\13\2\2\u0080"+
		"\u0081\t\2\2\2\u0081\u0082\7\b\2\2\u0082\u0083\7#\2\2\u0083\21\3\2\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0086\t\2\2\2\u0086\u0087\7\b\2\2\u0087\u0088"+
		"\7#\2\2\u0088\23\3\2\2\2\u0089\u008a\7\r\2\2\u008a\u008b\7#\2\2\u008b"+
		"\u008c\7\b\2\2\u008c\u008d\7#\2\2\u008d\25\3\2\2\2\u008e\u008f\7#\2\2"+
		"\u008f\u0090\7\b\2\2\u0090\u0091\7#\2\2\u0091\u0092\7\r\2\2\u0092\27\3"+
		"\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7#\2\2\u0095\u0096\7\b\2\2\u0096"+
		"\u0097\7#\2\2\u0097\31\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a\7\b\2\2"+
		"\u009a\u009b\7#\2\2\u009b\u009c\7\r\2\2\u009c\33\3\2\2\2\u009d\u009e\7"+
		"\17\2\2\u009e\u009f\t\2\2\2\u009f\u00a0\7\b\2\2\u00a0\u00a1\t\2\2\2\u00a1"+
		"\35\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\t\2\2\2\u00a4\u00a5\7\b\2"+
		"\2\u00a5\u00a6\t\2\2\2\u00a6\37\3\2\2\2\u00a7\u00a8\7\21\2\2\u00a8\u00a9"+
		"\t\2\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\t\2\2\2\u00ab!\3\2\2\2\u00ac"+
		"\u00ad\7\22\2\2\u00ad\u00ae\t\2\2\2\u00ae\u00af\7\b\2\2\u00af\u00b0\t"+
		"\2\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\t\2\2\2\u00b3\u00b4"+
		"\7\b\2\2\u00b4\u00b5\t\2\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7\24\2\2\u00b7"+
		"\u00b8\t\2\2\2\u00b8\u00b9\7\b\2\2\u00b9\u00ba\t\2\2\2\u00ba\'\3\2\2\2"+
		"\u00bb\u00bf\7\25\2\2\u00bc\u00be\n\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3)\3\2\2\2\u00c4\u00c5\7\27\2"+
		"\2\u00c5\u00c6\7#\2\2\u00c6\u00cb\7\35\2\2\u00c7\u00ca\5\6\4\2\u00c8\u00ca"+
		"\5\b\5\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\36\2\2\u00cf+\3\2\2\2\u00d0\u00d3\7\33\2\2\u00d1\u00d4"+
		"\5.\30\2\u00d2\u00d4\58\35\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d8\7\34\2\2\u00d6\u00d9\5.\30\2\u00d7\u00d9\5"+
		"8\35\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9-\3\2\2\2\u00da\u00dd"+
		"\7\30\2\2\u00db\u00de\5\60\31\2\u00dc\u00de\5\62\32\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\31\2\2\u00e0"+
		"/\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7\32\2\2\u00e3\u00e4\t\4\2\2"+
		"\u00e4\61\3\2\2\2\u00e5\u00ed\5\n\6\2\u00e6\u00ed\5\f\7\2\u00e7\u00ed"+
		"\5\16\b\2\u00e8\u00ed\5\20\t\2\u00e9\u00ed\5\22\n\2\u00ea\u00ed\5\24\13"+
		"\2\u00eb\u00ed\5\30\r\2\u00ec\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec"+
		"\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00eb\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ef\7\33\2\2\u00ef\u00f5"+
		"\5\66\34\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f4\5\66"+
		"\34\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\34"+
		"\2\2\u00f9\u00fb\58\35\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\65\3\2\2\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\58\35\2\u00fe\67\3\2\2\2\u00ff"+
		"\u0100\7\35\2\2\u0100\u0101\5:\36\2\u0101\u0102\7\36\2\2\u0102\u0105\3"+
		"\2\2\2\u0103\u0105\5\4\3\2\u0104\u00ff\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"9\3\2\2\2\u0106\u0108\5\4\3\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a;\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\22@Xaip\u00bf\u00c9\u00cb\u00d3\u00d8\u00dd\u00ec\u00f5\u00fa\u0104"+
		"\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}