package com.google.day19;

import java.io.File;

public class Demo09_File {

    /**
     * File(String pathname)：根据一个路径得到File对象
     * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
     * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
     */

    public static void main(String[] args) {
        //demo1();
        //demo2();
        demo3();
    }

    protected static void demo3() {
        File parent = new File("F:\\双元课堂\\day19\\video");
        String child = "001_今日内容.avi";
        File file = new File(parent, child);
        System.out.println(file.exists());
        System.out.println(parent.exists());
    }


    public static void demo2() {
        String parent = "E:\\所炫";
        String child = "乖乖.jpg";
        File file = new File(parent, child);
        System.out.println(file.exists());
    }

    public static void demo1() {
        File file = new File("E:\\所炫\\乖乖.jpg");
        System.out.println(file.exists());

        File file2 = new File("xxx.txt");
        System.out.println(file2.exists());

        File file3 = new File("yyy.txt");
        System.out.println(file3.exists());
    }
}
