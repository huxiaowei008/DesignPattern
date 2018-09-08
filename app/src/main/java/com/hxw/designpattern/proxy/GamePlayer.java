package com.hxw.designpattern.proxy;

/**
 * 游戏者
 *
 * @author hxw on 2018/9/8.
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    /**
     * 我的代理是谁
     */
    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (isProxy()) {
            System.out.print("登录名为" + user + "的用户" + this.name + "登录成功!\n");
        } else {
            System.out.print("请使用指定的代理访问\n");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.out.print(this.name + "在杀Boss!\n");
        } else {
            System.out.print("请使用指定的代理访问\n");
        }

    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.print(this.name + "升级了!\n");
        } else {
            System.out.print("请使用指定的代理访问\n");
        }
    }

    /**
     * 找到自己的代理
     *
     * @return 代理
     */
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 校验是否是代理访问
     *
     * @return false->否 true->是
     */
    private boolean isProxy() {
        return this.proxy != null;
    }
}
