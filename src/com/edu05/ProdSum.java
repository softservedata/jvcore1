package com.edu05;

import java.util.Scanner;

public class ProdSum {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        long sum = 0;
        long prod = 1;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        for (int i = 1; (k < n) && (i < n); i++) {
            sum = 0;
            for (int j = 0; (k < n) && (j < i); j++) {
                k++;
                sum = sum + k;
            }
            prod = prod * sum;
        }
        System.out.print("prod = " + prod);
    }
}
