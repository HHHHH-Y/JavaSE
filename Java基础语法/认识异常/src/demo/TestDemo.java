package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 认识异常
 * 异常是一中类
 * Throwable 类是JAVA语言中所有错误和异常的父类
 *
 * Throwable 类又分为 Error类和 Exception类
 * Error类: 是指Java运行时的内部错误或者资源耗尽错误, 必须由程序员自己解决
 * Exception类: 可以由程序自己解决
 *
 * 关于异常, 又分为如下两种:
 * 运行时异常/非受查异常: 在程序运行时抛出的异常
 * 编译时异常/受查异常: 在程序编译时的异常
 *
 * 当出现异常的时候, 程序会告知一个异常信息栈, 找最上面的一条异常信息即可
 * User: HHH.Y
 * Date: 2020-05-11
 */
public class TestDemo {
    //  java.lang.NullPointerException (空指针异常)
    int num = 10;
    public static void main3(String[] args) {
        TestDemo t = null;
        System.out.println(t.num);
    }
    public static void main2(String[] args) {
        // java.lang.ArrayIndexOutOfBoundsException: 3  (数组下标越界异常)
        int[] array = {1, 2, 3};
        System.out.println(array[3]);
    }
    public static void main1(String[] args) {
        // java.lang.ArithmeticException: / by zero  (算术异常: 除数为0)
        int a = 10 / 0;
        System.out.println(a);
    }
}
