package com.hxw.designpattern.bridge;

/**
 * 抽象公司
 *
 * @author hxw
 * @date 2019/5/6
 */
public abstract class Corp {

    /**
     * 产品
     */
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    /**
     * 赚钱
     */
    public void makeMoney() {
        //先生产,再销售
        this.product.beProducted();
        this.product.beSelled();
    }
}
