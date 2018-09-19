package com.hxw.designpattern.command;

/**
 * 删除页码的命令
 * @author hxw on 2018/9/19.
 */
class DeletePageCommand extends Command {
    /**
     * 执行删除一个页面的命令
     */
    @Override
    public void execute() {
        pg.find();
        pg.delete();
        pg.plan();
    }
}
