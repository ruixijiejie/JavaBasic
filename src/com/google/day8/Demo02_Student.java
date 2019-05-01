package com.google.day8;

public class Demo02_Student {
    static {
        System.out.println("Demo2_Student静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");

        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
    }
}

class Student2 {
    static {
        System.out.println("Student 静态代码块");
    }

    {
        System.out.println("Student 构造代码块");
    }

    public Student2() {
        System.out.println("Student 构造方法");
    }
}
