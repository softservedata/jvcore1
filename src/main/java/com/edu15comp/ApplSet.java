package com.edu15comp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ApplSet {
    public static final int MAXN = 128;

    public static void main(String[] args) {
        char[] chr1 = new char[]{'a', 'b', 'a', 'c', 'a', 'b', 'c', 'c', 'a', 'b'};
        char[] chr2 = {'b', 'a', 'c', 'a', 'b', 'd'};
        boolean isEquals = true;
        //
        int[] arr1 = new int[MAXN]; // from 0 to 127.
        int[] arr2 = new int[MAXN];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;
            arr2[i] = 0;
        }
        //System.out.println("a code = " + (int) arr1[0]);
        //
        for (int i = 0; i < chr1.length; i++) {
            arr1[ (int) chr1[i] ] = 1;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));
        //
        for (int i = 0; i < chr2.length; i++) {
            arr2[ (int) chr2[i] ] = 1;
        }
        System.out.println("arr2 = " + Arrays.toString(arr2));
        //
        for (int i = 0; i < MAXN; i++) {
            if (arr1[i] != arr2[i]) {
                isEquals = false;
                break;
            }
        }
        //
        System.out.println("isEquals = " + isEquals);
    }
}
