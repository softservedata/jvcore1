package com.edu10sort;

import java.util.Arrays;

public class AppSortMax {
    public static void main(String[] args) {
        int imax = -1;
        int max = 0;
        int[] arr = {4, 2, 7, 1, 8, 3, 9, 5};
        System.out.println("Original: " + Arrays.toString(arr));
        //
        for (int i = 0; i < arr.length - 1; i++) {
            imax = 0;
            max = arr[imax];
            for (int j = 0; j < arr.length - i; j++) {
                //System.out.print(" j = " + j + "   arr.length - i = " + (arr.length - i));
                if (max < arr[j]) {
                    imax = j;
                    max = arr[imax];
                }
                //System.out.println(" imax = " + imax+ "   max = " + max);
            }
            if (imax != arr.length - 1 - i) {
                arr[imax] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = max;
            }
        }
        //
        System.out.println("  Sorted: " + Arrays.toString(arr));
    }
}
