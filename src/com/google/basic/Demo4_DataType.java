package com.google.basic;

public class Demo4_DataType {
    public static void main(String[] args) {
        // 整数类型
        byte b = 10;    // 占一个字节，-128~127
        short s = 20;   // 占2个字节
        int i = 30;     // 占4个字节
        long x = 88888888888888L;    // 占8个字节
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(x);
        System.out.println(12345 + 54321L);

        // 浮点类型
        float f = 12.3F;     // 占4个字节
        double d = 33.4;     // 占8个字符   // 小数默认的数据类型是double类型
        System.out.println(f);
        System.out.println(d);

        // 字符类型
        char c = 'a';   // 占两个字符
        System.out.println(c);

        // 布尔类型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
    }
}
