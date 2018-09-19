package com.hxw.designpattern.templatemethod;

/**
 * 模板方法模式:
 * 定义一个操作中的算法骨架(热干面的制作流程), 而将某些步骤实现延迟到子类中.
 * 使得子类可以根据实际情况不改变算法骨架(热干面的制作流程),
 * 但是可以重新定义或改变该算法中的某些特定步骤(例如装碗).
 *
 * @author hxw on 2018/7/14.
 */
public class TemplateClient {
    public static void main(String args[]) {
        HummerH1 h1 = new HummerH1();
        HummerH2 h2 = new HummerH2();

        h1.run();

        h2.run();
    }
}
