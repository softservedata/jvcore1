package com.edu36task;

public class Match {

    public static void main(String[] args) {
        testMatchNumber(1, 32857890, 789);
        testMatchNumber(1, 37897890, 789);
        testMatchNumber(2, 1800765, 7);
        testMatchNumber(-1, 1800765, 8);
        testMatchNumber(1, 75, 7);
    }

    public static void testMatchNumber(int expected, long A, int M) {
        int result = matchNumber(A, M);
        if (expected == result) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed. Expected " + expected + ", but got " + result + ".");
        }
    }

    public static int matchNumber(long A, int M) {
        int result = -1;
        //
        long a = A;
        if (a < 0) {
            a = -a;
        }
        int m = M;
        if ((m < 0) || (m > 999)) {
            return -1;
        }
        //
        int[] arr = new int[19]; // 19 digits; max long = 9,223,372,036,854,775,807
        int[] mrr = new int[3];
        //
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < mrr.length; i++) {
            mrr[i] = 0;
        }
        //
        for (int i = 0; a > 0; i++) {
            arr[i] = (int) (a % 10);
            a = a / 10;
        }
        for (int i = 0; m > 0; i++) {
            mrr[i] = (int) (m % 10);
            m = m / 10;
        }
        //
        for (int i = 0; i < arr.length; i++) {
            boolean isFound = true;
            for (int j = 0; isFound && (j < mrr.length); j++) {
                isFound = arr[i+j] == mrr[j];
            }
            if (isFound) {
                result = i;
                break;
            }
        }
        // TODO
        return result;
    }

}
