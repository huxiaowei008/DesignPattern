package com.hxw.designpattern.strategy;

/**
 * 乔国老开后门
 *
 * @author hxw
 * @date 2019/3/12
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙,让吴国太给孙权施压");
    }
}
