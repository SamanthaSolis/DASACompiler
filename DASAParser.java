// Generated from DASA.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DASAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINE=1, FUNC=2, MAIN=3, TINT=4, TFLOAT=5, TBOOL=6, TCHAR=7, TSTRING=8, 
		PRINT=9, INPUT=10, ISNULL=11, TOINT=12, TOFLOAT=13, TOARRCHAR=14, PLOT=15, 
		DESCRIBE=16, REGRESSION=17, CLUSTER=18, RETURN=19, WHILE=20, IF=21, ELSE=22, 
		NULL=23, COLON=24, SCOLON=25, COMMA=26, LCURLY=27, RCURLY=28, LPAREN=29, 
		RPAREN=30, LBRACK=31, RBRACK=32, DIFF=33, EQUALS=34, ASSIGN=35, GREATEQ=36, 
		LESSEQ=37, GREAT=38, LESS=39, PLUS=40, MINUS=41, MULT=42, DIVIDE=43, NOT=44, 
		MOD=45, AND=46, OR=47, IGNORE=48, CCHAR=49, CARRCHAR=50, CFLOAT=51, CINT=52, 
		CBOOL=53, ID=54;
	public static final int
		RULE_programa = 0, RULE_prog1 = 1, RULE_prog2 = 2, RULE_main = 3, RULE_main1 = 4, 
		RULE_main2 = 5, RULE_metodos = 6, RULE_met1 = 7, RULE_met2 = 8, RULE_met3 = 9, 
		RULE_met4 = 10, RULE_met5 = 11, RULE_params = 12, RULE_params1 = 13, RULE_vars_st = 14, 
		RULE_vars1 = 15, RULE_vars2 = 16, RULE_vars3 = 17, RULE_vars4 = 18, RULE_vars5 = 19, 
		RULE_vars6 = 20, RULE_vars7 = 21, RULE_estatuto = 22, RULE_asignacion = 23, 
		RULE_asig1 = 24, RULE_asig2 = 25, RULE_durante = 26, RULE_condicion = 27, 
		RULE_con1 = 28, RULE_lectura = 29, RULE_lec1 = 30, RULE_lec2 = 31, RULE_arreglo = 32, 
		RULE_arr1 = 33, RULE_arr2 = 34, RULE_arr3 = 35, RULE_arr4 = 36, RULE_arr5 = 37, 
		RULE_arr6 = 38, RULE_arr7 = 39, RULE_cte = 40, RULE_tipo = 41, RULE_bloque = 42, 
		RULE_bloque1 = 43, RULE_escritura = 44, RULE_estdesc = 45, RULE_dibujar = 46, 
		RULE_regresion = 47, RULE_reg1 = 48, RULE_clustering = 49, RULE_funcion = 50, 
		RULE_func1 = 51, RULE_func2 = 52, RULE_regresa = 53, RULE_expresion = 54, 
		RULE_expres1 = 55, RULE_expres2 = 56, RULE_comp = 57, RULE_comp1 = 58, 
		RULE_comp2 = 59, RULE_exp = 60, RULE_exp1 = 61, RULE_exp2 = 62, RULE_termino = 63, 
		RULE_term1 = 64, RULE_term2 = 65, RULE_factor = 66, RULE_fact1 = 67, RULE_fact2 = 68, 
		RULE_fact3 = 69, RULE_valor = 70, RULE_valor1 = 71, RULE_valor2 = 72, 
		RULE_vacio = 73, RULE_castint = 74, RULE_castfloat = 75, RULE_castarrchar = 76;
	public static final String[] ruleNames = {
		"programa", "prog1", "prog2", "main", "main1", "main2", "metodos", "met1", 
		"met2", "met3", "met4", "met5", "params", "params1", "vars_st", "vars1", 
		"vars2", "vars3", "vars4", "vars5", "vars6", "vars7", "estatuto", "asignacion", 
		"asig1", "asig2", "durante", "condicion", "con1", "lectura", "lec1", "lec2", 
		"arreglo", "arr1", "arr2", "arr3", "arr4", "arr5", "arr6", "arr7", "cte", 
		"tipo", "bloque", "bloque1", "escritura", "estdesc", "dibujar", "regresion", 
		"reg1", "clustering", "funcion", "func1", "func2", "regresa", "expresion", 
		"expres1", "expres2", "comp", "comp1", "comp2", "exp", "exp1", "exp2", 
		"termino", "term1", "term2", "factor", "fact1", "fact2", "fact3", "valor", 
		"valor1", "valor2", "vacio", "castint", "castfloat", "castarrchar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'define'", "'func'", "'main'", "'Int'", "'Float'", "'Bool'", "'Char'", 
		"'String'", "'print'", "'input'", "'isNull'", "'toInt'", "'toFloat'", 
		"'toArrChar'", "'plot'", "'describe'", "'regression'", "'cluster'", "'return'", 
		"'while'", "'if'", "'else'", "'Null'", "':'", "';'", "','", "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'!='", "'=='", "'='", "'>='", "'<='", "'>'", 
		"'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFINE", "FUNC", "MAIN", "TINT", "TFLOAT", "TBOOL", "TCHAR", "TSTRING", 
		"PRINT", "INPUT", "ISNULL", "TOINT", "TOFLOAT", "TOARRCHAR", "PLOT", "DESCRIBE", 
		"REGRESSION", "CLUSTER", "RETURN", "WHILE", "IF", "ELSE", "NULL", "COLON", 
		"SCOLON", "COMMA", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"DIFF", "EQUALS", "ASSIGN", "GREATEQ", "LESSEQ", "GREAT", "LESS", "PLUS", 
		"MINUS", "MULT", "DIVIDE", "NOT", "MOD", "AND", "OR", "IGNORE", "CCHAR", 
		"CARRCHAR", "CFLOAT", "CINT", "CBOOL", "ID"
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
	public String getGrammarFileName() { return "DASA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DASAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Prog1Context prog1() {
			return getRuleContext(Prog1Context.class,0);
		}
		public Prog2Context prog2() {
			return getRuleContext(Prog2Context.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			prog1();
			setState(155);
			prog2();
			setState(156);
			main();
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

	public static class Prog1Context extends ParserRuleContext {
		public Vars_stContext vars_st() {
			return getRuleContext(Vars_stContext.class,0);
		}
		public Prog1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterProg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitProg1(this);
		}
	}

	public final Prog1Context prog1() throws RecognitionException {
		Prog1Context _localctx = new Prog1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog1);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				vars_st();
				}
				break;
			case FUNC:
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Prog2Context extends ParserRuleContext {
		public MetodosContext metodos() {
			return getRuleContext(MetodosContext.class,0);
		}
		public Prog2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterProg2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitProg2(this);
		}
	}

	public final Prog2Context prog2() throws RecognitionException {
		Prog2Context _localctx = new Prog2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog2);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				metodos();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(DASAParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(DASAParser.LCURLY, 0); }
		public Main1Context main1() {
			return getRuleContext(Main1Context.class,0);
		}
		public Main2Context main2() {
			return getRuleContext(Main2Context.class,0);
		}
		public TerminalNode RCURLY() { return getToken(DASAParser.RCURLY, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(MAIN);
			setState(167);
			match(LPAREN);
			setState(168);
			match(RPAREN);
			setState(169);
			match(LCURLY);
			setState(170);
			main1();
			setState(171);
			main2();
			setState(172);
			match(RCURLY);
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

	public static class Main1Context extends ParserRuleContext {
		public Vars_stContext vars_st() {
			return getRuleContext(Vars_stContext.class,0);
		}
		public Main1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMain1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMain1(this);
		}
	}

	public final Main1Context main1() throws RecognitionException {
		Main1Context _localctx = new Main1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_main1);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				vars_st();
				}
				break;
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case RCURLY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Main2Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Main2Context main2() {
			return getRuleContext(Main2Context.class,0);
		}
		public Main2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMain2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMain2(this);
		}
	}

	public final Main2Context main2() throws RecognitionException {
		Main2Context _localctx = new Main2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_main2);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				estatuto();
				setState(179);
				main2();
				}
				break;
			case RCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MetodosContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(DASAParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public Met1Context met1() {
			return getRuleContext(Met1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public Met2Context met2() {
			return getRuleContext(Met2Context.class,0);
		}
		public TerminalNode LCURLY() { return getToken(DASAParser.LCURLY, 0); }
		public Met3Context met3() {
			return getRuleContext(Met3Context.class,0);
		}
		public Met4Context met4() {
			return getRuleContext(Met4Context.class,0);
		}
		public TerminalNode RCURLY() { return getToken(DASAParser.RCURLY, 0); }
		public Met5Context met5() {
			return getRuleContext(Met5Context.class,0);
		}
		public MetodosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMetodos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMetodos(this);
		}
	}

	public final MetodosContext metodos() throws RecognitionException {
		MetodosContext _localctx = new MetodosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_metodos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FUNC);
			setState(185);
			match(ID);
			setState(186);
			match(LPAREN);
			setState(187);
			met1();
			setState(188);
			match(RPAREN);
			setState(189);
			met2();
			setState(190);
			match(LCURLY);
			setState(191);
			met3();
			setState(192);
			met4();
			setState(193);
			match(RCURLY);
			setState(194);
			met5();
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

	public static class Met1Context extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Met1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMet1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMet1(this);
		}
	}

	public final Met1Context met1() throws RecognitionException {
		Met1Context _localctx = new Met1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_met1);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINT:
			case TFLOAT:
			case TBOOL:
			case TCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				params();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Met2Context extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(DASAParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Met2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMet2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMet2(this);
		}
	}

	public final Met2Context met2() throws RecognitionException {
		Met2Context _localctx = new Met2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_met2);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(COLON);
				setState(201);
				tipo();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Met3Context extends ParserRuleContext {
		public Vars_stContext vars_st() {
			return getRuleContext(Vars_stContext.class,0);
		}
		public Met3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMet3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMet3(this);
		}
	}

	public final Met3Context met3() throws RecognitionException {
		Met3Context _localctx = new Met3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_met3);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				vars_st();
				}
				break;
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case RCURLY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Met4Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Met4Context met4() {
			return getRuleContext(Met4Context.class,0);
		}
		public Met4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMet4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMet4(this);
		}
	}

	public final Met4Context met4() throws RecognitionException {
		Met4Context _localctx = new Met4Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_met4);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				estatuto();
				setState(210);
				met4();
				}
				break;
			case RCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Met5Context extends ParserRuleContext {
		public MetodosContext metodos() {
			return getRuleContext(MetodosContext.class,0);
		}
		public Met5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_met5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterMet5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitMet5(this);
		}
	}

	public final Met5Context met5() throws RecognitionException {
		Met5Context _localctx = new Met5Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_met5);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				metodos();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParamsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(DASAParser.COLON, 0); }
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public Params1Context params1() {
			return getRuleContext(Params1Context.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			tipo();
			setState(220);
			match(COLON);
			setState(221);
			match(ID);
			setState(222);
			params1();
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

	public static class Params1Context extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Params1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterParams1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitParams1(this);
		}
	}

	public final Params1Context params1() throws RecognitionException {
		Params1Context _localctx = new Params1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_params1);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINT:
			case TFLOAT:
			case TBOOL:
			case TCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				params();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vars_stContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(DASAParser.DEFINE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Vars1Context vars1() {
			return getRuleContext(Vars1Context.class,0);
		}
		public TerminalNode COLON() { return getToken(DASAParser.COLON, 0); }
		public Vars3Context vars3() {
			return getRuleContext(Vars3Context.class,0);
		}
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public Vars7Context vars7() {
			return getRuleContext(Vars7Context.class,0);
		}
		public Vars_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars_st(this);
		}
	}

	public final Vars_stContext vars_st() throws RecognitionException {
		Vars_stContext _localctx = new Vars_stContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vars_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(DEFINE);
			setState(229);
			tipo();
			setState(230);
			vars1();
			setState(231);
			match(COLON);
			setState(232);
			vars3();
			setState(233);
			match(SCOLON);
			setState(234);
			vars7();
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

	public static class Vars1Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public TerminalNode CINT() { return getToken(DASAParser.CINT, 0); }
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Vars2Context vars2() {
			return getRuleContext(Vars2Context.class,0);
		}
		public Vars1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars1(this);
		}
	}

	public final Vars1Context vars1() throws RecognitionException {
		Vars1Context _localctx = new Vars1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_vars1);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(LBRACK);
				setState(237);
				match(CINT);
				setState(238);
				match(RBRACK);
				setState(239);
				vars2();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vars2Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public TerminalNode CINT() { return getToken(DASAParser.CINT, 0); }
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Vars2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars2(this);
		}
	}

	public final Vars2Context vars2() throws RecognitionException {
		Vars2Context _localctx = new Vars2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_vars2);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(LBRACK);
				setState(244);
				match(CINT);
				setState(245);
				match(RBRACK);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vars3Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public Vars4Context vars4() {
			return getRuleContext(Vars4Context.class,0);
		}
		public Vars6Context vars6() {
			return getRuleContext(Vars6Context.class,0);
		}
		public Vars3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars3(this);
		}
	}

	public final Vars3Context vars3() throws RecognitionException {
		Vars3Context _localctx = new Vars3Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_vars3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			vars4();
			setState(251);
			vars6();
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

	public static class Vars4Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DASAParser.ASSIGN, 0); }
		public Vars5Context vars5() {
			return getRuleContext(Vars5Context.class,0);
		}
		public Vars4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars4(this);
		}
	}

	public final Vars4Context vars4() throws RecognitionException {
		Vars4Context _localctx = new Vars4Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_vars4);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(ASSIGN);
				setState(254);
				vars5();
				}
				break;
			case SCOLON:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vars5Context extends ParserRuleContext {
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public Vars5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars5(this);
		}
	}

	public final Vars5Context vars5() throws RecognitionException {
		Vars5Context _localctx = new Vars5Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_vars5);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				cte();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				arreglo();
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

	public static class Vars6Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public Vars3Context vars3() {
			return getRuleContext(Vars3Context.class,0);
		}
		public Vars6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars6(this);
		}
	}

	public final Vars6Context vars6() throws RecognitionException {
		Vars6Context _localctx = new Vars6Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_vars6);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(COMMA);
				setState(263);
				vars3();
				}
				break;
			case SCOLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vars7Context extends ParserRuleContext {
		public Vars_stContext vars_st() {
			return getRuleContext(Vars_stContext.class,0);
		}
		public Vars7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVars7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVars7(this);
		}
	}

	public final Vars7Context vars7() throws RecognitionException {
		Vars7Context _localctx = new Vars7Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_vars7);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				vars_st();
				}
				break;
			case FUNC:
			case MAIN:
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case RCURLY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DuranteContext durante() {
			return getRuleContext(DuranteContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public EstdescContext estdesc() {
			return getRuleContext(EstdescContext.class,0);
		}
		public DibujarContext dibujar() {
			return getRuleContext(DibujarContext.class,0);
		}
		public RegresionContext regresion() {
			return getRuleContext(RegresionContext.class,0);
		}
		public ClusteringContext clustering() {
			return getRuleContext(ClusteringContext.class,0);
		}
		public RegresaContext regresa() {
			return getRuleContext(RegresaContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_estatuto);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				durante();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				condicion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				funcion();
				setState(275);
				match(SCOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				lectura();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				escritura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				estdesc();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				dibujar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				regresion();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				clustering();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				regresa();
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public Asig1Context asig1() {
			return getRuleContext(Asig1Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(DASAParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(287);
			asig1();
			setState(288);
			match(ASSIGN);
			setState(289);
			expresion();
			setState(290);
			match(SCOLON);
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

	public static class Asig1Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Asig2Context asig2() {
			return getRuleContext(Asig2Context.class,0);
		}
		public Asig1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterAsig1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitAsig1(this);
		}
	}

	public final Asig1Context asig1() throws RecognitionException {
		Asig1Context _localctx = new Asig1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_asig1);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(LBRACK);
				setState(293);
				expresion();
				setState(294);
				match(RBRACK);
				setState(295);
				asig2();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Asig2Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public TerminalNode CINT() { return getToken(DASAParser.CINT, 0); }
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Asig2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterAsig2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitAsig2(this);
		}
	}

	public final Asig2Context asig2() throws RecognitionException {
		Asig2Context _localctx = new Asig2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_asig2);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(LBRACK);
				setState(301);
				match(CINT);
				setState(302);
				match(RBRACK);
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DuranteContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DASAParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DuranteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterDurante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitDurante(this);
		}
	}

	public final DuranteContext durante() throws RecognitionException {
		DuranteContext _localctx = new DuranteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_durante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(WHILE);
			setState(307);
			match(LPAREN);
			setState(308);
			expresion();
			setState(309);
			match(RPAREN);
			setState(310);
			bloque();
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DASAParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Con1Context con1() {
			return getRuleContext(Con1Context.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(IF);
			setState(313);
			match(LPAREN);
			setState(314);
			expresion();
			setState(315);
			match(RPAREN);
			setState(316);
			bloque();
			setState(317);
			con1();
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

	public static class Con1Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(DASAParser.ELSE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Con1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCon1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCon1(this);
		}
	}

	public final Con1Context con1() throws RecognitionException {
		Con1Context _localctx = new Con1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_con1);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ELSE);
				setState(320);
				bloque();
				}
				break;
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case RCURLY:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(DASAParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public Lec1Context lec1() {
			return getRuleContext(Lec1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(INPUT);
			setState(325);
			match(LPAREN);
			setState(326);
			match(ID);
			setState(327);
			lec1();
			setState(328);
			match(RPAREN);
			setState(329);
			match(SCOLON);
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

	public static class Lec1Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Lec2Context lec2() {
			return getRuleContext(Lec2Context.class,0);
		}
		public Lec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lec1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterLec1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitLec1(this);
		}
	}

	public final Lec1Context lec1() throws RecognitionException {
		Lec1Context _localctx = new Lec1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_lec1);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(LBRACK);
				setState(332);
				expresion();
				setState(333);
				match(RBRACK);
				setState(334);
				lec2();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Lec2Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Lec2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lec2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterLec2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitLec2(this);
		}
	}

	public final Lec2Context lec2() throws RecognitionException {
		Lec2Context _localctx = new Lec2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_lec2);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(LBRACK);
				setState(340);
				expresion();
				setState(341);
				match(RBRACK);
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public Arr1Context arr1() {
			return getRuleContext(Arr1Context.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArreglo(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LBRACK);
			setState(347);
			arr1();
			setState(348);
			match(RBRACK);
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

	public static class Arr1Context extends ParserRuleContext {
		public Arr2Context arr2() {
			return getRuleContext(Arr2Context.class,0);
		}
		public Arr4Context arr4() {
			return getRuleContext(Arr4Context.class,0);
		}
		public Arr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr1(this);
		}
	}

	public final Arr1Context arr1() throws RecognitionException {
		Arr1Context _localctx = new Arr1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_arr1);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case RBRACK:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				arr2();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				arr4();
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

	public static class Arr2Context extends ParserRuleContext {
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public Arr3Context arr3() {
			return getRuleContext(Arr3Context.class,0);
		}
		public Arr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr2(this);
		}
	}

	public final Arr2Context arr2() throws RecognitionException {
		Arr2Context _localctx = new Arr2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_arr2);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				cte();
				setState(355);
				arr3();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arr3Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public Arr2Context arr2() {
			return getRuleContext(Arr2Context.class,0);
		}
		public Arr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr3(this);
		}
	}

	public final Arr3Context arr3() throws RecognitionException {
		Arr3Context _localctx = new Arr3Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_arr3);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(COMMA);
				setState(361);
				arr2();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arr4Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public Arr5Context arr5() {
			return getRuleContext(Arr5Context.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Arr7Context arr7() {
			return getRuleContext(Arr7Context.class,0);
		}
		public Arr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr4(this);
		}
	}

	public final Arr4Context arr4() throws RecognitionException {
		Arr4Context _localctx = new Arr4Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_arr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(LBRACK);
			setState(366);
			arr5();
			setState(367);
			match(RBRACK);
			setState(368);
			arr7();
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

	public static class Arr5Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Arr6Context arr6() {
			return getRuleContext(Arr6Context.class,0);
		}
		public Arr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr5(this);
		}
	}

	public final Arr5Context arr5() throws RecognitionException {
		Arr5Context _localctx = new Arr5Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_arr5);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISNULL:
			case TOINT:
			case TOFLOAT:
			case TOARRCHAR:
			case NULL:
			case LPAREN:
			case LBRACK:
			case PLUS:
			case MINUS:
			case NOT:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				expresion();
				setState(371);
				arr6();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arr6Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public Arr5Context arr5() {
			return getRuleContext(Arr5Context.class,0);
		}
		public Arr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr6(this);
		}
	}

	public final Arr6Context arr6() throws RecognitionException {
		Arr6Context _localctx = new Arr6Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_arr6);
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(COMMA);
				setState(377);
				arr5();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Arr7Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public Arr4Context arr4() {
			return getRuleContext(Arr4Context.class,0);
		}
		public Arr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterArr7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitArr7(this);
		}
	}

	public final Arr7Context arr7() throws RecognitionException {
		Arr7Context _localctx = new Arr7Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_arr7);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(COMMA);
				setState(382);
				arr4();
				}
				break;
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CteContext extends ParserRuleContext {
		public TerminalNode CINT() { return getToken(DASAParser.CINT, 0); }
		public TerminalNode CFLOAT() { return getToken(DASAParser.CFLOAT, 0); }
		public TerminalNode CCHAR() { return getToken(DASAParser.CCHAR, 0); }
		public TerminalNode CARRCHAR() { return getToken(DASAParser.CARRCHAR, 0); }
		public TerminalNode CBOOL() { return getToken(DASAParser.CBOOL, 0); }
		public TerminalNode NULL() { return getToken(DASAParser.NULL, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << CCHAR) | (1L << CARRCHAR) | (1L << CFLOAT) | (1L << CINT) | (1L << CBOOL))) != 0)) ) {
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(DASAParser.TINT, 0); }
		public TerminalNode TFLOAT() { return getToken(DASAParser.TFLOAT, 0); }
		public TerminalNode TCHAR() { return getToken(DASAParser.TCHAR, 0); }
		public TerminalNode TBOOL() { return getToken(DASAParser.TBOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TBOOL) | (1L << TCHAR))) != 0)) ) {
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DASAParser.LCURLY, 0); }
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public TerminalNode RCURLY() { return getToken(DASAParser.RCURLY, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(LCURLY);
			setState(391);
			bloque1();
			setState(392);
			match(RCURLY);
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

	public static class Bloque1Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public Bloque1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterBloque1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitBloque1(this);
		}
	}

	public final Bloque1Context bloque1() throws RecognitionException {
		Bloque1Context _localctx = new Bloque1Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_bloque1);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case INPUT:
			case PLOT:
			case DESCRIBE:
			case REGRESSION:
			case CLUSTER:
			case RETURN:
			case WHILE:
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				estatuto();
				setState(395);
				bloque1();
				}
				break;
			case RCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EscrituraContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DASAParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(PRINT);
			setState(401);
			match(LPAREN);
			setState(402);
			expresion();
			setState(403);
			match(RPAREN);
			setState(404);
			match(SCOLON);
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

	public static class EstdescContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(DASAParser.DESCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public EstdescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estdesc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterEstdesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitEstdesc(this);
		}
	}

	public final EstdescContext estdesc() throws RecognitionException {
		EstdescContext _localctx = new EstdescContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_estdesc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DESCRIBE);
			setState(407);
			match(LPAREN);
			setState(408);
			expresion();
			setState(409);
			match(RPAREN);
			setState(410);
			match(SCOLON);
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

	public static class DibujarContext extends ParserRuleContext {
		public TerminalNode PLOT() { return getToken(DASAParser.PLOT, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public DibujarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dibujar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterDibujar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitDibujar(this);
		}
	}

	public final DibujarContext dibujar() throws RecognitionException {
		DibujarContext _localctx = new DibujarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dibujar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(PLOT);
			setState(413);
			match(LPAREN);
			setState(414);
			expresion();
			setState(415);
			match(COMMA);
			setState(416);
			expresion();
			setState(417);
			match(RPAREN);
			setState(418);
			match(SCOLON);
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

	public static class RegresionContext extends ParserRuleContext {
		public TerminalNode REGRESSION() { return getToken(DASAParser.REGRESSION, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Reg1Context reg1() {
			return getRuleContext(Reg1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public RegresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitRegresion(this);
		}
	}

	public final RegresionContext regresion() throws RecognitionException {
		RegresionContext _localctx = new RegresionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_regresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(REGRESSION);
			setState(421);
			match(LPAREN);
			setState(422);
			expresion();
			setState(423);
			reg1();
			setState(424);
			match(RPAREN);
			setState(425);
			match(SCOLON);
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

	public static class Reg1Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Reg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterReg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitReg1(this);
		}
	}

	public final Reg1Context reg1() throws RecognitionException {
		Reg1Context _localctx = new Reg1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_reg1);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(COMMA);
				setState(428);
				expresion();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ClusteringContext extends ParserRuleContext {
		public TerminalNode CLUSTER() { return getToken(DASAParser.CLUSTER, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public ClusteringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterClustering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitClustering(this);
		}
	}

	public final ClusteringContext clustering() throws RecognitionException {
		ClusteringContext _localctx = new ClusteringContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_clustering);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(CLUSTER);
			setState(433);
			match(LPAREN);
			setState(434);
			expresion();
			setState(435);
			match(COMMA);
			setState(436);
			expresion();
			setState(437);
			match(RPAREN);
			setState(438);
			match(SCOLON);
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

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public Func1Context func1() {
			return getRuleContext(Func1Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ID);
			setState(441);
			match(LPAREN);
			setState(442);
			func1();
			setState(443);
			match(RPAREN);
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

	public static class Func1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Func2Context func2() {
			return getRuleContext(Func2Context.class,0);
		}
		public Func1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFunc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFunc1(this);
		}
	}

	public final Func1Context func1() throws RecognitionException {
		Func1Context _localctx = new Func1Context(_ctx, getState());
		enterRule(_localctx, 102, RULE_func1);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISNULL:
			case TOINT:
			case TOFLOAT:
			case TOARRCHAR:
			case NULL:
			case LPAREN:
			case LBRACK:
			case PLUS:
			case MINUS:
			case NOT:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				expresion();
				setState(446);
				func2();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(DASAParser.COMMA, 0); }
		public Func1Context func1() {
			return getRuleContext(Func1Context.class,0);
		}
		public Func2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFunc2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFunc2(this);
		}
	}

	public final Func2Context func2() throws RecognitionException {
		Func2Context _localctx = new Func2Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_func2);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(COMMA);
				setState(452);
				func1();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class RegresaContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DASAParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(DASAParser.SCOLON, 0); }
		public RegresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterRegresa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitRegresa(this);
		}
	}

	public final RegresaContext regresa() throws RecognitionException {
		RegresaContext _localctx = new RegresaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_regresa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(RETURN);
			setState(457);
			expresion();
			setState(458);
			match(SCOLON);
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

	public static class ExpresionContext extends ParserRuleContext {
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Expres1Context expres1() {
			return getRuleContext(Expres1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			comp();
			setState(461);
			expres1();
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

	public static class Expres1Context extends ParserRuleContext {
		public Expres2Context expres2() {
			return getRuleContext(Expres2Context.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public Expres1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expres1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExpres1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExpres1(this);
		}
	}

	public final Expres1Context expres1() throws RecognitionException {
		Expres1Context _localctx = new Expres1Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_expres1);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				expres2();
				setState(464);
				comp();
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Expres2Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DASAParser.AND, 0); }
		public TerminalNode OR() { return getToken(DASAParser.OR, 0); }
		public Expres2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expres2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExpres2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExpres2(this);
		}
	}

	public final Expres2Context expres2() throws RecognitionException {
		Expres2Context _localctx = new Expres2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_expres2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class CompContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Comp1Context comp1() {
			return getRuleContext(Comp1Context.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			exp();
			setState(472);
			comp1();
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

	public static class Comp1Context extends ParserRuleContext {
		public Comp2Context comp2() {
			return getRuleContext(Comp2Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Comp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterComp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitComp1(this);
		}
	}

	public final Comp1Context comp1() throws RecognitionException {
		Comp1Context _localctx = new Comp1Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_comp1);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFF:
			case EQUALS:
			case GREATEQ:
			case LESSEQ:
			case GREAT:
			case LESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				comp2();
				setState(475);
				exp();
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Comp2Context extends ParserRuleContext {
		public TerminalNode GREATEQ() { return getToken(DASAParser.GREATEQ, 0); }
		public TerminalNode GREAT() { return getToken(DASAParser.GREAT, 0); }
		public TerminalNode LESSEQ() { return getToken(DASAParser.LESSEQ, 0); }
		public TerminalNode LESS() { return getToken(DASAParser.LESS, 0); }
		public TerminalNode DIFF() { return getToken(DASAParser.DIFF, 0); }
		public TerminalNode EQUALS() { return getToken(DASAParser.EQUALS, 0); }
		public Comp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterComp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitComp2(this);
		}
	}

	public final Comp2Context comp2() throws RecognitionException {
		Comp2Context _localctx = new Comp2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_comp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFF) | (1L << EQUALS) | (1L << GREATEQ) | (1L << LESSEQ) | (1L << GREAT) | (1L << LESS))) != 0)) ) {
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

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			termino();
			setState(483);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public Exp2Context exp2() {
			return getRuleContext(Exp2Context.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExp1(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_exp1);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				exp2();
				setState(486);
				termino();
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
			case DIFF:
			case EQUALS:
			case GREATEQ:
			case LESSEQ:
			case GREAT:
			case LESS:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Exp2Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DASAParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DASAParser.MINUS, 0); }
		public Exp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitExp2(this);
		}
	}

	public final Exp2Context exp2() throws RecognitionException {
		Exp2Context _localctx = new Exp2Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_exp2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			factor();
			setState(494);
			term1();
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

	public static class Term1Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitTerm1(this);
		}
	}

	public final Term1Context term1() throws RecognitionException {
		Term1Context _localctx = new Term1Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_term1);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIVIDE:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				term2();
				setState(497);
				termino();
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
			case DIFF:
			case EQUALS:
			case GREATEQ:
			case LESSEQ:
			case GREAT:
			case LESS:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Term2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(DASAParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(DASAParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(DASAParser.MOD, 0); }
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitTerm2(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_term2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public Fact1Context fact1() {
			return getRuleContext(Fact1Context.class,0);
		}
		public Fact2Context fact2() {
			return getRuleContext(Fact2Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			fact1();
			setState(505);
			fact2();
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

	public static class Fact1Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(DASAParser.NOT, 0); }
		public Fact1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFact1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFact1(this);
		}
	}

	public final Fact1Context fact1() throws RecognitionException {
		Fact1Context _localctx = new Fact1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_fact1);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(NOT);
				}
				break;
			case ISNULL:
			case TOINT:
			case TOFLOAT:
			case TOARRCHAR:
			case NULL:
			case LPAREN:
			case LBRACK:
			case PLUS:
			case MINUS:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Fact2Context extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public Fact3Context fact3() {
			return getRuleContext(Fact3Context.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Fact2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFact2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFact2(this);
		}
	}

	public final Fact2Context fact2() throws RecognitionException {
		Fact2Context _localctx = new Fact2Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_fact2);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(LPAREN);
				setState(512);
				expresion();
				setState(513);
				match(RPAREN);
				}
				break;
			case ISNULL:
			case TOINT:
			case TOFLOAT:
			case TOARRCHAR:
			case NULL:
			case LBRACK:
			case PLUS:
			case MINUS:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				fact3();
				setState(516);
				valor();
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

	public static class Fact3Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DASAParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DASAParser.MINUS, 0); }
		public Fact3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterFact3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitFact3(this);
		}
	}

	public final Fact3Context fact3() throws RecognitionException {
		Fact3Context _localctx = new Fact3Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_fact3);
		try {
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(MINUS);
				}
				break;
			case ISNULL:
			case TOINT:
			case TOFLOAT:
			case TOARRCHAR:
			case NULL:
			case LBRACK:
			case CCHAR:
			case CARRCHAR:
			case CFLOAT:
			case CINT:
			case CBOOL:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ValorContext extends ParserRuleContext {
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public CastintContext castint() {
			return getRuleContext(CastintContext.class,0);
		}
		public CastfloatContext castfloat() {
			return getRuleContext(CastfloatContext.class,0);
		}
		public CastarrcharContext castarrchar() {
			return getRuleContext(CastarrcharContext.class,0);
		}
		public TerminalNode ID() { return getToken(DASAParser.ID, 0); }
		public Valor1Context valor1() {
			return getRuleContext(Valor1Context.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_valor);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				cte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				arreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				funcion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				vacio();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(529);
				castint();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				castfloat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(531);
				castarrchar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(532);
				match(ID);
				setState(533);
				valor1();
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

	public static class Valor1Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Valor2Context valor2() {
			return getRuleContext(Valor2Context.class,0);
		}
		public Valor1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterValor1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitValor1(this);
		}
	}

	public final Valor1Context valor1() throws RecognitionException {
		Valor1Context _localctx = new Valor1Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_valor1);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(LBRACK);
				setState(537);
				expresion();
				setState(538);
				match(RBRACK);
				setState(539);
				valor2();
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
			case DIFF:
			case EQUALS:
			case GREATEQ:
			case LESSEQ:
			case GREAT:
			case LESS:
			case PLUS:
			case MINUS:
			case MULT:
			case DIVIDE:
			case MOD:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Valor2Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DASAParser.LBRACK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(DASAParser.RBRACK, 0); }
		public Valor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterValor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitValor2(this);
		}
	}

	public final Valor2Context valor2() throws RecognitionException {
		Valor2Context _localctx = new Valor2Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_valor2);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(LBRACK);
				setState(545);
				expresion();
				setState(546);
				match(RBRACK);
				}
				break;
			case SCOLON:
			case COMMA:
			case RPAREN:
			case RBRACK:
			case DIFF:
			case EQUALS:
			case GREATEQ:
			case LESSEQ:
			case GREAT:
			case LESS:
			case PLUS:
			case MINUS:
			case MULT:
			case DIVIDE:
			case MOD:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VacioContext extends ParserRuleContext {
		public TerminalNode ISNULL() { return getToken(DASAParser.ISNULL, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public VacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitVacio(this);
		}
	}

	public final VacioContext vacio() throws RecognitionException {
		VacioContext _localctx = new VacioContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_vacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(ISNULL);
			setState(552);
			match(LPAREN);
			setState(553);
			expresion();
			setState(554);
			match(RPAREN);
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

	public static class CastintContext extends ParserRuleContext {
		public TerminalNode TOINT() { return getToken(DASAParser.TOINT, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public CastintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCastint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCastint(this);
		}
	}

	public final CastintContext castint() throws RecognitionException {
		CastintContext _localctx = new CastintContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_castint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(TOINT);
			setState(557);
			match(LPAREN);
			setState(558);
			expresion();
			setState(559);
			match(RPAREN);
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

	public static class CastfloatContext extends ParserRuleContext {
		public TerminalNode TOFLOAT() { return getToken(DASAParser.TOFLOAT, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public CastfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCastfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCastfloat(this);
		}
	}

	public final CastfloatContext castfloat() throws RecognitionException {
		CastfloatContext _localctx = new CastfloatContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_castfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(TOFLOAT);
			setState(562);
			match(LPAREN);
			setState(563);
			expresion();
			setState(564);
			match(RPAREN);
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

	public static class CastarrcharContext extends ParserRuleContext {
		public TerminalNode TOARRCHAR() { return getToken(DASAParser.TOARRCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(DASAParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DASAParser.RPAREN, 0); }
		public CastarrcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castarrchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).enterCastarrchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DASAListener ) ((DASAListener)listener).exitCastarrchar(this);
		}
	}

	public final CastarrcharContext castarrchar() throws RecognitionException {
		CastarrcharContext _localctx = new CastarrcharContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_castarrchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(TOARRCHAR);
			setState(567);
			match(LPAREN);
			setState(568);
			expresion();
			setState(569);
			match(RPAREN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u023e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\3\3\3\3\5\3\u00a3\n"+
		"\3\3\4\3\4\5\4\u00a7\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u00b3"+
		"\n\6\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\5\t\u00c9\n\t\3\n\3\n\3\n\5\n\u00ce\n\n\3\13\3\13"+
		"\5\13\u00d2\n\13\3\f\3\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\5\r\u00dc\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00e5\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00f4\n\21\3\22\3\22"+
		"\3\22\3\22\5\22\u00fa\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0103"+
		"\n\24\3\25\3\25\5\25\u0107\n\25\3\26\3\26\3\26\5\26\u010c\n\26\3\27\3"+
		"\27\5\27\u0110\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u011f\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u012d\n\32\3\33\3\33\3\33\3\33\5\33\u0133\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\5\36\u0145\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \5 \u0154\n \3!\3!\3!\3!\3!\5!\u015b\n!\3\"\3\"\3\"\3\"\3"+
		"#\3#\5#\u0163\n#\3$\3$\3$\3$\5$\u0169\n$\3%\3%\3%\5%\u016e\n%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\5\'\u0179\n\'\3(\3(\3(\5(\u017e\n(\3)\3)\3)\5"+
		")\u0183\n)\3*\3*\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\5-\u0191\n-\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u01b1\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\5\65\u01c4\n\65\3\66\3\66\3\66\5\66\u01c9\n\66\3\67\3\67\3\67\3"+
		"\67\38\38\38\39\39\39\39\59\u01d6\n9\3:\3:\3;\3;\3;\3<\3<\3<\3<\5<\u01e1"+
		"\n<\3=\3=\3>\3>\3>\3?\3?\3?\3?\5?\u01ec\n?\3@\3@\3A\3A\3A\3B\3B\3B\3B"+
		"\5B\u01f7\nB\3C\3C\3D\3D\3D\3E\3E\5E\u0200\nE\3F\3F\3F\3F\3F\3F\3F\5F"+
		"\u0209\nF\3G\3G\3G\5G\u020e\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0219\nH"+
		"\3I\3I\3I\3I\3I\3I\5I\u0221\nI\3J\3J\3J\3J\3J\5J\u0228\nJ\3K\3K\3K\3K"+
		"\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\2\2O\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\2\b\4\2\31\31\63\67\3\2\6\t\3\2\60\61\4\2#$&"+
		")\3\2*+\4\2,-//\2\u022a\2\u009c\3\2\2\2\4\u00a2\3\2\2\2\6\u00a6\3\2\2"+
		"\2\b\u00a8\3\2\2\2\n\u00b2\3\2\2\2\f\u00b8\3\2\2\2\16\u00ba\3\2\2\2\20"+
		"\u00c8\3\2\2\2\22\u00cd\3\2\2\2\24\u00d1\3\2\2\2\26\u00d7\3\2\2\2\30\u00db"+
		"\3\2\2\2\32\u00dd\3\2\2\2\34\u00e4\3\2\2\2\36\u00e6\3\2\2\2 \u00f3\3\2"+
		"\2\2\"\u00f9\3\2\2\2$\u00fb\3\2\2\2&\u0102\3\2\2\2(\u0106\3\2\2\2*\u010b"+
		"\3\2\2\2,\u010f\3\2\2\2.\u011e\3\2\2\2\60\u0120\3\2\2\2\62\u012c\3\2\2"+
		"\2\64\u0132\3\2\2\2\66\u0134\3\2\2\28\u013a\3\2\2\2:\u0144\3\2\2\2<\u0146"+
		"\3\2\2\2>\u0153\3\2\2\2@\u015a\3\2\2\2B\u015c\3\2\2\2D\u0162\3\2\2\2F"+
		"\u0168\3\2\2\2H\u016d\3\2\2\2J\u016f\3\2\2\2L\u0178\3\2\2\2N\u017d\3\2"+
		"\2\2P\u0182\3\2\2\2R\u0184\3\2\2\2T\u0186\3\2\2\2V\u0188\3\2\2\2X\u0190"+
		"\3\2\2\2Z\u0192\3\2\2\2\\\u0198\3\2\2\2^\u019e\3\2\2\2`\u01a6\3\2\2\2"+
		"b\u01b0\3\2\2\2d\u01b2\3\2\2\2f\u01ba\3\2\2\2h\u01c3\3\2\2\2j\u01c8\3"+
		"\2\2\2l\u01ca\3\2\2\2n\u01ce\3\2\2\2p\u01d5\3\2\2\2r\u01d7\3\2\2\2t\u01d9"+
		"\3\2\2\2v\u01e0\3\2\2\2x\u01e2\3\2\2\2z\u01e4\3\2\2\2|\u01eb\3\2\2\2~"+
		"\u01ed\3\2\2\2\u0080\u01ef\3\2\2\2\u0082\u01f6\3\2\2\2\u0084\u01f8\3\2"+
		"\2\2\u0086\u01fa\3\2\2\2\u0088\u01ff\3\2\2\2\u008a\u0208\3\2\2\2\u008c"+
		"\u020d\3\2\2\2\u008e\u0218\3\2\2\2\u0090\u0220\3\2\2\2\u0092\u0227\3\2"+
		"\2\2\u0094\u0229\3\2\2\2\u0096\u022e\3\2\2\2\u0098\u0233\3\2\2\2\u009a"+
		"\u0238\3\2\2\2\u009c\u009d\5\4\3\2\u009d\u009e\5\6\4\2\u009e\u009f\5\b"+
		"\5\2\u009f\3\3\2\2\2\u00a0\u00a3\5\36\20\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\5\3\2\2\2\u00a4\u00a7\5\16\b\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\7\3\2\2\2"+
		"\u00a8\u00a9\7\5\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\7 \2\2\u00ab\u00ac"+
		"\7\35\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\36\2\2"+
		"\u00af\t\3\2\2\2\u00b0\u00b3\5\36\20\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\13\3\2\2\2\u00b4\u00b5\5.\30\2\u00b5"+
		"\u00b6\5\f\7\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc"+
		"\78\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7 \2\2\u00bf"+
		"\u00c0\5\22\n\2\u00c0\u00c1\7\35\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3"+
		"\5\26\f\2\u00c3\u00c4\7\36\2\2\u00c4\u00c5\5\30\r\2\u00c5\17\3\2\2\2\u00c6"+
		"\u00c9\5\32\16\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3"+
		"\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00ce\5T+\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\23\3\2\2\2\u00cf"+
		"\u00d2\5\36\20\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3"+
		"\2\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\5.\30\2\u00d4\u00d5\5\26\f\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\27\3\2\2\2\u00d9\u00dc\5\16\b\2\u00da\u00dc\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\5T+\2\u00de"+
		"\u00df\7\32\2\2\u00df\u00e0\78\2\2\u00e0\u00e1\5\34\17\2\u00e1\33\3\2"+
		"\2\2\u00e2\u00e5\5\32\16\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\35\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5T+\2"+
		"\u00e8\u00e9\5 \21\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec"+
		"\7\33\2\2\u00ec\u00ed\5,\27\2\u00ed\37\3\2\2\2\u00ee\u00ef\7!\2\2\u00ef"+
		"\u00f0\7\66\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f4\5\"\22\2\u00f2\u00f4\3"+
		"\2\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f6"+
		"\7!\2\2\u00f6\u00f7\7\66\2\2\u00f7\u00fa\7\"\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa#\3\2\2\2\u00fb\u00fc\78\2\2\u00fc"+
		"\u00fd\5&\24\2\u00fd\u00fe\5*\26\2\u00fe%\3\2\2\2\u00ff\u0100\7%\2\2\u0100"+
		"\u0103\5(\25\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\'\3\2\2\2\u0104\u0107\5R*\2\u0105\u0107\5B\"\2\u0106\u0104"+
		"\3\2\2\2\u0106\u0105\3\2\2\2\u0107)\3\2\2\2\u0108\u0109\7\34\2\2\u0109"+
		"\u010c\5$\23\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c+\3\2\2\2\u010d\u0110\5\36\20\2\u010e\u0110\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u010e\3\2\2\2\u0110-\3\2\2\2\u0111\u011f\5\60\31\2\u0112"+
		"\u011f\5\66\34\2\u0113\u011f\58\35\2\u0114\u0115\5f\64\2\u0115\u0116\7"+
		"\33\2\2\u0116\u011f\3\2\2\2\u0117\u011f\5<\37\2\u0118\u011f\5Z.\2\u0119"+
		"\u011f\5\\/\2\u011a\u011f\5^\60\2\u011b\u011f\5`\61\2\u011c\u011f\5d\63"+
		"\2\u011d\u011f\5l\67\2\u011e\u0111\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0113"+
		"\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u0117\3\2\2\2\u011e\u0118\3\2\2\2\u011e"+
		"\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011d\3\2\2\2\u011f/\3\2\2\2\u0120\u0121\78\2\2\u0121\u0122"+
		"\5\62\32\2\u0122\u0123\7%\2\2\u0123\u0124\5n8\2\u0124\u0125\7\33\2\2\u0125"+
		"\61\3\2\2\2\u0126\u0127\7!\2\2\u0127\u0128\5n8\2\u0128\u0129\7\"\2\2\u0129"+
		"\u012a\5\64\33\2\u012a\u012d\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0126\3"+
		"\2\2\2\u012c\u012b\3\2\2\2\u012d\63\3\2\2\2\u012e\u012f\7!\2\2\u012f\u0130"+
		"\7\66\2\2\u0130\u0133\7\"\2\2\u0131\u0133\3\2\2\2\u0132\u012e\3\2\2\2"+
		"\u0132\u0131\3\2\2\2\u0133\65\3\2\2\2\u0134\u0135\7\26\2\2\u0135\u0136"+
		"\7\37\2\2\u0136\u0137\5n8\2\u0137\u0138\7 \2\2\u0138\u0139\5V,\2\u0139"+
		"\67\3\2\2\2\u013a\u013b\7\27\2\2\u013b\u013c\7\37\2\2\u013c\u013d\5n8"+
		"\2\u013d\u013e\7 \2\2\u013e\u013f\5V,\2\u013f\u0140\5:\36\2\u01409\3\2"+
		"\2\2\u0141\u0142\7\30\2\2\u0142\u0145\5V,\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0143\3\2\2\2\u0145;\3\2\2\2\u0146\u0147\7\f\2\2"+
		"\u0147\u0148\7\37\2\2\u0148\u0149\78\2\2\u0149\u014a\5> \2\u014a\u014b"+
		"\7 \2\2\u014b\u014c\7\33\2\2\u014c=\3\2\2\2\u014d\u014e\7!\2\2\u014e\u014f"+
		"\5n8\2\u014f\u0150\7\"\2\2\u0150\u0151\5@!\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0152\3\2\2\2\u0154?\3\2\2\2"+
		"\u0155\u0156\7!\2\2\u0156\u0157\5n8\2\u0157\u0158\7\"\2\2\u0158\u015b"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"A\3\2\2\2\u015c\u015d\7!\2\2\u015d\u015e\5D#\2\u015e\u015f\7\"\2\2\u015f"+
		"C\3\2\2\2\u0160\u0163\5F$\2\u0161\u0163\5J&\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163E\3\2\2\2\u0164\u0165\5R*\2\u0165\u0166\5H%\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0167\3\2"+
		"\2\2\u0169G\3\2\2\2\u016a\u016b\7\34\2\2\u016b\u016e\5F$\2\u016c\u016e"+
		"\3\2\2\2\u016d\u016a\3\2\2\2\u016d\u016c\3\2\2\2\u016eI\3\2\2\2\u016f"+
		"\u0170\7!\2\2\u0170\u0171\5L\'\2\u0171\u0172\7\"\2\2\u0172\u0173\5P)\2"+
		"\u0173K\3\2\2\2\u0174\u0175\5n8\2\u0175\u0176\5N(\2\u0176\u0179\3\2\2"+
		"\2\u0177\u0179\3\2\2\2\u0178\u0174\3\2\2\2\u0178\u0177\3\2\2\2\u0179M"+
		"\3\2\2\2\u017a\u017b\7\34\2\2\u017b\u017e\5L\'\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017a\3\2\2\2\u017d\u017c\3\2\2\2\u017eO\3\2\2\2\u017f\u0180\7\34\2\2"+
		"\u0180\u0183\5J&\2\u0181\u0183\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0181"+
		"\3\2\2\2\u0183Q\3\2\2\2\u0184\u0185\t\2\2\2\u0185S\3\2\2\2\u0186\u0187"+
		"\t\3\2\2\u0187U\3\2\2\2\u0188\u0189\7\35\2\2\u0189\u018a\5X-\2\u018a\u018b"+
		"\7\36\2\2\u018bW\3\2\2\2\u018c\u018d\5.\30\2\u018d\u018e\5X-\2\u018e\u0191"+
		"\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018f\3\2\2\2\u0191"+
		"Y\3\2\2\2\u0192\u0193\7\13\2\2\u0193\u0194\7\37\2\2\u0194\u0195\5n8\2"+
		"\u0195\u0196\7 \2\2\u0196\u0197\7\33\2\2\u0197[\3\2\2\2\u0198\u0199\7"+
		"\22\2\2\u0199\u019a\7\37\2\2\u019a\u019b\5n8\2\u019b\u019c\7 \2\2\u019c"+
		"\u019d\7\33\2\2\u019d]\3\2\2\2\u019e\u019f\7\21\2\2\u019f\u01a0\7\37\2"+
		"\2\u01a0\u01a1\5n8\2\u01a1\u01a2\7\34\2\2\u01a2\u01a3\5n8\2\u01a3\u01a4"+
		"\7 \2\2\u01a4\u01a5\7\33\2\2\u01a5_\3\2\2\2\u01a6\u01a7\7\23\2\2\u01a7"+
		"\u01a8\7\37\2\2\u01a8\u01a9\5n8\2\u01a9\u01aa\5b\62\2\u01aa\u01ab\7 \2"+
		"\2\u01ab\u01ac\7\33\2\2\u01aca\3\2\2\2\u01ad\u01ae\7\34\2\2\u01ae\u01b1"+
		"\5n8\2\u01af\u01b1\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"c\3\2\2\2\u01b2\u01b3\7\24\2\2\u01b3\u01b4\7\37\2\2\u01b4\u01b5\5n8\2"+
		"\u01b5\u01b6\7\34\2\2\u01b6\u01b7\5n8\2\u01b7\u01b8\7 \2\2\u01b8\u01b9"+
		"\7\33\2\2\u01b9e\3\2\2\2\u01ba\u01bb\78\2\2\u01bb\u01bc\7\37\2\2\u01bc"+
		"\u01bd\5h\65\2\u01bd\u01be\7 \2\2\u01beg\3\2\2\2\u01bf\u01c0\5n8\2\u01c0"+
		"\u01c1\5j\66\2\u01c1\u01c4\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01bf\3\2"+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c4i\3\2\2\2\u01c5\u01c6\7\34\2\2\u01c6\u01c9"+
		"\5h\65\2\u01c7\u01c9\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"k\3\2\2\2\u01ca\u01cb\7\25\2\2\u01cb\u01cc\5n8\2\u01cc\u01cd\7\33\2\2"+
		"\u01cdm\3\2\2\2\u01ce\u01cf\5t;\2\u01cf\u01d0\5p9\2\u01d0o\3\2\2\2\u01d1"+
		"\u01d2\5r:\2\u01d2\u01d3\5t;\2\u01d3\u01d6\3\2\2\2\u01d4\u01d6\3\2\2\2"+
		"\u01d5\u01d1\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6q\3\2\2\2\u01d7\u01d8\t"+
		"\4\2\2\u01d8s\3\2\2\2\u01d9\u01da\5z>\2\u01da\u01db\5v<\2\u01dbu\3\2\2"+
		"\2\u01dc\u01dd\5x=\2\u01dd\u01de\5z>\2\u01de\u01e1\3\2\2\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1w\3\2\2\2\u01e2"+
		"\u01e3\t\5\2\2\u01e3y\3\2\2\2\u01e4\u01e5\5\u0080A\2\u01e5\u01e6\5|?\2"+
		"\u01e6{\3\2\2\2\u01e7\u01e8\5~@\2\u01e8\u01e9\5\u0080A\2\u01e9\u01ec\3"+
		"\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec"+
		"}\3\2\2\2\u01ed\u01ee\t\6\2\2\u01ee\177\3\2\2\2\u01ef\u01f0\5\u0086D\2"+
		"\u01f0\u01f1\5\u0082B\2\u01f1\u0081\3\2\2\2\u01f2\u01f3\5\u0084C\2\u01f3"+
		"\u01f4\5\u0080A\2\u01f4\u01f7\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f2"+
		"\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u0083\3\2\2\2\u01f8\u01f9\t\7\2\2\u01f9"+
		"\u0085\3\2\2\2\u01fa\u01fb\5\u0088E\2\u01fb\u01fc\5\u008aF\2\u01fc\u0087"+
		"\3\2\2\2\u01fd\u0200\7.\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0089\3\2\2\2\u0201\u0202\7\37\2\2\u0202\u0203\5"+
		"n8\2\u0203\u0204\7 \2\2\u0204\u0209\3\2\2\2\u0205\u0206\5\u008cG\2\u0206"+
		"\u0207\5\u008eH\2\u0207\u0209\3\2\2\2\u0208\u0201\3\2\2\2\u0208\u0205"+
		"\3\2\2\2\u0209\u008b\3\2\2\2\u020a\u020e\7*\2\2\u020b\u020e\7+\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2"+
		"\2\2\u020e\u008d\3\2\2\2\u020f\u0219\5R*\2\u0210\u0219\5B\"\2\u0211\u0219"+
		"\5f\64\2\u0212\u0219\5\u0094K\2\u0213\u0219\5\u0096L\2\u0214\u0219\5\u0098"+
		"M\2\u0215\u0219\5\u009aN\2\u0216\u0217\78\2\2\u0217\u0219\5\u0090I\2\u0218"+
		"\u020f\3\2\2\2\u0218\u0210\3\2\2\2\u0218\u0211\3\2\2\2\u0218\u0212\3\2"+
		"\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0215\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u008f\3\2\2\2\u021a\u021b\7!\2\2\u021b\u021c\5n8"+
		"\2\u021c\u021d\7\"\2\2\u021d\u021e\5\u0092J\2\u021e\u0221\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0091\3\2"+
		"\2\2\u0222\u0223\7!\2\2\u0223\u0224\5n8\2\u0224\u0225\7\"\2\2\u0225\u0228"+
		"\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0226\3\2\2\2\u0228"+
		"\u0093\3\2\2\2\u0229\u022a\7\r\2\2\u022a\u022b\7\37\2\2\u022b\u022c\5"+
		"n8\2\u022c\u022d\7 \2\2\u022d\u0095\3\2\2\2\u022e\u022f\7\16\2\2\u022f"+
		"\u0230\7\37\2\2\u0230\u0231\5n8\2\u0231\u0232\7 \2\2\u0232\u0097\3\2\2"+
		"\2\u0233\u0234\7\17\2\2\u0234\u0235\7\37\2\2\u0235\u0236\5n8\2\u0236\u0237"+
		"\7 \2\2\u0237\u0099\3\2\2\2\u0238\u0239\7\20\2\2\u0239\u023a\7\37\2\2"+
		"\u023a\u023b\5n8\2\u023b\u023c\7 \2\2\u023c\u009b\3\2\2\2,\u00a2\u00a6"+
		"\u00b2\u00b8\u00c8\u00cd\u00d1\u00d7\u00db\u00e4\u00f3\u00f9\u0102\u0106"+
		"\u010b\u010f\u011e\u012c\u0132\u0144\u0153\u015a\u0162\u0168\u016d\u0178"+
		"\u017d\u0182\u0190\u01b0\u01c3\u01c8\u01d5\u01e0\u01eb\u01f6\u01ff\u0208"+
		"\u020d\u0218\u0220\u0227";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}