package com.hy.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-29
 */
// 基类
class Base {
    public int a;
}
// 派生类 继承了 基类
class Derive extends Base {
    public int b;
}

public class TestDemo2 {
    public static void main(String[] args) {
        Derive derive = new Derive();
        derive.a = 10;
        Test test = new Test();
        System.out.println(test.a);
    }
}
