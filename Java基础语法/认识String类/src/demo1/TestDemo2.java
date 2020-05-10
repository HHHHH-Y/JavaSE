package demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 字符串常见的操作
 * User: HHH.Y
 * Date: 2020-05-08
 */
public class TestDemo2 {
    /**
     * 字符串的拆分: 将一个字符串拆分成子串数组
     * 1. 将字符串全部进行拆分: split(String regex)
     * 2. 将字符串拆分成给定的几个部分: split(String regex, int limit)
     * 3. 如果遇见 .$|()[{^?* 这些符号, 在用他们作为分隔符时, 需要在其前面加上 \\
     *    如果是"", 就应该写成"\\"
     * 4. 字符串可以进行多次拆分, 这是需要使用 "|" 作为连接符, 但是使用它之前必须家爱上一个空格
     * @param args
     */

    public static void main(String[] args) {
        String str = "name=zhangsan&age=18";
        String[] tmp1 = str.split("&"); // name=zhangsan  age=18
        // 在遍历数组tmp1的时候, 再进行数组内字符串的拆分
        for (String s1:tmp1) {
            String[] tmp2 = s1.split("=");
            for (String s2:tmp2) {
                System.out.println(s2);
            }
        }
    }
    public static void main7(String[] args) {
        String str = "192\\168\\12\\2";
        String[] ret = str.split("\\\\");
        for (String s:ret) {
            System.out.println(s);
        }
    }
    public static void main6(String[] args) {
        // 1. 将字符串全部拆分 public String[] split(String regex)
        String str = "abc def ghi jkl";
//        String[] ret = str.split(""); // 将字符串全部拆分
        String[] ret = str.split(" "); // 按照空格拆分
        for (String s:ret) {
            System.out.println(s);
        }
        System.out.println("=============");

        // 2. 将字符串部分拆分, 该数组长度就是limit极限长度 public String[] split(String regex, int limit)
        String[] ret1 = str.split(" ", 2);
        for (String s:ret1) {
            System.out.println(s); // abc    def ghi jkl
        }
        System.out.println("==============");

        // 有的特殊的字符(比如: IP地址)在进行拆分的时候, 需要使用转移字符(需要考虑使用正则表达式)
        String id = "192.68.101.2";
        String[] ret2 = id.split("\\*"); // .$|()[{^?* : 如果使用这些字符进行拆分的话, 需要在其前面加上\\, 这也称作是正则表达式
        for (String s:ret2) {
            System.out.println(s);
        }
        System.out.println("===============");

        // 多次拆分: 如果一个字符串中有多个分割符, 可以用"|"作为连字符
        String tmp = "java-split#practice-hu"; // 将这个字符串进行多次拆分
        String[] ret3 = tmp.split(" |-|#");
        for (String s:ret3) {
            System.out.println(s);
        }
    }



    /**
     * 字符串查找
     * 1. 查找是否包含子串 contains
     * 2. 查找指定子串出现的位置 indexOf / 指定了子串和查找位置, 查找子串出现的位置 indexOf(String str, int fromIndex)
     * 3. 由后向前查找指定子串出现的位置 lastIndexOf  / 指定了要查找的子串和由后向前查找的位置, 查找子串出现的位置 lastIndexOf(String str, int fromIndex)
     * 4. 判断是否以指定字符串开头 startsWith / 从指定位置开始判断是否以指定的字符串开头 startsWith(String prefix, int tOffset)
     * 5. 判断是否以指定字符串结尾 endWith
     * @param args
     */
    public static void main5(String[] args) {
        // 1. 判断一个 子字符串 是否存在  public boolean contains(CharSequence s)
        String str = "abcdefg";
        boolean flg = str.contains("ello"); // 判断子字符串ello是否存在
        System.out.println(flg);

        // 2. 从头开始查找指定字符串的位置, 查到了返回位置的开始索引, 如果查不到返回-1
        // public int indexOf(String str)
        System.out.println(str.indexOf("ello"));

        // 3. 从指定位置开始查找子字符串的位置  public int indexOf(String str, int fromIndex)
        System.out.println(str.indexOf("def", 2)); // 3
        System.out.println(str.indexOf("def", 3)); // 3
        System.out.println(str.indexOf("def", 4)); // -1
        System.out.println("==============");

        // 4. 由后向前查找子字符串的位置 public int lastIndexOf(String str)
        System.out.println(str.lastIndexOf("cdef")); // 2
        System.out.println(str.lastIndexOf("a")); // 0
        System.out.println("===============");

        // 5. 从指定位置由后向前查找 public int lastIndexOf(String str, int fromIndex)
        System.out.println(str.lastIndexOf("def", 4)); // 3
        System.out.println(str.lastIndexOf("def", 2)); // -1
        System.out.println(str.lastIndexOf("cde", 4)); // 2
        System.out.println("==============");

        // 判断是否以指定字符串开头 public boolean startsWith(String prefix)
        System.out.println(str.startsWith("abc")); // true
        System.out.println(str.startsWith("acd")); // false
        System.out.println("==============");

        // 从指定位置开始判断是否以指定字符串开头 public boolean startsWith(String prefix, int tOffset)
        System.out.println(str.startsWith("def", 3)); // true
        System.out.println(str.startsWith("def", 2)); // false
        System.out.println(str.startsWith("def", 5)); // false
        System.out.println("==============");

        // 判断是否以指定字符串结尾 public boolean endWith(String suffix)
        System.out.println(str.endsWith("efg")); // true
        System.out.println(str.endsWith("g")); // true
        System.out.println(str.endsWith("acd")); // false
    }



    /**
     * 字符串的其他截取方法
     * 1. 去掉字符串左右两边的空格, 保留中间的空格 trim()
     * 2. 将字符串转大写: toUpperCase()
     * 3. 将字符串转小写: toLowerCase()
     * 4. 字符串入池操作: inter()
     * 5. 取字符串的长度: length()
     * 6. 判断字符串是否为空(要是长度为0, 而不是null): isEmpty()
     * @param args
     */
    public static void main4(String[] args) {
        // 1. 去掉字符串中的左右空格, 保留中间的空格
//        String str = "    aba   bcabcd      ";
//        String ret = str.trim();
//        System.out.println(ret);

        // 2. 字符串转大写 public String toUpperCase()
        String str = "AbcdEf";
        System.out.println(str.toUpperCase()); // ABCDEF

        // 3. 字符串转小写 public String toLowerCase()
        System.out.println(str.toLowerCase()); // abcdef

        // 4. 字符串入池操作 public native String intern()
//        String str1 = new String("AbcdEf");
        String str1 = new String("AbcdEf").intern(); // 字符串常量池中已经有"AbcdEf"了, 使用intern(), 可以直接将这个字符串的地址赋值给当前的引用
        System.out.println(str == str1); // true

        // 5. 取字符串的长度 public int length()
        System.out.println(str.length()); // 6

        // 6. 判断是否为空字符串(不是null), 而是长度需要为0 public boolean isEmpty()
        System.out.println(str.isEmpty()); // false
        String str2 = " ";
        String str3 = "";
        System.out.println(str2.isEmpty()); // false
        System.out.println(str3.isEmpty()); // true
        String str4 = null;
        System.out.println(str4.isEmpty()); // 会发生空指针异常
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
     * 字符串的替换
     * 1. 替换字符串中的一个字符为指定的字符: replace(char olsChar, char newChar)
     * 2. 替换字符串中的一个子串为指定的字符串
     *    使用接口作为参数进行替换: replace(CharSequence target, CharSequence replacement)
     *    不使用接口进行替换: replaceAll(String regex, String replacement)
     * 3. 替换首个内容为指定的内容: replaceFirst(String regex, String replacement)
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
     * 字符串的比较(比较的是字符串的内容)
     * 1. 字符串区分大小写的比较: equals
     * 2. 字符串不区分大小写的比较: equalsIgnoreCase
     * 3. 比较两个字符串的大小关系: compareTo(), 是按照字典顺序进行比较的
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
