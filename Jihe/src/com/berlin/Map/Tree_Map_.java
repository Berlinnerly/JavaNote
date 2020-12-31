package com.berlin.Map;

import com.berlin.bean.Student;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author Berlin
 * @Time 2020/11/2 17:22
 */

/*
    TreeMap集合键是Student值是String案例
 */
public class Tree_Map_ {
    public static void main(String[] args) {
//        demo1();
        TreeMap<Student,String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getName().compareTo(s2.getName());     //按照姓名比较
                return num == 0 ? s1.getAge() - s2.getAge() : num;
            }
        });
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("李四",24),"上海");
        tm.put(new Student("王五",25),"广州");
        tm.put(new Student("赵六",26),"深圳");

        System.out.println(tm);


    }

    public static void demo1() {
        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("李四",24),"上海");
        tm.put(new Student("王五",25),"广州");
        tm.put(new Student("赵六",26),"深圳");

        System.out.println(tm);
    }
}
