package com.google.day4;

import java.util.Scanner;

public class Test9_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //创建键盘录入对象
        System.out.println("请录入一个整数,范围在1-9之间");
        int num = sc.nextInt();                        //将键盘录入的整数存储在num中
        print99(num);
    }

    /*
	打印99乘法表
	1,返回值类型void
	2,参数列表,int a
	*/

    public static void print99(int a) {
        for (int i = 1; i <= a; i++) {                    //行数
            for (int j = 1; j <= i; j++) {                //列数
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
