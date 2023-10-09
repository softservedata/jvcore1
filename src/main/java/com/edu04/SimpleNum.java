package com.edu04;

import java.util.Scanner;

public class SimpleNum {
    public static void main(String[] args) {
        int n = 0;
        int k = 1;
        boolean isSimple = true;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        k = (int) Math.sqrt(n) + 1;
        System.out.println("k = " + k);
        //
        for (int i = 2; i < k; i++) {
            if (n % i == 0) {
                System.out.println("found i = " + i);
                isSimple = false;
                break;
            }
        }
        System.out.println("isSimple = " + isSimple);
    }
}
