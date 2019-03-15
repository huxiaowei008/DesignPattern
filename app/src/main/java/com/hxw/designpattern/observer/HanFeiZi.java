package com.hxw.designpattern.observer;

import java.util.Observable;

/**
 * @author hxw
 * @date 2019/3/15
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃早饭了...");
        notifyObservers("韩非子吃早饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        notifyObservers("韩非子娱乐");
    }
}
