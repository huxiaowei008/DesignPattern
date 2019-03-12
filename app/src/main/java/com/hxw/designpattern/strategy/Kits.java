package com.hxw.designpattern.strategy;

/**
 * 锦囊
 *
 * @author hxw
 * @date 2019/3/12
 */
public class Kits {

    private IStrategy strategy;

    public Kits(IStrategy strategy){
        this.strategy=strategy;
    }

    /**
     * 使用计策
     */
    public void operate(){
        this.strategy.operate();
    }
}
