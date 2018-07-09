package com.hxw.designpattern.factory.abstractfactory;

/**
 * 创业街的门面(具体产品)
 *
 * @author hxw on 2018/7/9.
 */
public class SbiStore implements Store {
    @Override
    public String getAddress() {
        return "关山创业街";
    }

    @Override
    public String getName() {
        return "SBI店";
    }
}
