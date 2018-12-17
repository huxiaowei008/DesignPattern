package com.hxw.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author hxw on 2018/9/10.
 */
public class GamePlayIH implements InvocationHandler {
    /**
     * 被代理实例
     */
    private Object obj;

    public GamePlayIH(Object o) {
        this.obj = o;
    }

    /**
     * 调用被代理的方法
     * 它完成对真实方法的调用
     *
     * @param proxy  指被代理的对象
     * @param method 要调用的方法
     * @param args   方法调用时所需要的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //如果是登录方法,则发送信息
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录!");
        }
        return result;
    }
}
