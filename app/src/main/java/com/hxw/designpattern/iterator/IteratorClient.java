package com.hxw.designpattern.iterator;

/**
 * 迭代器模式:
 * 它提供一种方法访问一个容器对象中各个元素,
 * 而又不需要暴露该对象的内部细节(现在都不怎么使用了,自带的Iterator一般就能满足使用)
 * @author hxw
 * @date 2019/3/14
 */
public class IteratorClient {
    public static void main(String args[]) {
        IProject project = new Project("", 0, 0);
        project.add("星球大战项目", 10, 1000000);
        project.add("人造太阳项目", 20, 1000000);
        project.add("人造人项目", 5, 2344230);

        IProjectIterator iterator = project.iterator();
        while (iterator.hasNext()) {
            IProject p = (IProject) iterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
