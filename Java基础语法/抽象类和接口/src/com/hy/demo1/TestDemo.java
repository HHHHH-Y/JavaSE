package com.hy.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description: 理解多态
 * 什么是多态? 意义:
 * 1. 父类引用 引用子类对象
 * 2. 父类和子类拥有同名的覆盖方法
 * 3. 通过父类引用 引用这个重写的方法
 *
 * 多态: 一种引用, 可以产生多种不同的形态
 *
 * 使用多态的好处:
 * 1. 类的调用者对类的使用成本进一步降低(相当于是进一步的封装)
 * 2. 能够降低代码的 "圈复杂度", 避免使用大量的 if-else 语句
 * 3. 可扩展能力强
 * User: HHH.Y
 * Date: 2020-04-29
 */
class Shape {
    // 打印的类
    public void draw() {
        // 啥也不用干
    }
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
    public static void main(String[] args) {
        // 如果不使用多态, 就要大量的使用 if-else 语句, 提高了 "圈复杂度"
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        Flower flower = new Flower();
        String[] shapes = {"cycle", "flower", "rect", "flower", "cycle"}; // 创建了一个字符串数组
        for (String shape : shapes) {
            if(shape.equals("cycle")) {  // 使用 equals 来判断字符串是否相等
                cycle.draw();
            } else if(shape.equals("flower")) {
                flower.draw();
            } else {
                rect.draw();
            }
        }
    }

    public static void main3(String[] args) {
        // 建立一个 Shape 类型的数组
        Shape[] shapes = {new Cycle(), new Rect(), new Flower(), new Rect(), new Flower()};
        for (Shape shape :shapes) {
            shape.draw();
        }
    }

    public static void main2(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5}; // 代表了一个int类型的数组
        for (int x:arrays) {
            System.out.print(x + " ");
        }
    }

    /**
     * 类的调用者完全不用去知道和了解当前的 shape 是哪个对象的实例, 只需要调用即可
     * @param shape
     */
    public static void drowMap(Shape shape) {
        shape.draw();
    }
    public static void main1(String[] args) {
        // 使用多态
        // 发生向上转型
        Shape shape = new Cycle();
        Shape shape1 = new Rect();
        Shape shape2 = new Flower();
        drowMap(shape);
        drowMap(shape1);
        drowMap(shape2);

//        Cycle cycle = new Cycle();
//        cycle.draw();
//        Rect rect  = new Rect();
//        rect.draw();
//        Flower flower = new Flower();
//        flower.draw();
    }
}
