package com.hxw.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hxw
 * @date 2019/3/15
 */
public class LiSi implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯:观察到活动了,要汇报");
        System.out.println("李斯:韩非子有活动了->" + arg.toString());
    }
}
