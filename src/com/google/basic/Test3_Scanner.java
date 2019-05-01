package com.google.basic;

import java.util.Scanner;

public class Test3_Scanner {
    /*
     * A:案例演示
     * 键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
     * B:案例演示
     * 键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //创建键盘录入对象

        //键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
		/*System.out.println("请输入第一个整数:");
		int x = sc.nextInt();					//将键盘录入的数据存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();					//将键盘录入的数据存储在y中
		int sum = x + y;
		System.out.println(sum);*/

        //键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
        System.out.println("请输入第一个整数:");
        int x = sc.nextInt();                        //将键盘录入的数据存储在x中
        System.out.println("请输入第二个整数:");
        int y = sc.nextInt();                        //将键盘录入的数据存储在y中
        System.out.println("请输入第三个整数:");
        int z = sc.nextInt();                        //将键盘录入的数据存储在y中

        //定义临时变量记录住比较出前两个变量中的最大值
        int temp = (x > y) ? x : y;
        //将比较后的结果与第三个变量中的值比较,比较出三个数中的最大值
        int max = (temp > z) ? temp : z;
        System.out.println("max = " + max);
    }
}
