package com.edu37erato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppEratosthenes {

    public int getPrimeNumbers(int limit) {
        if (limit < 2) {
            throw new RuntimeException("Invalid parameter, limit = " + limit);
        }
        // Initialization
        int[] sieve = new int[limit + 1];
        sieve[0] = 0;
        sieve[1] = 0;
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = i;
        }
        //
        int j = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] != 0) {
                j = 1;
                while (i + j * i < sieve.length) {
                    sieve[i + j * i] = 0;
                    j = j + 1;
                }
            }
        }
        //
        int result = 0;
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] != 0) {
                result = result + 1;
            }
        }
        System.out.println("numbers = " + Arrays.toString(sieve));
        //
        return result;
    }

    public static void main(String[] args) {
        AppEratosthenes app = new AppEratosthenes();
        int limit = 0;
        Scanner sc = new Scanner(System.in);
        //
        do {
            System.out.print("limit = ");
            limit = sc.nextInt();
        } while (limit < 2);
        //
        System.out.println("Number = " + app.getPrimeNumbers(limit));
    }
}
