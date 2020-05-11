package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 自定义异常类
 * 注意: 一定要先继承一个父类的异常
 * User: HHH.Y
 * Date: 2020-05-11
 */
// 1. 一定要继承一个父类异常
class MyException extends RuntimeException {
   public MyException() {
       super();
   }
   public MyException(String message) {
       super(message);
   }
}

public class TestDemo4 {
    public static void func(int x) throws MyException{
        if(x == 0) {
            throw new MyException("x==0");
        }
    }
    public static void main(String[] args) {
        try{
            func(0);
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
