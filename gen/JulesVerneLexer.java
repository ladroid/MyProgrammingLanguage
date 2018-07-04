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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, FLOAT=16, NUMBER=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "FLOAT", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func main() {'", "'}'", "'let'", "'='", "'print'", "'add'", "'to'", 
		"'minus'", "'multiply'", "'divide'", "'\"'", "'\n'", "'func'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ID", "FLOAT", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\6\20m\n\20\r\20\16\20n\3\21\6\21r\n\21\r"+
		"\21\16\21s\3\21\3\21\7\21x\n\21\f\21\16\21{\13\21\3\21\3\21\6\21\177\n"+
		"\21\r\21\16\21\u0080\5\21\u0083\n\21\3\22\6\22\u0086\n\22\r\22\16\22\u0087"+
		"\3\23\6\23\u008b\n\23\r\23\16\23\u008c\3\23\3\23\2\2\24\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0096\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\rC\3\2\2\2"+
		"\17G\3\2\2\2\21J\3\2\2\2\23P\3\2\2\2\25Y\3\2\2\2\27`\3\2\2\2\31b\3\2\2"+
		"\2\33d\3\2\2\2\35i\3\2\2\2\37l\3\2\2\2!\u0082\3\2\2\2#\u0085\3\2\2\2%"+
		"\u008a\3\2\2\2\'(\7h\2\2()\7w\2\2)*\7p\2\2*+\7e\2\2+,\7\"\2\2,-\7o\2\2"+
		"-.\7c\2\2./\7k\2\2/\60\7p\2\2\60\61\7*\2\2\61\62\7+\2\2\62\63\7\"\2\2"+
		"\63\64\7}\2\2\64\4\3\2\2\2\65\66\7\177\2\2\66\6\3\2\2\2\678\7n\2\289\7"+
		"g\2\29:\7v\2\2:\b\3\2\2\2;<\7?\2\2<\n\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2"+
		"\2@A\7p\2\2AB\7v\2\2B\f\3\2\2\2CD\7c\2\2DE\7f\2\2EF\7f\2\2F\16\3\2\2\2"+
		"GH\7v\2\2HI\7q\2\2I\20\3\2\2\2JK\7o\2\2KL\7k\2\2LM\7p\2\2MN\7w\2\2NO\7"+
		"u\2\2O\22\3\2\2\2PQ\7o\2\2QR\7w\2\2RS\7n\2\2ST\7v\2\2TU\7k\2\2UV\7r\2"+
		"\2VW\7n\2\2WX\7{\2\2X\24\3\2\2\2YZ\7f\2\2Z[\7k\2\2[\\\7x\2\2\\]\7k\2\2"+
		"]^\7f\2\2^_\7g\2\2_\26\3\2\2\2`a\7$\2\2a\30\3\2\2\2bc\7\f\2\2c\32\3\2"+
		"\2\2de\7h\2\2ef\7w\2\2fg\7p\2\2gh\7e\2\2h\34\3\2\2\2ij\7}\2\2j\36\3\2"+
		"\2\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o \3\2\2\2pr\t\3"+
		"\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\7\60\2\2vx\t"+
		"\3\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u0083\3\2\2\2{y\3\2\2"+
		"\2|~\7\60\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082q\3\2\2\2\u0082|\3\2\2\2"+
		"\u0083\"\3\2\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088$\3\2\2\2\u0089\u008b"+
		"\t\4\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\23\2\2\u008f&\3\2\2\2"+
		"\n\2nsy\u0080\u0082\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}