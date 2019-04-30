package com.hxw.designpattern.adapter;

/**
 * 适配器模式:
 * 将一个类的接口变换成客户端所期待的另一种接口,从而使原本因接口不匹配而无法在一起工作的两个类
 * 能够在一起工作。
 * @author hxw
 * @date 2019/3/13
 */
public class AdapterClient {
    public static void main(String[] args){
        //没有与外系统连接时
        IUserInfo userInfo=new UserInfo();
        userInfo.getMobileNumber();

        //与外系统对接后
        IUserInfo userInfo1=new OuterUserInfo();
        userInfo1.getMobileNumber();
    }
}
