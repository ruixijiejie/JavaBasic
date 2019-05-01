package com.google.day7;

public class Demo06_Student {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.show();
    }
}
class Student2 {
    private String name = "张三";
    private int age = 23;

    public Student2() {
        name = "李四";
        age = 24;
    }

    public void show() {
        System.out.println(name + "..." + age);
    }
}