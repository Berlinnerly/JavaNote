package com.Berlin.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

/**
 * @author Berlin
 * @Time 2020/11/13 11:20
 */

/*
    ��֪һ���࣬�������£�
        package cn.itcast.heima;
            public class DemoClass {
                public void run() {
                System.out.println("welcome to heima!");
            }
        }
    1.дһ��properties��ʽ�������ļ�����������������ƣ�
    2.дһ�����򣬶�ȡ��������ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������

 */
public class Test3_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
        Class clazz = Class.forName(br.readLine());

        DemoClass dc = (DemoClass) clazz.newInstance();                 //ͨ���ֽ�����󴴽�����
        dc.run();
    }
}
