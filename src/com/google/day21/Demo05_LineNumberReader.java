package com.google.day21;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo05_LineNumberReader {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("sources\\zzz.txt"));

        String line;
        lnr.setLineNumber(100);
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);
        }

        lnr.close();
    }

}
