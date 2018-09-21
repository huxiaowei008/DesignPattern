package com.hxw.designpattern.decorator;

/**
 * 排名情况修饰
 *
 * @author hxw on 2018/9/21.
 */
public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    /**
     * 告诉老爸学校排名情况
     */
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        //老爸看完成绩单后再告诉他,加强作用
        super.report();
        reportSort();
    }
}
