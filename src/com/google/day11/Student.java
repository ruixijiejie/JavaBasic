package com.google.day11;

import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



	/*@Override
	public String toString() {

		return "我的姓名是：" + name + ",我的年龄是："+ age;
	}*/

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    //重写equals方法
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }


}
