/**
 * Created with IntelliJ IDEA.
 * Description: 代码块
 * User: HHH.Y
 * Date: 2020-04-19
 */
class Teacher {
    private String name;
    private int age;
    public static int count = 0;

    // 静态代码块
    static {
        System.out.println("静态代码块 ");
    }

    // 实例代码块
    {
        System.out.println("实例代码块");
    }

    // 构造方法
    public Teacher() {
        System.out.println("teacher");
    }
}

public class TestDemo04 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println("==================");
        Teacher teacher1 = new Teacher();
    }
}
