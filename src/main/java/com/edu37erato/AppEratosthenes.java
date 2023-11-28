package com.edu37erato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppEratosthenes {

    public int getPrimeNumbers(int limit) {
        if (limit < 2) {
            throw new RuntimeException("Invalid parameter, limit = " + limit);
        }
        //
        List<Integer> numbers = new ArrayList<>();
        boolean isPrime = true;
        for (int current = 2; current <= limit; current++) {
            isPrime = true;
            for (Integer prime : numbers) {
                if (current % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                numbers.add(current);
            }
        }
        System.out.println("numbers = " + numbers);
        //
        return numbers.size();
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
