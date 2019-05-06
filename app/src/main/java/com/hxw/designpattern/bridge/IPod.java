package com.hxw.designpattern.bridge;

/**
 * iPod产品
 *
 * @author hxw
 * @date 2019/5/6
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
