package com.edu08sec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonachi {

    public void fibCyclp(int n) {
        int f0 = 1;
        int f1 = 1;
        int f = 1;
        System.out.print("1  1");
        for (int i = 2; i <= n; i++) {
            f0 = f1;
            f1 = f;
            f = f0 + f1;
            System.out.print("  " + f);
        }
    }

    public int[] fibCycl(int n) {
        int[] a = new int[n + 1];
        int f0 = 1;
        int f1 = 1;
        int f = 1;
        //
        a[0] = f0;
        a[1] = f1;
        for (int i = 2; i <= n; i++) {
            f0 = f1;
            f1 = f;
            f = f0 + f1;
            a[i] = f;
        }
        return a;
    }

    public List<Integer> fibCyclm(int max) {
        List<Integer> a = new ArrayList<>();
        int f0 = 1;
        int f1 = 1;
        int f = 1;
        //
        a.add(f0);
        a.add(f1);
        do {
            f0 = f1;
            f1 = f;
            f = f0 + f1;
            //
            a.add(f);
        } while (f <= max);
        return a;
    }

    public int fibDiv(int n) {
        // End of recursion
        if (n <= 1) {
            return 1;
        }
        // Continue
        return fibDiv(n-1) + fibDiv(n-2);
    }

    public static void main(String[] args) {
        int n = 0;
        Fibonachi fibonachi = new Fibonachi();
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        n = scanner.nextInt();
        //
        //fibonachi.fibCyclp(n);
        /*
        int[] arr = fibonachi.fibCycl(n);
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + "  ");
        }
        */
        // /*
        //List<Integer> lst = fibonachi.fibCyclm(n);
        List<Integer> lst = fibonachi.fibCyclm(100);
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + "  ");
        }
        // */
        //
        System.out.print("\nfibon = " + fibonachi.fibDiv(n));
    }
}
