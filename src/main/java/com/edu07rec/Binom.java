package com.edu07rec;

public class Binom {

    //public Binom() {} // JVM Create by default

    public long fn(int n) {
        long factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        return factor;
    }

    public long fnRec(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fnRec(n - 1);
    }

    public long cnk(int n, int k) {
        return fn(n) / (fn(k) * fn(n - k));
    }

    public long cnk2(int n, int k) {
        return fnRec(n) / (fnRec(k) * fnRec(n - k));
    }

    public long cnkRec(int n, int k) {
        if (k <= n) {
            if ((n <= 0) || (k <= 0) || (k == n)) {
                return 1;
            }
            return cnkRec(n - 1, k - 1) + cnkRec(n - 1, k);
        }
        return 0;
    }

    public static void main(String[] args) {
        //
        Binom binom = new Binom();
        //
        //System.out.println("   fn 5! = " + binom.fn(5));
        //System.out.println("fnRec 5! = " + binom.fn(5));
        System.out.println("   cnk 2,1 = " + binom.cnk(2, 1));
        System.out.println("   cnk 3,2 = " + binom.cnk(3, 2));
        System.out.println("cnkRec 2,1 = " + binom.cnk(2, 1));
        System.out.println("cnkRec 3,2 = " + binom.cnk(3, 2));
        System.out.println("cnkRec 4,2 = " + binom.cnk(4, 2));
        //
    }
}
