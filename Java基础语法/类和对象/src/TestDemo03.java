
/**
 * Created with IntelliJ IDEA.
 * Description: 构造方法
 * User: HHH.Y
 * Date: 2020-04-18
 */
class Book {
    private String name;
    private int age;

    public Book() {
        System.out.println("book");
    }
}
public class TestDemo03 {
    public static void main(String[] args) {
        Book book = new Book();
    }
}
