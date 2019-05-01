package com.google.day10;

public class Demo08_Override {
    public static void main(String[] args) {

    }
}

class Person4 {
    public void print() {
        System.out.println("Person");
    }
}

class Student4 extends Person4 {
    public void print() {
        System.out.println("Student");
    }
}

class Father2 {			//子类重写父类方法的返回值类型可以是父类方法返回值类型的子类
    public Person4 method() {
        return new Person4();
    }
}

class Son extends Father2 {
    public Student4 method() {
        return new Student4();
    }
}

