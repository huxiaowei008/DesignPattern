package com.hxw.designpattern.factory.normalfactory;

/**
 * 黄人创建工厂(具体工厂类)
 *
 * @author hxw on 2018/7/9.
 */
public class YellowFactory extends HumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
