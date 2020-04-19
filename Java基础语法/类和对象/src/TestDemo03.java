
/**
 * Created with IntelliJ IDEA.
 * Description: 构造方法
 * 构造方法可以通过 this()来调用
 * 注意:
 * 1. this()只能写在构造方法里面
 * 2. this()只能被调用一次
 * 3. this()只能写在构造方法的第一行
 * User: HHH.Y
 * Date: 2020-04-18
 */
class Book {
    private String name;
    private String id;
    // 构造方法
    // (无参的构造方法)
    public Book() {
        this("木偶奇遇记", "10697061418"); // 调用了有参的构造方法
        // this("爱丽丝仙境");  // error
        this.name = "鲁宾逊漂流记";
        this.id = "10697061419";
        System.out.println("name = " + name + ", " + "id = " + id);
    }
    // 有参的构造方法
    public Book(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("name = " + name + ", " + "id = " + id);
    }

    // 提供get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
public class TestDemo03 {

    public static void main2(String[] args) {
        Book book = new Book();
    }


    public static void main1(String[] args) {
        Book book = new Book();
        Book book1 = new Book("木偶奇遇记", "10697061418");
    }
}
