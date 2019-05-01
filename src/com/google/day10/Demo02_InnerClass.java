package com.google.day10;

public class Demo02_InnerClass {
    public static void main(String[] args) {
        //Outer2.Inner2 oi = new Outer2().new Inner2();
        //oi.method();

        Outer2 o = new Outer2();
        o.print();
    }
}

class Outer2 {
    private int num = 10;
    private class Inner2 {
        public void method() {
            System.out.println(num);
        }
    }

    public void print() {
        Inner2 i = new Inner2();
        i.method();
    }
}