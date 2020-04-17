/**
 * Created with IntelliJ IDEA.
 * Description: 类和对象
 * 访问修饰限定符:
 *    public: 共有的
 *    private: 私有的
 *    protected: 受保护的
 *    什么都不写 -> 默认权限 -> 包访问权限
 * User: HHH.Y
 * Date: 2020-04-17
 */


/**
 * 如何定义一个类, 如何实例化一个对象
 */
// 定义一个类
class Person {
    // 字段 -> 成员变量 -> 定义在方法外边, 类的里面
    // 实例成员变量  在对象里面(在堆上)
    // 实例成员没有初始化(一般情况下, 不进行初始化), 默认值为对应的0值  引用类型默认为null, 简单类型默认为0
    // char类型默认为\u0000       boolean 默认为 false
    public String name;
    public int age;
  /*  public char ch;
    public boolean flg;*/
    // 静态成员变量不属于对象,它是属于它所在的类
    // 它存放在方法区中, 且会创建一次(仅有一份)
    // 静态成员变量 和 实例成员变量  在不初始化的情况下都是0
    public static int size ;


    // 方法
    // 实例成员方法
    public void eat() {
        System.out.println("eat");
    }
    public void sleep() {
        System.out.println("sleep");
    }
    public void show() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }

    // 静态成员方法
    public static void func1() {
        System.out.println("static :: func1()");
        //age = 18;    error  静态方法呢内部, 不能够访问非静态的数据成员, 只能访问静态的数据成员
        size = 99;
    }
}
public class TestDemo01 {
    public static void main(String[] args) {
        // 访问实例成员方法
       Person person = new Person();
      /* person.eat();
       person.sleep();
       Person.func1();*/
       person.name = "kris";
       person.age = 18;
       person.show();
    }


    public static void main3(String[] args) {
        Person person = new Person();
        // 如何访问静态数据成员: 类名.静态成员变量
        System.out.println(Person.size);
    }



    public static void main2(String[] args) {
        // 实例化一个对象
        Person person = new Person();
        // 如何访问对象当中的实例成员变量: 对象的引用.成员变量
        System.out.println(person.name);
        person.name = "kris";
        System.out.println(person.name);
        System.out.println(person.age);
       /* System.out.println(person.ch);
        System.out.println(person.flg);*/
    }


    public static void main1(String[] args) {
        // 实例化一个对象 -> 使用关键字 new
        Person person = new Person();
        // 通过类实例化多个对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
    }
}
