package com.Berlin.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/5 10:42
 */

/*
    第三种拷贝
    定义小数组
 */
public class Array_Copy_ {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        FileInputStream fis = new FileInputStream("20180403 二珂 老公天下第一.mp3");
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        byte[] arr = new byte[1024 * 8];
        int len;
        while ((len = fis.read(arr)) != -1) {                   //如果忘记加arr返回的就不是读取的字节个数，而是字节的码表值
            fos.write(arr, 0, len);
        }
        fis.close();
        fos.close();


    }

    private static void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");               //创建输入流对象
        FileOutputStream fos = new FileOutputStream("yyy.txt");             //创建输出流对象
        byte[] arr = new byte[2];
        int len;
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);
        }
        fis.close();
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        byte[] arr = new byte[2];
        int a = fis.read(arr);                                      //将文件上的字节读取到字节数组中

        System.out.println(a);                                      //读到的有效字节个数
        for (byte b : arr) {                                        //第一次获取到文件上的a和b;
            System.out.println(b);
        }

        System.out.println("------------------------------------------");

        int c = fis.read(arr);
        System.out.println(c);
        for (byte b : arr) {
            System.out.println(b);
        }
        fis.close();
    }
}
