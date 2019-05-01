package com.google.basic;

public class Demo5_DataType {
    public static void main(String[] args) {
        /*
         * a:作用域问题
         *   同一个区域不能使用相同的变量名
         * b:初始化问题
         *   局部变量在使用之前必须赋值
         * c:一条语句可以定义几个变量
         *   int a, b, c ...*/

        int x = 20;
        // int x = 30;
        System.out.println(x);

        int y;
        y = 10;
        System.out.println(y);

        int a = 10, b = 20, c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
