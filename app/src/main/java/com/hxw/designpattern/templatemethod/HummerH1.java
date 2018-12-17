package com.hxw.designpattern.templatemethod;

/**
 * 悍马H1型
 *
 * @author hxw on 2018/7/14.
 */
public class HummerH1 extends AbstractHummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H1发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎发声");
    }
}
