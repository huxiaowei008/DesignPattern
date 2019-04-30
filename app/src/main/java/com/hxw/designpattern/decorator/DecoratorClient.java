package com.hxw.designpattern.decorator;

/**
 * 装饰模式:
 * 动态地给一个对象添加一些额外的职责。就增加功能来说,装饰模式相比生成子类更为灵活。
 *
 * @author hxw on 2018/9/21.
 */
public class DecoratorClient {
    public static void main(String[] args) {
        //原装成绩单
        SchoolReport sr = new FouthGradeSchoolReport();

        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);

        //加了成绩排名的成绩单
        sr = new SortDecorator(sr);

        //汇报成绩
        sr.report();

        //家长签名
        sr.sign("张三丰");

    }
}
