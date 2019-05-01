package com.google.basic;

public class Demo10_Operator {
    public static void main(String[] args) {
        /*
        * +号在Java中的作用，代表正号  做加法运算 字符串的连接
        * b整数相除只能得到整数，如果想得到小数，必须把数据变为浮点数据类型
        * c:/获取的除法操作的商，%获取的除法操作的余数
        * %运算符
        * 当左边的绝对值小于右边的绝对值时，结果是左边
        * 当左边的绝对值等于右边或右边的倍数时，结果是0
        * 当左边的绝对值大于右边的绝对值时，结果是余数
        * %运算符结果的符号只和左边有关，与右边无关
        * 任何一个正整数%2结果不是0就是1，可以用来做切换条件
        * */

        System.out.println(10 / 3);
        System.out.println(10 / 3.0);  // 如果想得到小数，把其中一个数变为小数，另一个在运算的时候会数据类型提升
        System.out.println(9 % 2);
        System.out.println(-5 % -5);
    }
}
