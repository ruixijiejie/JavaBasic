package com.google.basic;

public class Demo11_Operator {
    public static void main(String[] args) {
       /*
       * 单独使用
       *    放在操作数的前面和后面效果一样
       * 参与运算使用
       *    放在前面，先自增或自减，然后运算
       *    放在后面，先运算，再自增
       */

       int a = 3;
       int b;
       // b = a++;   // 当++在后面，先将变量中的值取出做赋值操作，在自增
        b = ++a;
       System.out.println("a = " + a);
       System.out.println("b = " + b);
    }
}
