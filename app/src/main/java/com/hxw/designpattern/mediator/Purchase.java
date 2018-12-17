package com.hxw.designpattern.mediator;

/**
 * 采购管理
 *
 * @author hxw on 2018/9/12.
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购IBM电脑
     *
     * @param number 采购数量
     */
    public void buyIBMComputer(int number) {
        mediator.execute("purchase.buy", number);
    }

    /**
     * 不在采购IBM电脑
     */
    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
