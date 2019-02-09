// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/main/java/com/ladroid/julesvernepl/JulesVerne.g4 by ANTLR 4.7.2
package com.ladroid.julesvernepl;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JulesVerneParser}.
 */
public interface JulesVerneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JulesVerneParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JulesVerneParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JulesVerneParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JulesVerneParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#declare_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var(JulesVerneParser.Declare_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#declare_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var(JulesVerneParser.Declare_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#array_init}.
	 * @param ctx the parse tree
	 */
	void enterArray_init(JulesVerneParser.Array_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#array_init}.
	 * @param ctx the parse tree
	 */
	void exitArray_init(JulesVerneParser.Array_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(JulesVerneParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(JulesVerneParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(JulesVerneParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(JulesVerneParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#comparisonRef}.
	 * @param ctx the parse tree
	 */
	void enterComparisonRef(JulesVerneParser.ComparisonRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#comparisonRef}.
	 * @param ctx the parse tree
	 */
	void exitComparisonRef(JulesVerneParser.ComparisonRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(JulesVerneParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(JulesVerneParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(JulesVerneParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(JulesVerneParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#forLoopReverse}.
	 * @param ctx the parse tree
	 */
	void enterForLoopReverse(JulesVerneParser.ForLoopReverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#forLoopReverse}.
	 * @param ctx the parse tree
	 */
	void exitForLoopReverse(JulesVerneParser.ForLoopReverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#forArray}.
	 * @param ctx the parse tree
	 */
	void enterForArray(JulesVerneParser.ForArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#forArray}.
	 * @param ctx the parse tree
	 */
	void exitForArray(JulesVerneParser.ForArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(JulesVerneParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(JulesVerneParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(JulesVerneParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(JulesVerneParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#varInt}.
	 * @param ctx the parse tree
	 */
	void enterVarInt(JulesVerneParser.VarIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#varInt}.
	 * @param ctx the parse tree
	 */
	void exitVarInt(JulesVerneParser.VarIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#varFloat}.
	 * @param ctx the parse tree
	 */
	void enterVarFloat(JulesVerneParser.VarFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#varFloat}.
	 * @param ctx the parse tree
	 */
	void exitVarFloat(JulesVerneParser.VarFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#varString}.
	 * @param ctx the parse tree
	 */
	void enterVarString(JulesVerneParser.VarStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#varString}.
	 * @param ctx the parse tree
	 */
	void exitVarString(JulesVerneParser.VarStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JulesVerneParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JulesVerneParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JulesVerneParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JulesVerneParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(JulesVerneParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(JulesVerneParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(JulesVerneParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(JulesVerneParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(JulesVerneParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(JulesVerneParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#divide}.
	 * @param ctx the parse tree
	 */
	void enterDivide(JulesVerneParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#divide}.
	 * @param ctx the parse tree
	 */
	void exitDivide(JulesVerneParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(JulesVerneParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(JulesVerneParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(JulesVerneParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(JulesVerneParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#incrementPostfix}.
	 * @param ctx the parse tree
	 */
	void enterIncrementPostfix(JulesVerneParser.IncrementPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#incrementPostfix}.
	 * @param ctx the parse tree
	 */
	void exitIncrementPostfix(JulesVerneParser.IncrementPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(JulesVerneParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(JulesVerneParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#decrementPostfix}.
	 * @param ctx the parse tree
	 */
	void enterDecrementPostfix(JulesVerneParser.DecrementPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#decrementPostfix}.
	 * @param ctx the parse tree
	 */
	void exitDecrementPostfix(JulesVerneParser.DecrementPostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#shl}.
	 * @param ctx the parse tree
	 */
	void enterShl(JulesVerneParser.ShlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#shl}.
	 * @param ctx the parse tree
	 */
	void exitShl(JulesVerneParser.ShlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#shr}.
	 * @param ctx the parse tree
	 */
	void enterShr(JulesVerneParser.ShrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#shr}.
	 * @param ctx the parse tree
	 */
	void exitShr(JulesVerneParser.ShrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#xorV}.
	 * @param ctx the parse tree
	 */
	void enterXorV(JulesVerneParser.XorVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#xorV}.
	 * @param ctx the parse tree
	 */
	void exitXorV(JulesVerneParser.XorVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#orV}.
	 * @param ctx the parse tree
	 */
	void enterOrV(JulesVerneParser.OrVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#orV}.
	 * @param ctx the parse tree
	 */
	void exitOrV(JulesVerneParser.OrVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#andV}.
	 * @param ctx the parse tree
	 */
	void enterAndV(JulesVerneParser.AndVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#andV}.
	 * @param ctx the parse tree
	 */
	void exitAndV(JulesVerneParser.AndVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#notV}.
	 * @param ctx the parse tree
	 */
	void enterNotV(JulesVerneParser.NotVContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#notV}.
	 * @param ctx the parse tree
	 */
	void exitNotV(JulesVerneParser.NotVContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JulesVerneParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JulesVerneParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(JulesVerneParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(JulesVerneParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(JulesVerneParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(JulesVerneParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterTyp(JulesVerneParser.TypContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitTyp(JulesVerneParser.TypContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#smth}.
	 * @param ctx the parse tree
	 */
	void enterSmth(JulesVerneParser.SmthContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#smth}.
	 * @param ctx the parse tree
	 */
	void exitSmth(JulesVerneParser.SmthContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JulesVerneParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JulesVerneParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(JulesVerneParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(JulesVerneParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(JulesVerneParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(JulesVerneParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(JulesVerneParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(JulesVerneParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JulesVerneParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JulesVerneParser.BlockContext ctx);
}