package com.hxw.designpattern.factory.abstractfactory;

/**
 * 创业接的店铺具体创建工厂(具体工厂类)
 *
 * @author hxw on 2018/7/9.
 */
public class SbiCompanyFactory implements CompanyFactory {
    @Override
    public Store createStore() {
        return new SbiStore();
    }

    @Override
    public Checkstand createCheckstand() {
        return new SbiCheckStand();
    }
}
