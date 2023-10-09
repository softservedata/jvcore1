package com.edu27set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppCompare {
    public static void main(String[] args) {
        /* O(n^2)
        int[] arr0 = {0, 1, 0, 3, 0, 2, 1, 3, 2, 1};
        int[] arr1 = {1, 3, 2, 1, 0, 2, 3, 1, 1, 3, 0, 2, 2, 1, 3, 0};
        boolean isContentEquals = true;
        //
        for (int i = 0; i < arr0.length; i++) {
            isContentEquals = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr0[i] == arr1[j]) {
                    isContentEquals = true;
                    break;
                }
            }
            if (!isContentEquals) {
                break;
            }
        }
        //
        if (isContentEquals) {
            for (int j = 0; j < arr1.length; j++) {
                isContentEquals = false;
                for (int i = 0; i < arr0.length; i++) {
                    if (arr1[j] == arr0[i]) {
                        isContentEquals = true;
                        break;
                    }
                }
                if (!isContentEquals) {
                    break;
                }
            }
        }
        //
        System.out.println("isContentEquals = " + isContentEquals);
        */
        //
        // O(n)=Const*n
        Integer[] arr0 = {0, 1, 0, 3, 0, 2, 1, 3, 2, 1};
        Integer[] arr1 = {1, 3, 2, 1, 0, 2, 3, 1, 1, 3, 0, 2, 2, 1, 3, 0};
        boolean isContentEquals = true;
        //
        Set<Integer> set0 = new HashSet<>(Arrays.asList(arr0));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        //
        System.out.println("isContentEquals = " + set0.equals(set1));
    }
}
