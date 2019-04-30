package com.hxw.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式:
 * 封装一些作用于某种数据结构中的各元素的操作,
 * 它可以在不改变数据结构的前提下定义作用于这些元素的新的操作
 *
 * @author hxw
 * @date 2019/3/19
 */
public class VisitorClient {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("程序员");
        zhangSan.setName("张三");
        zhangSan.setSalary(18000);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("美工");
        liSi.setName("李四");
        liSi.setSalary(15000);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        Manager wangWu = new Manager();
        wangWu.setPerformance("基本上是负值,但会拍马屁");
        wangWu.setName("王五");
        wangWu.setSalary(20000);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);

        return empList;
    }
}
