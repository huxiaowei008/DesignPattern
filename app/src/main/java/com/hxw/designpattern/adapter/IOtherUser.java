package com.hxw.designpattern.adapter;

import java.util.Map;

/**
 * 劳动服务公司的人员信息接口
 *
 * @author hxw
 * @date 2019/3/13
 */
public interface IOtherUser {
    /**
     * @return 基本信息, 如姓名
     */
    public Map getUserBaseInfo();

    /**
     * @return 工作区域信息
     */
    public Map getUserOfficeInfo();

    /**
     * @return 家庭信息
     */
    public Map getUserHomeInfo();
}
