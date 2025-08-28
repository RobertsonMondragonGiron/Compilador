// Generated from RemiLang.g4 by ANTLR 4.13.1

package com.remilang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RemiLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RemiLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RemiLangParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(RemiLangParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(RemiLangParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(RemiLangParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(RemiLangParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#bucle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle(RemiLangParser.BucleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RemiLangParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(RemiLangParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enteroExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnteroExpr(RemiLangParser.EnteroExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aritExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritExpr(RemiLangParser.AritExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadenaExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadenaExpr(RemiLangParser.CadenaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(RemiLangParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(RemiLangParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link RemiLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(RemiLangParser.IdExprContext ctx);
}