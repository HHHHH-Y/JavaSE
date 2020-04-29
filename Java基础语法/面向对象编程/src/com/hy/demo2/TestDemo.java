package com.hy.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description: 多层继承
 * 多层继承, 最多不能超过3层
 *
 * final:
 * 1. 修饰变量: 使用final修饰了变量, 这个变量就成了常量, 只能被初始化一次
 * 2. 修饰类: 密封类  特性: 不能再被继承, 一旦一个类被final所修饰, 那么这个类必然不能再被继承
 * 3. 修饰方法: 密封方法
 * User: HHH.Y
 * Date: 2020-04-29
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

public class TestDemo {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);
//        a = 20; // error
//        System.out.println(a);
    }
}
