// Generated from C:/Users/gener/OneDrive/Desktop/remilang-compiler/src/main/antlr4/RemiLang.g4 by ANTLR 4.13.2

package com.remilang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RemiLangParser}.
 */
public interface RemiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(RemiLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(RemiLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#bucle}.
	 * @param ctx the parse tree
	 */
	void enterBucle(RemiLangParser.BucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#bucle}.
	 * @param ctx the parse tree
	 */
	void exitBucle(RemiLangParser.BucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RemiLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RemiLangParser.ExprContext ctx);
}