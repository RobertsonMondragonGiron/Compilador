// Generated from C:/Users/gener/OneDrive/Desktop/remilang-compiler/src/main/antlr4/RemiLang.g4 by ANTLR 4.13.2

package com.remilang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RemiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SI=6, SINO=7, MIENTRAS=8, FIN=9, 
		IMPRIMIR=10, ENTERO=11, CADENA=12, ID=13, OPARIT=14, OPREL=15, WS=16, 
		COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SI", "SINO", "MIENTRAS", "FIN", 
			"IMPRIMIR", "ENTERO", "CADENA", "ID", "OPARIT", "OPREL", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ENTERO'", "';'", "'='", "'('", "')'", "'SI'", "'SINO'", "'MIENTRAS'", 
			"'FIN'", "'IMPRIMIR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SI", "SINO", "MIENTRAS", "FIN", 
			"IMPRIMIR", "ENTERO", "CADENA", "ID", "OPARIT", "OPREL", "WS", "COMMENT"
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


	public RemiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RemiLang.g4"; }

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
		"\u0004\u0000\u0011\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0001"+
		"\u000b\u0001\u000b\u0005\u000bX\b\u000b\n\u000b\f\u000b[\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fa\b\f\n\f\f\fd\t\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000eq\b\u000e\u0001\u000f"+
		"\u0004\u000ft\b\u000f\u000b\u000f\f\u000fu\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010|\b\u0010\n\u0010\f\u0010\u007f\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"\u0001\u0000\b\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000AZ__a"+
		"z\u0004\u000009AZ__az\u0003\u0000*+--//\u0002\u0000<<>>\u0003\u0000\t"+
		"\n\r\r  \u0002\u0000\n\n\r\r\u008a\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000"+
		"\u0000\u0000\u0003*\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000"+
		"\u0007.\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f:\u0001\u0000\u0000"+
		"\u0000\u0011C\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015"+
		"Q\u0001\u0000\u0000\u0000\u0017U\u0001\u0000\u0000\u0000\u0019^\u0001"+
		"\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dp\u0001\u0000\u0000"+
		"\u0000\u001fs\u0001\u0000\u0000\u0000!y\u0001\u0000\u0000\u0000#$\u0005"+
		"E\u0000\u0000$%\u0005N\u0000\u0000%&\u0005T\u0000\u0000&\'\u0005E\u0000"+
		"\u0000\'(\u0005R\u0000\u0000()\u0005O\u0000\u0000)\u0002\u0001\u0000\u0000"+
		"\u0000*+\u0005;\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005=\u0000"+
		"\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005(\u0000\u0000/\b\u0001\u0000"+
		"\u0000\u000001\u0005)\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005S"+
		"\u0000\u000034\u0005I\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005S"+
		"\u0000\u000067\u0005I\u0000\u000078\u0005N\u0000\u000089\u0005O\u0000"+
		"\u00009\u000e\u0001\u0000\u0000\u0000:;\u0005M\u0000\u0000;<\u0005I\u0000"+
		"\u0000<=\u0005E\u0000\u0000=>\u0005N\u0000\u0000>?\u0005T\u0000\u0000"+
		"?@\u0005R\u0000\u0000@A\u0005A\u0000\u0000AB\u0005S\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005F\u0000\u0000DE\u0005I\u0000\u0000EF\u0005"+
		"N\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005I\u0000\u0000HI\u0005"+
		"M\u0000\u0000IJ\u0005P\u0000\u0000JK\u0005R\u0000\u0000KL\u0005I\u0000"+
		"\u0000LM\u0005M\u0000\u0000MN\u0005I\u0000\u0000NO\u0005R\u0000\u0000"+
		"O\u0014\u0001\u0000\u0000\u0000PR\u0007\u0000\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\u0016\u0001\u0000\u0000\u0000UY\u0005\"\u0000\u0000"+
		"VX\b\u0001\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\"\u0000\u0000]\u0018\u0001\u0000"+
		"\u0000\u0000^b\u0007\u0002\u0000\u0000_a\u0007\u0003\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u001a\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000ef\u0007\u0004\u0000\u0000f\u001c\u0001\u0000\u0000\u0000"+
		"gq\u0007\u0005\u0000\u0000hi\u0005>\u0000\u0000iq\u0005=\u0000\u0000j"+
		"k\u0005<\u0000\u0000kq\u0005=\u0000\u0000lm\u0005=\u0000\u0000mq\u0005"+
		"=\u0000\u0000no\u0005!\u0000\u0000oq\u0005=\u0000\u0000pg\u0001\u0000"+
		"\u0000\u0000ph\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pl\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000q\u001e\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0006\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wx\u0006\u000f\u0000\u0000x \u0001\u0000\u0000\u0000"+
		"y}\u0005#\u0000\u0000z|\b\u0007\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0006\u0010\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0007"+
		"\u0000SYbpu}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}