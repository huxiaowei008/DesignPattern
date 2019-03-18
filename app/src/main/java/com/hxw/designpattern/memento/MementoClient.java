package com.hxw.designpattern.memento;

/**
 * 备忘录模式:
 * 在不破坏封装性的前提下,捕获一个对象的内部状态。
 * 这样以后就可将该对象恢复到原先保存的状态。
 *
 * @author hxw
 * @date 2019/3/18
 */
public class MementoClient {
    public static void main(String args[]) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        //初始化当前状态
        boy.setState("心情很好!");
        System.out.println("男孩现在的状态->" + boy.getState());
        //记录当下状态
        caretaker.setMemento(boy.createMemento());

        //男孩状态改变
        boy.changeState();
        System.out.println("男孩状态改变后->" + boy.getState());
        //恢复男孩状态
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("男孩状态恢复->" + boy.getState());
    }
}
