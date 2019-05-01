package com.google.day11;

import java.util.Scanner;

public class Demo01_HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int aa = sc.nextInt();
        int num = aa;
        System.out.println(num);
        System.out.println("-----------");
        int[] arr = {32, 335, 6546, 32, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Demo04_Student s = new Demo04_Student("张三", 23);
        System.out.println(s.getName() + "..." + s.getAge());
    }

    private int num1 = 10;
    int num2 = 20;
    protected int num3 = 30;
    public int num4 = 40;

    private void method1() {
        System.out.println(num1);
    }

    void method2() {
        System.out.println(num1);
    }

    protected void method3() {
        System.out.println(num1);
    }

    public static void method4() {

    }

    public static final void method5() {

    }
}
