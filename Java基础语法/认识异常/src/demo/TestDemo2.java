package demo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 抛出异常
 * throw: 一般情况下, 抛出一个你想抛出的异常
 * User: HHH.Y
 * Date: 2020-05-11
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 10) {
            throw new RuntimeException("n == 10");
        }
        System.out.println(n);
    }
}
