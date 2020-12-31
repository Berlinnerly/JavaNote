package com.Berlin.chario;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/6 9:26
 */

/*
    带缓冲区的流中的特殊方法：
    readLine();
    newLine();

    newLine()与\r\n的区别：
        newLine()是跨平台的方法；
        \r\n只支持Windows系统
 */
public class Buffered_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();               //写出回车换行符；
        }

        br.close();
        bw.close();
    }

    private static void demo1() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
