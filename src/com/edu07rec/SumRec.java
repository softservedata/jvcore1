package com.edu07rec;

public class SumRec {

    public int sumSimple(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int sumRecur(int[] arr, int n) {
        if (n < 0) {
            return 0;
        }
        return arr[n] + sumRecur(arr, n - 1);
    }

    public int sumDivImp(int[] arr, int k, int n) {
        if (k >= n) {
            return arr[k];
        }
        int m = (k + n) / 2;
        return sumDivImp(arr, k, m) + sumDivImp(arr, m + 1, n);
    }

    public static void main(String[] args) {
        SumRec sumRec = new SumRec();
        //
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(" sumSimple sum = " + sumRec.sumSimple(arr));
        System.out.println("  sumRecur sum = " + sumRec.sumRecur(arr, arr.length - 1));
        System.out.println(" sumDivImp sum = " + sumRec.sumDivImp(arr, 0, arr.length - 1));
    }
}
