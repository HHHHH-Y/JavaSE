package com.hy.demo3;



/**
 * Created with IntelliJ IDEA.
 * Description: 接口(Interface)
 * 注意事项:
 * 1. 接口当中的方法, 都是抽象方法
 * 2. 其实可以有具体实现的方法. 这个方法, 是被default修饰的
 * 3. 接口当中定义的成员变量, 默认为常量
 * 4. 接口当中成员变量默认是: public static final    成员方法默认是: public abstract
 * 5. 接口是不可以被实例化的  Shape shape = new Shape();
 * 6. 接口和类之间的关系是: implements (类实现了接口)
 * 7. 为了解决Java单继承的问题, 可以实现多个接口
 * 8. 只要这个类实现了该接口, 你就可以进行向上转型了
 * User: HHH.Y
 * Date: 2020-04-30
 */
// 定义了一个接口
interface Shape {
    int a = 10; // 默认类型是 public static final
    void draw(); // 默认类型是 public abstract
}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class Rect implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
class Flower implements Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}

public class TestInterFace {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
//        Shape shape = new Shape(); // error 接口是不能被实例化的
        Shape shape = new Cycle();
        Shape shape1 = new Rect();
        Shape shape2 = new Flower();
        drawMap(shape);
        drawMap(shape1);
        drawMap(shape2);
    }
}
