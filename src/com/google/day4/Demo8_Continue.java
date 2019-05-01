package com.google.day4;

/*
 * A:break的使用场景
 * 只能在switch和循环中
 */
public class Demo8_Continue {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x == 4) {
                //break;
                continue;                            //终止本次循环,继续下次循环
            }

            System.out.println("x = " + x);
        }
        System.out.println("----");
    }
}
