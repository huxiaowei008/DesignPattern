package com.hxw.designpattern.mediator;

/**
 * 中介者模式:
 * 用一个中介对象封装一系列的对象交互,中介者使各对象不需要显示地相互作用,
 * 从而使其耦合松散,而且可以独立地改变它们之间的交互。
 * <p>
 * 中介者模式慎用,不要为了模式而使用。推荐在以下情况使用:
 * 1、N个对象之间产生了相互的依赖关系(N>2)
 * 2、多个对象有依赖关系,但是依赖的行为尚不确定或者有发生改变的可能
 *
 * @author hxw on 2018/9/11.
 */
public class MediatorClient {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购人员采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        //销售人员销售电脑
        System.out.println("------销售人员销售电脑------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //库房管理人员管理库存
        System.out.println("------库房管理人员管理库存------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
