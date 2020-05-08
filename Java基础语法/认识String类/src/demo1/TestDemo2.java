package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description: 字符串常见的操作
 * User: HHH.Y
 * Date: 2020-05-08
 */
public class TestDemo2 {
    /**
     * 字符串的其他截取方法
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. 去掉字符串中的左右空格, 保留中间的空格
        String str = "    aba   bcabcd      ";
        String ret = str.trim();
        System.out.println(ret);
    }

    //hello

    /**
     * 字符串的截取
     *
     * @param args
     */
    public static void main3(String[] args) {
        // 1. 从指定位置截取到结尾
        String str = "hello";
        String ret = str.substring(1);
        System.out.println(ret);
        // 2. 截取字符串的部分内容
        String ret1 = str.substring(1, 4); // 左闭右开区间
        System.out.println(ret1); // ell
    }


    /**
     * 2. 字符串的替换
     *
     * @param args
     */
    public static void main2(String[] args) {
        // 1. 替换一个指定的字符 repalce (char oldChar, char newChar)
        String str = "ababcabcd";
        String ret = str.replace('a', 'p');
        System.out.println(ret);
        // 2. 使用接口作为参数进行替换 replace (CharSequence target, CharSequence replacement)
        String ret1 = str.replace("ab", "pp");
        System.out.println(ret1);
        // 3. 替换所有的指定内容
        String str1 = "ababcabcd";
        String ret2 = str1.replaceAll("ab", "pp");
        System.out.println(ret2);
        // 4. 替换首个内容
        String ret3 = str1.replaceFirst("ab", "pp");
        System.out.println(ret3);
    }


    /**
     * 1. 字符串的比较(比较的是字符串的内容)
     *
     * @param args
     */
    public static void main1(String[] args) {
        // 1. 判断字符串是否相等(区分大小写的)
        String str = "abcdef";
        String str1 = "ABCdef";
        System.out.println(str.equals(str1)); // false
        // 2. 判断字符串是否相等(不区分大小写)
        System.out.println(str.equalsIgnoreCase(str1)); // true
        // 3. 比较两个字符串的大小关系, 使用comparaTo()方法
        String str2 = "abc";
        String str3 = "Abc";
        // str2 < str3  负数
        // str2 > str3  正数
        // str2 == str3  0
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));
    }
}
