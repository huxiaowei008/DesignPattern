package com.hxw.designpattern.iterator;

import java.util.ArrayList;

/**
 * 项目信息实现
 *
 * @author hxw
 * @date 2019/3/14
 */
public class Project implements IProject {
    private ArrayList<IProject> projects = new ArrayList<>();
    /**
     * 项目名称
     */
    private String name = "";

    /**
     * 项目成员数量
     */
    private int num = 0;

    /**
     * 项目费用
     */
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {

        return "项目名称->" + name +
                "\t项目人数->" + num +
                "\t项目费用->" + cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projects.add(new Project(name, num, cost));
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(projects);
    }
}
