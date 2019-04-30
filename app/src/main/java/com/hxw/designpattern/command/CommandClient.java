package com.hxw.designpattern.command;

/**
 * 命令模式:
 * 将一个请求封装成一个对象,从而让你使用不同的请求把客户端参数化,
 * 对请求排队或者记录请求日志,可以提供命令的撤销和恢复功能。
 *
 * @author hxw on 2018/9/18.
 */
public class CommandClient {
    public static void main(String[] args) {
//        //首先客户找到需求组说,过来谈需求并修改
//        System.out.println("------客户要求增加一项需求------");
//        Group rg=new RequirementGroup();
//        //找到需求组
//        rg.find();
//        //增加一个需求
//        rg.add();
//        //要求变更计划
//        rg.plan();

        //定义我们的负责人
        Invoker invoker = new Invoker();
        System.out.println("------客户要求增加一项需求------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("------客户要求删除一个页面------");
        command = new DeletePageCommand();
        invoker.setCommand(command);
        invoker.action();
    }
}
