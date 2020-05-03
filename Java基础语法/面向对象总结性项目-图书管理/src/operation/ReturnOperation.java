package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:归还书籍
 * User: HHH.Y
 * Date: 2020-05-02
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字: ");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功!");
                return;
            } else {
                System.out.println("没有你要归还的图书");
            }
        }
    }
}
