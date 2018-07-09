package com.hxw.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例
 * 将多种单例类型注入到一个统一的管理类中，使用时根据key获取对应的对象，这种模式使得我们可以和管理多种类型的单例，
 * 并且在使用的时候可以通过统一的接口进行获取操作，降低了用户的使用成本，也对用户隐藏的具体的实现，降低了耦合度。
 *
 * @author hxw on 2018/7/9.
 */
public class EmperorManager {
    /**
     * 使用HashMap作为缓存容器
     */
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    private EmperorManager() {

    }

    public static void registerService(String key, Object obj) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, obj);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }


}
