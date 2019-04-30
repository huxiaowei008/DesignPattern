package com.hxw.designpattern.composite;

import java.util.ArrayList;

/**
 * 组合模式:
 * 将对象组合成树形结构以表示"部分-整体"的层次结构,
 * 使得用户对单个对象和组合对象的使用具有一致性
 *
 * @author hxw
 * @date 2019/3/14
 */
public class CompositeClient {
    public static void main(String[] args) {
        //首先组装个组织结构
        Branch ceo = compositeCorpTree();
        //打印ceo
        System.out.println(ceo.getInfo());
        //所有员工信息
        System.out.println(getTreeInfo(ceo));
    }

    private static String getTreeInfo(Branch root) {
        ArrayList<Corp> sub = root.subordinateList;
        StringBuilder info = new StringBuilder();
        for (Corp s : sub) {
            if (s instanceof Leaf) {
                info.append(s.getInfo()).append("\n");
            } else {
                info.append(s.getInfo()).append("\n")
                        .append(getTreeInfo((Branch) s));
            }
        }
        return info.toString();
    }

    public static Branch compositeCorpTree() {
        //首先生产CEO
        Branch root = new Branch("楚休", "总经理", 1000000);
        //再生产三个部门经理
        Branch developDep = new Branch("王大锤", "研发部门经理", 100000);
        Branch salesDep = new Branch("明王", "销售部门经理", 10000);
        Branch financeDep = new Branch("端木千山", "财务部门经理", 100000);
        //再生产两个组长
        Branch firstGroup = new Branch("杨阳", "研发一组组长", 10000);
        Branch secondGroup = new Branch("魏明", "研发二组组长", 10000);
        //最后小兵
        Leaf a = new Leaf("a", "开发人员", 10000);
        Leaf b = new Leaf("b", "开发人员", 10000);
        Leaf c = new Leaf("c", "开发人员", 10000);
        Leaf d = new Leaf("d", "销售人员", 10000);
        Leaf e = new Leaf("e", "财务人员", 10000);
        //组装
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        developDep.addSubordinate(firstGroup);
        developDep.addSubordinate(secondGroup);

        firstGroup.addSubordinate(a);
        firstGroup.addSubordinate(b);
        secondGroup.addSubordinate(c);
        salesDep.addSubordinate(d);
        financeDep.addSubordinate(e);

        return root;
    }

}
