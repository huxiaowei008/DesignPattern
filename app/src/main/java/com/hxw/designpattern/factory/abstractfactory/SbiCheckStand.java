package com.hxw.designpattern.factory.abstractfactory;

/**
 * 创业街的收银(具体产品)
 *
 * @author hxw on 2018/7/9.
 */
public class SbiCheckStand implements Checkstand {
    @Override
    public String getAccount() {
        return "招商银行:620123131231233";
    }
}
