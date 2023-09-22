package com.edu03arr;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Input i = ");
            i=scanner.nextInt();
        } while (i < 0 || i > 100);
        System.out.println("Ok, i = " + i);
    }
}
