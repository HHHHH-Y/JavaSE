/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-21
 */
public class TestDemo01 {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(77);
        myLinkList.addFirst(66);
        myLinkList.addFirst(77);
        myLinkList.addFirst(77);
        myLinkList.addFirst(33);
        myLinkList.print();
        myLinkList.addFirst(77);
        myLinkList.print();
//        System.out.println("=============");
//        System.out.println("=============");
//        System.out.println(myLinkList.contains(77));
//        System.out.println(myLinkList.contains(10));
//        System.out.println("=============");
//        System.out.println(myLinkList.size());
//        System.out.println("=============");
//        myLinkList.addIndex(3, 11);
//        myLinkList.print();
        System.out.println("=============");
//        myLinkList.remove(77);
//        myLinkList.print();
//        System.out.println("=============");
//        myLinkList.removeAllKey(44);
//        myLinkList.removeAllKey(66);
        myLinkList.removeAllKey(77);
        myLinkList.print();
//        myLinkList.clear();
//        myLinkList.print();
    }
}
