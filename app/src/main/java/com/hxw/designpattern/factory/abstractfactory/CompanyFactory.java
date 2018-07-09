package com.hxw.designpattern.factory.abstractfactory;

/**
 * 店面的创建工厂抽象(抽象工厂类)
 * @author hxw on 2018/7/9.
 */
public interface CompanyFactory {
    Store createStore();

    Checkstand createCheckstand();
}
