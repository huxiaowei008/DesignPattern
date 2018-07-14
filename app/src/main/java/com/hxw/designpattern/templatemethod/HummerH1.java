package com.hxw.designpattern.templatemethod;

/**
 * 悍马H1型
 *
 * @author hxw on 2018/7/14.
 */
public class HummerH1 extends AbstractHummerModel {
    @Override
    protected void start() {
        System.out.print("悍马H1发动\n");
    }

    @Override
    protected void stop() {
        System.out.print("悍马H1停车\n");
    }

    @Override
    protected void alarm() {
        System.out.print("悍马H1鸣笛\n");
    }

    @Override
    protected void engineBoom() {
        System.out.print("悍马H1引擎发声\n");
    }
}
