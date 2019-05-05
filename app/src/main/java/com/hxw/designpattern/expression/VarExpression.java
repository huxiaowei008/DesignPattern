package com.hxw.designpattern.expression;

import java.util.HashMap;

/**
 * 变量解析器
 *
 * @author hxw
 * @date 2019/5/5
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
