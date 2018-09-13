package com.hxw.designpattern.mediator;

/**
 * 抽象中介者
 *
 * @author hxw on 2018/9/12.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    /**
     * 中介者最重要的方法叫做事件方法,处理多个对象之间的关系
     *
     * @param str     标记
     * @param objects 参数
     */
    public abstract void execute(String str, Object... objects);
}
