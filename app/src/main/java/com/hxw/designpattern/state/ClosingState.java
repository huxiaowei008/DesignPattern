package com.hxw.designpattern.state;

/**
 * 关闭状态：
 * 这个状态下可以做开门、停止、运行
 *
 * @author hxw
 * @date 2019/4/30
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
