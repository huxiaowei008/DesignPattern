package com.hxw.designpattern.decorator;

/**
 * 修饰的抽象类
 *
 * @author hxw on 2018/9/21.
 */
public abstract class Decorator extends SchoolReport {
    /**
     * 首先要知道是哪个成绩单
     */
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        sr.report();
    }

    @Override
    public void sign(String name) {
        sr.sign(name);
    }
}
