package com.hxw.designpattern.composite;

import java.util.ArrayList;

/**
 * 树枝实现
 *
 * @author hxw
 * @date 2019/3/14
 */
public class Branch extends Corp {


    /**
     * 领导下边有哪些领导和小兵
     */
    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return subordinateList;
    }


}
