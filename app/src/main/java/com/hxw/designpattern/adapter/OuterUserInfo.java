package com.hxw.designpattern.adapter;

import java.util.Map;

/**
 * 中转角色
 *
 * @author hxw
 * @date 2019/3/13
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map homeInfo = super.getUserHomeInfo();
    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String name=(String) this.baseInfo.get("userName");
        System.out.println(name);
        return name;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress=(String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber=(String)this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTel=(String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTel);
        return officeTel;
    }

    @Override
    public String getJobPosition() {
        String jobPosition=(String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber=(String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
