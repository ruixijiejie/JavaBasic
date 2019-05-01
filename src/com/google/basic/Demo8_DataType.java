package com.google.basic;

public class Demo8_DataType {
    public static void main(String[] args) {
        float f = 12.5f;
        long x = 12345;
        f = x;          // 隐式转换
        System.out.println(f);

        x = (long) f;
        System.out.println(x);   // 强制转换


        /*
        * float 占4个字节
        * 32个二进制位
        * 1位代表符号位
        * 8位代表指数位
        * 00000000 11111111
        * 0 - 255
        * 0代表0
        * 255代表无穷大
        * 1 - 254
        * 23位代表尾数位
        *
        * float的范围比long的范围大*/

    }
}
