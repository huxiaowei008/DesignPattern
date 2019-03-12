package com.hxw.designpattern.strategy;

/**
 * 吴国太开绿灯
 *
 * @author hxw
 * @date 2019/3/12
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行!");
    }
}
