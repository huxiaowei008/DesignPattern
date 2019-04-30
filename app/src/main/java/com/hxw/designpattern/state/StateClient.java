package com.hxw.designpattern.state;

/**
 * 状态模式:
 * 当一个对象内在状态改变时允许其改变行为,
 * 这个对象看起来像改变了其类
 *
 * @author hxw
 * @date 2019/4/30
 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
