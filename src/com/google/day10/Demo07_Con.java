package com.google.day10;

public class Demo07_Con {
    public static void main(String[] args) {
        Person2 p = new Person2();
        //p.Person();
    }
}

class Person2 {
    //public void Person() {						//不是构造方法,是一个普通方法
    public Person2() {
        System.out.println("Hello World!");
    }
}