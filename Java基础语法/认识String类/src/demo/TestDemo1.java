package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 比较字符串是否相等: equals
 *
 *一般情况下, 如果调用 equals方法, 没有重写的话, 默认是调用的Object的equals方法, 他的实现是默认比较引用是否相等
 *
 * 在使用equlas时的注意事项:
 * 1. 使用 equals 的时候,  .  之前一定不能是一个空指针, 否则就会发生空指针异常 (null.equals(str))
 * 2. 在 . 之后可以是一个空指针 (str.equals(null))
 * 3. 一般情况下, 尽量写成形如: hello.equals(str) 的形式, 可以避免发生空指针异常的情况
 *
 * User: HHH.Y
 * Date: 2020-05-07
 */

/**
 * 比较字符串的内容是否相同
 */

import java.lang.reflect.Field;

/**
 * intern():
 * 从现象上来看: 手动入池
 * 从本质上来看: 要看当前这个字符串在常量池中是否存在.
 * 如果存在, 把常量池中的引用 赋值给当前的引用类型.
 * 不存在的情况就是: 使用scanner进行输入字符串, 然后在常量池中加入该字符串, 然后再返回给当前的引用类型.
 */
public class TestDemo1 {
    /**
     * 反射可以修改私有的属性或者方法
     * 通过反射的方式将字符串"Hello"改写成"hello"的形式, 也就是说, 修改字符串的内容
     * @param args
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 1. 通过原来的字符串, 创建新的字符串
        String str = "Hello";
//        str = "hello";
//        str = "h" + str.substring(1);
//        System.out.println(str);

        // 2. 利用反射 --> 就是一个自省的过程

        // 1. 拿到这个类的class对象
        Class cl = String.class;
        // 2. 拿到String的value字段
        Field field = cl.getDeclaredField("value");
        // 3. 将私有权限设置为true, 就可以对它进行修改了.
        field.setAccessible(true);
        char[] val = (char[]) field.get(str);
        val[0] = 'h';
        System.out.println(str);
    }



    /**
     * 在进行拼接的时候, 会产生大量的临时变量, 占用内存. 所以一般情况下, 不采用这种形式进行字符串的拼接
     * 若要进行字符串拼接, 一般情况下, 我们会采用 StringBuffer 或者 StringBuilder 来进行拼接
     * @param args
     */
    public static void main4(String[] args) {
        // 不推荐这样进行字符串的拼接
        String str = "hello"; // hello
        str += "world"; // world, helloword
        str += "!!!"; // !!!   helloworld!!!
        System.out.println(str);
    }


    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1  == str2); // true
    }

    public static void main2(String[] args) {
        String str1 = null;
        String str2 = new String("hello");
//        System.out.println(str1.equals(str2)); // 会发生空指针异常
        System.out.println(str2.equals(str1));
        System.out.println("hello".equals(str2)); // 有一般情况下, 尽可能写成这种形式, 可以避免发生空指针异常的情况

    }

    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1  == str2); // false
        System.out.println(str1.equals(str2)); // true

        String str3 = "hello";
        System.out.println(str1 == str3); // true
        System.out.println(str1.equals(str3)); // true

    }
}
