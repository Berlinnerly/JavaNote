package com.Berlin.ö��;

/**
 * @author Berlin
 * @Time 2020/11/13 13:34
 */
public class Week2 {
    public static final Week2 MON = new Week2("����һ");
    public static final Week2 TUE = new Week2("���ڶ�");
    public static final Week2 WED = new Week2("������");

    private String name;
    private Week2(String name) {             //˽�й��죬���������ഴ���������
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
