package com.google.day11;

public class Demo02_method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println(sum);
    }


    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
