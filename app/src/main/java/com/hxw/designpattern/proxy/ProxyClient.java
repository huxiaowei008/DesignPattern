package com.hxw.designpattern.proxy;

import com.hxw.designpattern.proxy.dynamic.DynamicGamePlayer;
import com.hxw.designpattern.proxy.dynamic.GamePlayIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式:
 * 为其他对象提供一种代理以控制对这个对象的访问。
 * <p>
 * 不同的场景有不同的代理变种,主要是能灵活运用,最基础的可以看书
 * 在最基础的形式上，可以隐藏真实角色(普通代理),也可以隐藏代理角色(强制代理)(现在写的代码)
 * 同时,可以赋予代理自己的特性(如写一个代理的接口,或实现其他的接口)
 * 动态代理:
 * 是在实现阶段不用关心代理谁,而在运行阶段才指定代理哪一个对象。
 *
 * @author hxw on 2018/9/8.
 */
public class ProxyClient {
    public static void main(String args[]) {
        //定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三丰");
        //定义一个代练者
        IGamePlayer proxy = player.getProxy();
        //开始打游戏,记录时间戳
        System.out.println("开始时间是:2018-09-08 16:00");
        proxy.login("zhangSanFeng", "password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是:2018-09-08 20:00");

        //动态代理
        //定义一个痴迷的玩家
        IGamePlayer player1 = new DynamicGamePlayer("萧峰");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player1);
        //开始打游戏,记录时间戳
        System.out.println("开始时间是:2018-09-10 10:00");
        //获得类的class loader
        ClassLoader cl = player1.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy1 = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy1.login("xiaoFeng", "password");
        //开始杀怪
        proxy1.killBoss();
        //升级
        proxy1.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是:2018-09-10 20:00");

    }
}
