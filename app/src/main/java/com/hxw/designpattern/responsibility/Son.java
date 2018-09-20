package com.hxw.designpattern.responsibility;

/**
 * 儿子类
 *
 * @author hxw on 2018/9/20.
 */
public class Son extends AbstractHandler {

    Son() {
        super(AbstractHandler.SON_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------母亲向儿子请示------");
        System.out.println("母亲的请示是:" + women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
