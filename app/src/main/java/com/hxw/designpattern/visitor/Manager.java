package com.hxw.designpattern.visitor;

/**
 * 管理层员工
 *
 * @author hxw
 * @date 2019/3/19
 */
public class Manager extends Employee {
    /**
     * 业绩
     */
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
