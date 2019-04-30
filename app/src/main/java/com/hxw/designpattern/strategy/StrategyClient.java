package com.hxw.designpattern.strategy;

/**
 * 策略模式:
 * 定义一组算法,将每个算法都封装起来,并且使它们之间可以互换
 * @author hxw
 * @date 2019/3/12
 */
public class StrategyClient {

    public static void main(String[] args){
        Kits kits;
        System.out.println("---刚到吴国拆第一个锦囊---");
        kits=new Kits(new BackDoor());
        kits.operate();
        System.out.println("---刘备乐不思蜀了,拆第二个---");
        kits=new Kits(new GivenGreenLight());
        kits.operate();
        System.out.println("---孙权追兵来啦,拆第三个---");
        kits=new Kits(new BlockEnemy());
        kits.operate();

    }
}
