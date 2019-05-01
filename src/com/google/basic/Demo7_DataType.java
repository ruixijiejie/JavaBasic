package com.google.basic;

public class Demo7_DataType {
    public static void main(String[] args) {
       /* byte b1 = 3;
        byte b2 = 4;
        byte b3 = b1 + b2;
        System.out.println(b3);
        */

        /*
        * 从两方面
        * 1.byte与byte(或short，char)进行运算的时候会提升为int类型,相加也是int类型
        * 2.b1和b2是两个变量，变量存贮的值是变化的，在编译的时候无法判断里面具体的值，相加也有可能超出byte的取值
        */

        byte b4 = 3 + 4;  // Java编译器有常量优化机制
        System.out.println(b4);
    }
}
