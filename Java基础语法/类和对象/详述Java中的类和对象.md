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

**只要数据成员被private修饰以后, 就只能在它所在的类中使用, 在类外若想访问这些数据成员, 就需要在类中提供两个public类的接口(get / set方法)**

通过get / set方法去访问封装了的数据成员

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

## 4. 构造方法
有一个问题: 一个对象的产生分为几步? 他是怎样产生的?
答案为: 两步   1. 给对象分配内存;      2. 调用合适的构造方法

那么什么是构造方法?
构造方法是一种特殊的的方法, 使用关键字new实例化对象的时候, 就会自动调用构造方法, 用于完成初始化的操作.

构造方法的构造要求: 
构造方法名与类名相同, 并且没有返回值
```java 
class Person {
    private String name;
    private int age;

    // 构造方法
    public Person () {
        System.out.println("person");
    }
}
public class Test {
    public static void main(String[] args) {
       Person person = new Person();
    }
}
```

构造方法可以是一个, 也可以是多个.

**若自己未在代码中定义构造方法, 编译器将会默认自带一个无参的构造方法. 若自己定义了构造方法, 编译器将不再赠送构造方法**

构造方法可以是无参的构造方法, 也可以是有参构造方法, 由构造方法的构造可知, 它完全符合重载的要求

所以,  **构造方法可以进行重载**

```java
class Person{
    private String name;
    private int age;

    // 构造方法
    public Person() { // 不带参数的构造方法
        System.out.println("person");
    }
    
    public Person(String name, int age) { // 带有参数的构造方法
        System.out.println("person || String || age");
    }
}
public class Test {
    public static void main(String[] args) {
       c
        Person person = new Person("zhangsan",18);
    }
}
```

### this关键字的简单介绍

这里我们从一个问题入手: **this代表一个对象, 这句话对不对?**

**这句话是错误的**

这里展示一段代码:

```java
class Person{
    private String name;
    private String age;

    // 构造方法
   public Person() {
       this.name = "zhangsan";
       this.age = 18;
       System.out.println(name + " " + age);
   }
}
public class TestDemo03 {
    public static void main(String[] args) {
        Person person = new Person();
    }
}
```

我们知道, 一个对象要产生, 首先就要先给对象分配内存, 然后再调用合适的构造方法. 但是从这段代码中我们可以看出, 在构造方法中就已经使用了this关键字, 而这个时候, 对象还没有完全创建好. 所以, this代表一个对象是错误的

那么,this到底代表什么呢? **this代表的是当前对象的引用(this写在哪个类, 就代表哪个类的对象的引用)**

### 构造方法还可以调用构造方法

```java
  public Book() {
        this("木偶奇遇记", "10697061418"); // 调用了有参的构造方法
        this.name = "鲁宾逊漂流记";
        this.id = "10697061419";
        System.out.println("name = " + name + ", " + "id = " + id);
    }
    // 有参的构造方法
    public Book(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("name = " + name + ", " + "id = " + id);
    }
```

**调用构造方法, 需要使用 this( ) 来调用自己的构造方法**

**注意: 1. this( ) 只能在构造方法里面写**

​          **2. 调用构造方法的时候, 只能调用一次**

​          **3. 调用的时候只能写在第一行**



## 5. 代码块

代码块分为3种: 1. 静态代码块

​                           2. 实例代码块(构造代码块)

​                           3.本地代码块

我们着重介绍前两个代码块

```java
class Person {
    private String name;
    private int age;
     // 构造方法 
    public Person() {
        System.out.println("person");
    }
    
    // 实例代码块
    {
        System.out.println("实例代码块");
    }
    
    // 静态代码块(使用static定义的代码块)
    static {
        System.out.println("静态代码块 ");
    }
}

public class TestDemo04 {
    public static void main(String[] args) {
         Person person = new Person();
    }
}
```

运行结果为:

```
静态代码块 
实例代码块
teacher
```

由运行结果可知: 不论静态代码块, 实例代码块, 构造方法如何分布, 在访问的时候都是优先访问静态代码块, 再下来是实例代码块, 之后才是构造方法

注意: 无论创建多少个对象, 静态代码块都只执行一次, 并且是最先执行的

如果一个类中存在两个或者多个静态类的数据成员, 那么他们被访问的顺序按照他们定义的先后顺序

## 6. 匿名对象

匿名表示没有名字的对象

没有引用的对象称为匿名对象

匿名对象只能在创建对象时使用

如果一个对象只用一次, 之后就不再使用了, 可以考虑使用匿名对象

```java
class Animal {
    private String name = "晶晶";
    private String sex = "母";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
public class TestDemo05 {
    public static void main(String[] args) {
        // 匿名对象
        System.out.println(new Animal().getName());
        System.out.println(new Animal().getSex());
    }
}
```

