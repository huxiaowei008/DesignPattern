package com.hxw.designpattern.singleton;

/**
 * 单例模式
 * 优点:
 * <p>
 * 由于单例模式在内存中只有一个实例，减少了内存开支，特别是一个对象需要频繁创建，或者创建或销毁时性能无法优化，单例模式的优势就很明显了。
 * 由于只生成一个实例，减少了系统性能开销。
 * 可以避免对资源的多重占用，如文件操作等。
 * 单例模式可以设置为全局的访问点，优化和共享资源访问。
 * 缺点:
 * <p>
 * 单例模式一般没有接口，拓展很困难，基本都要修改源代码。
 * 在Android中，如果单例模式持有Activity的Context，容易产生内存泄漏。所以尽量用ApplicationContext。
 *
 * @author hxw on 2018/7/9.
 */
public class Signleton {
}
