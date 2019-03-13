package com.hxw.designpattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 劳动服务公司的人员实现
 *
 * @author hxw
 * @date 2019/3/13
 */
public class OuterUser implements IOtherUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这员工叫混世魔王");
        baseInfoMap.put("mobileNumber", "这员工电话是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职务是Boss...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "员工家庭电话是...");
        homeInfoMap.put("homeAddress", "员工家庭地址是...");
        return homeInfoMap;
    }
}
