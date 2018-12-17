package com.hxw.designpattern.mediator;

/**
 * 具体中介者
 *
 * @author hxw on 2018/9/12.
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy":
                //采购电脑
                buyIBMComputer((Integer) objects[0]);
                break;
            case "sale.sell":
                //销售电脑
                this.sellIBMComputer((Integer) objects[0]);
                break;
            case "sale.offsell":
                //折价销售
                this.offSale();
                break;
            case "stock.clear":
                //清仓处理
                this.clearStock();
                break;
            default:
                break;
        }
    }

    /**
     * 采购IBM电脑
     *
     * @param number 采购数量
     */
    private void buyIBMComputer(int number) {
        //电脑的销售情况
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            //销售情况良好
            System.out.println("采购IBM电脑:" + number + "台");
            stock.increase(number);
        } else {
            //销售情况不好,折半采购
            int buyNumber = number / 2;
            System.out.println("采购IBM电脑:" + buyNumber + "台");
        }
    }

    /**
     * 销售IBM电脑
     *
     * @param number 销售数量
     */
    private void sellIBMComputer(int number) {
        if (stock.getStockNumber() < number) {
            //库存数量不够销售
            purchase.buyIBMComputer(number);
        }
        stock.decrease(number);
    }

    /**
     * 折价处理
     */
    private void offSale() {
        //库房有多少卖多少
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    /**
     * 存货压力大了,就要通知采购人员不要采购,销售人员要尽快销售
     * 清仓处理
     */
    private void clearStock() {
        //要求折价销售
        sale.offSale();
        //要求采购人员不要采购
        purchase.refuseBuyIBM();
    }

}
