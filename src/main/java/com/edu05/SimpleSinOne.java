package com.edu05;

import java.util.Scanner;

public class SimpleSinOne {

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        double p = 1;
        double f = 1;
        int sign = 1;
        double sum = 0;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        sum = x;
        p = x;
        for (int i = 1; i < n; i++) {
            sign = -sign;
            // Top
            p = p * x * x;
            // Bottom
            f = f * (2 * i) * (2 * i + 1);
            //
            sum = sum + sign * p / f;
        }
        System.out.println("sum = " + sum);
        System.out.println("sin(x) = " + Math.sin(x));
    }

}
