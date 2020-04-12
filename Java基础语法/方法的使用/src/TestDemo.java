import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;


public class TestDemo {
    public static int factor(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
           /* int ret = 1;
            for (int j = 1; j <= i ; j++) {
                ret *= j;
            }*/
            sum += fac(i);
        }
        return sum;
    }
    public static int fac(int num) {
        int ret = 1;
        for (int i = 1; i <= num ; i++) {
            ret *= i;
        }
        return ret;
    }

    /**
     * return 代表函数的结束, 它下面的代码将不会被执行
     * 一个方法可以被调用多次
     */
    public static void main(String[] args) {
        // 计算 1! + 2! + 3! + 4! + 5!
        System.out.println(factor(5));
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        int ret = sum(a, b);
        System.out.println(ret);
        int ret1 = sum(20, 80);
        System.out.println(ret1);
    }


    /**
     * java 的方法对应的就是 C语言当中的函数
     * 方法: 功能
     * public static 返回值  方法名 (形式参数列表) {
     *     方法体;
     * }
     *方法名: 要采用小驼峰的形式. maxNum
     * public static: 因为当前所有的方法在写完之后会在 main 方法中调用
     * 因为 main 方法是 public static 的
     *
     *返回值: 可有可无, 具体看业务需求. 如果有返回值, 那么返回值的类型需要和方法的返回值类型匹配
     *
     * 形式参数列表: 形参 --> 实参的一份拷贝
     *
     * 方法体: 就是具体方法的实现
     * @param args
     */
    public static int maxNum(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static void main4(String[] args) {
        // 求两个数的最大值
        Scanner scanner = new Scanner(System.in);
       /* int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ret = maxNum(n1, n2);
        System.out.println(ret);*/

        // 求 3 个数的最大值
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        // 函数的重复调用
        System.out.println(maxNum(maxNum(n1, n2), n3));
    }


    public static void main3(String[] args) {
        // 求一个数字的二进制位的奇数和偶数, 并打印
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 1 ; i -= 2) {
            System.out.print(((n >> i) & 1)); // 奇数
        }
        System.out.println();
        for (int i = 30; i >= 0 ; i -= 2) {
            System.out.print(((n >> i) & 1)); // 偶数
        }
    }


    /**
     * idea调试
     * 1. 打断点: 让代码走到这一步停下来
     * 2. 开始调试: 点击甲壳虫
     * @param args
     */
    public static void main2(String[] args) {
        // 2. 让该值和该值-1的数进行与运算(最佳)
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while(num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println(count);
    }


    public static void main1(String[] args) {
        // 求二进制中 1 的个数
        // 1. 判断二进制中1的个数-->判断每一位上是不是1  让当前数字和 1 进行与操作
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}
