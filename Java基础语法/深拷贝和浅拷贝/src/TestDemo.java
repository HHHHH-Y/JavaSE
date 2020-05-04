import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description: 深拷贝和浅拷贝
 * User: HHH.Y
 * Date: 2020-05-02
 */


/**
 * 如果想克隆自定义类型:
 * 1. 实现 Cloneable 接口
 *    面试问题: 为什么这个接口, 是空接口呢?
 *    空接口: 也把他叫做标记接口. 其实就是这个意思: 只要一个类实现了这个接口, 那么就标记这个类, 是可以进行clone的
 * 2. 重写 clone 方法 --> Object的克隆方法
 *
 * 什么是深拷贝, 什么是浅拷贝?
 * 深拷贝: 在拷贝之后, 改变拷贝对象中的属性或者方法, 对于原对象没有任何影响就叫做深拷贝.  一般来说, 简单类型的拷贝都是深拷贝
 * 浅拷贝: 在拷贝之后, 改变拷贝对象中的属性或者方法, 会影响到原对象的属性或者方法就叫做浅拷贝.
 *         一般来说, 引用类型如果不拷贝引用对象的话, 就是浅拷贝
 */
class Money implements Cloneable{
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age;

    Money m = new Money();

    @Override  // 在重写 clone 方法的时候声明了 CloneNotSupportedException 的异常
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone(); //  克隆 Person
        // 1. 克隆 person
        Person p = (Person) super.clone(); // 克隆一个 Person 给 p
        // 2. 克隆当前的 Money 对象
        p.m = (Money) this.m.clone(); // 把当前的 m 再克隆一份, 给到 p 的 m
        return p;
    }
}

// Money是引用类型, 因此在没有进行Money类型拷贝的时候, 是浅拷贝
// 对 Money 类型进行拷贝之后, 就达到了深拷贝的目的
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone(); // 处理这个异常
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        System.out.println("=====修改======");

        person1.m.money = 99.9;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
    }

    // 属性是简单类型, 因此是深拷贝
    public static void main2(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone(); // 处理这个异常
        System.out.println(person.age);
        System.out.println(person1.age);
        System.out.println("=====修改======");
        person1.age = 99;
        System.out.println(person.age);
        System.out.println(person1.age);
    }

    // 深拷贝
    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = array.clone(); // array2 是克隆的 array
        array2[0] = 99;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
