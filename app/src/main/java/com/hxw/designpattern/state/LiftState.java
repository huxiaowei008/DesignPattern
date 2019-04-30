package com.hxw.designpattern.state;

/**
 * 抽象电梯状态
 *
 * @author hxw
 * @date 2019/4/30
 */
public abstract class LiftState {
    /**
     * 定义一个环境角色,也就是封装状态的变化引起的功能变化
     */
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 开门
     */
    public abstract void open();

    /**
     * 关门
     */
    public abstract void close();

    /**
     * 电梯上下运动
     */
    public abstract void run();

    /**
     * 电梯停下来
     */
    public abstract void stop();

}
