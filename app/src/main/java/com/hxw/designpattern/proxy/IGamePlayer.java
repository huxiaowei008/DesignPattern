package com.hxw.designpattern.proxy;

/**
 * 游戏者接口
 *
 * @author hxw on 2018/9/8.
 */
public interface IGamePlayer {
    /**
     * 登录游戏
     *
     * @param user     用户名
     * @param password 密码
     */
    void login(String user, String password);

    /**
     * 杀Boss怪物
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();

    /**
     * 每个人都可以找一下自己的代理(强制代理)
     * @return 自己的代理
     */
    IGamePlayer getProxy();
}
