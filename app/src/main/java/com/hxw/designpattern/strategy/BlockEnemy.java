package com.hxw.designpattern.strategy;

/**
 * 孙夫人断后
 *
 * @author hxw
 * @date 2019/3/12
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵");
    }
}
