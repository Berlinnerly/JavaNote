package com.Berlin.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Berlin
 * @Time 2020/11/13 11:52
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Ȩ��У��");
        method.invoke(target, args);                //ִ�б�����target����ķ���
        System.out.println("��־��¼");
        return null;
    }
}
