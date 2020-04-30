package com.hy.demo2;

/**
 * Created with IntelliJ IDEA.
 * Description: 抽象类和抽象方法
 * 如果一个方法没有实际工作, 我们就把它设计成一个抽象方法
 *
 * 抽象类:
 * 1. 抽象方法: 被关键字 abstract 修饰的方法称为抽象方法, 抽象方法可以没有具体的实现
 * 2. 包含抽象方法的类就称为抽象类
 *
 * 抽象类的注意事项:
 * 1. 抽象类不能被实例化, 不能 Shape shape = new Shape();
 * 2. 除了抽象方法以外, 类内的其他数据成员, 都和普通的数据成员没什么区别
 * 3. 抽象类主要就是用来被继承的
 * 4. 如果一个类继承了这个抽象类, 那么这个类必须重写抽象类中的抽象方法
 * 5. 如果 抽象类A 继承了 抽象类B, 那么A可以不重写B中的方法, 但是如果有一个普通类又继承了A, 还是要重写这个抽象方法
 * User: HHH.Y
 * Date: 2020-04-29
 */
// 抽象类
abstract class Shape {
//    public String name;
//    public void eat() {
//    }
    // 抽象方法: 没有具体的实现
    public abstract void draw();
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}
public class TestDemo {
    // 使用了多态
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        // Shape shape = new Shape();  // error 抽象类不能被实例化
        Shape shape = new Cycle();
        Shape shape1 = new Rect();
        Shape shape2 = new Flower();
        drawMap(shape);
        drawMap(shape1);
        drawMap(shape2);
    }
}
