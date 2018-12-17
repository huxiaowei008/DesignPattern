package com.hxw.designpattern.mediator;

import java.util.Random;

/**
 * 销售管理
 *
 * @author hxw on 2018/9/12.
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 销售IBM电脑
     *
     * @param number 销售数量
     */
    public void sellIBMComputer(int number) {
        mediator.execute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    /**
     * 反馈销售情况
     *
     * @return 0~100之间变化,0代表没人卖,100代表非常畅销
     */
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());

        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为:" + saleStatus );
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale() {
        mediator.execute("sale.offsell");
    }
}
