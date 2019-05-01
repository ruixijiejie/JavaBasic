package com.google.day9;

public class Test05_Employee {
    public static void main(String[] args) {
        Coder c = new Coder("德玛西亚", "007", 8000);
        c.work();

        Manager m = new Manager("苍老师", "9527", 3000, 20000);
        m.work();
    }
}
/*
 * 假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号以及工资。
 * 经理，除了含有程序员的属性外，另为还有一个奖金属性。
 * 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
 */

abstract class Employee {
    private String name;                      //姓名
    private String id;                        //工号
    private double salary;                    //工资

    public Employee() {

    }                    //空参构造

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}

//程序员
class Coder extends Employee {
    public Coder() {
    }                    //空参构造

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:"
                + this.getSalary() + ",我的工作内容是敲代码");
    }
}

//项目经理
class Manager extends Employee {
    private int bonus;                    //奖金

    public Manager() {
    }                    //空参构造

    public Manager(String name, String id, double salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("我的姓名是:" + this.getName() + ",我的工号是:" + this.getId() + ",我的工资是:"
                + this.getSalary() + ",我的奖金是:" + bonus + ",我的工作内容是管理");
    }
}