package com.hxw.designpattern.memento;

/**
 * 备忘录管理者
 * @author hxw
 * @date 2019/3/18
 */
public class Caretaker {
    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
