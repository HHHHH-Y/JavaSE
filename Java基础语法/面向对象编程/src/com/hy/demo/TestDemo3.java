package com.hy.demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-29
 */
class Test {
    int a; // 访问修饰限定符为default, 默认权限->包访问权限(只能在同一个包中进行访问)

    // 同一个包中同一个类
    public void func(int a) {
        this.a = a;
    }
}

public class TestDemo3 {
    int b;

    public static void main1(String[] args) {
        Test test = new Test();
        // 同一个包中不同的类
        System.out.println(test.a);
    }
}
