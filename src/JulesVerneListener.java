// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link JulesVerneParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JulesVerneParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JulesVerneParser.AssignContext ctx);
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
	 * Enter a parse tree produced by {@link JulesVerneParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(JulesVerneParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(JulesVerneParser.StringContext ctx);
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
	 * Enter a parse tree produced by {@link JulesVerneParser#exprtr}.
	 * @param ctx the parse tree
	 */
	void enterExprtr(JulesVerneParser.ExprtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#exprtr}.
	 * @param ctx the parse tree
	 */
	void exitExprtr(JulesVerneParser.ExprtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JulesVerneParser#exprsmth}.
	 * @param ctx the parse tree
	 */
	void enterExprsmth(JulesVerneParser.ExprsmthContext ctx);
	/**
	 * Exit a parse tree produced by {@link JulesVerneParser#exprsmth}.
	 * @param ctx the parse tree
	 */
	void exitExprsmth(JulesVerneParser.ExprsmthContext ctx);
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