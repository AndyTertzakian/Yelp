// Generated from Query.g4 by ANTLR 4.5

package ca.ece.ubc.cpen221.mp5;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(QueryParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(QueryParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(QueryParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(QueryParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(QueryParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(QueryParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(QueryParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(QueryParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#category}.
	 * @param ctx the parse tree
	 */
	void enterCategory(QueryParser.CategoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#category}.
	 * @param ctx the parse tree
	 */
	void exitCategory(QueryParser.CategoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(QueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(QueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void enterRating(QueryParser.RatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#rating}.
	 * @param ctx the parse tree
	 */
	void exitRating(QueryParser.RatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#price}.
	 * @param ctx the parse tree
	 */
	void enterPrice(QueryParser.PriceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#price}.
	 * @param ctx the parse tree
	 */
	void exitPrice(QueryParser.PriceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(QueryParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(QueryParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#leftNum}.
	 * @param ctx the parse tree
	 */
	void enterLeftNum(QueryParser.LeftNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#leftNum}.
	 * @param ctx the parse tree
	 */
	void exitLeftNum(QueryParser.LeftNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#rightNum}.
	 * @param ctx the parse tree
	 */
	void enterRightNum(QueryParser.RightNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#rightNum}.
	 * @param ctx the parse tree
	 */
	void exitRightNum(QueryParser.RightNumContext ctx);
}