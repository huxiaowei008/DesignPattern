package com.hxw.designpattern.visitor;

/**
 * 访问者实现
 *
 * @author hxw
 * @date 2019/3/19
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

    /**
     * 组装基本信息
     *
     * @param employee 员工
     * @return 基本信息
     */
    private String getBasicInfo(Employee employee) {
        return "姓名:" +
                employee.getName() +
                "\t" +
                "性别:" +
                (employee.getSex() == Employee.MALE ? "男" : "女") +
                "\t" +
                "薪水:" +
                employee.getSalary() +
                "\t";
    }

    /**
     * 组装管理层部门人员信息
     *
     * @param manager 管理层人员
     * @return 人员信息
     */
    private String getManagerInfo(Manager manager) {
        String basicInfo = getBasicInfo(manager);
        String otherInfo = "业绩:" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    /**
     * 组装普通员工信息
     *
     * @param commonEmployee 普通员工
     * @return 人员信息
     */
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = getBasicInfo(commonEmployee);
        String otherInfo = "工作:" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
