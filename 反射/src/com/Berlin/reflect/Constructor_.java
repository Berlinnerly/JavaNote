package com.Berlin.reflect;

import com.Berlin.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Berlin
 * @Time 2020/11/13 10:13
 */

/*
    Class���newInstance()������ʹ�ø����޲εĹ��캯������������һ����û���޲εĹ��캯�����Ͳ������������ˣ����Ե���Class��getConstructor
    (String.class, int.class)������ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���new Instance()������������
 */
public class Constructor_ {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.Berlin.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);          //��ȡ�вι���
        Person p = (Person) c.newInstance("����",23);                     //ͨ���вι��촴������

//        Field f = clazz.getField("name");                                     //��ȡ�����ֶ�
//        f.set(p, "����");                                                       //�޸�������ֵ
        Field f = clazz.getDeclaredField("name");                       //���������ȡ�ֶ�
        f.setAccessible(true);                                                  //ȥ��˽��Ȩ��
        f.set(p, "����");

        System.out.println(p);
    }
}
