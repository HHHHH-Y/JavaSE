import com.hy.demo.TestDemo3;
import com.hy.demo1.Animal;

/**
 * Created with IntelliJ IDEA.
 * Description:  不同包中的子类 访问父类的protected成员时, 需要使用super进行访问
 * User: HHH.Y
 * Date: 2020-04-28
 */
public class TestDemo extends Animal {

    public void func() {
        Animal animal = new Animal();
//        System.out.println(animal.name); // 对于name的访问方式不对
        System.out.println(super.name); // super是父类对象的引用, static不依赖于对象
    }
    public static void main(String[] args) {
        TestDemo3 testDemo3 = new TestDemo3();
//        System.out.println(testDemo3.b); // error 被default修饰的, 不能跨包访问
    }
}
