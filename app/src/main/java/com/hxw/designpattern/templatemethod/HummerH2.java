package com.hxw.designpattern.templatemethod;

/**
 * 悍马H2型
 *
 * @author hxw on 2018/7/14.
 */
public class HummerH2 extends AbstractHummerModel {
    @Override
    protected void start() {
        System.out.print("悍马H2发动\n");
    }

    @Override
    protected void stop() {
        System.out.print("悍马H2停车\n");
    }

    @Override
    protected void alarm() {
        System.out.print("悍马H2鸣笛\n");
    }

    @Override
    protected void engineBoom() {
        System.out.print("悍马H2引擎发声\n");
    }
}
