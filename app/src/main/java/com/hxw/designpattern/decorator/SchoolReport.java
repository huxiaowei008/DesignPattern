package com.hxw.designpattern.decorator;

/**
 * 抽象成绩单
 *
 * @author hxw on 2018/9/21.
 */
public abstract class SchoolReport {

    /**
     * 成绩单主要展示的就是你的成绩情况
     */
    public abstract void report();

    /**
     * 成绩单要家长签字
     * @param name 家长名称
     */
    public abstract void sign(String name);
}
