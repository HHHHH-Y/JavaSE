import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 二维数组
 * User: HHH.Y
 * Date: 2020-04-17
 */
public class TestDemo {
    /**
     * 不规则的二维数组
     * 注意: C语言中是 必须指定列, 行可以自动推导
     *       Java当中是 必须指定行, 列不可以自动推导
     * 打印不规则二维数组的时候, 应该给二维数组的元素重新指定长度
     * 若不指定长度, 就会发生空指针异常
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][]; // 一定要指定行, 但是列不可以自动推导
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{4, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }



    /**
     *规则的二维数组:
     * 打印方式:
     * 1. for循环
     * 2. 调用Arrays的方法(deepToString())
     * 3. foreach循环
     * @param args
     */
    public static void main3(String[] args) {
        // 1. for循环遍历二维数组并进行打印
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // 2. 直接调用Arrays的方法
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        // 3. 使用foreach对二维数组进行打印
        for (int[] ret : arr) {
            for (int x : ret) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public static void main2(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = {{1, 2, 3,}, {4, 5, 6}};
        int[][] array2 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        int[][] array3 = new int[2][3];
    }
}
