package com.hxw.designpattern.builder;

/**
 * 电脑
 *
 * @author hxw on 2018/7/20.
 */
public class Computer {
    /**
     * CPU
     */
    private String cpu;
    /**
     * 内存
     */
    private String memory;
    /**
     * 硬盘
     */
    private String hardDisk;
    /**
     * 键盘
     */
    private String keyboard;
    /**
     * 鼠标
     */
    private String mouse;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
}
