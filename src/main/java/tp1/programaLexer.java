// Generated from /mnt/c/users/agux/desktop/archivos adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

package tp1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IFOR=11, MAS=12, MENOS=13, MULT=14, DIV=15, MENOR=16, 
		MAYOR=17, MENORIGUAL=18, MAYORIGUAL=19, IGUALES=20, DISTINTO=21, ASIG=22, 
		PYQ=23, COMA=24, OR=25, AND=26, ENTERO=27, ID=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", 
			"VOID", "FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", 
			"MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", 
			"ASIG", "PYQ", "COMA", "OR", "AND", "ENTERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'='", "';'", "','", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", 
			"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", 
			"COMA", "OR", "AND", "ENTERO", "ID", "WS"
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


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\36\6\36\u0096\n\36\r\36\16\36\u0097\3"+
		"\37\3\37\5\37\u009c\n\37\3\37\3\37\3\37\7\37\u00a1\n\37\f\37\16\37\u00a4"+
		"\13\37\3 \6 \u00a7\n \r \16 \u00a8\3 \3 \2\2!\3\2\5\2\7\3\t\4\13\5\r\6"+
		"\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24"+
		"+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37\3\2\5\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u00af\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2"+
		"\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21Q\3\2\2\2\23X\3\2\2\2"+
		"\25]\3\2\2\2\27c\3\2\2\2\31i\3\2\2\2\33l\3\2\2\2\35p\3\2\2\2\37r\3\2\2"+
		"\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+\177\3\2\2\2-\u0082"+
		"\3\2\2\2/\u0085\3\2\2\2\61\u0088\3\2\2\2\63\u008a\3\2\2\2\65\u008c\3\2"+
		"\2\2\67\u008e\3\2\2\29\u0091\3\2\2\2;\u0095\3\2\2\2=\u009b\3\2\2\2?\u00a6"+
		"\3\2\2\2AB\t\2\2\2B\4\3\2\2\2CD\t\3\2\2D\6\3\2\2\2EF\7}\2\2F\b\3\2\2\2"+
		"GH\7\177\2\2H\n\3\2\2\2IJ\7*\2\2J\f\3\2\2\2KL\7+\2\2L\16\3\2\2\2MN\7k"+
		"\2\2NO\7p\2\2OP\7v\2\2P\20\3\2\2\2QR\7f\2\2RS\7q\2\2ST\7w\2\2TU\7d\2\2"+
		"UV\7n\2\2VW\7g\2\2W\22\3\2\2\2XY\7x\2\2YZ\7q\2\2Z[\7k\2\2[\\\7f\2\2\\"+
		"\24\3\2\2\2]^\7h\2\2^_\7n\2\2_`\7q\2\2`a\7c\2\2ab\7v\2\2b\26\3\2\2\2c"+
		"d\7y\2\2de\7j\2\2ef\7k\2\2fg\7n\2\2gh\7g\2\2h\30\3\2\2\2ij\7k\2\2jk\7"+
		"h\2\2k\32\3\2\2\2lm\7h\2\2mn\7q\2\2no\7t\2\2o\34\3\2\2\2pq\7-\2\2q\36"+
		"\3\2\2\2rs\7/\2\2s \3\2\2\2tu\7,\2\2u\"\3\2\2\2vw\7\61\2\2w$\3\2\2\2x"+
		"y\7>\2\2y&\3\2\2\2z{\7@\2\2{(\3\2\2\2|}\7>\2\2}~\7?\2\2~*\3\2\2\2\177"+
		"\u0080\7@\2\2\u0080\u0081\7?\2\2\u0081,\3\2\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0084\7?\2\2\u0084.\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087"+
		"\60\3\2\2\2\u0088\u0089\7?\2\2\u0089\62\3\2\2\2\u008a\u008b\7=\2\2\u008b"+
		"\64\3\2\2\2\u008c\u008d\7.\2\2\u008d\66\3\2\2\2\u008e\u008f\7~\2\2\u008f"+
		"\u0090\7~\2\2\u00908\3\2\2\2\u0091\u0092\7(\2\2\u0092\u0093\7(\2\2\u0093"+
		":\3\2\2\2\u0094\u0096\5\5\3\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098<\3\2\2\2\u0099\u009c\5"+
		"\3\2\2\u009a\u009c\7a\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u00a2\3\2\2\2\u009d\u00a1\5\3\2\2\u009e\u00a1\5\5\3\2\u009f\u00a1\7a"+
		"\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3>\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00a7\t\4\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b \2\2\u00ab@\3\2\2\2\b\2\u0097\u009b\u00a0\u00a2\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}