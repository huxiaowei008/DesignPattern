package com.hxw.designpattern.builder;

/**
 * builder模式:
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 一般来说, Builder常常作为实际产品的静态内部类来实现(提高内聚性).
 *
 * @author hxw on 2018/7/20.
 */
public class Builder {
    public static void main(String args[]) {
        Hummer hummer = new Hummer.Builder()
                .setSex("男")
                .setSkinColor("黄")
                .setHigh(170)
                .setWeight(50)
                .build();
        System.out.print(hummer.toString());


        Computer low = new LowConfigBuilder()
                .setCPU()
                .setHardDisk()
                .setKeyboard()
                .setMemory()
                .setMouse()
                .createComputer();
        System.out.print("低配->" + low.toString());

        Computer high=new HighConfigBuider()
                .setCPU()
                .setHardDisk()
                .setKeyboard()
                .setMemory()
                .setMouse()
                .createComputer();
        System.out.print("高配->" + high.toString());
    }
}
