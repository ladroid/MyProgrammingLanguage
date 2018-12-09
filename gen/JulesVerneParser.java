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
		T__17=18, T__18=19, T__19=20, IF=21, ELSE=22, OBRACE=23, CBRACE=24, TRUE=25, 
		FALSE=26, COMMENT=27, LINE_COMMENT=28, ID=29, CYRILLIC=30, FLOAT=31, NUMBER=32, 
		Space=33, WS=34;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_print = 3, 
		RULE_add = 4, RULE_minus = 5, RULE_multiply = 6, RULE_divide = 7, RULE_mod = 8, 
		RULE_increment = 9, RULE_decrement = 10, RULE_shl = 11, RULE_shr = 12, 
		RULE_string = 13, RULE_function = 14, RULE_smth = 15, RULE_expr = 16, 
		RULE_exprtr = 17, RULE_exprsmth = 18, RULE_if_stat = 19, RULE_condition_block = 20, 
		RULE_stat_block = 21, RULE_block = 22;
	public static final String[] ruleNames = {
		"program", "statement", "assign", "print", "add", "minus", "multiply", 
		"divide", "mod", "increment", "decrement", "shl", "shr", "string", "function", 
		"smth", "expr", "exprtr", "exprsmth", "if_stat", "condition_block", "stat_block", 
		"block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'let'", "'='", "'print'", "'+'", "'to'", "'-'", 
		"'*'", "'/'", "'%'", "'++'", "'--'", "'<<'", "'>>'", "'\"'", "'\n'", "'func'", 
		"'('", "')'", "'is'", "'if'", "'else'", "'{'", "'}'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "IF", "ELSE", "OBRACE", 
		"CBRACE", "TRUE", "FALSE", "COMMENT", "LINE_COMMENT", "ID", "CYRILLIC", 
		"FLOAT", "NUMBER", "Space", "WS"
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
			setState(46);
			match(T__0);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << IF))) != 0) );
			setState(52);
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
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ShlContext shl() {
			return getRuleContext(ShlContext.class,0);
		}
		public ShrContext shr() {
			return getRuleContext(ShrContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				minus();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				multiply();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				divide();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				mod();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				increment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(62);
				decrement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(63);
				shl();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(64);
				shr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(65);
				function();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(66);
				smth();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(67);
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
			setState(70);
			match(T__1);
			setState(71);
			match(ID);
			setState(72);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(73);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(74);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(75);
				match(FLOAT);
				}
				break;
			case T__14:
				{
				setState(76);
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
			setState(79);
			match(T__3);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(80);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(81);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(82);
				match(FLOAT);
				}
				break;
			case T__14:
				{
				setState(83);
				string();
				}
				break;
			case CYRILLIC:
				{
				setState(84);
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
			setState(87);
			match(T__4);
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(88);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(89);
				match(ID);
				}
				break;
			case FLOAT:
				{
				setState(90);
				match(FLOAT);
				}
				break;
			case T__14:
				{
				setState(91);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			match(T__5);
			setState(95);
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
			setState(97);
			match(T__6);
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(99);
			match(T__5);
			setState(100);
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
			setState(102);
			match(T__7);
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
			match(T__5);
			setState(105);
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
			setState(107);
			match(T__8);
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			match(T__5);
			setState(110);
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
			setState(112);
			match(T__9);
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << FLOAT) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
			match(T__5);
			setState(115);
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
			setState(117);
			match(T__10);
			{
			setState(118);
			match(ID);
			}
			setState(119);
			match(T__5);
			setState(120);
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
		enterRule(_localctx, 20, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			{
			setState(123);
			match(ID);
			}
			setState(124);
			match(T__5);
			setState(125);
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

	public static class ShlContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
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
		enterRule(_localctx, 22, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__12);
			{
			setState(128);
			match(ID);
			}
			setState(129);
			match(T__5);
			setState(130);
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

	public static class ShrContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JulesVerneParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JulesVerneParser.ID, i);
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
		enterRule(_localctx, 24, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__13);
			{
			setState(133);
			match(ID);
			}
			setState(134);
			match(T__5);
			setState(135);
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
		enterRule(_localctx, 26, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__14);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << IF) | (1L << ELSE) | (1L << OBRACE) | (1L << CBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << ID) | (1L << CYRILLIC) | (1L << FLOAT) | (1L << NUMBER) | (1L << Space) | (1L << WS))) != 0)) {
				{
				{
				setState(138);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__14);
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__16);
			setState(147);
			match(ID);
			setState(148);
			match(OBRACE);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__3) {
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(149);
					assign();
					}
					break;
				case T__3:
					{
					setState(150);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
		enterRule(_localctx, 30, RULE_smth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(159);
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
			case T__16:
			case IF:
			case OBRACE:
				{
				setState(160);
				stat_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			match(ELSE);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(164);
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
			case T__16:
			case IF:
			case OBRACE:
				{
				setState(165);
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
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__17);
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(169);
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
				setState(170);
				exprsmth();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
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
		enterRule(_localctx, 34, RULE_exprtr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(176);
			match(T__19);
			setState(177);
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
		enterRule(_localctx, 36, RULE_exprsmth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(179);
				add();
				}
				break;
			case T__6:
				{
				setState(180);
				minus();
				}
				break;
			case T__7:
				{
				setState(181);
				multiply();
				}
				break;
			case T__8:
				{
				setState(182);
				divide();
				}
				break;
			case T__9:
				{
				setState(183);
				mod();
				}
				break;
			case T__10:
				{
				setState(184);
				increment();
				}
				break;
			case T__11:
				{
				setState(185);
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
		enterRule(_localctx, 38, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IF);
			setState(189);
			condition_block();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					match(ELSE);
					setState(191);
					match(IF);
					setState(192);
					condition_block();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(198);
				match(ELSE);
				setState(199);
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
		enterRule(_localctx, 40, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expr();
			setState(203);
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
		enterRule(_localctx, 42, RULE_stat_block);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(OBRACE);
				setState(206);
				block();
				setState(207);
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
			case T__16:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << IF))) != 0)) {
				{
				{
				setState(212);
				statement();
				}
				}
				setState(217);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\6"+
		"\2\63\n\2\r\2\16\2\64\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u008e\n\17\f\17\16\17\u0091"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u009a\n\20\f\20\16\20\u009d"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a4\n\21\3\21\3\21\3\21\5\21\u00a9"+
		"\n\21\3\22\3\22\3\22\5\22\u00ae\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bd\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00c4\n\25\f\25\16\25\u00c7\13\25\3\25\3\25\5\25\u00cb\n\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00d5\n\27\3\30\7\30\u00d8\n"+
		"\30\f\30\16\30\u00db\13\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\5\4\2\37\37!\"\3\2\21\22\3\2\33\34\2\u00ed\2\60\3\2"+
		"\2\2\4F\3\2\2\2\6H\3\2\2\2\bQ\3\2\2\2\nY\3\2\2\2\fc\3\2\2\2\16h\3\2\2"+
		"\2\20m\3\2\2\2\22r\3\2\2\2\24w\3\2\2\2\26|\3\2\2\2\30\u0081\3\2\2\2\32"+
		"\u0086\3\2\2\2\34\u008b\3\2\2\2\36\u0094\3\2\2\2 \u00a0\3\2\2\2\"\u00aa"+
		"\3\2\2\2$\u00b1\3\2\2\2&\u00bc\3\2\2\2(\u00be\3\2\2\2*\u00cc\3\2\2\2,"+
		"\u00d4\3\2\2\2.\u00d9\3\2\2\2\60\62\7\3\2\2\61\63\5\4\3\2\62\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\32"+
		"\2\2\67\3\3\2\2\28G\5\6\4\29G\5\n\6\2:G\5\b\5\2;G\5\f\7\2<G\5\16\b\2="+
		"G\5\20\t\2>G\5\22\n\2?G\5\24\13\2@G\5\26\f\2AG\5\30\r\2BG\5\32\16\2CG"+
		"\5\36\20\2DG\5 \21\2EG\5(\25\2F8\3\2\2\2F9\3\2\2\2F:\3\2\2\2F;\3\2\2\2"+
		"F<\3\2\2\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2"+
		"FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\7\4\2\2IJ\7\37\2\2JO\7\5\2"+
		"\2KP\7\"\2\2LP\7\37\2\2MP\7!\2\2NP\5\34\17\2OK\3\2\2\2OL\3\2\2\2OM\3\2"+
		"\2\2ON\3\2\2\2P\7\3\2\2\2QW\7\6\2\2RX\7\"\2\2SX\7\37\2\2TX\7!\2\2UX\5"+
		"\34\17\2VX\7 \2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\t"+
		"\3\2\2\2Y^\7\7\2\2Z_\7\"\2\2[_\7\37\2\2\\_\7!\2\2]_\5\34\17\2^Z\3\2\2"+
		"\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7\b\2\2ab\7\37\2\2b\13\3"+
		"\2\2\2cd\7\t\2\2de\t\2\2\2ef\7\b\2\2fg\7\37\2\2g\r\3\2\2\2hi\7\n\2\2i"+
		"j\t\2\2\2jk\7\b\2\2kl\7\37\2\2l\17\3\2\2\2mn\7\13\2\2no\t\2\2\2op\7\b"+
		"\2\2pq\7\37\2\2q\21\3\2\2\2rs\7\f\2\2st\t\2\2\2tu\7\b\2\2uv\7\37\2\2v"+
		"\23\3\2\2\2wx\7\r\2\2xy\7\37\2\2yz\7\b\2\2z{\7\37\2\2{\25\3\2\2\2|}\7"+
		"\16\2\2}~\7\37\2\2~\177\7\b\2\2\177\u0080\7\37\2\2\u0080\27\3\2\2\2\u0081"+
		"\u0082\7\17\2\2\u0082\u0083\7\37\2\2\u0083\u0084\7\b\2\2\u0084\u0085\7"+
		"\37\2\2\u0085\31\3\2\2\2\u0086\u0087\7\20\2\2\u0087\u0088\7\37\2\2\u0088"+
		"\u0089\7\b\2\2\u0089\u008a\7\37\2\2\u008a\33\3\2\2\2\u008b\u008f\7\21"+
		"\2\2\u008c\u008e\n\3\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0093\7\21\2\2\u0093\35\3\2\2\2\u0094\u0095\7\23\2\2\u0095"+
		"\u0096\7\37\2\2\u0096\u009b\7\31\2\2\u0097\u009a\5\6\4\2\u0098\u009a\5"+
		"\b\5\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u009f\7\32\2\2\u009f\37\3\2\2\2\u00a0\u00a3\7\27\2\2\u00a1"+
		"\u00a4\5\"\22\2\u00a2\u00a4\5,\27\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\7\30\2\2\u00a6\u00a9\5\"\22\2\u00a7"+
		"\u00a9\5,\27\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9!\3\2\2\2"+
		"\u00aa\u00ad\7\24\2\2\u00ab\u00ae\5$\23\2\u00ac\u00ae\5&\24\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\25\2\2"+
		"\u00b0#\3\2\2\2\u00b1\u00b2\7\37\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4"+
		"\t\4\2\2\u00b4%\3\2\2\2\u00b5\u00bd\5\n\6\2\u00b6\u00bd\5\f\7\2\u00b7"+
		"\u00bd\5\16\b\2\u00b8\u00bd\5\20\t\2\u00b9\u00bd\5\22\n\2\u00ba\u00bd"+
		"\5\24\13\2\u00bb\u00bd\5\26\f\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2"+
		"\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\'\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf"+
		"\u00c5\5*\26\2\u00c0\u00c1\7\30\2\2\u00c1\u00c2\7\27\2\2\u00c2\u00c4\5"+
		"*\26\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\30"+
		"\2\2\u00c9\u00cb\5,\27\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		")\3\2\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\5,\27\2\u00ce+\3\2\2\2\u00cf"+
		"\u00d0\7\31\2\2\u00d0\u00d1\5.\30\2\u00d1\u00d2\7\32\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d5\5\4\3\2\u00d4\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"-\3\2\2\2\u00d6\u00d8\5\4\3\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da/\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\22\64FOW^\u008f\u0099\u009b\u00a3\u00a8\u00ad\u00bc\u00c5\u00ca"+
		"\u00d4\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}