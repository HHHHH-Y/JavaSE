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

/**
 * intern():
 * 从现象上来看: 手动入池
 * 从本质上来看: 要看当前这个字符串在常量池中是否存在.
 * 如果存在, 把常量池中的引用 赋值给当前的引用类型.
 * 不存在的情况就是: 使用scanner进行输入字符串, 然后在常量池中加入该字符串, 然后再返回给当前的引用类型.
 */
public class TestDemo1 {
    public static void main(String[] args) {
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
