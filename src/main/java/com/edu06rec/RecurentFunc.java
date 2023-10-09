package com.edu06rec;

import java.util.Scanner;

public class RecurentFunc {

    // Constructor RecurentFunc() added by default

    public double recSqrt(int n) {
        double r = 0;
        for (int i = n; i > 0; i--) {
            r = Math.sqrt(i + r);
        }
        return r;
    }

    public double recursive(int i, int n) {
        if (i > n) {
            return 0;
        }
        return Math.sqrt(i + recursive(i + 1, n));
    }

    public static void main(String[] args) {
        int n = 0;
        RecurentFunc recurentFunc = new RecurentFunc();
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        System.out.println("        r = " + recurentFunc.recSqrt(n));
        System.out.println("recursive = " + recurentFunc.recursive(1, n));
    }

}

