import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现顺序表代码
 * User: HHH.Y
 * Date: 2020-04-19
 */
public class MyArrayList {
    public int[] list; // 顺序表
    public int usedSize; // 有效数字的个数
    public static final int capacity = 10; // 设置一个初始容量

    // 初始化这个顺序表(也可以在定义属性的时候初始化)
    public MyArrayList() {
        this.list = new int[capacity]; // 初始化数组的容量为10
        this.usedSize = 0; // 初始化数组的有效数字个数为0
    }

    // 顺序表的各种功能

    // 只想提供给之后的方法使用, 而不想被外界访问, 因此设置成私有的
    // checkPos 是用来判断 有效数字位的pos是否合法
    private void checkPos(int pos) {
        if(pos < 0 || pos >= usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }

    private boolean isFull() {
        if(this.usedSize == this.list.length) {
            return true; // 顺序表已满
        }
        return false;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        // 1. 判断pos位置是否合法, 若不合法, 手动抛出一个异常
        // 2. 判断顺序表是否已满, 若满了的话, 需要进行扩容
        // 3. 进行元素的挪动
        // 4. 将新增的元素挪到 pos 位置处
        // 5. 有效数字的个数+1
        if(pos < 0 || pos > usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
        // 若顺序表满, 则扩容
        if(isFull()) {
            this.list = Arrays.copyOf(this.list,2*this.list.length);
        }
        for (int i = this.usedSize - 1; i >= pos ; i--) {
            this.list[i + 1] = this.list[i];
        }
        this.list[pos] = data;
        this.usedSize++; // 更新了usedSize
    }

    // 打印顺序表
    public void print() {
        // System.out.println(Arrays.toString(this.list));
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.list[i] + " ");
        }
        System.out.println();
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        // 遍历顺序表的有效数字, 查看是否有和 toFind 相同的元素
        for (int i = 0; i < this.usedSize; i++) {
            if(this.list[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        // 遍历一遍顺序表的有效数字, 若有需要查找的元素, 就返回它的下标
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public void isEmpty() {
        if(this.usedSize == 0) {
            // 若顺序表为空, 就抛出异常
            throw new RuntimeException("顺序表为空");
        }
    }
    // 获取 pos 位置的元素(也要判断顺序表是否为空)
    public int getPos(int pos) {
        // 1. 判断顺序表是否为空
        // 1. 判断pos位置是否合法
        // 2. 获取pos位置的元素
        this.isEmpty();
        this.checkPos(pos);
        return this.list[pos];
    }

    // 给 pos 位置的元素设为value
    public void setPos(int pos, int value) {
        // 1. 判断pos位置是否合法
        // 2. 给pos位置设置为value
        this.checkPos(pos);
        this.list[pos] = value;
    }

    // 删除第一次出现的关键字key
    public void remove(int key) {
        // 1. 判断顺序表是否为空(判断顺序表的有效数字个数是否为0), 若为空, 就不能进行删除
        // 2. 找到关键字key的下标, 并对下标进行判断, 如果下标不为-1的话, 才可以进行删除操作
        // 3. 通过挪动元素进行删除
        // 4. 有效数字的个数 - 1
        this.isEmpty();
        int index = this.search(key);
        if(index == -1) {
            System.out.println("没有要删除的数字");
            return;
        } else {
            for (int i = index; i < this.usedSize - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            this.usedSize--;
        }
    }

    // 获取顺序表的长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
