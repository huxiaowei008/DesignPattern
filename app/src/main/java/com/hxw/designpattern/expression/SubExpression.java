package com.hxw.designpattern.expression;

import java.util.HashMap;

/**
 * 减法解析器
 *
 * @author hxw
 * @date 2019/5/5
 */
public class SubExpression extends SymbolExpression {
    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left  左结果
     * @param right 右结果
     */
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
