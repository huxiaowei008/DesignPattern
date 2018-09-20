package com.hxw.designpattern.responsibility;

/**
 * 有处理权的人员接口
 *
 * @author hxw on 2018/9/20.
 */
public abstract class AbstractHandler {
    public final static int FATHER_LEVEL = 1;
    public final static int HUSBAND_LEVEL = 2;
    public final static int SON_LEVEL = 3;
    /**
     * 能处理的级别
     */
    private int level = 0;
    /**
     * 责任传递,下一个责任人是谁
     */
    private AbstractHandler nextHandler;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     * @param level 处理级别
     */
    public AbstractHandler(int level) {
        this.level = level;
    }

    /**
     * 一个女性(女儿、妻子或者母亲)要求逛街,你要处理这个请求
     */
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                //有后续环节,才把请求往后递送
                this.nextHandler.handleMessage(women);
            } else {
                //没有后续,不用处理了
                System.out.println("没地方请示,按不同意处理");
            }
        }
    }

    /**
     * 如果不属于你处理的请求,你应该让她找下一个环节的人
     */
    public void setNext(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 回应请求
     */
    protected abstract void response(IWomen women);

}
