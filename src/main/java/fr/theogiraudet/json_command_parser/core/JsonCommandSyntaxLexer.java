package fr.theogiraudet.json_command_parser.core;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonCommandSyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TYPE_QUOTED=17, 
		STRING=18, BOOLEAN=19, FLOAT=20, INTEGER=21, BACK_LINE=22, WHITESPACE=23, 
		COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "TYPE_QUOTED", 
			"TYPE", "SIMPLE_TYPE", "COMPLEX_TYPE", "STRING", "ESC", "UNICODE", "HEX", 
			"SAFECODEPOINT", "BOOLEAN", "FLOAT", "INTEGER", "BACK_LINE", "WHITESPACE", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "':'", "'}'", "','", "'\"description\"'", "'\"aliases\"'", 
			"'\"permissions\"'", "'\"arguments\"'", "'['", "']'", "'\"type\"'", "'\"id\"'", 
			"'\"matches\"'", "'\"execute\"'", "'\"keep_value\"'", "'\"tag\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TYPE_QUOTED", "STRING", "BOOLEAN", "FLOAT", 
			"INTEGER", "BACK_LINE", "WHITESPACE", "COMMENT"
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


	public JsonCommandSyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonCommandSyntax.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			BACK_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void BACK_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 UtilLex.lineNumber_$eq(UtilLex.lineNumber() + 1); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0136\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00b9\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00dd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00ed\n\25\3\26\3\26\3\26\7\26\u00f2\n"+
		"\26\f\26\16\26\u00f5\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u00fc\n\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0111\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u011a\n\34\3\35\6\35\u011d\n\35\r\35\16\35\u011e\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\6\37\u0127\n\37\r\37\16\37\u0128\3\37\3\37\3 \3 "+
		"\3 \3 \6 \u0131\n \r \16 \u0132\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\2+\24"+
		"-\2/\2\61\2\63\2\65\25\67\269\27;\30=\31?\32\3\2\b\n\2$$\61\61^^ddhhp"+
		"pttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\3\2\f\f\5\2\13\13\17\17\"\"\2\u013c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2+\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2"+
		"\2\rW\3\2\2\2\17a\3\2\2\2\21o\3\2\2\2\23{\3\2\2\2\25}\3\2\2\2\27\177\3"+
		"\2\2\2\31\u0086\3\2\2\2\33\u008b\3\2\2\2\35\u0095\3\2\2\2\37\u009f\3\2"+
		"\2\2!\u00ac\3\2\2\2#\u00b2\3\2\2\2%\u00b8\3\2\2\2\'\u00dc\3\2\2\2)\u00ec"+
		"\3\2\2\2+\u00ee\3\2\2\2-\u00f8\3\2\2\2/\u00fd\3\2\2\2\61\u0103\3\2\2\2"+
		"\63\u0105\3\2\2\2\65\u0110\3\2\2\2\67\u0119\3\2\2\29\u011c\3\2\2\2;\u0120"+
		"\3\2\2\2=\u0126\3\2\2\2?\u012c\3\2\2\2AB\7}\2\2B\4\3\2\2\2CD\7<\2\2D\6"+
		"\3\2\2\2EF\7\177\2\2F\b\3\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7$\2\2JK\7f\2\2"+
		"KL\7g\2\2LM\7u\2\2MN\7e\2\2NO\7t\2\2OP\7k\2\2PQ\7r\2\2QR\7v\2\2RS\7k\2"+
		"\2ST\7q\2\2TU\7p\2\2UV\7$\2\2V\f\3\2\2\2WX\7$\2\2XY\7c\2\2YZ\7n\2\2Z["+
		"\7k\2\2[\\\7c\2\2\\]\7u\2\2]^\7g\2\2^_\7u\2\2_`\7$\2\2`\16\3\2\2\2ab\7"+
		"$\2\2bc\7r\2\2cd\7g\2\2de\7t\2\2ef\7o\2\2fg\7k\2\2gh\7u\2\2hi\7u\2\2i"+
		"j\7k\2\2jk\7q\2\2kl\7p\2\2lm\7u\2\2mn\7$\2\2n\20\3\2\2\2op\7$\2\2pq\7"+
		"c\2\2qr\7t\2\2rs\7i\2\2st\7w\2\2tu\7o\2\2uv\7g\2\2vw\7p\2\2wx\7v\2\2x"+
		"y\7u\2\2yz\7$\2\2z\22\3\2\2\2{|\7]\2\2|\24\3\2\2\2}~\7_\2\2~\26\3\2\2"+
		"\2\177\u0080\7$\2\2\u0080\u0081\7v\2\2\u0081\u0082\7{\2\2\u0082\u0083"+
		"\7r\2\2\u0083\u0084\7g\2\2\u0084\u0085\7$\2\2\u0085\30\3\2\2\2\u0086\u0087"+
		"\7$\2\2\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089\u008a\7$\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7$\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7e\2\2\u0090\u0091\7j\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7u\2\2\u0093\u0094\7$\2\2\u0094\34\3\2\2\2\u0095\u0096\7"+
		"$\2\2\u0096\u0097\7g\2\2\u0097\u0098\7z\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7w\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7$\2\2\u009e\36\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7m\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7a\2\2"+
		"\u00a5\u00a6\7x\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7$\2\2\u00ab \3\2\2\2\u00ac\u00ad"+
		"\7$\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7i\2\2\u00b0"+
		"\u00b1\7$\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\5%\23\2\u00b4"+
		"\u00b5\7$\2\2\u00b5$\3\2\2\2\u00b6\u00b9\5\'\24\2\u00b7\u00b9\5)\25\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7"+
		"k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7i\2\2\u00bf\u00c0\7g\2\2\u00c0\u00dd\7t\2\2\u00c1\u00c2\7d\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7c\2\2\u00c7\u00dd\7p\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7e\2\2\u00d0\u00dd\7g\2\2"+
		"\u00d1\u00d2\7u\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00dd\7i\2\2\u00d7\u00d8\7h\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7c\2\2\u00db\u00dd\7v\2\2"+
		"\u00dc\u00ba\3\2\2\2\u00dc\u00c1\3\2\2\2\u00dc\u00c8\3\2\2\2\u00dc\u00d1"+
		"\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd(\3\2\2\2\u00de\u00df\7n\2\2\u00df\u00e0"+
		"\7k\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7>\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\5%\23\2\u00e5\u00e6\7@\2\2\u00e6\u00ed\3\2"+
		"\2\2\u00e7\u00e8\5\'\24\2\u00e8\u00e9\7\60\2\2\u00e9\u00ea\7\60\2\2\u00ea"+
		"\u00eb\7\60\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00e7\3"+
		"\2\2\2\u00ed*\3\2\2\2\u00ee\u00f3\7$\2\2\u00ef\u00f2\5-\27\2\u00f0\u00f2"+
		"\5\63\32\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7,\3\2\2\2\u00f8\u00fb\7^\2\2\u00f9\u00fc"+
		"\t\2\2\2\u00fa\u00fc\5/\30\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		".\3\2\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\5\61\31\2\u00ff\u0100\5\61\31"+
		"\2\u0100\u0101\5\61\31\2\u0101\u0102\5\61\31\2\u0102\60\3\2\2\2\u0103"+
		"\u0104\t\3\2\2\u0104\62\3\2\2\2\u0105\u0106\n\4\2\2\u0106\64\3\2\2\2\u0107"+
		"\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u0111\7g\2\2"+
		"\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f"+
		"\7u\2\2\u010f\u0111\7g\2\2\u0110\u0107\3\2\2\2\u0110\u010b\3\2\2\2\u0111"+
		"\66\3\2\2\2\u0112\u0113\59\35\2\u0113\u0114\7h\2\2\u0114\u011a\3\2\2\2"+
		"\u0115\u0116\59\35\2\u0116\u0117\7\60\2\2\u0117\u0118\59\35\2\u0118\u011a"+
		"\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0115\3\2\2\2\u011a8\3\2\2\2\u011b"+
		"\u011d\t\5\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f:\3\2\2\2\u0120\u0121\t\6\2\2\u0121\u0122"+
		"\b\36\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\36\3\2\u0124<\3\2\2\2\u0125"+
		"\u0127\t\7\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b\37\3\2\u012b"+
		">\3\2\2\2\u012c\u012d\7\61\2\2\u012d\u012e\7\61\2\2\u012e\u0130\3\2\2"+
		"\2\u012f\u0131\n\6\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b \3\2\u0135"+
		"@\3\2\2\2\16\2\u00b8\u00dc\u00ec\u00f1\u00f3\u00fb\u0110\u0119\u011e\u0128"+
		"\u0132\4\3\36\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}