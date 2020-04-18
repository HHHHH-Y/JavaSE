# 详述Java中的类和对象

## 1. 对类和对象的初步认识

### 1.1 面向对象和面向过程的区别

C语言是一个面向过程的语言. 

那么什么是面向过程呢?   

我们打个比方:    把一头大象塞进冰箱里, 总共分成三步: 把冰箱门打开, 把大象塞进去, 把冰箱门关上

在塞大象的时候, 我们的关注点在于把大象塞进去的这个过程. 这就是面向过程



Java是一个面向对象的语言.

那什么又是面向对象呢?  

继续用 上一个将大象装进冰箱的例子来说, 这一次, 我们着重关注的是冰箱, 打开冰箱, 存储, 关闭冰箱, 这一系列的动作都是对于冰箱而言的, 我们的关注点是冰箱, 这就是面向对象

### 1.2 什么是类, 什么是对象, 什么是面向对象

**类** 是一类对象的统称, 是一个**自定义的类型**,  相当于一个**模板**

**对象** 是一个具体化的**实例**, 相当于是一个**实体**

面向对象的三个步骤是: 找对象,   创对象,   使用对象

## 2. 类的创建以及对象的使用

### 2.1 类的创建和对象的创建

```java
class Person { // 类的创建
   // 字段/属性/成员变量
   // 方法/成员方法 
}
public class Test {
    public static void main(String[] args) {
        // 通过类实例化了一个对象
		Person person = new Person();
    }
```

### 2.2 类中成员变量和成员方法的定义, 类外对于成员变量和方法的调用

**通过一个类, 就可以产生若干个对象**

```java
class Person { 
   // 字段/属性/成员变量
   // 方法/成员方法 
}
public class Test {
    public static void main(String[] args) {
      // 一个类可以实例化多个对象
      Person person1 = new Person();
      Person person2 = new Person();
      Person person3 = new Person();
    }
```

成员变量和方法的定义和使用(一般情况下, 不在成员变量定义的时候进行赋值)

```java
class Person {
    // 定义成员变量
    public String name;
    public int age;
    // 定义成员方法
    public void eat() {
        System.out.println("eat");
    }
    public void sleep() {
        System.out.println("sleep");
    }
}
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        // 通过 对象的引用.成员变量名 可以给成员变量赋值, 也可以打印
        person.name = "zhangsan";
        person.age = 18;
        System.out.println(person.name); // zhangsan
        System.out.println(person.age); // 18
        // 通过 对象的引用.成员方法名 可以调用成员方法
        person.eat();
        person.sleep();
    }
}
```

若成员变量没赋值, 则默认为其对应的0值.

简单数据类型(byte, short, int, long): 默认值为0

float, double: 0.0

char: \u0000

boolean: false

引用类型统一为: null

### 2.3 静态方法和实例方法

成员变量可分为两种: 实例成员变量 , 静态成员变量

成员方法也分为两种: 实例成员方法, 静态成员方法

静态方法: 

1. 在任何方法上应用static关键字, 次方法都称为静态方法
2. 静态方法直接通过类进行访问, 不需要创建类的对象
3. 静态方法可以访问静态数据成员, 并可以更改静态数据成员的值

静态方法和实例方法的区别:

1. 静态的数据存放在方法区中, 而非静态的数据放在堆上

2. 静态方法直接通过类就可以访问,  而实例方法需要通过实例化一个对象进行访问

3. 静态方法中不可以使用非静态的数据成员或者调用非静态的方法

4. main方法也是一个静态的方法

```java
class Person {
    public String name;
    public static int count;
  
   public static void change() {
       name++; // error  在静态方法中不能使用非静态的数据成员
       count++;
       System.out.println(count);
   }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.change(); // 直接通过类来调用静态方法
    }
}
```

静态数据成员在内存中是存放在方法区中, 且只能创建一次

## 3. 封装

###  使用private进行封装

为什么要封装:   java是一个面向对象的语言, 封装就相当于把一个算法代码块封装成一个只有几个字母的方法, 你可以直接调用方法, 减少重写代码的量和编译出错率

**一般在无特殊要求下, 都用private来对成员变量进行封装**

**只要数据成员被private修饰以后, 就只能在它所在的类中使用, 在类外若想访问这些数据成员, 就需要在类中提供两个public类的接口(getter / setter方法)**

通过getter / setter方法去访问封装了的数据成员

```java
class Person {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(18);
        System.out.println(person.getName()); // zhangsan
        System.out.println(person.getAge()); // 18
    }
}
```

关于this关键字:

this 是当前对象的引用, 要习惯使用 this.

