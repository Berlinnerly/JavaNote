package com.Berlin.ģ�����ģʽ;

/**
 * @author Berlin
 * @Time 2020/11/13 13:12
 */

/*
    ģ�����ģʽ���Ƕ���һ���㷨�ĹǼܣ�����������㷨�ӳٵ���������ʵ��

    �ŵ㣺
        ʹ��ģ�����ģʽ���ڶ����㷨�Ǽܵ�ͬʱ�����Ժ�����ʵ�־�����㷨�������û�����������

    ȱ�㣺
        ����㷨�Ǽ����޸ĵĻ�������Ҫ�޸ĳ�����
 */
public class Template_ {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println("x");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        Demo d = new Demo();
        System.out.println(d.getTime());

    }
}

abstract class GetTime {
    public final long getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return end - start;
    }

    public abstract void code();
}

class Demo extends GetTime {
    @Override
    public void code() {
        int i = 0;
        while (i < 100000) {
            System.out.println("x");
            i++;
        }
    }
}
