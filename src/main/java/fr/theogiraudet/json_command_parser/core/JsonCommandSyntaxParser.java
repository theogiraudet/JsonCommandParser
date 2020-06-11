package fr.theogiraudet.json_command_parser.core;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonCommandSyntaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TYPE_QUOTED=17, 
		STRING=18, BOOLEAN=19, FLOAT=20, INTEGER=21, BACK_LINE=22, WHITESPACE=23, 
		COMMENT=24;
	public static final int
		RULE_root = 0, RULE_descriptor = 1, RULE_descriptor_expressions = 2, RULE_description = 3, 
		RULE_aliases = 4, RULE_permissions = 5, RULE_arguments = 6, RULE_argument = 7, 
		RULE_argument_expressions = 8, RULE_type = 9, RULE_id = 10, RULE_matches = 11, 
		RULE_execute = 12, RULE_keep_value = 13, RULE_tag = 14, RULE_array_string = 15, 
		RULE_int_lex = 16, RULE_float_lex = 17, RULE_boolean_lex = 18, RULE_string_lex = 19, 
		RULE_type_lex = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "descriptor", "descriptor_expressions", "description", "aliases", 
			"permissions", "arguments", "argument", "argument_expressions", "type", 
			"id", "matches", "execute", "keep_value", "tag", "array_string", "int_lex", 
			"float_lex", "boolean_lex", "string_lex", "type_lex"
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

	@Override
	public String getGrammarFileName() { return "JsonCommandSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonCommandSyntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public DescriptorContext descriptor() {
			return getRuleContext(DescriptorContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			string_lex();
			 Actions.initCommand(); 
			setState(45);
			match(T__1);
			Actions.newContext();
			setState(47);
			match(T__0);
			setState(48);
			descriptor();
			 Actions.deleteContext(); 
			setState(50);
			match(T__2);
			setState(51);
			match(T__2);
			 Actions.resultCommand(); 
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

	public static class DescriptorContext extends ParserRuleContext {
		public List<Descriptor_expressionsContext> descriptor_expressions() {
			return getRuleContexts(Descriptor_expressionsContext.class);
		}
		public Descriptor_expressionsContext descriptor_expressions(int i) {
			return getRuleContext(Descriptor_expressionsContext.class,i);
		}
		public DescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitDescriptor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitDescriptor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptorContext descriptor() throws RecognitionException {
		DescriptorContext _localctx = new DescriptorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_descriptor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			descriptor_expressions();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(55);
				match(T__3);
				setState(56);
				descriptor_expressions();
				}
				}
				setState(61);
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

	public static class Descriptor_expressionsContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public AliasesContext aliases() {
			return getRuleContext(AliasesContext.class,0);
		}
		public PermissionsContext permissions() {
			return getRuleContext(PermissionsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public Descriptor_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptor_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterDescriptor_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitDescriptor_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitDescriptor_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Descriptor_expressionsContext descriptor_expressions() throws RecognitionException {
		Descriptor_expressionsContext _localctx = new Descriptor_expressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descriptor_expressions);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				description();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				aliases();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				permissions();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				arguments();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				execute();
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

	public static class DescriptionContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			match(T__1);
			setState(71);
			string_lex();
			 Actions.setDescription(); 
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

	public static class AliasesContext extends ParserRuleContext {
		public Array_stringContext array_string() {
			return getRuleContext(Array_stringContext.class,0);
		}
		public AliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasesContext aliases() throws RecognitionException {
		AliasesContext _localctx = new AliasesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_aliases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);
			setState(75);
			match(T__1);
			setState(76);
			array_string();
			 Actions.setAliases(); 
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

	public static class PermissionsContext extends ParserRuleContext {
		public Array_stringContext array_string() {
			return getRuleContext(Array_stringContext.class,0);
		}
		public PermissionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permissions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterPermissions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitPermissions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitPermissions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermissionsContext permissions() throws RecognitionException {
		PermissionsContext _localctx = new PermissionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_permissions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__6);
			setState(80);
			match(T__1);
			setState(81);
			array_string();
			 Actions.setPermissions(); 
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__7);
			setState(85);
			match(T__1);
			setState(86);
			match(T__8);
			 Actions.stackArguments(); 
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(88);
				argument();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(89);
					match(T__3);
					setState(90);
					argument();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(98);
			match(T__9);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<Argument_expressionsContext> argument_expressions() {
			return getRuleContexts(Argument_expressionsContext.class);
		}
		public Argument_expressionsContext argument_expressions(int i) {
			return getRuleContext(Argument_expressionsContext.class,i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Actions.newContext(); 
			setState(101);
			match(T__0);
			setState(102);
			argument_expressions();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(103);
				match(T__3);
				setState(104);
				argument_expressions();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__2);
			 Actions.deleteContext(); 
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

	public static class Argument_expressionsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public MatchesContext matches() {
			return getRuleContext(MatchesContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public Keep_valueContext keep_value() {
			return getRuleContext(Keep_valueContext.class,0);
		}
		public Argument_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterArgument_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitArgument_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitArgument_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_expressionsContext argument_expressions() throws RecognitionException {
		Argument_expressionsContext _localctx = new Argument_expressionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument_expressions);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				type();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				tag();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				matches();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				id();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				arguments();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				execute();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				keep_value();
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

	public static class TypeContext extends ParserRuleContext {
		public Type_lexContext type_lex() {
			return getRuleContext(Type_lexContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__10);
			setState(123);
			match(T__1);
			setState(124);
			type_lex();
			 Actions.setType(); 
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

	public static class IdContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			match(T__1);
			setState(129);
			string_lex();
			 Actions.setId(); 
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

	public static class MatchesContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public MatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterMatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitMatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitMatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchesContext matches() throws RecognitionException {
		MatchesContext _localctx = new MatchesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__12);
			setState(133);
			match(T__1);
			setState(134);
			string_lex();
			 Actions.setMatches(); 
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

	public static class ExecuteContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_execute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__13);
			setState(138);
			match(T__1);
			setState(139);
			string_lex();
			 Actions.setExecute(); 
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

	public static class Keep_valueContext extends ParserRuleContext {
		public Boolean_lexContext boolean_lex() {
			return getRuleContext(Boolean_lexContext.class,0);
		}
		public Keep_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keep_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterKeep_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitKeep_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitKeep_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Keep_valueContext keep_value() throws RecognitionException {
		Keep_valueContext _localctx = new Keep_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keep_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__14);
			setState(143);
			match(T__1);
			setState(144);
			boolean_lex();
			 Actions.setKeepValue(); 
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

	public static class TagContext extends ParserRuleContext {
		public String_lexContext string_lex() {
			return getRuleContext(String_lexContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__15);
			setState(148);
			match(T__1);
			setState(149);
			string_lex();
			 Actions.setTag(); 
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

	public static class Array_stringContext extends ParserRuleContext {
		public List<String_lexContext> string_lex() {
			return getRuleContexts(String_lexContext.class);
		}
		public String_lexContext string_lex(int i) {
			return getRuleContext(String_lexContext.class,i);
		}
		public Array_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterArray_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitArray_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitArray_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_stringContext array_string() throws RecognitionException {
		Array_stringContext _localctx = new Array_stringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Actions.initList(); 
			setState(153);
			match(T__8);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(154);
				string_lex();
				 Actions.addToList(); 
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(156);
					match(T__3);
					setState(157);
					string_lex();
					 Actions.addToList(); 
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(167);
			match(T__9);
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

	public static class Int_lexContext extends ParserRuleContext {
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(JsonCommandSyntaxParser.INTEGER, 0); }
		public Int_lexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_lex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterInt_lex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitInt_lex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitInt_lex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_lexContext int_lex() throws RecognitionException {
		Int_lexContext _localctx = new Int_lexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_int_lex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((Int_lexContext)_localctx).INTEGER = match(INTEGER);
			 UtilLex.integer_$eq(Integer.parseInt((((Int_lexContext)_localctx).INTEGER!=null?((Int_lexContext)_localctx).INTEGER.getText():null))); 
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

	public static class Float_lexContext extends ParserRuleContext {
		public Token FLOAT;
		public TerminalNode FLOAT() { return getToken(JsonCommandSyntaxParser.FLOAT, 0); }
		public Float_lexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_lex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterFloat_lex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitFloat_lex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitFloat_lex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_lexContext float_lex() throws RecognitionException {
		Float_lexContext _localctx = new Float_lexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_float_lex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Float_lexContext)_localctx).FLOAT = match(FLOAT);
			 UtilLex.floating_$eq(Float.parseFloat((((Float_lexContext)_localctx).FLOAT!=null?((Float_lexContext)_localctx).FLOAT.getText():null))); 
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

	public static class Boolean_lexContext extends ParserRuleContext {
		public Token BOOLEAN;
		public TerminalNode BOOLEAN() { return getToken(JsonCommandSyntaxParser.BOOLEAN, 0); }
		public Boolean_lexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_lex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterBoolean_lex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitBoolean_lex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitBoolean_lex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_lexContext boolean_lex() throws RecognitionException {
		Boolean_lexContext _localctx = new Boolean_lexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolean_lex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((Boolean_lexContext)_localctx).BOOLEAN = match(BOOLEAN);
			 UtilLex.bool_$eq(Boolean.parseBoolean((((Boolean_lexContext)_localctx).BOOLEAN!=null?((Boolean_lexContext)_localctx).BOOLEAN.getText():null))); 
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

	public static class String_lexContext extends ParserRuleContext {
		public Token STRING;
		public TerminalNode STRING() { return getToken(JsonCommandSyntaxParser.STRING, 0); }
		public String_lexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterString_lex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitString_lex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitString_lex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_lexContext string_lex() throws RecognitionException {
		String_lexContext _localctx = new String_lexContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_string_lex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((String_lexContext)_localctx).STRING = match(STRING);
			 UtilLex.string_$eq((((String_lexContext)_localctx).STRING!=null?((String_lexContext)_localctx).STRING.getText():null).substring(1, (((String_lexContext)_localctx).STRING!=null?((String_lexContext)_localctx).STRING.getText():null).length() - 1)); 
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

	public static class Type_lexContext extends ParserRuleContext {
		public Token TYPE_QUOTED;
		public TerminalNode TYPE_QUOTED() { return getToken(JsonCommandSyntaxParser.TYPE_QUOTED, 0); }
		public Type_lexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_lex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).enterType_lex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonCommandSyntaxListener ) ((JsonCommandSyntaxListener)listener).exitType_lex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonCommandSyntaxVisitor ) return ((JsonCommandSyntaxVisitor<? extends T>)visitor).visitType_lex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_lexContext type_lex() throws RecognitionException {
		Type_lexContext _localctx = new Type_lexContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_lex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((Type_lexContext)_localctx).TYPE_QUOTED = match(TYPE_QUOTED);
			 UtilLex.string_$eq((((Type_lexContext)_localctx).TYPE_QUOTED!=null?((Type_lexContext)_localctx).TYPE_QUOTED.getText():null).substring(1, (((Type_lexContext)_localctx).TYPE_QUOTED!=null?((Type_lexContext)_localctx).TYPE_QUOTED.getText():null).length() - 1)); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\5\bc\n\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u00a3\n\21\f\21\16\21\u00a6\13\21\5\21\u00a8\n\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00b5\2"+
		",\3\2\2\2\48\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fQ\3\2\2\2\16V\3"+
		"\2\2\2\20f\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u0081\3\2\2\2\30\u0086\3"+
		"\2\2\2\32\u008b\3\2\2\2\34\u0090\3\2\2\2\36\u0095\3\2\2\2 \u009a\3\2\2"+
		"\2\"\u00ab\3\2\2\2$\u00ae\3\2\2\2&\u00b1\3\2\2\2(\u00b4\3\2\2\2*\u00b7"+
		"\3\2\2\2,-\7\3\2\2-.\5(\25\2./\b\2\1\2/\60\7\4\2\2\60\61\b\2\1\2\61\62"+
		"\7\3\2\2\62\63\5\4\3\2\63\64\b\2\1\2\64\65\7\5\2\2\65\66\7\5\2\2\66\67"+
		"\b\2\1\2\67\3\3\2\2\28=\5\6\4\29:\7\6\2\2:<\5\6\4\2;9\3\2\2\2<?\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@F\5\b\5\2AF\5\n\6\2BF\5\f"+
		"\7\2CF\5\16\b\2DF\5\32\16\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED"+
		"\3\2\2\2F\7\3\2\2\2GH\7\7\2\2HI\7\4\2\2IJ\5(\25\2JK\b\5\1\2K\t\3\2\2\2"+
		"LM\7\b\2\2MN\7\4\2\2NO\5 \21\2OP\b\6\1\2P\13\3\2\2\2QR\7\t\2\2RS\7\4\2"+
		"\2ST\5 \21\2TU\b\7\1\2U\r\3\2\2\2VW\7\n\2\2WX\7\4\2\2XY\7\13\2\2Yb\b\b"+
		"\1\2Z_\5\20\t\2[\\\7\6\2\2\\^\5\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_"+
		"`\3\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2"+
		"e\17\3\2\2\2fg\b\t\1\2gh\7\3\2\2hm\5\22\n\2ij\7\6\2\2jl\5\22\n\2ki\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\5\2\2qr\b\t"+
		"\1\2r\21\3\2\2\2s{\5\24\13\2t{\5\36\20\2u{\5\30\r\2v{\5\26\f\2w{\5\16"+
		"\b\2x{\5\32\16\2y{\5\34\17\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2z"+
		"w\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\23\3\2\2\2|}\7\r\2\2}~\7\4\2\2~\177\5*"+
		"\26\2\177\u0080\b\13\1\2\u0080\25\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\5(\25\2\u0084\u0085\b\f\1\2\u0085\27\3\2\2\2\u0086"+
		"\u0087\7\17\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5(\25\2\u0089\u008a\b"+
		"\r\1\2\u008a\31\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\7\4\2\2\u008d"+
		"\u008e\5(\25\2\u008e\u008f\b\16\1\2\u008f\33\3\2\2\2\u0090\u0091\7\21"+
		"\2\2\u0091\u0092\7\4\2\2\u0092\u0093\5&\24\2\u0093\u0094\b\17\1\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\7\22\2\2\u0096\u0097\7\4\2\2\u0097\u0098\5(\25"+
		"\2\u0098\u0099\b\20\1\2\u0099\37\3\2\2\2\u009a\u009b\b\21\1\2\u009b\u00a7"+
		"\7\13\2\2\u009c\u009d\5(\25\2\u009d\u00a4\b\21\1\2\u009e\u009f\7\6\2\2"+
		"\u009f\u00a0\5(\25\2\u00a0\u00a1\b\21\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009e"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa!\3\2\2\2\u00ab\u00ac"+
		"\7\27\2\2\u00ac\u00ad\b\22\1\2\u00ad#\3\2\2\2\u00ae\u00af\7\26\2\2\u00af"+
		"\u00b0\b\23\1\2\u00b0%\3\2\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\b\24\1"+
		"\2\u00b3\'\3\2\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\b\25\1\2\u00b6)\3"+
		"\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\b\26\1\2\u00b9+\3\2\2\2\n=E_b"+
		"mz\u00a4\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}