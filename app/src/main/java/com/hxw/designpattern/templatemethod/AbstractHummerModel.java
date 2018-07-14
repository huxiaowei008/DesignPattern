package com.hxw.designpattern.templatemethod;

/**
 * 悍马模型(算法骨架)
 * 抽象的是基本方法,由子类实现,并且在模板方法被调用
 *
 * @author hxw on 2018/7/14.
 */
public abstract class AbstractHummerModel {

    /**
     * 启动汽车
     * 模型要能被发动起来,不管是手摇还是电动
     */
    protected abstract void start();

    /**
     * 停止汽车
     * 能发动还要能停止
     */
    protected abstract void stop();

    /**
     * 喇叭鸣叫
     * 喇叭能发声,是滴滴叫,还是哔哔叫
     */
    protected abstract void alarm();

    /**
     * 引擎轰鸣声
     * 引擎不会响那是假的
     */
    protected abstract void engineBoom();

    /**
     * 汽车跑动
     * 模板方法,为了防止恶意操作,一般会加上final关键字,不允许被覆写
     */
    public final void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //遇到行人挡路就按喇叭
        this.alarm();
        //到达目的地停车
        this.stop();
    }
}
