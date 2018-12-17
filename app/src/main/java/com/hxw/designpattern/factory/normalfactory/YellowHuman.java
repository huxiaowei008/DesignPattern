package com.hxw.designpattern.factory.normalfactory;

/**
 * 黄人(具体产品)
 *
 * @author hxw on 2018/7/9.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }
}
