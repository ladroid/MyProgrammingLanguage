// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		COMMENT=18, LINE_COMMENT=19, ID=20, CYRILLIC=21, FLOAT=22, NUMBER=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"COMMENT", "LINE_COMMENT", "ID", "CYRILLIC", "FLOAT", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'}'", "'let'", "'='", "'print'", "'add'", "'to'", 
		"'minus'", "'multiply'", "'divide'", "'mod'", "'++'", "'--'", "'\"'", 
		"'\n'", "'func'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", "ID", "CYRILLIC", 
		"FLOAT", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\7\23\u0086\n\23\f\23\16\23\u0089\13\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u0094\n\24\f\24\16\24\u0097\13\24\3\24\3"+
		"\24\3\25\6\25\u009c\n\25\r\25\16\25\u009d\3\26\3\26\3\27\6\27\u00a3\n"+
		"\27\r\27\16\27\u00a4\3\27\3\27\7\27\u00a9\n\27\f\27\16\27\u00ac\13\27"+
		"\3\27\3\27\6\27\u00b0\n\27\r\27\16\27\u00b1\5\27\u00b4\n\27\3\30\6\30"+
		"\u00b7\n\30\r\30\16\30\u00b8\3\31\6\31\u00bc\n\31\r\31\16\31\u00bd\3\31"+
		"\3\31\3\u0087\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6"+
		"\4\2\f\f\17\17\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00c9\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rO\3\2\2"+
		"\2\17S\3\2\2\2\21V\3\2\2\2\23\\\3\2\2\2\25e\3\2\2\2\27l\3\2\2\2\31p\3"+
		"\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#\177\3\2\2\2%\u0081"+
		"\3\2\2\2\'\u008f\3\2\2\2)\u009b\3\2\2\2+\u009f\3\2\2\2-\u00b3\3\2\2\2"+
		"/\u00b6\3\2\2\2\61\u00bb\3\2\2\2\63\64\7h\2\2\64\65\7w\2\2\65\66\7p\2"+
		"\2\66\67\7e\2\2\678\7\"\2\289\7o\2\29:\7c\2\2:;\7k\2\2;<\7p\2\2<=\7*\2"+
		"\2=>\7+\2\2>?\7\"\2\2?@\7}\2\2@\4\3\2\2\2AB\7\177\2\2B\6\3\2\2\2CD\7n"+
		"\2\2DE\7g\2\2EF\7v\2\2F\b\3\2\2\2GH\7?\2\2H\n\3\2\2\2IJ\7r\2\2JK\7t\2"+
		"\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\f\3\2\2\2OP\7c\2\2PQ\7f\2\2QR\7f\2\2R\16"+
		"\3\2\2\2ST\7v\2\2TU\7q\2\2U\20\3\2\2\2VW\7o\2\2WX\7k\2\2XY\7p\2\2YZ\7"+
		"w\2\2Z[\7u\2\2[\22\3\2\2\2\\]\7o\2\2]^\7w\2\2^_\7n\2\2_`\7v\2\2`a\7k\2"+
		"\2ab\7r\2\2bc\7n\2\2cd\7{\2\2d\24\3\2\2\2ef\7f\2\2fg\7k\2\2gh\7x\2\2h"+
		"i\7k\2\2ij\7f\2\2jk\7g\2\2k\26\3\2\2\2lm\7o\2\2mn\7q\2\2no\7f\2\2o\30"+
		"\3\2\2\2pq\7-\2\2qr\7-\2\2r\32\3\2\2\2st\7/\2\2tu\7/\2\2u\34\3\2\2\2v"+
		"w\7$\2\2w\36\3\2\2\2xy\7\f\2\2y \3\2\2\2z{\7h\2\2{|\7w\2\2|}\7p\2\2}~"+
		"\7e\2\2~\"\3\2\2\2\177\u0080\7}\2\2\u0080$\3\2\2\2\u0081\u0082\7\61\2"+
		"\2\u0082\u0083\7,\2\2\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7\61"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\23\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n\2\2\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\24\2\2"+
		"\u0099(\3\2\2\2\u009a\u009c\t\3\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e*\3\2\2\2\u009f\u00a0"+
		"\4\u0402\u0501\2\u00a0,\3\2\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00aa\7\60\2\2\u00a7\u00a9\t\4\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b4"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7\60\2\2\u00ae\u00b0\t\4\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00ad\3\2\2\2\u00b4"+
		".\3\2\2\2\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\60\3\2\2\2\u00ba\u00bc"+
		"\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\31\2\2\u00c0\62\3\2\2"+
		"\2\f\2\u0087\u0095\u009d\u00a4\u00aa\u00b1\u00b3\u00b8\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}