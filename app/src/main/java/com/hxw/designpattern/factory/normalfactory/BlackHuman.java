package com.hxw.designpattern.factory.normalfactory;

/**
 * 黑人(具体产品)
 *
 * @author hxw on 2018/7/9.
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.print("黑色人种\n");
    }
}
