package com.google.day10;

public class Test03_NoNameInnerClass {
    public static void main(String[] args) {
        //Outer.method().show();			//链式编程,每次调用方法后还能继续调用方法,证明调用方法返回的是对象
        Inter3 i = Outer8.method();
        i.show();
    }
}

//按照要求，补齐代码
interface Inter3 {
    void show();
}

class Outer8 {
    //补齐代码
    public static Inter3 method() {
        return new Inter3() {
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
}

//要求在控制台输出”HelloWorld”