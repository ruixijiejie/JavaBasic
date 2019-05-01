package com.google.basic;

public class Demo9_DataTypeConversion {
    public static void main(String[] args) {
        System.out.println('a' + 1);    // a对应的ASCII码表的97
        System.out.println((char) ('a' + 1));  // b
        System.out.println("hello" + 'a' + 1);   // 任何数据类型用+与字符串相连接都会产生新的字符串
        System.out.println('a' + 1 + "hello");
        System.out.println("5 + 5 = " + (5 + 5));
    }
}
