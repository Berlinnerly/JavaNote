package com.Berlin.reflect;

import java.lang.reflect.Field;

/**
 * @author Berlin
 * @Time 2020/11/13 11:13
 */
public class Tool {
    //�˷����ɽ�obj��������ΪpropertyName������ֵ����Ϊvalue
    public void setProperty(Object obj, String propertyName, Object value) throws Exception {
        Class clazz = obj.getClass();                           //��ȡ�ֽ������
        Field f = clazz.getDeclaredField(propertyName);         //���������ȡ�ֶ�
        f.setAccessible(true);                                      //ȥ��Ȩ��
        f.set(obj, value);
    }
}
