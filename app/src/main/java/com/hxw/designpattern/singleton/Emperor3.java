package com.hxw.designpattern.singleton;

/**
 * Double Check Lock（DCL）双重检查锁
 * 优点：第一次执行getInstance方法时才会实例化，资源利用率高，效率高。
 * 缺点：偶尔失效（高并发条件下，由于JDK版本问题，在jdk1.5之前会失败）小概率
 * 推荐使用
 *
 * @author hxw on 2018/7/9.
 */
public class Emperor3 {
    /**
     * 解决了DCL失效的问题,加入volatile关键字
     */
    private volatile static Emperor3 instance;

    private Emperor3() {

    }

    /**
     * 获取实例
     *
     * @return 单例对象Emperor3
     */
    public static Emperor3 getInstance() {
        if (instance == null) {
            synchronized (Emperor3.class) {
                if (instance == null) {
                    instance = new Emperor3();
                }
            }
        }
        return instance;
    }
}
