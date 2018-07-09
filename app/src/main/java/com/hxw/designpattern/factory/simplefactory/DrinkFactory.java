package com.hxw.designpattern.factory.simplefactory;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 饮料的制作工厂
 * 简单工厂
 *
 * @author hxw on 2018/7/9.
 */
public class DrinkFactory {
    public static final int TYPE_W = 0;//开水
    public static final int TYPE_J = 1;//果汁
    public static final int TYPE_C = 2;//可乐

    /**
     * 静态工厂
     * 缺点: 扩展性差，不同的产品需要不同额外参数的时候 不支持
     *
     * @param type 类型
     * @return 具体饮料
     */
    public static Drink create(@Type int type) {
        switch (type) {
            case TYPE_W:
                return new Water();

            case TYPE_C:
                return new Coke();

            case TYPE_J:
                return new Juice();

            default:
                return new Water();
        }
    }

    /**
     * 反射获取
     * 利用反射机制生成对象返回，好处是增加一种产品时，不需要修改create()的代码
     * 但不推荐使用反射
     */
    public static <T extends Drink> T create(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 多创建方法
     */
    public static Drink createW() {
        return new Water();
    }

    public static Drink createJ() {
        return new Juice();
    }

    public static Drink createC() {
        return new Coke();
    }

    @IntDef({TYPE_W, TYPE_J, TYPE_C})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }
}
