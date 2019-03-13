package com.hxw.designpattern.adapter;

/**
 * 员工信息实现类
 *
 * @author hxw
 * @date 2019/3/13
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名是...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址...");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是010101...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公电话是...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个人职务是Boss...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这里是员工的家庭电话...");
        return null;
    }
}
