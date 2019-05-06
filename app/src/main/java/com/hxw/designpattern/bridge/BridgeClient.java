package com.hxw.designpattern.bridge;

/**
 * 桥梁模式:
 * 将抽象和实现解耦,使得两者可以独立地变化
 *
 * @author hxw
 * @date 2019/5/6
 */
public class BridgeClient {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("房地产公司是这样运行的....");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("山寨公司是这样运行的....");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
