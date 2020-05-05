package com.hy.demo3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 接口的实例
 * 一般情况下, 自定义类型进行比较 需要是 可比较的
 *  Comparable 和  Comparator 是有区别的!!!!
 *
 *  自定义类型想要进行比较, 必须实现comparable 或 comparator 的接口
 *  比较是 从大到小的比较 还是 从小到大的比较 需要重写comparaTo 方法的, 自己定义比较的顺序
 * User: HHH.Y
 * Date: 2020-04-30
 */
// < >: <>中代表的是泛型. 但在这里, <>中的东西代表的是你要比较的是什么类
class Student implements Comparable <Student>{
    public String name;
    public int age;
    public int score;
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.score > o.score) {
            return 1;
        } else if(this.score == o.score) {
            return 0;
        } else {
            return -1;
        }
        //return 0;
    }
}

public class TestDemo {
    public static void main3(String[] args) {
        Student student = new Student("张三", 20,77);
        Student student1 = new Student("李四",19,70);
        Student student2 = new Student("爱尔兰",18,99);
        if(student.compareTo(student1) > 0) {
            System.out.println("student的年龄 > student1");
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student("张三",20,77),
                new Student("李四",19,70), new Student("爱尔兰",18,99)};
        // 自定义类型在某种意义上是不能进行排序的, 因为编译器根本无法知道要比较什么
        // 默认是从小到大排序
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }


    public static void main1(String[] args) {
        int[] array = {21, 64, 35, 16, 29};
        Arrays.sort(array); // 将数组进行排序
        System.out.println(Arrays.toString(array));
    }
}
