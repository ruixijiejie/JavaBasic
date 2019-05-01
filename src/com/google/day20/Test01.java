package com.google.day20;

import java.io.*;

public class Test01 {
    /**
     * @param args
     * @throws IOException 将写出的字节异或上一个数,这个数就是密钥,解密的时候再次异或就可以了
     */
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sources\\乖乖.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("sources\\copy2.jpg"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b ^ 123);
        }

        bis.close();
        bos.close();
    }

}
