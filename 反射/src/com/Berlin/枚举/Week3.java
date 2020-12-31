package com.Berlin.ö��;

/**
 * @author Berlin
 * @Time 2020/11/13 13:34
 */
abstract public class Week3 {
    public static final Week3 MON = new Week3("����һ") {
        public void show() {
            System.out.println("����һ");
        }
    };

    public static final Week3 TUE = new Week3("���ڶ�") {
        public void show() {
            System.out.println("���ڶ�");
        }
    };

    public static final Week3 WeD = new Week3("������") {
        public void show() {
            System.out.println("������");
        }
    };

    private String name;
    private Week3(String name) {             //˽�й��죬���������ഴ���������
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
