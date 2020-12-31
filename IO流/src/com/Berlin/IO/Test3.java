package com.Berlin.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Berlin
 * @Time 2020/11/5 15:22
 */

/*
    录入数据拷贝到文件
    将键盘录入的数据拷贝到当前目录下的text.txt文件中，键盘录入数据当遇到quit时就退出

    分析：
        1.创建键盘录入对象
        2.创建输出流对象，关联text.txt文件；
        3.定义无限循环；
        4.遇到quit退出循环
        5.如果不quit，就将内容写出；
        6.关闭流
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据：");
        //2.创建输出流对象，关联text.txt文件；
        FileOutputStream fos = new FileOutputStream("text.txt");
        //3.定义无限循环；
        while (true) {
            String line = sc.nextLine();
            //4.遇到quit退出循环
            if ("quit".equals(line)) {
                break;
            }
            //5.如果不quit，就将内容写出；
            fos.write(line.getBytes());                 //字符串写出必须转换成字节数组；
            fos.write("\r\n".getBytes());
        }
        //6.关闭流
        fos.close();
    }
}
