package com.hy.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description: 多继承
 * 在 Java 中, 一个类只能继承一个父类, 但是可以同时实现多个接口, 也可以达到多继承的效果
 * 以下代码展示了, 一个类继承一个父类, 同时实现多个接口
 *
 * 继承表达式的含义是: is-a
 * 接口表达式的含义是: 具有 xxx 特性
 * User: HHH.Y
 * Date: 2020-04-30
 */
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
}
// 另外我们再提供一组接口
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
interface IFlying {
    void fly();
}
// 创建几个具体的动物
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
class Frog extends Animal implements ISwimming, IRunning {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }

    @Override
    public void fly() {
        System.out.println(this.name + "正在飞");
    }
}
class Robot implements IRunning {
    public String name;
    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用轮子走");
    }
}
public class TestMoreExtends {
    public static void wolk(IRunning iRunning) {
        System.out.println("我带着伙伴去散步!");
        iRunning.run();
    }
    public static void main(String[] args) {
//        Cat cat = new Cat("咪咪");
//        Frog frog = new Frog("青青");
//        Duck duck = new Duck("鸭鸭");
//        wolk(cat);
//        wolk(frog);
//        wolk(duck);
        Robot robot = new Robot("圆圆");
        wolk(robot);
    }
}
