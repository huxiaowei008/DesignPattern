package com.hxw.designpattern.iterator;

/**
 * 项目信息接口
 *
 * @author hxw
 * @date 2019/3/14
 */
public interface IProject {

    /**
     * @return 项目信息
     */
    String getProjectInfo();

    /**
     * 增加项目
     *
     * @param name 项目名称
     * @param num  项目人数
     * @param cost 项目费用
     */
    void add(String name, int num, int cost);

    /**
     * @return 一个可以被遍历的对象
     */
    IProjectIterator iterator();
}
