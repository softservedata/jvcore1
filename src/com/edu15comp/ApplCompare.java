package com.edu15comp;

public class ApplCompare {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 2, 1, 3, 2, 4, 2, 1};
        int[] arr2 = {3, 2, 1, 1, 2, 3, 4};
        boolean isEquals = true;
        //
        for (int i = 0; i < arr1.length; i++) {
            isEquals = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isEquals = true;
                    break;
                }
            }
            if (!isEquals) {
                break;
            }
        }
        if (isEquals) {
            for (int i = 0; i < arr2.length; i++) {
                isEquals = false;
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        isEquals = true;
                        break;
                    }
                }
                if (!isEquals) {
                    break;
                }
            }
        }
        //
        System.out.println("isEquals = " + isEquals);
    }
}
