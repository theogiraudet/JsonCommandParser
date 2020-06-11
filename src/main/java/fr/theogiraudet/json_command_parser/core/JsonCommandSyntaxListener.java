package fr.theogiraudet.json_command_parser.core;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonCommandSyntaxParser}.
 */
public interface JsonCommandSyntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(JsonCommandSyntaxParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(JsonCommandSyntaxParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor(JsonCommandSyntaxParser.DescriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#descriptor}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor(JsonCommandSyntaxParser.DescriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#descriptor_expressions}.
	 * @param ctx the parse tree
	 */
	void enterDescriptor_expressions(JsonCommandSyntaxParser.Descriptor_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#descriptor_expressions}.
	 * @param ctx the parse tree
	 */
	void exitDescriptor_expressions(JsonCommandSyntaxParser.Descriptor_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(JsonCommandSyntaxParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(JsonCommandSyntaxParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#aliases}.
	 * @param ctx the parse tree
	 */
	void enterAliases(JsonCommandSyntaxParser.AliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#aliases}.
	 * @param ctx the parse tree
	 */
	void exitAliases(JsonCommandSyntaxParser.AliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#permissions}.
	 * @param ctx the parse tree
	 */
	void enterPermissions(JsonCommandSyntaxParser.PermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#permissions}.
	 * @param ctx the parse tree
	 */
	void exitPermissions(JsonCommandSyntaxParser.PermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JsonCommandSyntaxParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JsonCommandSyntaxParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(JsonCommandSyntaxParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(JsonCommandSyntaxParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#argument_expressions}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expressions(JsonCommandSyntaxParser.Argument_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#argument_expressions}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expressions(JsonCommandSyntaxParser.Argument_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JsonCommandSyntaxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JsonCommandSyntaxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(JsonCommandSyntaxParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(JsonCommandSyntaxParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#matches}.
	 * @param ctx the parse tree
	 */
	void enterMatches(JsonCommandSyntaxParser.MatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#matches}.
	 * @param ctx the parse tree
	 */
	void exitMatches(JsonCommandSyntaxParser.MatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(JsonCommandSyntaxParser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(JsonCommandSyntaxParser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#keep_value}.
	 * @param ctx the parse tree
	 */
	void enterKeep_value(JsonCommandSyntaxParser.Keep_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#keep_value}.
	 * @param ctx the parse tree
	 */
	void exitKeep_value(JsonCommandSyntaxParser.Keep_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(JsonCommandSyntaxParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(JsonCommandSyntaxParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#array_string}.
	 * @param ctx the parse tree
	 */
	void enterArray_string(JsonCommandSyntaxParser.Array_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#array_string}.
	 * @param ctx the parse tree
	 */
	void exitArray_string(JsonCommandSyntaxParser.Array_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#int_lex}.
	 * @param ctx the parse tree
	 */
	void enterInt_lex(JsonCommandSyntaxParser.Int_lexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#int_lex}.
	 * @param ctx the parse tree
	 */
	void exitInt_lex(JsonCommandSyntaxParser.Int_lexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#float_lex}.
	 * @param ctx the parse tree
	 */
	void enterFloat_lex(JsonCommandSyntaxParser.Float_lexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#float_lex}.
	 * @param ctx the parse tree
	 */
	void exitFloat_lex(JsonCommandSyntaxParser.Float_lexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#boolean_lex}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_lex(JsonCommandSyntaxParser.Boolean_lexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#boolean_lex}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_lex(JsonCommandSyntaxParser.Boolean_lexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#string_lex}.
	 * @param ctx the parse tree
	 */
	void enterString_lex(JsonCommandSyntaxParser.String_lexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#string_lex}.
	 * @param ctx the parse tree
	 */
	void exitString_lex(JsonCommandSyntaxParser.String_lexContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonCommandSyntaxParser#type_lex}.
	 * @param ctx the parse tree
	 */
	void enterType_lex(JsonCommandSyntaxParser.Type_lexContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonCommandSyntaxParser#type_lex}.
	 * @param ctx the parse tree
	 */
	void exitType_lex(JsonCommandSyntaxParser.Type_lexContext ctx);
}