package com.hxw.designpattern.mediator;

/**
 * 库存管理
 *
 * @author hxw on 2018/9/12.
 */
public class Stock extends AbstractColleague {

    /**
     * 刚开始有100台电脑
     */
    private static int computerNumber = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 库存增加
     *
     * @param number 增加数量
     */
    public void increase(int number) {
        computerNumber = computerNumber + number;
        System.out.print("库存数量为:->" + computerNumber + "\n");
    }

    /**
     * 库存减少
     *
     * @param number 减少数量
     */
    public void decrease(int number) {
        computerNumber = computerNumber - number;
        System.out.print("库存数量为:->" + computerNumber + "\n");
    }

    /**
     * 获取库存数量
     *
     * @return 库存数量
     */
    public int getStockNumber() {
        return computerNumber;
    }

    /**
     * 存货压力大了,就要通知采购人员不要采购,销售人员要尽快销售
     */
    public void clearStock() {
        System.out.print("清理存货数量为:->" + computerNumber + "\n");
        mediator.execute("stock.clear");
    }
}
