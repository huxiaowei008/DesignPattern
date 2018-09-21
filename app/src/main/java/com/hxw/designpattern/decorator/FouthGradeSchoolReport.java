package com.hxw.designpattern.decorator;

/**
 * 四年级成绩单
 *
 * @author hxw on 2018/9/21.
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println("......");
        System.out.println("语文 62 数学 65 自然 63");
        System.out.println("......");
        System.out.println("家长签名:");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为:" + name);
    }
}
