package com.hxw.designpattern.expression;

/**
 * 抽象运算符号解析器
 *
 * @author hxw
 * @date 2019/5/5
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     * @param left 左结果
     * @param right 右结果
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
