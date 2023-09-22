package com.edu05;

import java.util.Scanner;

public class SimpleSin {

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        double p = 1;
        double f = 1;
        int sign = -1;
        double sum = 0;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        for (int i = 0; i < n; i++) {
            sign = -sign;
            // Top
            p = 1;
            for (int j = 0; j < (2 * i + 1); j++) {
                p = p * x;
            }
            // Bottom
            f = 1;
            for (int j = 1; j <= (2 * i + 1); j++) {
                f = f * j;
            }
            //
            sum = sum + sign * p / f;
        }
        System.out.println("sum = " + sum);
        System.out.println("sin(x) = " + Math.sin(x));
    }
}
