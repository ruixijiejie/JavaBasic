package com.google.day7;

public class Demo07_Static {
    public static void main(String[] args) {
        Person4 p3 = new Person4();
        p3.name = "福原爱老师";        //调用姓名属性并赋值
        p3.country = "台湾";        //调用国籍属性并赋值
        p3.speak();

        Person4 p1 = new Person4();    //创建对象
        p1.name = "苍老师";            //调用姓名属性并赋值
        p1.country = "日本";        //调用国籍属性并赋值
        p1.speak();

        Person4 p2 = new Person4();
        p2.name = "小泽老师";        //调用姓名属性并赋值
        // p2.country = "日本";		//调用国籍属性并赋值
        p2.speak();

        Person4 p4 = new Person4();
        p4.name = "黄老师";        //调用姓名属性并赋值
        // p2.country = "日本";		//调用国籍属性并赋值
        p4.speak();


        //Person.country = "日本";	//静态多了一种调用方式,可以通过类名.
        //System.out.println(Person.country);
    }
}

class Person4 {
    String name;                    //姓名
    static String country;                    //国籍

    public void speak() {            //说话的方法
        System.out.println(name + "..." + country);
    }
}