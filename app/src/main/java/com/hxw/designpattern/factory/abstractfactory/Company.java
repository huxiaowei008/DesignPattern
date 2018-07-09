package com.hxw.designpattern.factory.abstractfactory;

/**
 * @author hxw on 2018/7/9.
 */
public class Company {
    private Store store;
    private Checkstand checkstand;

    public Company(Store store, Checkstand checkstand) {
        this.store = store;
        this.checkstand = checkstand;
    }

    @Override
    public String toString() {
        return "分店{" +
                "地址:" + store.getAddress() +
                ", 名字:" + store.getName() +
                ", 收银账户:" + checkstand.getAccount() +
                '}';
    }
}
