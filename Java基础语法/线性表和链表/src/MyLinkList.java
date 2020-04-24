/**
 * Created with IntelliJ IDEA.
 * Description: 单链表的创建和使用
 * User: HHH.Y
 * Date: 2020-04-21
 */
class Node {
    public int data; // 数据域
    public Node next; // 下一个节点的引用

    // 使用构造方法初始化属性
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkList {
    public Node head; // 保存单链表头节点的引用, 初始值默认为null

    // 头插法
    public void addFirst(int data) {
        // 1. 创建一个节点
        // 2. 若是第一次插入(head = null), 直接让head指向node, 插进去即可
        // 3. 若不是第一次插入, 将节点插入到head节点之前, 并改变节点的next域和单链表的head
        Node node = new Node(data); // node 表示的是该节点的引用(存放的该节点的地址)
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    // 打印单链表
    public void print() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 尾插法
    public void addLast(int data) {
        // 1. 创建一个节点
        // 2. 如果是第一次插入, 方法和第一次头插一样
        // 3. 如果不是第一次插入, 就在最后一个节点进行插入操作, 所以需要找到该链表的最后一个节点
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        // 这时, cur就为最后一个节点的引用
        cur.next = node;
    }

    // 查找单链表中是否包含关键字key
    public boolean contains (int key) {
        // 遍历单链表, 查看是否有和关键字key相同的节点, 若有, 就返回true, 没有, 就返回false
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 得到单链表的长度
    public int size() {
        Node cur = this.head;
        // 遍历单链表, 然后计数单链表总共有多少个节点, 有多少节点, 单链表就有多长
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    private Node previousIndex(int index) {
        // 1. 检查index的合法性
        // 2. cur 只需要走 index - 1 步就可以找到要插入位置的前驱
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        int count = index - 1;
        while(count != 0) {
            cur = cur.next;
            count--;
        }
        return cur;
    }
    // 任意位置插入, 规定第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        // 1. 若插在最前面, 就相当于是头插法
        // 2. 若插在最后面, 就相当于是尾插法
        // 3. 若往中间插入, 就要找到插入位置的上一个节点(重点), 然后进行插入(先连接后面的节点, 再连接前面的节点)
        Node node = new Node(data);
        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        Node cur = this.head;
        cur = previousIndex(index);
        node.next = cur.next;
        cur.next = node;
    }

    // 找到要删除的节点的前一个节点
    private Node searchPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            } else {
                prev = prev.next;
            }
        }
        return null;
    }
    // 删除第一次出现关键字为key的节点
    public void remove(int key) {
        // 1. 如果单链表为空, 就不能进行删除操作
        // 2. 如果要删除的关键字恰好在第一个节点, 直接挪动head即可
        // 3. 删除的关键字在第一个节点之后, 直接让前一个节点的next = 要删除节点的next
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if(prev == null) {
            System.out.println("根本没有这个节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    // 删除所有值为key的节点
    public void removeAllKey(int key) {
        // 定义两个引用, 一个用于寻找值为key的节点, 另一个在这个寻找节点之前, 用于删除key节点
        // 还需要判断一下头节点的值是否为key, 若是, 只需要挪动head即可
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    // 清空单链表
    public void clear() {
        this.head = null;
    }
}
