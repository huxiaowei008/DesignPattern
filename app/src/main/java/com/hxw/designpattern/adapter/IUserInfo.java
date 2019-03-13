package com.hxw.designpattern.adapter;

/**
 * 员工信息接口
 *
 * @author hxw
 * @date 2019/3/13
 */
public interface IUserInfo {
    /**
     * @return 用户姓名
     */
    public String getUserName();

    /**
     * @return 家庭地址
     */
    public String getHomeAddress();

    /**
     * @return 手机号码
     */
    public String getMobileNumber();

    /**
     * @return 办公电话
     */
    public String getOfficeTelNumber();

    /**
     * @return 个人职务
     */
    public String getJobPosition();

    /**
     * @return 家庭电话
     */
    public String getHomeTelNumber();
}
