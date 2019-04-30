package com.hxw.designpattern.state;

/**
 * 运行状态:
 * 这只能做停止动作
 *
 * @author hxw
 * @date 2019/4/30
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
