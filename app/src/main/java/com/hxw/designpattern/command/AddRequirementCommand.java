package com.hxw.designpattern.command;

/**
 * 增加需求的命令
 *
 * @author hxw on 2018/9/19.
 */
public class AddRequirementCommand extends Command {
    /**
     * 执行增加一项需求的命令
     */
    @Override
    public void execute() {
        rg.find();
        rg.add();
        rg.plan();
    }
}
