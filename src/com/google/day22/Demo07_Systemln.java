package com.google.day22;

import java.io.IOException;
import java.util.Scanner;

public class Demo07_Systemln {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//InputStreamReaderת转换流
		String line = br.readLine();
		System.out.println(line);
		br.close();*/

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        sc.close();
    }

}
