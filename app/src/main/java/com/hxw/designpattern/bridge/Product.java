package com.hxw.designpattern.bridge;

/**
 * 抽象产品类
 *
 * @author hxw
 * @date 2019/5/6
 */
public abstract class Product {
    /**
     * 被生产
     */
    public abstract void beProducted();

    /**
     * 被销售
     */
    public abstract void beSelled();
}
