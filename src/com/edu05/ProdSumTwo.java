package com.edu05;

import java.util.Scanner;

public class ProdSumTwo {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        long sum = 0;
        long prod = 1;
        String anwer = "";
        //
        do {
            //
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value: n = ");
            n = Integer.parseInt(scanner.nextLine());
            //
            k = 0;
            prod = 1;
            for (int i = 1; (k < n) && (i <= n); i++) {
                sum = 0;
                for (int j = 0; (k < n) && (j < i); j++) {
                    k++;
                    sum = sum + k;
                }
                prod = prod * sum;
            }
            System.out.println("prod = " + prod);
            System.out.print("Calculate another value (Yes/No)? ");
            anwer = scanner.nextLine().toLowerCase();
        } while (anwer.startsWith("y"));
        System.out.print("The End.");
    }
}
