package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description: StringBuffer 和 StringBuilder
 * StringBuffer和 StringBuilder 的区别:
 * StringBuilder 和 String 一般都用于单线程情况
 * StringBuffer 一般用于多线程情况(线程安全)
 * User: HHH.Y
 * Date: 2020-05-10
 */

/**
 * 字符串类型为 String, 它一旦被声明了就不可改变, 即使改变对象的内容, 也只是改变了对象的指向
 * 为了方便字符串的修改, 引进了StringBuffer 和 StringBuilder
 */
public class TestDemo {
    /**
     * StringBuffer
     * append(), 用于进行字符串的拼接
     * 将StringBuffer 引用中的值 转换成为一个字符串, 需要使用toString()方法
     *
     * StringBUffer 里面具有 String 所不具备的一些方法, 比如说: 逆置(reverse)
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        System.out.println(sb.reverse()); // olleh
    }

    public static void main2(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" world");
        String str = sb.toString();
        System.out.println(str);

    }
    public static void main1(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append(" world");
        String ret = sb.toString(); // 将StringBuffer引用中的值赋值给一个字符串, 需要使用toString()方法
        System.out.println(ret);

    }
}
