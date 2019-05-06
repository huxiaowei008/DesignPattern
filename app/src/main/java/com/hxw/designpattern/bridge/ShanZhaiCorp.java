package com.hxw.designpattern.bridge;

/**
 * 山寨公司
 *
 * @author hxw
 * @date 2019/5/6
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱啊....");
    }
}
