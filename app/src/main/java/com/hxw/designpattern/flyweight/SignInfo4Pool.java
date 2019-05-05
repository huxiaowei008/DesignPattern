package com.hxw.designpattern.flyweight;

/**
 * 带对象池的报考信息
 *
 * @author hxw
 * @date 2019/5/5
 */
public class SignInfo4Pool extends SignInfo {
    /**
     * 定义一个对象池提取的key值
     */
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
