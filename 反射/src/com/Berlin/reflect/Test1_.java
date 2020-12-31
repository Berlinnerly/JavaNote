package com.Berlin.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author Berlin
 * @Time 2020/11/13 11:04
 */

/*
    ArrayList<Integer>��һ��������������������һ���ַ�������

    ����ֻ�ڱ�������Ч���������ڻᱻ������
 */
public class Test1_ {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);

        Class clazz = Class.forName("java.util.ArrayList");         //��ȡ�ֽ������
        Method m = clazz.getMethod("add", Object.class);        //��ȡadd����
        m.invoke(list, "abc");

        System.out.println(list);
    }
}
