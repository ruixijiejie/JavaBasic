package com.google.day11;

public class Demo07_GetClass {
    public static void main(String[] args) {
        Student s = new Student("张三", 23);
        // Class clazz = new Class();

        Class clazz = s.getClass();
        String name = clazz.getName();
        System.out.println(name);
    }
}
