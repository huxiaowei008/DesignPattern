package com.hxw.designpattern.facade;

/**
 * 写信过程接口
 *
 * @author hxw
 * @date 2019/3/15
 */
public interface ILetterProcess {

    /**
     * 首先要写信的内容
     *
     * @param context 信的内容
     */
    void writeContext(String context);

    /**
     * 其次写信封
     *
     * @param address 地址
     */
    void fillEnvelope(String address);

    /**
     * 把信放到信封里
     */
    void letterIntoEnvelope();

    /**
     * 然后邮递
     */
    void sendLetter();
}
