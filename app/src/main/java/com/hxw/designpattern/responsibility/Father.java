package com.hxw.designpattern.responsibility;

/**
 * 父亲类
 *
 * @author hxw on 2018/9/20.
 */
public class Father extends AbstractHandler {

    Father() {
        super(AbstractHandler.FATHER_LEVEL);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("------女儿向父亲请示------");
        System.out.println("女儿的请示是:" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}
