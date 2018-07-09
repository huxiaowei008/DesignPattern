package com.hxw.designpattern.singleton;

/**
 * 懒汉式
 * 优点：用到的时候才会去实例化，在一定程度上节约了资源。
 * 缺点：getInstance方法是用synchronized修饰的，该方法是同步的，为了保证线程安全，但是导致每次调用该方法的时候都会被同步，
 * 这样会消耗不必要的资源（不必要的同步开销）。所以这种模式一般不建议使用。
 *
 * @author hxw on 2018/7/9.
 */
public class Emperor2 {
    private static Emperor2 instance = null;

    private Emperor2() {

    }

    /**
     * 获取实例
     *
     * @return 单例对象Emperor2
     */
    public static synchronized Emperor2 getInstance() {
        if (instance == null) {
            instance = new Emperor2();
        }
        return instance;
    }


}
