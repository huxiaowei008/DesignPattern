package com.hxw.designpattern.state;

/**
 * 敞门状态：
 * 这个状态下只能做关门动作
 *
 * @author hxw
 * @date 2019/4/30
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
