package com.hxw.designpattern.prototype;

import java.util.Random;

/**
 * 原型模式:
 * 用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象。
 * 优点:1、性能优良,比直接new一个对象性能要好很多,特别是在一个循环体中产生大量对象的时候。
 * 2、逃避构造函数的约束,即是优点也是缺点,直接在内存中拷贝是不会执行构造函数的。
 * <p>
 * 浅拷贝:两个对象互相影响内部数组和引用对象,因为只拷贝了对象,对象内部的数组、引用对象都不拷贝,
 * 还是指向原生对象的内部元素地址。(基本类型如int、char都会被拷贝)
 * (引用的成员变量必须满足两个条件才不会被拷贝:一是类的成员变量,而不是方法内变量;二是必须是一个可变的引用对象,
 * 而不是一个原始类型或不可变对象)
 * <p>
 * 深拷贝:与浅拷贝相反,两个对象互不影响。
 * <p>
 * 注意:要使用clone方法,类的成员变量上不要加final关键字
 *
 * @author hxw on 2018/9/10.
 */
public class PrototypeClient {
    /**
     * 发送账单数量
     */
    private static int MAX_COUNT = 6;

    public static void main(String args[]) {
        //模拟发送邮件
        int i = 0;
        //把模板定义出来
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            //以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(3) + ".com");
            //然后发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    /**
     * 发送邮件
     */
    private static void sendMail(Mail mail) {
        System.out.print("标题:" + mail.getSubject() + "\t收件人:" + mail.getReceiver() + "\t...发送成功");
    }

    /**
     * 获得指定长度的随机字符串
     */
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
