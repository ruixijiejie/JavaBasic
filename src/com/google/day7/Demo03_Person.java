package com.google.day7;

public class Demo03_Person {
    public static void main(String[] args) {
        Person3 p1 = new Person3("张三", 23);
        //p1 = new Person("张天一",23);	//这种方式看运行结果貌似是改名了,其实是将原对象变成垃圾
        System.out.println(p1.getName() + "..." + p1.getAge());

        System.out.println("--------------------");

        Person3 p2 = new Person3();        //空参构造创建对象
        p2.setName("李四");
        p2.setAge(24);

        p2.setName("李鬼");
        System.out.println(p2.getName() + "..." + p2.getAge());
    }
}

/*
构造方法
	给属性进行初始化
setXxx方法
	修改属性值
	这两种方式,在开发中用setXxx更多一些,因为比较灵活
*/
class Person3 {
    private String name;                //姓名
    private int age;                    //年龄


    public Person3() {                    //空参构造

    }

    public Person3(String name, int age) {   //有参构造
        this.name = name;
        this.age = age;
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
}
