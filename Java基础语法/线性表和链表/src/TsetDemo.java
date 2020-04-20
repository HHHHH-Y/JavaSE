/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-19
 */
public class TsetDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList.add(i,i);
        }
        myArrayList.print();
        myArrayList.add(10,112);
//        myArrayList.add(15, 88);
        myArrayList.print();
        myArrayList.print();
        System.out.println("==============");
        System.out.println(myArrayList.contains(112));
        System.out.println(myArrayList.contains(10));
        System.out.println("==============");
        System.out.println(myArrayList.search(5));
        System.out.println(myArrayList.search(112));
        System.out.println(myArrayList.search(10));
        System.out.println("==============");
        System.out.println(myArrayList.getPos(10));
        System.out.println(myArrayList.getPos(2));
        System.out.println(myArrayList.getPos(5));
//        System.out.println(myArrayList.getPos(15));
        System.out.println("===============");
        myArrayList.setPos(5,20);
        myArrayList.print();
        System.out.println("===============");
//        myArrayList.remove(0);
        myArrayList.remove(112);
        myArrayList.remove(20);
//        myArrayList.remove(10);
        myArrayList.print();
        System.out.println("================");
        System.out.println(myArrayList.size());
        System.out.println("================");
        myArrayList.clear();
        myArrayList.print();
    }
}
