/**
 * Created with IntelliJ IDEA.
 * Description:匿名对象
 *  匿名对象: 没有引用类型的对象
 *  只能在创建对象的时候使用, 并且只能使用一次
 * User: HHH.Y
 * Date: 2020-04-19
 */
class Animal {
    private String name = "晶晶";
    private String sex = "母";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
public class TestDemo05 {
    public static void main(String[] args) {
        // 匿名对象
        System.out.println(new Animal().getName());
        System.out.println(new Animal().getSex());
    }
}
