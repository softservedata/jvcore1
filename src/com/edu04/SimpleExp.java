package com.edu04;

import java.util.Scanner;

public class SimpleExp {

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        double p = 1;
        double f = 1;
        double sum = 0;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        for (int i = 0; i < n; i++) {
            // Top
            p = 1;
            for (int j = 0; j < i; j++) {
                p = p * x;
            }
            // Bottom
            f = 1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            //
            sum = sum + p / f;
        }
        System.out.println("sum = " + sum);
        System.out.println("exp(x) = " + Math.exp(x));
    }
}
