package com.hxw.designpattern.factory.abstractfactory;

/**
 * 门面(产品抽象)
 *
 * @author hxw on 2018/7/9.
 */
public interface Store {
    /**
     * @return 地址
     */
    String getAddress();


    /**
     * @return 店铺名
     */
    String getName();
}
