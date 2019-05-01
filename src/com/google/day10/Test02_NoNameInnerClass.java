package com.google.day10;

public class Test02_NoNameInnerClass {
    public static void main(String[] args) {
//如何调用PersonDemo中的method方法呢?
        PersonDemo pd = new PersonDemo();
        //pd.method(new Student());
        pd.method(new Person() {    // 匿名内部类当做参数传递(本质把匿名内部类当做一个对象)
            public void show() {
                System.out.println("show");
            }
        });
    }
}


//这里写抽象类，接口都行
abstract class Person {
    public abstract void show();
}

class PersonDemo {

    //public void method(Person p) {		//Person p = new Student();		//父类引用指向子类对象
	/*
	Person p = new Person(){
		public void show() {
			System.out.println("show");
		}
	};
	*/
    public void method(Person p) {
        p.show();
    }
}

class Student extends Person {
    public void show() {
        System.out.println("show");
    }
}