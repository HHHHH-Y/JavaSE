package com.hy.demo3;

/**
 * Created with IntelliJ IDEA.
 * Description: 多态
 * User: HHH.Y
 * Date: 2020-04-29
 */

/**
 * 重写(override)
 * 注意事项:
 * 1. 需要重写的方法, 一定不能是被final所修饰的. 被final所修饰的方法是密封方法, 不能进行修改
 * 2. 被重写的方法, 访问限定修饰符一定不能是私有的
 * 3. 被重写的方法, 子类的访问修饰限定一定要大于父类的访问修饰限定  private < default < protected < public
 * 4. 被static修饰的方法是不可以进行重写的
 */
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
        //System.out.println("Animal(String)");
        eat(); // 发生了运行时绑定 是调用它的类的eat方法
    }
    public void eat() {
        System.out.println(this.name + "Animal :: eat()");
    }
}

class Cat extends Animal {
    public int count;
    public Cat(String name) {
        super(name); // 显示调用父类的构造方法
        //System.out.println("Cat(String)");
    }
    // 重写
    public void eat() {
        System.out.println(this.name + "Cat :: eat()");
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

    @Override
    public void eat() {
        System.out.println(this.name + "Bird :: eat");
    }
}


public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        //cat.eat();

    }


    /**
     * 向下转型不安全的示范
     * @param args
     */
    // instanceof 关键字
    // A instanceof B : 判断 A 是不是 B 的一个实例
    public static void main7(String[] args) {
        Animal animal = new Cat("咪咪");
        if(animal instanceof Bird) {
            // 如果animal是Bird的一个实例, 才可以发生向下转型
            Bird bird = (Bird)animal;
            bird.fly();
        } else {
            System.out.println("dfafsrhtsrh");
        }
    }



    /**
     * 向下转型: 及其不安全
     * @param args
     */
    public static void main6(String[] args) {
        Animal animal = new Bird("八哥");
        // 发生向下转型: 父类引用 赋值给了子类
        Bird bird = (Bird)animal;
        bird.fly();
    }



    /**
     * 多态
     * 运行时绑定
     * 父类引用 引用子类的对象, 通过父类引用调用同名的覆盖方法(重要)
     * @param args
     */
    public static void main5(String[] args) {
        Animal animal = new Cat("咪咪");
        animal.eat(); // 访问的是cat的eat方法
    }



    /**
     * 向上转型: 父类引用 引用子类对象
     * 向上转型发生的时机:
     *   1. 直接赋值
     *   2. 传参
     *   3. 返回值
     */
    public static Animal func() {
//        Cat cat = new Cat("咪咪");
//        return cat;
        return new Cat("咪咪");
    }
    public static void main3(String[] args) {
        // 返回值
        Animal animal = func();
        animal.eat();
    }


    public static void func(Animal animal) {
        animal.eat();
    }
    public static void main2(String[] args) {
        // 传参
        Cat cat = new Cat("咪咪");
        func(cat);
    }

    public static void main1(String[] args) {
        // 1. 直接赋值
        Animal animal = new Cat("咪咪");
        animal.eat(); // 父类引用只能访问父类的属性或者方法
        //animal.count; //  error  count是cat所特有的, animal是无法访问cat的特有属性的
    }
}
