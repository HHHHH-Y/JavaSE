package demo;

/**
 * Created with IntelliJ IDEA.
 * Description: 异常说明
 * 在进行异常处理的时候, 通常会想知道会出现哪些异常的情况
 * 可以通过 throw, 来显示的将异常标注在方法的位置上
 *
 *
 * 如果一段代码出现了受查异常, 那么一定要显示的进行处理
 * User: HHH.Y
 * Date: 2020-05-11
 */
// 如果程序出现了受查异常
class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Person person = new Person();
        // 由于程序出现了受查异常, 所以一定要显示的处理这个异常
        // 使用 Alt + Enter
        try {
            Person person1 = (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    // 声明一个异常, 使得调用者可以知道这个异常, 从而在调用的时候可以更好的捕获异常
    public static int divide(int x, int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("除数为0");
        }
        return x / y;
    }
    public static void main1(String[] args) {
        int ret = 0;
        try{
            ret = divide(10, 2);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
        System.out.println(ret);
    }
}
