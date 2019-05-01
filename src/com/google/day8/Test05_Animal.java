package com.google.day8;

public class Test05_Animal {
    public static void main(String[] args) {
        Cat5 c1 = new Cat5("花", 4);
        System.out.println(c1.getColor() + "..." + c1.getLeg());
        c1.eat();
        c1.catchMouse();

        Dog5 d1 = new Dog5("黑", 2);
        System.out.println(d1.getColor() + "..." + d1.getLeg());
        d1.eat();
        d1.lookHome();
    }
}
/*
 * A:猫狗案例分析
 * B:案例演示
 * 猫狗案例继承版
 * 属性:毛的颜色,腿的个数
 * 行为:吃饭
 * 猫特有行为:抓老鼠catchMouse
 * 狗特有行为:看家lookHome
 */

class Animal5 {
    private String color;                    //毛的颜色
    private int leg;                        //腿的个数

    public Animal5() {
    }

    public Animal5(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }

    public void setColor(String color) {    //设置颜色
        this.color = color;
    }

    public String getColor() {                //获取颜色
        return color;
    }

    public void setLeg(int leg) {            //设置腿的个数
        this.leg = leg;
    }

    public int getLeg() {                    //获取腿的个数
        return leg;
    }

    public void eat() {                        //吃饭
        System.out.println("吃饭");
    }
}

class Cat5 extends Animal5 {
    public Cat5() {
    }                            //空参构造

    public Cat5(String color, int leg) {        //有参构造
        super(color, leg);
    }

    public void eat() {                        //吃鱼
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {                //抓老鼠
        System.out.println("抓老鼠");
    }
}

class Dog5 extends Animal5 {
    public Dog5() {
    }                            //空参构造

    public Dog5(String color, int leg) {        //有参构造
        super(color, leg);
    }

    public void eat() {                        //吃肉
        System.out.println("狗吃肉");
    }

    public void lookHome() {                //看家
        System.out.println("看家");
    }
}