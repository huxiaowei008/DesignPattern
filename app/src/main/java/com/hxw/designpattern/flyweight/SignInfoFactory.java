package com.hxw.designpattern.flyweight;

import java.util.HashMap;

/**
 * 带对象池的工厂类
 *
 * @author hxw
 * @date 2019/5/5
 */
public class SignInfoFactory {
    /**
     * 池容器
     */
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        //池中没有该对象，则建立，并放入池中
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立对象并放入池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "----直接从池中取得");
        }
        return result;
    }
}
