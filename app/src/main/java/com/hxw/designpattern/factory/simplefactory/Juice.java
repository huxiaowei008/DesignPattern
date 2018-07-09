package com.hxw.designpattern.factory.simplefactory;

/**
 * 具体产品
 *
 * @author hxw on 2018/7/9.
 */
public class Juice extends Drink {
    @Override
    public String printlnName() {
        return "果汁";
    }
}
