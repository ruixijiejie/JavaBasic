package com.google.day21;

import java.io.*;

public class Demo03_Copy {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //demo1();
        demo2();
        //demo3();
        //demo4();
        return;
    }

    protected static void demo4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sources\\xxx.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sources\\yyy.txt"));

        int c;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }

        br.close();
        bw.close();
    }

    public static void demo3() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("sources\\xxx.txt");
        FileWriter fw = new FileWriter("sources\\yyy.txt");

        char[] arr = new char[1024];
        int len;
        while ((len = fr.read(arr)) != -1) {            //将文件上的数据读取到字符数组中
            fw.write(arr, 0, len);                    //将字符数组中的数据写到文件上
        }

        fr.close();
        fw.close();
    }

    public static void demo2() throws FileNotFoundException, IOException {
        //字符流不能拷贝纯文本的文件
        FileReader fr = new FileReader("sources\\桌面1.jpg");
        FileWriter fw = new FileWriter("sources\\copy3.jpg");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }

    public static void demo1() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("sources\\xxx.txt");
        FileWriter fw = new FileWriter("sources\\zzz.txt");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();                //Writer类中有一个2k的小缓冲区,如果不关流,就会将内容写到缓冲区里,关流会将缓冲区内容刷新,再关闭
    }

}
