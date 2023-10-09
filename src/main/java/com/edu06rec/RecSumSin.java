package com.edu06rec;

import java.util.Scanner;

public class RecSumSin {

    public double recSinTwo(double x, int n) {
        double sum = 0;
        double r = 0;
        for (int i = 0; i < n; i++) {
            r = x;
            for (int j = 0; j <= i; j++) {
                r = Math.sin(r);
            }
            sum = sum + r;
        }
        return sum;
    }

    public double recSin(double x, int n) {
        double sum = 0;
        double r = x;
        for (int i = 0; i < n; i++) {
            r = Math.sin(r);
            sum = sum + r;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 0;
        double x = 0;
        RecSumSin recSumSin = new RecSumSin();
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        System.out.print("x = ");
        x = scanner.nextDouble();
        //
        System.out.println("recSinTwo = " + recSumSin.recSinTwo(x, n));
        System.out.println("   recSin = " + recSumSin.recSin(x, n));
    }
}
