package com.hxw.designpattern.facade;

/**
 * 现代化邮局
 *
 * @author hxw
 * @date 2019/3/15
 */
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();

    /**
     * 写信、封装、投递一体化
     */
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
