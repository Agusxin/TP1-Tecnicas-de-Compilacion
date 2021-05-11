// Generated from /mnt/c/users/agux/desktop/Archivos Adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

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
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, WHILE=6, DOUBLE=7, MAS=8, 
		MENOS=9, MULT=10, DIV=11, MENOR=12, MAYOR=13, MENORIGUAL=14, MAYORIGUAL=15, 
		IGUALES=16, DISTINTO=17, ASIG=18, PYQ=19, COMA=20, ENTERO=21, ID=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "WHILE", 
			"DOUBLE", "MAS", "MENOS", "MULT", "DIV", "MENOR", "MAYOR", "MENORIGUAL", 
			"MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", "COMA", "ENTERO", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'while'", "'double'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "WHILE", "DOUBLE", 
			"MAS", "MENOS", "MULT", "DIV", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", 
			"IGUALES", "DISTINTO", "ASIG", "PYQ", "COMA", "ENTERO", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\6\30r\n\30\r\30\16\30s\3\31\3\31\5\31x\n\31\3\31\3\31\3\31\7\31"+
		"}\n\31\f\31\16\31\u0080\13\31\3\32\6\32\u0083\n\32\r\32\16\32\u0084\3"+
		"\32\3\32\2\2\33\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u008b\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2"+
		"\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21E\3\2"+
		"\2\2\23K\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35Z\3"+
		"\2\2\2\37\\\3\2\2\2!^\3\2\2\2#a\3\2\2\2%d\3\2\2\2\'g\3\2\2\2)j\3\2\2\2"+
		"+l\3\2\2\2-n\3\2\2\2/q\3\2\2\2\61w\3\2\2\2\63\u0082\3\2\2\2\65\66\t\2"+
		"\2\2\66\4\3\2\2\2\678\t\3\2\28\6\3\2\2\29:\7}\2\2:\b\3\2\2\2;<\7\177\2"+
		"\2<\n\3\2\2\2=>\7*\2\2>\f\3\2\2\2?@\7+\2\2@\16\3\2\2\2AB\7k\2\2BC\7p\2"+
		"\2CD\7v\2\2D\20\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7k\2\2HI\7n\2\2IJ\7g\2\2J"+
		"\22\3\2\2\2KL\7f\2\2LM\7q\2\2MN\7w\2\2NO\7d\2\2OP\7n\2\2PQ\7g\2\2Q\24"+
		"\3\2\2\2RS\7-\2\2S\26\3\2\2\2TU\7/\2\2U\30\3\2\2\2VW\7,\2\2W\32\3\2\2"+
		"\2XY\7\61\2\2Y\34\3\2\2\2Z[\7>\2\2[\36\3\2\2\2\\]\7@\2\2] \3\2\2\2^_\7"+
		">\2\2_`\7?\2\2`\"\3\2\2\2ab\7@\2\2bc\7?\2\2c$\3\2\2\2de\7?\2\2ef\7?\2"+
		"\2f&\3\2\2\2gh\7#\2\2hi\7?\2\2i(\3\2\2\2jk\7?\2\2k*\3\2\2\2lm\7=\2\2m"+
		",\3\2\2\2no\7.\2\2o.\3\2\2\2pr\5\5\3\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\60\3\2\2\2ux\5\3\2\2vx\7a\2\2wu\3\2\2\2wv\3\2\2\2x~\3\2\2\2"+
		"y}\5\3\2\2z}\5\5\3\2{}\7a\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\62\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\t\4\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\32\2\2\u0087\64\3\2\2"+
		"\2\b\2sw|~\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}