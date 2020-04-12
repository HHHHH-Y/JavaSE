import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestDemo02 {
    /**
     * 递归: (把一个大的问题化解为小的问题, 因为大问题的处理方式和小问题的处理方式是一样的)
     * 1. 要调用自己本身
     * 2. 要有一个趋近于终止的条件
     * 3. 推导出递归的公式(重要)
     * @param args
     */
    public static int fabonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }
    public static int fabonacci1(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        // 求第n个斐波那契数
        // 采用递归的形式
        System.out.println(fabonacci(4));
        // 采用非递归的形式
        System.out.println(fabonacci1(4));
    }


    public static int func2(int n) {
        // 1729
        if(n < 10) {
            return n;
        }
        return (n % 10) + func2(n / 10);
    }

    public static void main4(String[] args) {
        System.out.println(func2(1729)); // 19
    }

    public static int sum (int n) {
        // 1 + 2 + 3 + 4 + 5 ==> 5 + 4 + 3 + 2 + 1
        if(n == 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main3(String[] args) {
        // 计算 1 + 2 + 3 + 4 + 5
        System.out.println(sum(5));
    }


    public static void func1(int n) {
        // 123
        if(n > 9) {
            func1(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main2(String[] args) {
        func1(123);
    }


    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
    public static void main1(String[] args) {
        // 求 n 的阶乘
        // n! = n * (n-1)!
        System.out.println(fac(4));
    }
}
