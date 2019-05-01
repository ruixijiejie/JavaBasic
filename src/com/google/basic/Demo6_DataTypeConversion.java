package com.google.basic;

public class Demo6_DataTypeConversion {
    public static void main(String[] args) {
        // 数据类型之隐是转换
      /*  int x = 3;
        byte b = 4;
        x = x + b;
        System.out.println(x);*/

        // 低到高，提升数据类型


        // 数据类型之强制转换
       /* int x = 3;
        byte b = 4;
        b = (byte) (x + b);
        System.out.println(b);*/

        // 00000000 00000000 00000000 10000010   130的二进制
        // 100000010                             -126的补码
        // 000000001                             -1求反码
        // 100000001                             -126的反码
        // 111111110                             -126的原码
        byte b = (byte) (126 + 4);
        System.out.println(b);

        // 00000000 00000000 00000000 00101100    300的二进制
        // 00101100
        byte b2 = (byte) 300;
        System.out.println(b2);
    }
}
