// Generated from Query.g4 by ANTLR 4.5

package ca.ece.ubc.cpen221.mp5;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, IN=3, NAME=4, RATING=5, CATEGORY=6, PRICE=7, RPAREN=8, LPAREN=9, 
		NUMBER=10, TO=11, STRING=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OR", "AND", "IN", "NAME", "RATING", "CATEGORY", "PRICE", "RPAREN", "LPAREN", 
		"NUMBER", "TO", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'in'", "'name'", "'rating'", "'category'", "'price'", 
		"')'", "'('", null, "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "AND", "IN", "NAME", "RATING", "CATEGORY", "PRICE", "RPAREN", 
		"LPAREN", "NUMBER", "TO", "STRING"
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


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        //removeErrorListeners();
	        
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }
	    
	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public QueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Query.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\5\2#\n\2\3\3\5\3&\n"+
		"\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\rW\n\r\f\r\16"+
		"\rZ\13\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\3\2\4\3\2\63\67\3\2\"\u0080a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2\2\5%\3"+
		"\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13\65\3\2\2\2\r<\3\2\2\2\17E\3\2\2\2\21"+
		"K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33\35\7\"\2"+
		"\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7~\2\2\37 \7~\2\2 "+
		"\"\3\2\2\2!#\7\"\2\2\"!\3\2\2\2\"#\3\2\2\2#\4\3\2\2\2$&\7\"\2\2%$\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7(\2\2()\7(\2\2)+\3\2\2\2*,\7\"\2\2+*\3\2"+
		"\2\2+,\3\2\2\2,\6\3\2\2\2-.\7k\2\2./\7p\2\2/\b\3\2\2\2\60\61\7p\2\2\61"+
		"\62\7c\2\2\62\63\7o\2\2\63\64\7g\2\2\64\n\3\2\2\2\65\66\7t\2\2\66\67\7"+
		"c\2\2\678\7v\2\289\7k\2\29:\7p\2\2:;\7i\2\2;\f\3\2\2\2<=\7e\2\2=>\7c\2"+
		"\2>?\7v\2\2?@\7g\2\2@A\7i\2\2AB\7q\2\2BC\7t\2\2CD\7{\2\2D\16\3\2\2\2E"+
		"F\7r\2\2FG\7t\2\2GH\7k\2\2HI\7e\2\2IJ\7g\2\2J\20\3\2\2\2KL\7+\2\2L\22"+
		"\3\2\2\2MN\7*\2\2N\24\3\2\2\2OP\t\2\2\2P\26\3\2\2\2QR\7\60\2\2RS\7\60"+
		"\2\2S\30\3\2\2\2TX\7$\2\2UW\t\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7$\2\2\\\32\3\2\2\2\b\2\34\"%+X\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}