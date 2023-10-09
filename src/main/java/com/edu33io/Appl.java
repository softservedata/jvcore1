package com.edu33io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        System.out.print("Input number: ");
        try {
            String s = br.readLine();
            System.out.println("s = " + s + " bytes = " + Arrays.toString(s.getBytes()));
            x = Integer.parseInt(s);
        } catch (NumberFormatException | IOException e) {
            System.out.println("I/O Error.");
        }
        x = x + 1;
        System.out.println("Number is " + (x + 1));
        String s2 = String.valueOf(x);
        System.out.println("s2 = " + s2 + " bytes = " + Arrays.toString(s2.getBytes()));
        //
        try {
            br.close();
        } catch (IOException e) {
            System.out.println("close() Error.");
        }
    }

}
