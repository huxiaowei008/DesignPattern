package com.hxw.designpattern.builder;

/**
 * 经典builder模式
 * 电脑配置建造接口
 *
 * @author hxw on 2018/7/20.
 */
public interface ComputerConfigBuilder {
    ComputerConfigBuilder setCPU();

    ComputerConfigBuilder setMemory();

    ComputerConfigBuilder setHardDisk();

    ComputerConfigBuilder setKeyboard();

    ComputerConfigBuilder setMouse();

    Computer createComputer();
}
