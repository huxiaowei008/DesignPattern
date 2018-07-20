package com.hxw.designpattern.builder;

/**
 * 制造人类
 *
 * @author hxw on 2018/7/20.
 */
public class Hummer {
    /**
     * 性别
     */
    private String sex;
    /**
     * 肤色
     */
    private String skinColor;
    /**
     * 身高
     */
    private int high;
    /**
     * 体重
     */
    private int weight;


    Hummer(Builder builder) {
        this.sex = builder.sex;
        this.skinColor = builder.skinColor;
        this.high = builder.high;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "性别->" + sex +
                "\n肤色->" + skinColor +
                "\n身高->" + high +
                "\n体重->" + weight;
    }

    public static class Builder {
        /**
         * 性别
         */
        private String sex = "";
        /**
         * 肤色
         */
        private String skinColor = "";
        /**
         * 身高
         */
        private int high = 0;
        /**
         * 体重
         */
        private int weight = 0;


        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setSkinColor(String skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public Builder setHigh(int high) {
            this.high = high;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Hummer build() {
            return new Hummer(this);
        }
    }
}
