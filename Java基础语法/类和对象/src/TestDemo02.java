/**
 * Created with IntelliJ IDEA.
 * Description:
 * 封装: 用 private 来修饰属性或者方法
 *
 * 关键字:
 *       this: 当前对象的  引用  (this写在哪个类, 就代表哪个类的对象的引用)
 *       要习惯使用this
 * User: HHH.Y
 * Date: 2020-04-17
 */
// 建议: 以后在设计类的时候, 如果无特殊要求, 那么属性全部设置成私有的(private)
class Student {
    // 将成员变量用private封装之后, 成员变量就只可以在当前类中使用
    private String name;
    private int age;

    // alt + insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 封装了之后就对外界提供两个公开的接口
  /*  public String getName() {
        return this.name;
    }
    public void setName(String MyName) {
       MyName = MyName; // 在这个代码块中, 其实就是参数自己给自己赋值, 并没有给成员变量赋值 (局部变量优先)
        this.name = MyName;
    }
*/

    public void func1() {
        System.out.println("func1");
    }
    public void func2() {
        System.out.println("func2");
    }
    public void show() {
        System.out.println("我叫" + this.name + ", 今年" + this.age + "岁");
    }

    // 重写   实现了一下Object类的 toString() 方法
    // alt + insert -> toString()
    @Override // 注解: 这个注解指的是 这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
// 以上是类的类的开发者写的
// 以下是类的调用者写的
public class TestDemo02 {
    public static void main(String[] args) {
        Student student = new Student();
        /*student.setName("kris");
        System.out.println(student.getName());*/
        System.out.println(student);
    }
}
