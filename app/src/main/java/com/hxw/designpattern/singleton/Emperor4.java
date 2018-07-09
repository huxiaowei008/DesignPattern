package com.hxw.designpattern.singleton;

/**
 * 静态内部类实现
 * 优点：
 * 不仅能保证线程安全，也能保证单例的唯一性，也延迟了单例的实例化，比较推荐
 *
 * @author hxw on 2018/7/9.
 */
public class Emperor4 {

    private Emperor4() {

    }

    /**
     * 获取实例
     *
     * @return 单例对象Emperor4
     */
    public static Emperor4 getInstance() {
        return SingletonHolder.INSTANCE;
    }


    private static class SingletonHolder {
        private static final Emperor4 INSTANCE = new Emperor4();
    }
}
