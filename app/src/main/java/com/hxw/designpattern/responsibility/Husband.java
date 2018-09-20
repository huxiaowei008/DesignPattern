package com.hxw.designpattern.responsibility;

/**
 * 丈夫类
 *
 * @author hxw on 2018/9/20.
 */
public class Husband extends AbstractHandler {

    Husband() {
        super(AbstractHandler.HUSBAND_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------妻子向丈夫请示------");
        System.out.println("妻子的请示是:" + women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}
