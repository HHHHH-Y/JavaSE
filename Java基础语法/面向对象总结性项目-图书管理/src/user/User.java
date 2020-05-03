package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-02
 */
public abstract class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    // menu 是一个不具体实现的类
    public abstract int menu();

    public void doOperation(BookList bookList,int choice) {
        // 根据你的选择, 去 operations 数组中去寻找
        this.operations[choice].work(bookList);
    }
}
