public class TestDemo01 {

    /**
     * 方法的重载(overload):
     * 1. 方法名相同
     * 2. 返回值类型不做要求
     * 3. 参数列表不同(参数的个数 / 参数的类型 不同)
     *    (1 和 3 必须同时满足才可以发生重载)
     *
     * 4. 同一个类当中
     * 面试题:
     *     重载和重写的区别是什么?
     * @param args
     */
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(add(a, b)); // 3
        double c = 3.14;
        double d = 5.12;
        System.out.println(add(c, d)); // 8.26
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double c, double d) {
        return c + d;
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a, b));

        double c = 19.9;
        double d = 18.8;
        System.out.println(sum(c, d));
    }



    public static void swap(int x, int y) {
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("a = " + a + " " + "b = " + b);
    }
}
