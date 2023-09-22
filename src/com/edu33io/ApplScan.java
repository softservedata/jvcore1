package com.edu33io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplScan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        System.out.print("Input number: ");
        try {
            /*
            String s = sc.nextLine();
            System.out.println("s = " + s + " bytes = " + Arrays.toString(s.getBytes()));
            x = Integer.parseInt(s);
            */
            x = sc.nextInt();
            //
        } catch (InputMismatchException e) {
            System.out.println("I/O Error.");
        }
        x = x + 1;
        System.out.println("Number is " + (x + 1));
        String s2 = String.valueOf(x);
        System.out.println("s2 = " + s2 + " bytes = " + Arrays.toString(s2.getBytes()));
        //
        sc.close();
    }
}
