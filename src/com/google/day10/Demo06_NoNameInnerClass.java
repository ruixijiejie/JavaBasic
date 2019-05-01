package com.google.day10;

public class Demo06_NoNameInnerClass {
    public static void main(String[] args) {
        Outer7 o = new Outer7();
        o.method();
    }
}

interface Inter2 {
    public void show1();

    public void show2();

    public void show3();
}

//匿名内部类只针对重写一个方法时候使用
class Outer7 {
    public void method() {
		/*new Inter2() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show1();

		new Inter2() {
			public void show1() {
				System.out.println("show1");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();*/

        Inter2 i = new Inter2() {
            public void show1() {
                System.out.println("show1");
            }

            public void show2() {
                System.out.println("show2");
            }

			public void show3() {
				System.out.println("show3");
			}
        };

        i.show1();
        i.show2();
        i.show3();						//匿名内部类是不能向下转型的,因为没有子类类名
    }
}