package com.edu08sec;

import java.util.Scanner;

public class Sequence {

    public double exp1(double eps) {
        int n = 1;
        double a = 2;
        double a0 = 0;
        double coef = 0;
        //
        do {
            a0 = a;
            n = n + 1;
            coef = 1 + 1.0 / n;
            a = 1;
            for (int i = 0; i < n; i++) {
                a = a * coef;
            }
        } while (Math.abs(a - a0) > eps);
        return a;
    }

    public double expCycl(double x, double eps) {
        double p = 1;
        double f = 1;
        double sum = 1;
        double a = 0;
        int i = 0;
        //
        do {
            i = i + 1;
            p = p * x;
            f = f * i;
            a = p / f;
            sum = sum + a;
        } while (Math.abs(a) > eps);
        System.out.println("i = " + i);
        return sum;
    }

    public static void main(String[] args) {
        double eps = 0;
        Sequence sequence = new Sequence();
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("eps = ");
        eps = scanner.nextDouble();
        //
        System.out.println("       exp1 = " + sequence.exp1(eps));
        System.out.println(" expCycl(1) = " + sequence.expCycl(1, eps));
        System.out.println("Math.exp(1) = " + Math.exp(1));
    }
}
