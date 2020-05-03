import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-02
 */
public class TestMain {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名: ");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份: 1 -> 管理员, 2 -> 普通用户");
        int choice = scanner.nextInt();

        // 使用了向上转型
        if(choice == 1) {
            return new Admin(name);
        } else {
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        //1. 准备书籍
        BookList bookList = new BookList();
        //2. 登录
        User user = login();
        while(true) {
            int choice = user.menu(); // 发生了多态
            //3. 选择是几, 就可以对应是哪个方法了
            user.doOperation(bookList, choice);
        }

    }
}
