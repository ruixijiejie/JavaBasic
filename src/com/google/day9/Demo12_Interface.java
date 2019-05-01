package com.google.day9;

public interface Demo12_Interface {
    public static void main(String[] args) {
        Demo7 d = new Demo7();
        d.print();
        System.out.println(Inter2.num);
    }
}

/*
 * 成员变量；只能是常量，并且是静态的并公共的。
 * 默认修饰符：public static final	三个关键字可以互相交换位置
 * 建议：自己手动给出。
 * 构造方法：接口没有构造方法。
 * 成员方法：只能是抽象方法。
 * 默认修饰符：public abstract
 * 建议：自己手动给出。
 */

interface Inter2 {
    public static final int num = 10;
    //public Inter(){}					接口中没有构造方法

	/*public void print() {				接口中不能定义非抽象方法

	}*/

    public abstract void print();
}

class Demo7 /*extends Object*/ implements Inter2 {
    public void print() {
        //num = 20;
        System.out.println(num);
    }

    public Demo7() {
        super();
    }
}