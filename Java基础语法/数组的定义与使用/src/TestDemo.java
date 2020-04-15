import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
        // 自己实现一个数组转字符串的方法
        int[] arr = {1, 2, 3, 4, 5};
        // 转出来的字符串形式: [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println(func(arr));
    }
    public static String func(int[] a) {
        String ret = "[";
        for (int i = 0; i < a.length; i++) {
            ret += a[i];
            // 只要不是最后一个元素, 每一个元素后面都加上一个 ,
            if(i != a.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    /**
     * 将数组以字符串的形式输出
     * Arrays 把它叫做操作数组的工具类
     * @param args
     */
    public static void main5(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int x:arr) {
            System.out.print(x + " ");
        }
    }


    /**
     * 数组进行参数传递
     * @param args
     */
    public static void main4(String[] args) {
        // 交换两个数的值
        // 要想改变两个数的值, 传递的参数应该是引用类型的
        int[] array = {10, 20};
        System.out.println("array[0] = " + array[0] + ", " + "array[1] = " + array[1] );
        swap(array);
        System.out.println("array[0] = " + array[0] + ", " + "array[1] = " + array[1] );
    }
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }


    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 4};
        // 打印这个数组
        printArray(array); // 1 2 3 4
    }
    public static void printArray(int[] a)  {
        for (int val:a) {
            System.out.print(val + " ");
        }
    }



    public static void main2(String[] args) {
        // 通过for循环来遍历数组元素
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // 1 2 3 4
        }
        System.out.println();
        // 也可以通过foreach来对数组进行遍历
        // foreach对数组进行遍历
        // for( 数组元素的类型 : 数组名 )
        // foreach循环不涉及数组的下标
        for (int j:array) {
            System.out.print(j + " "); // 1 2 3 4
        }
    }


    /**
     * 数组的定义
     * @param args
     */
    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array1 = new int[] {11, 22, 33, 44};
        int[] array3 = new int[4]; // 定义了一个数组并分配了大小空间, 默认数组中为0
        array3[0] = 100;
        array3[1] = 200;
        System.out.println(array3[0]); // 100
        System.out.println(array3[1]); // 200
    }
}
