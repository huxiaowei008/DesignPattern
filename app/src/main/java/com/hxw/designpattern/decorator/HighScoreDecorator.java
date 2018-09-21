package com.hxw.designpattern.decorator;

/**
 * 最高成绩修饰
 *
 * @author hxw on 2018/9/21.
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    /**
     * 汇报最高成绩
     */
    private void reportHighScore() {
        System.out.println("这次考试语文最高75,数学是78,自然是80");
    }

    @Override
    public void report() {
        //再老爸看成绩单前告诉他最高成绩
        reportHighScore();
        super.report();
    }
}
