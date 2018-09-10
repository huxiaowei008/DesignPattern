package com.hxw.designpattern.proxy.dynamic;

import com.hxw.designpattern.proxy.IGamePlayer;

/**
 * 动态模式下的游戏者
 *
 * @author hxw on 2018/9/8.
 */
public class DynamicGamePlayer implements IGamePlayer {
    private String name;

    public DynamicGamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.print("登录名为" + user + "的用户" + this.name + "登录成功!\n");
    }

    @Override
    public void killBoss() {
        System.out.print(this.name + "在杀Boss!\n");

    }

    @Override
    public void upgrade() {
        System.out.print(this.name + "升级了!\n");
    }

    @Override
    public IGamePlayer getProxy() {
        return null;
    }


}
