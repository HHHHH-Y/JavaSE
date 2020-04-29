package com.hy.demo;


//import java.util.*; // 导入util下的所有包,  一般情况下不推荐使用



/**
 * Created with IntelliJ IDEA.
 * Description: 继承   是一个 is-a 的关系
 * 被继承的类: 父类, 基类, 超类      继承的类: 子类, 派生类
 * 优点: 可以达到代码复用的效果
 * 注意:
 * 1. 在 JAVA 中, 一个子类只能继承一个父类
 * 2. 子类会继承 除父类的构造方法外 的所有
 * 3. 对于父类中的private方法, 子类是不能访问的, 因为private只能在类内访问, 类外是不能访问的
 * 4. 子类在构造的时候, 要先帮助父类进行构造, 使用super关键字调用父类的构造方法(重点)
 * User: HHH.Y
 * Date: 2020-04-28
 */
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void eat() {
        System.out.println(this.name + "Animal :: eat()");
    }
    public void sleep() {
        System.out.println(this.name + "Animal :: sleep()");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name); // 显示调用父类的构造方法
        System.out.println("Cat(String)");
    }
}
class ChineseGurdenCat extends Cat {
    public ChineseGurdenCat(String name) {
        super(name);
    }
}

class OrangeCat extends ChineseGurdenCat {
    public OrangeCat(String name) {
        super(name);
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
        System.out.println("Bird(String)");
    }

    public void fly() {
        System.out.println(this.name + "Bird :: fly()");
    }
}


public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        cat.eat();
    }
}
