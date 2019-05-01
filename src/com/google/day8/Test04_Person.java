package com.google.day8;

public class Test04_Person {
    public static void main(String[] args) {

    }
}

/*
 * 使用继承后的学生和老师案例
 */

class Person3 {
    private String name;					//姓名
    private int age;						//年龄

    public Person3() {}						//空参构造

    public Person3(String name,int age) {	//有参构造
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {		//设置姓名
        this.name = name;
    }

    public String getName() {				//获取姓名
        return name;
    }

    public void setAge(int age) {			//设置年龄
        this.age = age;
    }

    public int getAge() {					//获取年龄
        return age;
    }

    public void eat() {						//吃饭
        System.out.println(name  + "吃饭");
    }
}

class Student4 extends Person3 {
    public Student4() {}						//空参构造

    public Student4(String name,int age) {
        super(name,age);
    }

    public void study() {
        System.out.println(this.getName() + "学习");
    }
}

class Teacher2 extends Person3 {
    public Teacher2() {}						//空参构造

    public Teacher2(String name,int age) {
        super(name,age);
    }

    public void teach() {
        System.out.println(this.getName() + "讲课");
    }
}