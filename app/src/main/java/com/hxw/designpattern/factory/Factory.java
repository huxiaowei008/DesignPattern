package com.hxw.designpattern.factory;

import com.hxw.designpattern.factory.abstractfactory.Company;
import com.hxw.designpattern.factory.abstractfactory.CompanyFactory;
import com.hxw.designpattern.factory.abstractfactory.SbiCompanyFactory;
import com.hxw.designpattern.factory.normalfactory.BlackFactory;
import com.hxw.designpattern.factory.normalfactory.Human;
import com.hxw.designpattern.factory.normalfactory.WhiteFactory;
import com.hxw.designpattern.factory.normalfactory.YellowFactory;
import com.hxw.designpattern.factory.simplefactory.Coke;
import com.hxw.designpattern.factory.simplefactory.Drink;
import com.hxw.designpattern.factory.simplefactory.DrinkFactory;

/**
 * 对于工厂模式的最上层抽象,用接口还是抽象类都可以
 * <p>
 * 简单工厂:
 * 一种编程习惯, 将类似对象的初始化放下一个地方, 便于管理.
 * <p>
 * 普通工厂(工厂方法模式):
 * 定义一个用于创建对象的接口,让子类决定实例化哪个类。工厂方法使一个类的实例化延迟到其子类。
 * 有一个工厂, 工厂(饮料机)里有那么一个方法(定义了一个创建对象的接口makeDrink),
 * 可以生产产品(Drink). 由实现了这个工厂方法的类来决定具体生产出什么产品(可以是可乐, 橙汁, 奶茶等)。
 * <p>
 * 抽象工厂:
 * 为创建一组相关或相互依赖的对象提供一个接口,而且无须指定它们的具体类。
 * 可以生产一系列的相关的或是互相依赖的产品。
 *
 * @author hxw on 2018/7/9.
 */
public class Factory {
    public static void main(String args[]) {
        Drink drink = DrinkFactory.create(DrinkFactory.TYPE_J);
        System.out.print(drink.printlnName() + "\n");

        drink = DrinkFactory.create(Coke.class);
        System.out.print(drink.printlnName() + "\n");

        drink = DrinkFactory.createW();
        System.out.print(drink.printlnName() + "\n");

        Human human = new YellowFactory().createHuman();
        human.getColor();

        human = new WhiteFactory().createHuman();
        human.getColor();

        human = new BlackFactory().createHuman();
        human.getColor();

        CompanyFactory factory = new SbiCompanyFactory();
        Company sbiCompany = new Company(factory.createStore(), factory.createCheckstand());
        System.out.println(sbiCompany);
    }
}
