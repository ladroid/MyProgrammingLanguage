// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/main/java/com/ladroid/julesvernepl/JulesVerne.g4 by ANTLR 4.7.2
package com.ladroid.julesvernepl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JulesVerneLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"ASSIGN", "INTEGER", "STRING", "IF", "ELSE", "OBRACE", "CBRACE", "LSCOPE", 
			"RSCOPE", "ARROW", "TRUE", "FALSE", "INEQUALITY", "GRTTHEN", "LESTHEN", 
			"GRTTHENEQUL", "LESTHENEQUL", "EQUALITY", "TRIPLEEQUAL", "COMMENT", "LINE_COMMENT", 
			"ID", "CYRILLIC", "JAPANESE", "KOREAN", "FLOAT", "DOT", "NUMBER", "OCTAL", 
			"HEXADECIMAL", "Space", "OTHER", "WS"
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


	public JulesVerneLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JulesVerne.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3$\3%\3%\7%\u0120\n%\f%\16%\u0123\13%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\5/\u014b\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66"+
		"\u0162\n\66\f\66\16\66\u0165\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\7\67\u0170\n\67\f\67\16\67\u0173\13\67\3\67\3\67\38\38\78\u0179"+
		"\n8\f8\168\u017c\138\39\39\3:\3:\3;\3;\3<\6<\u0185\n<\r<\16<\u0186\3<"+
		"\3<\6<\u018b\n<\r<\16<\u018c\3=\3=\3>\6>\u0192\n>\r>\16>\u0193\3?\3?\3"+
		"?\7?\u0199\n?\f?\16?\u019c\13?\3@\3@\3@\3@\6@\u01a2\n@\r@\16@\u01a3\3"+
		"A\3A\3A\3A\3B\3B\3C\6C\u01ad\nC\rC\16C\u01ae\3C\3C\3\u0163\2D\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\f\3\2$$\4\2\f\f\17\17\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2\62;\3\2\639\3\2\629\5\2\62;CHch\5\2\13\f\16\17\""+
		"\"\5\2\13\f\17\17\"\"\3\36\2\u2e82\2\u2e9b\2\u2e9d\2\u2ef5\2\u2f02\2\u2fd7"+
		"\2\u3007\2\u3007\2\u3009\2\u3009\2\u3023\2\u302b\2\u303a\2\u303d\2\u3043"+
		"\2\u3098\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30ff\2\u3101\2\u31f2\2\u3201"+
		"\2\u32d2\2\u3300\2\u3302\2\u3359\2\u3402\2\u4db7\2\u4e02\2\u9fec\2\uf902"+
		"\2\ufa6f\2\ufa72\2\ufadb\2\uff68\2\uff71\2\uff73\2\uff9f\2\ub002\3\ub120"+
		"\3\uf202\3\uf202\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4\ub822\4"+
		"\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u01c0\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2"+
		"\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r"+
		"\u009e\3\2\2\2\17\u00a4\3\2\2\2\21\u00a8\3\2\2\2\23\u00ab\3\2\2\2\25\u00b4"+
		"\3\2\2\2\27\u00bc\3\2\2\2\31\u00c1\3\2\2\2\33\u00c5\3\2\2\2\35\u00ce\3"+
		"\2\2\2\37\u00d9\3\2\2\2!\u00e5\3\2\2\2#\u00eb\3\2\2\2%\u00ed\3\2\2\2\'"+
		"\u00f0\3\2\2\2)\u00f2\3\2\2\2+\u00f4\3\2\2\2-\u00f6\3\2\2\2/\u00f8\3\2"+
		"\2\2\61\u00fb\3\2\2\2\63\u00fe\3\2\2\2\65\u0101\3\2\2\2\67\u0104\3\2\2"+
		"\29\u0106\3\2\2\2;\u0108\3\2\2\2=\u010a\3\2\2\2?\u010c\3\2\2\2A\u0111"+
		"\3\2\2\2C\u0113\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011d\3\2\2\2K"+
		"\u0126\3\2\2\2M\u0129\3\2\2\2O\u012e\3\2\2\2Q\u0130\3\2\2\2S\u0132\3\2"+
		"\2\2U\u0134\3\2\2\2W\u0136\3\2\2\2Y\u0139\3\2\2\2[\u013e\3\2\2\2]\u014a"+
		"\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c\u0150\3\2\2\2e\u0153\3\2\2\2g"+
		"\u0156\3\2\2\2i\u0159\3\2\2\2k\u015d\3\2\2\2m\u016b\3\2\2\2o\u0176\3\2"+
		"\2\2q\u017d\3\2\2\2s\u017f\3\2\2\2u\u0181\3\2\2\2w\u0184\3\2\2\2y\u018e"+
		"\3\2\2\2{\u0191\3\2\2\2}\u0195\3\2\2\2\177\u019d\3\2\2\2\u0081\u01a5\3"+
		"\2\2\2\u0083\u01a9\3\2\2\2\u0085\u01ac\3\2\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7p\2\2\u008a\u008b\7e\2\2\u008b\u008c\7\"\2"+
		"\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f\7k\2\2\u008f\u0090"+
		"\7p\2\2\u0090\4\3\2\2\2\u0091\u0092\7]\2\2\u0092\6\3\2\2\2\u0093\u0094"+
		"\7_\2\2\u0094\b\3\2\2\2\u0095\u0096\7.\2\2\u0096\n\3\2\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\u009b\7e\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7v\2\2\u009d\f\3\2\2\2\u009e\u009f\7y\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3\16\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7"+
		"t\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\22"+
		"\3\2\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7x\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2"+
		"\u00b2\u00b3\7f\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7i\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\u00bb\7j\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7r\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7p\2\2\u00c0\30\3\2\2\2\u00c1"+
		"\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7v\2\2\u00c4\32\3\2\2\2\u00c5"+
		"\u00c6\7x\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7<\2\2"+
		"\u00c9\u00ca\7\"\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\34\3\2\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1"+
		"\7t\2\2\u00d1\u00d2\7<\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7H\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\36\3\2\2\2\u00d9\u00da\7x\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7"+
		"t\2\2\u00dc\u00dd\7<\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7U\2\2\u00df"+
		"\u00e0\7v\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2"+
		"\u00e3\u00e4\7i\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2"+
		"\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00ea\"\3"+
		"\2\2\2\u00eb\u00ec\7-\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7q\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7"+
		",\2\2\u00f3*\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7"+
		"\'\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9\u00fa\7-\2\2\u00fa\60\3"+
		"\2\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\7/\2\2\u00fd\62\3\2\2\2\u00fe\u00ff"+
		"\7>\2\2\u00ff\u0100\7>\2\2\u0100\64\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103"+
		"\7@\2\2\u0103\66\3\2\2\2\u0104\u0105\7`\2\2\u01058\3\2\2\2\u0106\u0107"+
		"\7~\2\2\u0107:\3\2\2\2\u0108\u0109\7(\2\2\u0109<\3\2\2\2\u010a\u010b\7"+
		"\u0080\2\2\u010b>\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u010f\7p\2\2\u010f\u0110\7e\2\2\u0110@\3\2\2\2\u0111\u0112\7<\2\2\u0112"+
		"B\3\2\2\2\u0113\u0114\7K\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116"+
		"D\3\2\2\2\u0117\u0118\7?\2\2\u0118F\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7v\2\2\u011cH\3\2\2\2\u011d\u0121\7$\2\2\u011e\u0120"+
		"\n\2\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$"+
		"\2\2\u0125J\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7h\2\2\u0128L\3\2\2"+
		"\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c\7u\2\2\u012c\u012d"+
		"\7g\2\2\u012dN\3\2\2\2\u012e\u012f\7}\2\2\u012fP\3\2\2\2\u0130\u0131\7"+
		"\177\2\2\u0131R\3\2\2\2\u0132\u0133\7*\2\2\u0133T\3\2\2\2\u0134\u0135"+
		"\7+\2\2\u0135V\3\2\2\2\u0136\u0137\7/\2\2\u0137\u0138\7@\2\2\u0138X\3"+
		"\2\2\2\u0139\u013a\7v\2\2\u013a\u013b\7t\2\2\u013b\u013c\7w\2\2\u013c"+
		"\u013d\7g\2\2\u013dZ\3\2\2\2\u013e\u013f\7h\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7n\2\2\u0141\u0142\7u\2\2\u0142\u0143\7g\2\2\u0143\\\3\2\2\2\u0144"+
		"\u014b\5_\60\2\u0145\u014b\5a\61\2\u0146\u014b\5c\62\2\u0147\u014b\5e"+
		"\63\2\u0148\u014b\5g\64\2\u0149\u014b\5i\65\2\u014a\u0144\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u0149\3\2\2\2\u014b^\3\2\2\2\u014c\u014d\7@\2\2\u014d`\3\2"+
		"\2\2\u014e\u014f\7>\2\2\u014fb\3\2\2\2\u0150\u0151\7@\2\2\u0151\u0152"+
		"\7?\2\2\u0152d\3\2\2\2\u0153\u0154\7>\2\2\u0154\u0155\7?\2\2\u0155f\3"+
		"\2\2\2\u0156\u0157\7?\2\2\u0157\u0158\7?\2\2\u0158h\3\2\2\2\u0159\u015a"+
		"\7?\2\2\u015a\u015b\7?\2\2\u015b\u015c\7?\2\2\u015cj\3\2\2\2\u015d\u015e"+
		"\7\61\2\2\u015e\u015f\7,\2\2\u015f\u0163\3\2\2\2\u0160\u0162\13\2\2\2"+
		"\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167"+
		"\u0168\7\61\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\66\2\2\u016al\3\2\2"+
		"\2\u016b\u016c\7\61\2\2\u016c\u016d\7\61\2\2\u016d\u0171\3\2\2\2\u016e"+
		"\u0170\n\3\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\b\67\2\2\u0175n\3\2\2\2\u0176\u017a\t\4\2\2\u0177\u0179\t\5\2\2"+
		"\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b"+
		"\3\2\2\2\u017bp\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\4\u0402\u0501"+
		"\2\u017er\3\2\2\2\u017f\u0180\t\f\2\2\u0180t\3\2\2\2\u0181\u0182\4\uac02"+
		"\uc001\2\u0182v\3\2\2\2\u0183\u0185\4\62;\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u018a\7\60\2\2\u0189\u018b\4\62;\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dx\3\2\2\2"+
		"\u018e\u018f\7\60\2\2\u018fz\3\2\2\2\u0190\u0192\t\6\2\2\u0191\u0190\3"+
		"\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"|\3\2\2\2\u0195\u0196\7\62\2\2\u0196\u019a\t\7\2\2\u0197\u0199\t\b\2\2"+
		"\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b~\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\62\2\2\u019e"+
		"\u019f\7z\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\t\t\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u0080\3\2\2\2\u01a5\u01a6\t\n\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\bA"+
		"\2\2\u01a8\u0082\3\2\2\2\u01a9\u01aa\13\2\2\2\u01aa\u0084\3\2\2\2\u01ab"+
		"\u01ad\t\13\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3"+
		"\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\bC\3\2\u01b1"+
		"\u0086\3\2\2\2\16\2\u0121\u014a\u0163\u0171\u017a\u0186\u018c\u0193\u019a"+
		"\u01a3\u01ae\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}