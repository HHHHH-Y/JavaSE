package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-05-11
 */
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class Test {
    private static String userName = "admin";
    private static String password = "123456";
    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }

    public static void login(String userName, String password) throws UserException, PasswordException {
        if (!Test.userName.equals(userName)) {
            // TODO 处理用户名错误
            throw new UserException("用户名错误");
        }
        if (!Test.password.equals(password)) {
            // TODO 处理密码错误
            throw new PasswordException("登录密码错误");
        }
        System.out.println("登陆成功");
    }
}
