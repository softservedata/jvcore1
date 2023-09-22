package com.edu06rec;

import java.util.Scanner;

public class Recurent {

    public static void main(String[] args) {
        int n = 0;
        double r = 0;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        for (int i = n; i > 0; i--) {
            r = Math.sqrt(i + r);
        }
        System.out.print("r = " + r);
    }
}
