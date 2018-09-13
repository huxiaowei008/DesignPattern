package com.hxw.designpattern.mediator;

/**
 * 抽象同事类
 *
 * @author hxw on 2018/9/13.
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
