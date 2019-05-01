package com.google.day24;

public class Demo10_Yield {

    /**
     * yield让出cpu礼让线程
     */
    public static void main(String[] args) {
        new MyThread2().start();
        new MyThread2().start();
    }

}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            if(i % 10 == 0) {
                Thread.yield();						//让出CPU
            }
            System.out.println(getName() + "..." + i);
        }
    }
}
