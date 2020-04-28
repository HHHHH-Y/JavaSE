/**
 * Created with IntelliJ IDEA.
 * Description: 无头双向链表的实现
 * User: HHH.Y
 * Date: 2020-04-27
 */
class LNode {
    public int data;
    public LNode next; // 默认为null
    public LNode pre; // 默认为null
    // 构造方法初始化
    public LNode(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public LNode head;
    public LNode end;

    // 头插法
    public void addFirst(int data) {
        LNode node = new LNode(data);
        // 1. 第一次插入节点, 该节点 既是头也是尾
        if(this.head == null) {
            this.head = node;
            this.end = node;
            return;
        }
        // 2. 不是第一次插入
        this.head.pre = node;
        node.next = this.head;
        this.head = node;
    }

    // 打印
    public void display() {
        // 遍历一遍双向链表, 每遍历一个节点, 就打印一次, 直到所有节点都遍历完
        LNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // 尾插法
    public void addLast(int data) {
        LNode node = new LNode(data);
        // 1. 第一次插入节点, 该节点 既是头也是尾
        if(this.head == null) {
            this.head = node;
            this.end = node;
            return;
        }
        // 2. 不是第一次插入
        this.end.next = node;
        node.pre = this.end;
        this.end = node;
    }

    // 在链表中查看是否包含关键字key
    public boolean contains(int key) {
        // 查看每个节点, 若有, 就返回true. 若所有节点都查看完毕之后还没有, 就返回false
        LNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // 计算双向链表的长度
    public int size() {
       LNode cur = this.head;
       int count = 0;
       while (cur != null) {
           count++;
           cur = cur.next;
       }
       return count;
    }

    // 判断index位置是否合法
    private void judgeIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }
    }
    // 找到要插入的位置
    private LNode searchIndex(int index) {
        LNode cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    // 任意位置插入, 第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        // 1. 判断index位置是否合法
        judgeIndex(index);
        // 2. 如果插到0号位置, 就相当于是头插法
        if(index == 0) {
            addFirst(data);
            return;
        }
        // 3. 如果插到最后, 相当于是尾插法
        if(index == size()) {
            addLast(data);
            return;
        }
        // 4. 如果插到中间, 先绑后面, 再绑前面
        LNode cur = searchIndex(index);
        LNode node = new LNode(data);
        node.next = cur;
        cur.pre.next = node;
        node.pre = cur.pre;
        cur.pre = node;
    }

    // 删除第一次出现关键字为key的节点
    // 如果找到了要删除的关键字key, 就返回key节点
    public int remove(int key) {
        LNode cur = this.head;
        while(cur != null) {
            int oldNum = cur.data;
            // 如果cur的值等于key的值
            if(cur.data == key) {
                // 1. 如果key节点恰好在头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.pre = null;
                } else {
                    cur.pre.next = cur.next;
                    if(cur.next != null) {
                        // 2. 如果key节点是中间节点
                        cur.next.pre = cur.pre;
                    } else {
                        // 3. 如果key节点是尾节点
                        end= cur.pre;
                    }
                }
                return oldNum;
            }
            cur = cur.next;
        }
        return -1;
    }

    // 删除所有值为key的节点
    public void removeAllKey(int key) {
        LNode cur = this.head;
        while(cur != null) {
            // 如果cur的值等于key的值
            if(cur.data == key) {
                // 1. 如果key节点恰好在头节点
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.pre = null;
                    }
                } else {
                    cur.pre.next = cur.next;
                    if(cur.next != null) {
                        // 2. 如果key节点是中间节点
                        cur.next.pre = cur.pre;
                    } else {
                        // 3. 如果key节点是尾节点
                        end= cur.pre;
                    }
                }
            }
            cur = cur.next;
        }
    }

    // 清空双向链表
    public void clear() {
       while (this.head != null) {
           LNode cur = this.head.next;
           this.head.pre = null;
           this.head.next = null;
           this.head = cur;
       }
       this.end = null;
    }
}
