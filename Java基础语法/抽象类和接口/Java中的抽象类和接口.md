# Java中的抽象类和接口

# 1. 多态的理解以及使用

**发生多态的条件:**

1. **父类引用 引用子类对象 ( 发生了向上转型 )**
2. **父类和子类拥有同名的覆盖方法** 
3. **通过父类引用调用这个重写的方法时, 发生了运行时绑定, 进而就发生了多态**

```java
class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个♦");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape) { // 发生了向上转型
        shape.draw();
    }
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        React react = new React();
        drawMap(cycle);
        drawMap(react);
    }
}
```

**多态的好处:** 

1. **类的调用者对类的使用成本进一步降低**

   多态可以让类的调用者无需关心使用的是哪个类, 只要知道这个类中是否有这个方法即可

2. **能够降低代码的"圈复杂度", 避免使用大量的 if - else 语句**

3. **可扩展的能力强**

   如果想要新增一种形状, 只需要创建一个新类的实例就可以了

#  2. 抽象类

由刚刚的代码可以看出, Shape类中的draw方法并没有什么实际的工作, **像这种没有什么实际工作的方法, 我们可以把它设计成一个抽象方法.**

抽象方法:  一个方法如果被 abstract 关键字修饰, 那么这个方法就叫做抽象方法, 抽象方法可以没有具体的实现

抽象类: 包含抽象方法的类就叫做抽象类, 这个类仍然是被 abstract 所修饰的

**注意:** 

1. **抽象类是不可以被实例化的**
2. **抽象类中, 除了抽象方法以外, 类内的其他方法和普通类中的方法没有什么区别**
3. **抽象类的作用: 抽象类主要就是用来被继承的**
4. **如果一个类继承了一个抽象类, 那么这个类必须重写这个抽象类中的抽象方法** 
5. **当抽象类A继承了抽象类B, 那么A可以不用重写B中的抽象方法, 但是一旦A再被继承, 还是一定还是要重写这个抽象方法**

```java
// 抽象类
abstract class Shape {
    public abstract void draw(); // 抽象方法
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}
```

# 3. 接口(interface)

接口是抽象类的更近一步, 抽象类中可以包含属性, 方法, 抽象方法. 但是接口中只包含抽象方法

继续由上面的代码看出, Shape类中, 除了抽象方法draw以外, 没有别的非抽象方法了, 因此我们可以将其设计成一个接口

```java
interface Shape {
    public abstract void draw();
}
```

**注意:** 

1. **接口中的方法均为抽象方法**

2. 其实接口中可以有具体实现的方法, 这个方法是被 default 修饰的

3. **接口当中定义的成员变量, 默认是: public static final;   成员方法, 默认是: public abstract;**

   **一般情况下, 尽量使用简单的代码方式**

4. **接口是不可以被实例化的**

5. **接口和类之间的关系: implements ( 实现 )**

6. **由于 Java 中是单继承, 因此接口的出现是为了解决多继承问题**

7. **只要一个类实现了这个接口, 那么这个类就可以实现向上转型了**

```java
interface Shape { // 接口
    void draw();
}
class Cycle implements Shape { // 类实现了接口
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class Flower implements Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}
public class TestInterface {
    public static void drawMap(Shape shape) { // 发生了向上转型
        shape.draw();
    }
    public static void main(String[] args) {
       Shape shape = new Cycle();
       Shape shape1 = new Flower();
       drawMap(shape);
       drawMap(shape1);
    }
}
```

## 一个类可以实现多个接口, 解决 Java中多继承问题

```java
class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
interface IFlying {
    void fly();
}
// 一个类继承了一个普通类/抽象类, 并且实现了一个接口
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用腿跑");
    }
}
// 一个类继承了一个普通类/抽象类, 并且实现了多个接口
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
```

接口的出现, 可以使类的调用者不必关注具体的类型, 而只关注某个类是否具有某种接口即可

# 4. 接口的使用

## 自定义类型的比较

1. 数组的排序

```java
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {13, 25, 6, 11, 64};
        Arrays.sort(array); 
        System.out.println(Arrays.toString(array));
    }
}
```

结果:

```
[6, 11, 13, 25, 64]
```

2. 内置类型的比较

```java
public class TestDemo {
    public static int func(int a, int b) {
        if(a > b) {
            return a;
        } 
        return b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(func(a, b));
    }
}
```

结果:

```
20
```

3. 自定义类型的比较:

​       自定义类型的比较, 必须是可比较的

​       自定义类型需要比较需要实现 Comparable 或 Comparator 接口, 然后重写 compareTo 方法进行可比较项的比较

```java
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int score;
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public int compareTo(Student o) {
        if(this.age > o.age) {
            return 1;
        } else if(this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 20, 79);
        Student student2 = new Student("李四", 18, 70);
        Student student3 = new Student("王五", 28, 99);
        if(student1.compareTo(student2) > 0) {
            System.out.println("student1 的年龄 > student2");
        }
    }
}
```



