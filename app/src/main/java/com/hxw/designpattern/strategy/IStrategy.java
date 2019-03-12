package com.hxw.designpattern.strategy;

/**
 * 策略总称
 *
 * @author hxw
 * @date 2019/3/12
 */
public interface IStrategy {

    /**
     * 每个锦囊妙计都是一个可执行的算法
     */
    void operate();
}
