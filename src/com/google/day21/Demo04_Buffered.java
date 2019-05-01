package com.google.day21;

import java.io.*;

public class Demo04_Buffered {

    /**
     * @param args 带缓冲区的流中的特殊方法
     *             readLine()
     *             newLine();
     *             <p>
     *             newLine()与\r\n的区别
     *             newLine()是跨平台的方法
     *             \r\n只支持的是windows系统
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //demo1();
        BufferedReader br = new BufferedReader(new FileReader("sources\\zzz.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("sources\\aaa.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            //bw.newLine();							//写出回车换行符
            //bw.write("\r\n");
        }

        br.close();
        bw.close();
    }

    public static void demo1() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("sources\\zzz.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
