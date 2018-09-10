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
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        //如果是登录方法,则发送信息
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.print("有人在用我的账号登录!\n");
        }
        return result;
    }
}
