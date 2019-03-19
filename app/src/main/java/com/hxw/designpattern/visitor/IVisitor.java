package com.hxw.designpattern.visitor;

/**
 * 访问者接口
 *
 * @author hxw
 * @date 2019/3/19
 */
public interface IVisitor {
    /**
     * 定义可以访问普通员工
     *
     * @param commonEmployee 普通员工
     */
    void visit(CommonEmployee commonEmployee);

    /**
     * 定义可以访问管理层员工
     *
     * @param manager 管理层员工
     */
    void visit(Manager manager);
}
