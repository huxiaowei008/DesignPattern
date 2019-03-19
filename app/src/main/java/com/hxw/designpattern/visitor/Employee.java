package com.hxw.designpattern.visitor;

/**
 * 抽象员工
 *
 * @author hxw
 * @date 2019/3/19
 */
public abstract class Employee {
    /**
     * 代表男性
     */
    public final static int MALE = 0;
    /**
     * 代表女性
     */
    public final static int FEMALE = 1;

    private String name;

    private int salary;

    private int sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }


    /**
     * 允许一个访问者访问
     *
     * @param visitor 访问者
     */
    public abstract void accept(IVisitor visitor);
}
