package demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 处理异常的方式
 * 最好的就是使用 try catch 来处理异常: 先操作, 遇到问题再进行处理
 *  try {
 *     可能出现异常的语句
 *  } catch (异常的类型 异常对象) {
 *      出现异常后的处理行为
 *  } finally {
 *      异常的出口
 *  }
 *
 * 使用 try catch 进行异常处理时, 需要注意:
 * 1. catch块中, 一定要捕获相应的异常. 如果程序抛出的异常不在 catch 块中, 就不能被捕获, 就会交给JVM处理
 * 2. 可以通过 catch 块来捕获多个异常
 * 3. 不建议直接捕获 Exception
 * 4. finally中的语句, 无论是否发生异常, 都会被执行
 * 5. 不建议在 finally 语句中出现 return 语句
 *
 *
 * 异常处理的流程:
 * 1. 程序先执行 try 中的代码
 * 2. 如果 try 中的代码出现异常, 就会结束 try 中的代码, 看和 catch 中的异常类型是否匹配.
 * 3. 如果找到匹配的异常类型, 就会执行 catch 中的代码
 * 4. 如果没有找到匹配的异常类型, 就会将异常向上传递到上层调用者.
 * 5. 无论是否找到匹配的异常类型, finally 中的代码都会被执行到(在该方法结束之前执行).
 * 6. 如果上层调用者也没有处理的了异常, 就继续向上传递.
 * 7. 一直到 main 方法也没有合适的代码处理异常, 就会交给 JVM 来进行处理, 此时程序就会异常终止
 *
 * User: HHH.Y
 * Date: 2020-05-11
 */
public class TestDemo1 {
    // 如果一直传递都没有找到合适的方法处理异常, 就会将这个异常交由JVM进行处理
    public static void func1() {
        // 在这个方法中, 没有处理这个异常
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }
    public static void main(String[] args) {
        // 在main方法中都没有处理这个异常
        func1();
        System.out.println("hello");
    }

    // 如果本方法中没有合适的处理异常的方式, 就会沿着调用栈向上传递
    public static void func() {
        // 在这个方法中, 没有处理这个异常
        int[] arr = {1, 2, 3};
        System.out.println(arr[100]);
    }
    public static void main6(String[] args) {
        try{
            func();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }


    // finally 经常用于完成善后工作, 常用于释放资源
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            System.out.println(10 / n);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }


    /**
     * 建议使用多个catch语句进行异常的捕获
     * @param args
     */
    public static void main4(String[] args) {
        // catch可以有多个
        int[] arr = {1, 2, 3};
        int a = 10;
        String str = null;
       /* try{
            System.out.println(arr[10]);
            int num = a / 0;
            System.out.println(str.isEmpty());
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
        System.out.println("捕获下标越界异常或者算术异常或者空指针异常");
            e.printStackTrace();
        }*/
        try{
            System.out.println(str.isEmpty());
            System.out.println(arr[10]);
            int num = a / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获下标越界异常");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("捕获算术异常");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("捕获空指针异常");
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    // catch只能处理对应种类的异常
    public static void main3(String[] args) {
        int[] arr = {1, 2, 3, 4};
        try{
            int a = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) { // 捕获的是数组下标越界异常, 而非算术异常
            e.printStackTrace();
        }
        System.out.println("hello");
    }


    /**
     * 使用 try catch 进行异常处理:
     * 当程序抛出异常的时候, 由catch块进行异常捕获, 程序自己来处理
     * 这样导致的结果是, 程序会继续向下执行
     * @param args
     */
    public static void main2(String[] args) {
        // 使用 try catch 处理异常
        int[] arr = {1, 2, 3};
        try{
            System.out.println("before");
            System.out.println(arr[100]);
            System.out.println("after");
        } catch (ArrayIndexOutOfBoundsException e) {
            // 打印出异常调用栈
            e.printStackTrace();
        }
        System.out.println("after try catch");
    }

    /**
     * 当出现异常, 并且并没有需异常进行处理时, 就会直接将异常情况交于JVM处理
     * 这样导致的结果就是, 程序会立即停止, 不会向下继续执行
     * @param args
     */
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[4]);
        System.out.println("hello");
    }
}
