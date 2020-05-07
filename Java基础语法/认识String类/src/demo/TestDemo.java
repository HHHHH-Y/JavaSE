package demo;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Java中的字符串类型  String
 * String 的三种常用的表示方式: 1. 直接定义; 2. 使用带有一个字符串参数的构造方法; 3. 使用字符数组
 *
 * 在Java中有一个所谓的字符串常量池, 它的特点有:
 * 1. 从JDK 1.7开始, 字符串常量池被挪到了 堆 当中
 * 2. 字符串常量池中存放的字符串是不重复的, 可以更好的使用内存
 * 3. 如果字符串常量池中有一样的字符串, 就直接调用即可. 如果没有, 再将新的字符串放进字符串常量池中即可
 *
 * 注意:
 * 1. 常量在编译的时候就已经确定了
 * 2. 传递一个引用是无法修改值的内容的, 想要修改值的内容, 需要通过反射才可以进行修改.
 * User: HHH.Y
 * Date: 2020-05-07
 */

/**
 * 比较的是字符串的引用
 */
public class TestDemo {
    public static void func(String str, char[] array) {
        str = "abcdef";
        array[0] = 'g';
    }
    public static void main(String[] args) {
        String str1 = "hello";
        char[] val = {'a'};
        System.out.println(str1); // hello
        System.out.println(Arrays.toString(val)); // a
        func(str1, val);
        System.out.println(str1); // hello
        System.out.println(Arrays.toString(val)); // g
    }


    public static void main4(String[] args) {
        String str1 = "hello";
        String str2 = str1; // 将str1的地址赋值给str2
        System.out.println(str1); // hello
        System.out.println(str2); // hello

        str1 = "abc"; // 仅仅是修改了str1的指向而已, 并没有修改其原本所指向的内容
        System.out.println(str1); // abc
        System.out.println(str2); // hello
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo"; // 常量在编译的时候就已经确定了, 这里在编译时, 就已经确定成为了"hello", 然后再放进字符串常量池中
        System.out.println(str1 == str2); // true;

        String str3 = new String("hel") + "lo";
        System.out.println(str1 == str3); // false
    }


    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1  == str2); // false

        String str3 = "hello";
        System.out.println(str1 == str3); // true
    }



    public static void main1(String[] args) {
        // 1. 直接定义
        String str1 = "hello";
        System.out.println(str1);
        // 2. 调用带有一个字符串参数的构造方法
        String str2 = new String("abcdef");
        System.out.println(str2);
        // 3. 使用字符数组
        char[] val = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str3 = new String(val);
        System.out.println(str3);
    }
}
