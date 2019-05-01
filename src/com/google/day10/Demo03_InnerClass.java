package com.google.day10;

public class Demo03_InnerClass {
    public static void main(String[] args) {
        Outer3.Inner oi = new Outer3.Inner();
        oi.method();

        Outer3.Inner2.print();
    }
}

class Outer3 {
    static class Inner {
        public void method() {
            System.out.println("method");
        }
    }

    static class Inner2 {
        public static void print() {
            System.out.println("print");
        }
    }
}