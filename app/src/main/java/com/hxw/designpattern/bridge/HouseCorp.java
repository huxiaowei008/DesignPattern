package com.hxw.designpattern.bridge;

/**
 * 房地产公司
 *
 * @author hxw
 * @date 2019/5/6
 */
public class HouseCorp extends Corp {

    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
