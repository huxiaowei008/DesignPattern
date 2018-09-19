package com.hxw.designpattern.command;

/**
 * 负责人
 *
 * @author hxw on 2018/9/19.
 */
public class Invoker {
    /**
     * 什么命令
     */
    private Command command;

    /**
     * 客户发出命令
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action() {
        this.command.execute();
    }
}
