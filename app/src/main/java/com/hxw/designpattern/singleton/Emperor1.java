package com.hxw.designpattern.singleton;

/**
 * 饿汉式
 * 优点：简单，速度快，线程安全。
 * 缺点：实例对象是static的，在声明的时候就实例化了，浪费资源。
 *
 * @author hxw on 2018/7/9.
 */
public class Emperor1 {

    private static Emperor1 instance = new Emperor1();

    private Emperor1() {

    }

    /**
     * 获取实例
     *
     * @return 单例对象Emperor1
     */
    public static Emperor1 getInstance() {
        return instance;
    }
}
