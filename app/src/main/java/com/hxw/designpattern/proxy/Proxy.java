package com.hxw.designpattern.proxy;

/**
 * 代理模式:
 * 为其他对象提供一种代理以控制对这个对象的访问。
 *
 * @author hxw on 2018/9/8.
 */
public class Proxy {
    public static void main(String args[]) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三丰");
        //定义一个代练者
        IGamePlayer proxy = player.getProxy();
        //开始打游戏,记录时间戳
        System.out.print("开始时间是:2018-09-08 16:00\n");
        proxy.login("zhangSanFeng", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.print("结束时间是:2018-09-08 20:00");
    }
}
