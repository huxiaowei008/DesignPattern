package com.hxw.designpattern.templatemethod;

/**
 * 悍马H2型
 *
 * @author hxw on 2018/7/14.
 */
public class HummerH2 extends AbstractHummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎发声");
    }
}
