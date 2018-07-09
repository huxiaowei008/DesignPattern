package com.hxw.designpattern.factory.normalfactory;

/**
 * 白人(具体产品)
 *
 * @author hxw on 2018/7/9.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.print("白色人种\n");
    }
}
