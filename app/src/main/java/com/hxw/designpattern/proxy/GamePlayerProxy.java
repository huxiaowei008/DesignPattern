package com.hxw.designpattern.proxy;

/**
 * 代练者
 *
 * @author hxw on 2018/9/8.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;


    /**
     * 通过构造函数传递要对谁进行代练
     *
     * @param gamePlayer 名称
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练登录
     *
     * @param user     用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
     * 代练杀怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    /**
     * 代理的代理暂时还没有,就是自己
     *
     * @return 自己
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
