package com.hxw.designpattern.expression;

import java.util.HashMap;

/**
 * 抽象表达式
 *
 * @author hxw
 * @date 2019/5/5
 */
public abstract class Expression {

    /**
     * 解析公式和数值
     *
     * @param var key时公式的参数,value值是具体的数字
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
