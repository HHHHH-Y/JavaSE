/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HHH.Y
 * Date: 2020-04-27
 */
public class TesrDemo02 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();
//        System.out.println(myLinkedList.contains(4));
//        System.out.println(myLinkedList.size());
//        myLinkedList.addIndex(0, 9);
//        myLinkedList.display();
//        myLinkedList.addIndex(5, 19);
//        myLinkedList.display();
//        myLinkedList.addIndex(3,99);
//        myLinkedList.display();
//        myLinkedList.removeAllKey(4);
        myLinkedList.clear();
        myLinkedList.display();
    }
}
