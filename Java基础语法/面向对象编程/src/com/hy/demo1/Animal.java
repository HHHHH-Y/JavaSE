package com.hy.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-29
 */
public class Animal {
    protected String name;

    // 同一包中的同一个类
    public void eat() {
        System.out.println(this.name + "Animal :: eat()");
    }
}
