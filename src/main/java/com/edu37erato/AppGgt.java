package com.edu37erato;

import java.util.Scanner;

public class AppGgt {

    public int getGgt(int x, int y) {
        int a = Math.max(Math.abs(x), Math.abs(y));
        int b = Math.min(Math.abs(x), Math.abs(y));
        int r;
        do {
            r = a % b;
            a = b;
            b = r;
        } while (b != 0);
        return a;
    }

    public int recGgt(int x, int y) {
        int a = Math.max(Math.abs(x), Math.abs(y));
        int b = Math.min(Math.abs(x), Math.abs(y));
        if (b == 0) {
            return a;
        }
        return recGgt(b, a % b);
    }

    public static void main(String[] args) {
        AppGgt app = new AppGgt();
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        //
        System.out.println("get ggt = " + app.getGgt(a, b));
        System.out.println("rec ggt = " + app.recGgt(a, b));
    }
}
