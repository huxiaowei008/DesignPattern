package com.hxw.designpattern.bridge;

/**
 * 房子
 *
 * @author hxw
 * @date 2019/5/6
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子....");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了....");
    }
}
