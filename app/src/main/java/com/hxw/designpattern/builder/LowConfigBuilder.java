package com.hxw.designpattern.builder;

/**
 * 低配版的套餐
 * @author hxw on 2018/7/20.
 */
public class LowConfigBuilder implements ComputerConfigBuilder {

    private Computer mComputer;

    public LowConfigBuilder(){
        this.mComputer = new Computer();
    }

    @Override
    public ComputerConfigBuilder setCPU() {
        mComputer.setCPU("i5");
        return this;
    }

    @Override
    public ComputerConfigBuilder setMemory() {
        mComputer.setMemory("8G");
        return this;
    }

    @Override
    public ComputerConfigBuilder setHardDisk() {
        mComputer.setHardDisk("500G");
        return this;
    }

    @Override
    public ComputerConfigBuilder setKeyboard() {
        mComputer.setKeyboard("薄膜键盘");
        return this;
    }

    @Override
    public ComputerConfigBuilder setMouse() {
        mComputer.setMouse("有线鼠标");
        return this;
    }

    @Override
    public Computer createComputer() {
        return mComputer;
    }
}
