package com.hxw.designpattern.iterator;

import java.util.ArrayList;

/**
 * 项目迭代器
 *
 * @author hxw
 * @date 2019/3/14
 */
public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projects = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {
        boolean b = true;
        if (currentItem >= projects.size() || projects.get(currentItem) == null) {
            b = false;
        }
        return b;
    }

    @Override
    public Object next() {
        return projects.get(currentItem++);
    }

    @Override
    public void remove() {
        //暂时没用到
    }
}
