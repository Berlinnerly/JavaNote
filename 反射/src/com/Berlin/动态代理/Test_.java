package com.Berlin.��̬����;

import java.lang.reflect.Proxy;

/**
 * @author Berlin
 * @Time 2020/11/13 11:32
 */

/*
    ��̬����
        �ڳ������й����в�����������󣬶��������й����в���������ʵ���Ƿ��䣬���Զ�̬�������ͨ������������һ������

    ��Java��java.lang.reflect�����ṩ��һ��proxy���һ��InvocationHandler�ӿڣ�ͨ��ʹ�������ͽӿھͿ������ɶ�̬�������jdk�ṩ�Ĵ���ֻ����Խӿ�������
    �����и���ǿ��Ĵ���cglib, proxy���еķ���������̬�������
 */
public class Test_ {
    public static void main(String[] args) {
//        Userimp ui = new Userimp();
//        ui.add();
//        ui.delete();
//
//        System.out.println("--------------");
//
//        MyInvocationHandler m = new MyInvocationHandler(ui);
//        User u = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
//        u.add();
//        u.delete();

        StudentImp si = new StudentImp();
        si.login();
        si.submit();

        System.out.println("------------------------");

        MyInvocationHandler m = new MyInvocationHandler(si);
        Student u = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);

        si.login();
        si.submit();
    }
}
