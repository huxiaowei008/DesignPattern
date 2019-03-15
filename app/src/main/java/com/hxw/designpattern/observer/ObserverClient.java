package com.hxw.designpattern.observer;

import java.util.Observer;

/**
 * 观察者模式:
 * 定义对象间一种一对多的依赖关系,使得每当一个对象改变状态,
 * 则所有依赖于它的对象都会得到通知并被自动更新
 *
 * @author hxw
 * @date 2019/3/15
 */
public class ObserverClient {
    public static void main(String args[]) {
        Observer liSi = new LiSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        //添加观察者
        hanFeiZi.addObserver(liSi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
