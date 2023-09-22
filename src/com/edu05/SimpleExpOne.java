package com.edu05;

import java.util.Scanner;

public class SimpleExpOne {

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        double p = 1;
        double f = 1;
        double sum = 1;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        for (int i = 1; i < n; i++) {
            // Top
            p = p * x;
            f = f * i;
            sum = sum + p / f;
        }
        System.out.println("sum = " + sum);
        System.out.println("exp(x) = " + Math.exp(x));
    }
}
