package com.hxw.designpattern.facade;

/**
 * 外观模式(门面模式):
 * 要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。
 * 门面模式提供一个高层的接口,使得子系统更易于使用
 *
 * @author hxw
 * @date 2019/3/15
 */
public class FacadeClient {
    public static void main(String[] args) {
        ModenPostOffice office = new ModenPostOffice();
        String address = "信件地址";
        String context = "信件内容";
        office.sendLetter(context, address);
    }
}
