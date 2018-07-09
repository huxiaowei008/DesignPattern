package com.hxw.designpattern.singleton;

/**
 * 枚举单例
 * 优点：
 * 写法简单，而且默认线程安全，任何情况下都是一个单例，
 * 即使是在反序列化的过程，枚举单例也不会重新生成新的实例
 * 而其他几种方式，必须加入如下方法,否则失效:
 * <pre>
 * private Object readResolve()  throws ObjectStreamException{
 * return INSTANCE;
 * }
 * </pre>
 *
 * @author hxw on 2018/7/9.
 */
public enum Emperor5 {
    /**
     * 单例对象
     */
    INSTANCE
}
