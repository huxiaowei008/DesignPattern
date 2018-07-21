package com.hxw.designpattern.builder;

/**
 * 高配版的套餐
 *
 * @author hxw on 2018/7/20.
 */
public class HighConfigBuider implements ComputerConfigBuilder {
    private Computer mComputer;

    public HighConfigBuider() {
        this.mComputer = new Computer();
    }

    @Override
    public ComputerConfigBuilder setCPU() {
        mComputer.setCPU("i7");
        return this;
    }

    @Override
    public ComputerConfigBuilder setMemory() {
        mComputer.setMemory("16G");
        return this;
    }

    @Override
    public ComputerConfigBuilder setHardDisk() {
        mComputer.setHardDisk("1T");
        return this;
    }

    @Override
    public ComputerConfigBuilder setKeyboard() {
        mComputer.setKeyboard("机械键盘");
        return this;
    }

    @Override
    public ComputerConfigBuilder setMouse() {
        mComputer.setMouse("无线鼠标");
        return this;
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
