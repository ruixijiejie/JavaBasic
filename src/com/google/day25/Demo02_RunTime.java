package com.google.day25;

import java.io.IOException;

public class Demo02_RunTime {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();            //获取运行时对象
        //r.exec("shutdown -s -t 300");
        r.exec("shutdown -a");
    }
}
