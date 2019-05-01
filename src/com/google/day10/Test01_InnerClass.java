package com.google.day10;

public class Test01_InnerClass {
    public static void main(String[] args) {
        Outer4.Inner oi = new Outer4().new Inner();
        oi.show();
    }
}

//要求：使用已知的变量，在控制台输出30，20，10。
//内部类之所以能获取到外部类的成员,是因为他能获取到外部类的引用外部类名.this
class Outer4 {
    public int num = 10;

    class Inner {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer4.this.num);
        }
    }
}
