package com.hxw.designpattern.command;

/**
 * 抽象命令类
 *
 * @author hxw on 2018/9/19.
 */
public abstract class Command {
    //把三组都定义好,子类直接使用
    /**
     * 需求组
     */
    protected RequirementGroup rg = new RequirementGroup();
    /**
     * 美工组
     */
    protected PageGroup pg = new PageGroup();
    /**
     * 代码组
     */
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法,你要我做什么事情
     */
    public abstract void execute();
}
