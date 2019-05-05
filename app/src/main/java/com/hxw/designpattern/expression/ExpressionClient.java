package com.hxw.designpattern.expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式:
 * 给定一门语言,定义它的文法的一种表示,并定义一个解释器,该解释器使用该表示来解释语言中的句子
 *
 * @author hxw
 * @date 2019/5/5
 */
public class ExpressionClient {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String, Integer> var = getValue(expStr);

        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为:" + expStr + "=" + cal.run(var));
    }


    /**
     * @return 获得表达式
     * @throws IOException
     */
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    /**
     * @return 获得值映射
     * @throws IOException
     */
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        //解析有几个参数要传递
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数问题
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "值:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}
