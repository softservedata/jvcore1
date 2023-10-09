package com.edu12tree;

public class AppTree {
    public static void main(String[] args) {
        //double[] arr = {10, 5, 15, 2, 18, 12, 3, 1, 20, 6, 13, 21, 11, 17};
        double[] arr = {5, 6, 3, 7, 4, 2};
        //double[] arr = {10, 5};
        double[] result = null;
        Tree tree = new Tree();
        //
        System.out.println("\nOriginal:");
        for (int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }
        //
        System.out.println("\nuse tree.getElements():");
        result = tree.getElements();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%4.1f  ", result[i]);
        }
        //
        System.out.println("\nuse tree.getElementsByStack():");
        result = tree.getElementsByStack();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%4.1f  ", result[i]);
        }
    }
}
