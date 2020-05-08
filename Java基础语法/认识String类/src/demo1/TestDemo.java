package demo1;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 字符, 字节, 字符串之间的转换
 *
 * 什么时候使用char[], 什么时候使用byte[]?
 * 当处理的是视频, 音频, 包括网络传输,, 数据存储等情况下应该使用byte[].
 * 当处理的是文本数据, 或者是字符型的数据的时候, 就应该使用char[].
 * User: HHH.Y
 * Date: 2020-05-08
 */
public class TestDemo {
    /**
     * 字节与字符串
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1. 将字节数组变为字符串, 调用 public String (byte bytes[]) 的构造方法
        byte[] val = {97, 98, 99};
        String str = new String(val); // abc
        System.out.println(str);
        // 2. 将部分字节数组中的内容变为字符串, 调用 public String (char[] val, int offset, int length) 的构造方法
        String str1 = new String(val, 1, 2);
        System.out.println(str1); // bc
        // 3. 将字符串以字节数组的形式返回
        String str2 = "abcde";
        byte[] byte1 = str2.getBytes();
        System.out.println(Arrays.toString(byte1));
//        str2.getBytes(1, 2, val, 4); // 已弃用的方法
        // 4.编码转换处理
        byte[] bytes = str2.getBytes("gbk");
        System.out.println("===============");
        System.out.println(Arrays.toString(bytes));
    }


    /**
     * 1. 字符与字符串
    */
    public static boolean func(String str) {
        char[] val = str.toCharArray();
        for (int i = 0; i < val.length; i++) {
            if(val[i] < '0' || val[i] > '9') {
                return false;
            }
        }
        return true;
    }
    public static boolean func1(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
    public static void  main2(String[] args) {
        // 给定一个字符串, 判断其是否全部由数组所组成的.
        String str = "123456a7";
        // 1. 将这个字符串转换成字符数组, 然后遍历数组进行判断.
//        System.out.println(func(str));
        // 2. 直接取得指定位置的字符, 判断这个字符是否为数字
        System.out.println(func1(str));
    }

    public static void main1(String[] args) {
        // 1. 将字符数组中的内容变为字符串, 调用 public String(char[] val) 的构造方法
        char[] val = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str = new String(val);
        System.out.println(str);
        // 2. 将部分字符数组的内容变为字符串, 调用带有偏移量的构造方法, 即:public String(char[] val, int offset, int count)
        String str1 = new String(val, 1, 3); // 偏移量是下标为1的字符, 总共偏移3个字符
        System.out.println(str1);
        // 3. 取得指定索引位置的字符. 索引位置从0号下标开始
        String str2 = "hello";
        System.out.println(str2.charAt(0));
        // 4. 将字符串变为字符数组
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
}
