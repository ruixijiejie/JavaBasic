package com.google.day10;

public class Demo04_InnerClass {
    public static void main(String[] args) {
        Outer5 o = new Outer5();
        o.method();
    }
}

//局部内部类
class Outer5 {
    public void method() {
        final int num = 10;
        class Inner {
            public void print() {
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.print();
    }

	/*public void run() {
		Inner i = new Inner();				//局部内部类,只能在其所在的方法中访问
		i.print();
	}*/
}