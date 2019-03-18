package com.hxw.designpattern.memento;

/**
 * 备忘录
 * @author hxw
 * @date 2019/3/18
 */
public class Memento {

    /**
     * 男孩的状态
     */
    private String state;

    public Memento(String state){
        this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
