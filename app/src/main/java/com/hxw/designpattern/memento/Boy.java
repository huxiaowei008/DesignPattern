package com.hxw.designpattern.memento;

/**
 * 男孩
 *
 * @author hxw
 * @date 2019/3/18
 */
public class Boy {
    private String state;

    public void changeState() {
        state = "心情很不好";
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return 保留一个备份
     */
    public Memento createMemento() {
        return new Memento(state);
    }


    /**
     * 恢复一个备份
     *
     * @param memento 备份
     */
    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }
}
