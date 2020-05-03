package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description: 退出系统
 * User: HHH.Y
 * Date: 2020-05-02
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1); // 代表正常退出
    }
}
