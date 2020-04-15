public class TestDemo02 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 3, 1};
        findAppearOnce(array);
    }
    public static void findAppearOnce(int[] arr) {
        // 1. 先找出这两个数字异或的值
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        // 2. 异或结果的二进制中, 从右向左, 找出第一个1所在的位置
        //    用count来表示右移的次数, count+1就是第一个1所在的位置
        int count = 0;
        for(int j = 0; j < 32; j++) {
            if(((ret >> j) & 1) == 1) {
                count += j; //
                break;
            }
        }
        // 3. 找出了异或结果中第一个1的位置
        //    找出数组中在这个位置上是1的所有元素并将他们异或
        //    这样就得到了第一个只出现一次的值
        int ret1 = 0;
        for (int x = 0; x < arr.length; x++) {
            if((arr[x]>>count & 1) == 1) {
                ret1 ^= arr[x];
            }
        }
        System.out.println(ret1);
        // 4. 剩余的元素在该位置上的二进制数都不为1
        //    将这些剩下的数异或, 就得到了第二个只出现一次的值
        int ret2 = 0;
        for (int y = 0; y < arr.length; y++) {
            if((arr[y]>>count & 1) == 0) {
                ret2 ^= arr[y];
            }
        }
        System.out.println(ret2);
    }


    /**
     * 一个数组中只有一个数字出现一次, 其他数字都出现了两次, 找出这个数字
     * @param args
     */
    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        findOwnNum1(array);
    }
    public static void findOwnNum1(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i]; // ret = ret ^ arr[i]
        }
        System.out.println(ret);
    }


    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        findOwnNum(array);
    }
    public static void findOwnNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int j = 0;
            for (j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
                if(count == 2) {
                    break;
                }
            }
            if(j == arr.length) {
                System.out.println(arr[i] + ", 下标是: " + i);
            }
        }
    }
}
