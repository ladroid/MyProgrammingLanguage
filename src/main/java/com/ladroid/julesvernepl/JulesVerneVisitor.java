/*
 * Deveoped by Volodymyr Kadzhaia on 2018
 * Copyright (c) 2018.
 */

package com.ladroid.julesvernepl;// Generated from /Users/lado/Documents/MyProgrammingLanguage/com.ladroid.julesvernepl.JulesVernePL/src/main/java/JulesVerne.g4 by ANTLR 4.7
import com.ladroid.julesvernepl.JulesVerneParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JulesVerneParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JulesVerneVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JulesVerneParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JulesVerneParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#declare_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var(JulesVerneParser.Declare_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#array_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_init(JulesVerneParser.Array_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(JulesVerneParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#varInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInt(JulesVerneParser.VarIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#varFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFloat(JulesVerneParser.VarFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(JulesVerneParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(JulesVerneParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(JulesVerneParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(JulesVerneParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#divide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(JulesVerneParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(JulesVerneParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(JulesVerneParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#incrementPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementPostfix(JulesVerneParser.IncrementPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(JulesVerneParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#decrementPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementPostfix(JulesVerneParser.DecrementPostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#shl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShl(JulesVerneParser.ShlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#shr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShr(JulesVerneParser.ShrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#xorV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorV(JulesVerneParser.XorVContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#orV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrV(JulesVerneParser.OrVContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#andV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndV(JulesVerneParser.AndVContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#notV}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotV(JulesVerneParser.NotVContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JulesVerneParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(JulesVerneParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(JulesVerneParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp(JulesVerneParser.TypContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#smth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmth(JulesVerneParser.SmthContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(JulesVerneParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#exprtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	//T visitExprtr(JulesVerneParser.ExprtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#//exprsmth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	//T visitExprsmth(JulesVerneParser.ExprsmthContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(JulesVerneParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(JulesVerneParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(JulesVerneParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JulesVerneParser.BlockContext ctx);
}