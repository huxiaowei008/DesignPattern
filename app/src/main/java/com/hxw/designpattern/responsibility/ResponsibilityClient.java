package com.hxw.designpattern.responsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * 责任链模式:
 * 使多个对象都有机会处理请求,从而避免了请求的发送者和接受者之间的耦合关系。
 * 将这些对象连成一条链,并沿着这条链传递该请求,直到有对象处理它为止。
 *
 * @author hxw on 2018/9/20.
 */
public class ResponsibilityClient {
    public static void main(String[] args) {

        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        //定义三个请示对象
        AbstractHandler father = new Father();
        AbstractHandler husband = new Husband();
        AbstractHandler son = new Son();
        //设置请求顺序
        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women : arrayList) {
            father.handleMessage(women);
        }
    }

}
