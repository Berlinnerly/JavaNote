package com.Berlin.reflect;

import com.Berlin.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Berlin
 * @Time 2020/11/13 10:53
 */

/*
    Class.getMethod(String, Class...)��Class.getDeclaredMethod(String, Class...)�������Ի�ȡ���е�ָ������������invoke(Object, Object...)���Ե��ø÷�����
    Class.getMethod("eat") invoke(obj)
    Class.getMethod("eat", int.class) invoke(obj,10)

 */
public class Method_ {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.Berlin.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);          //��ȡ�вι���
        Person p = (Person) c.newInstance("����",23);                     //ͨ���вι��촴������

        Method m = clazz.getMethod("eat");                                          //��ȡeat����
        m.invoke(p);

        Method m2 = clazz.getMethod("eat", int.class);                  //��ȡ�вε�eat����
        m2.invoke(p, 10);
    }
}
