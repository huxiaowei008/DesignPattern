package com.hxw.designpattern.composite;

/**
 * 抽象公司职员
 *
 * @author hxw
 * @date 2019/3/15
 */
public abstract class Corp {
    /**
     * 名称
     */
    private String name;

    /**
     * 职务
     */
    private String position;

    /**
     * 薪水
     */
    private int salary;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     * @return 员工信息
     */
    public String getInfo() {
        return "姓名->" + name +
                "\t职位->" + position +
                "\t薪水->" + salary;
    }
}
