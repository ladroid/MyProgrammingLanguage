// Generated from /Users/lado/Documents/MyProgrammingLanguage/JulesVernePL/src/JulesVerne.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link JulesVerneParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JulesVerneParser.AssignContext ctx);
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
	 * Visit a parse tree produced by {@link JulesVerneParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JulesVerneParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JulesVerneParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JulesVerneParser.FunctionContext ctx);
}