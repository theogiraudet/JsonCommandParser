package fr.theogiraudet.json_command_parser.core;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonCommandSyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonCommandSyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JsonCommandSyntaxParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptor(JsonCommandSyntaxParser.DescriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#descriptor_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptor_expressions(JsonCommandSyntaxParser.Descriptor_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(JsonCommandSyntaxParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#aliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliases(JsonCommandSyntaxParser.AliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissions(JsonCommandSyntaxParser.PermissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JsonCommandSyntaxParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(JsonCommandSyntaxParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#argument_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expressions(JsonCommandSyntaxParser.Argument_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JsonCommandSyntaxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(JsonCommandSyntaxParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#matches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatches(JsonCommandSyntaxParser.MatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(JsonCommandSyntaxParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#keep_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_value(JsonCommandSyntaxParser.Keep_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(JsonCommandSyntaxParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#array_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_string(JsonCommandSyntaxParser.Array_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#int_lex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_lex(JsonCommandSyntaxParser.Int_lexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#float_lex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_lex(JsonCommandSyntaxParser.Float_lexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#boolean_lex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_lex(JsonCommandSyntaxParser.Boolean_lexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#string_lex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lex(JsonCommandSyntaxParser.String_lexContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonCommandSyntaxParser#type_lex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_lex(JsonCommandSyntaxParser.Type_lexContext ctx);
}