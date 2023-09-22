package com.edu12tree;

public class AppAddTree {
    public static void main(String[] args) {
        double[] arr1 = {10, 5, 15, 2, 18, 12, 3, 1, 20, 6, 13, 21, 11, 17};
        double[] arr2 = {19, 4, 9, 22, 7, 14};
        double[] result = null;
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        //
        for (int i = 0; i < arr1.length; i++) {
            tree1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            tree2.add(arr2[i]);
        }
        //
        System.out.println("\nTree1:");
        result = tree1.getElements();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%4.1f  ", result[i]);
        }
        System.out.println("\nTree2:");
        result = tree2.getElements();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%4.1f  ", result[i]);
        }
        //
        Tree tree3;
        if (tree1.getNum() > tree2.getNum()) {
            tree3 = tree1;
            tree3.add(tree2);
        } else {
            tree3 = tree2;
            tree3.add(tree1);
        }
        //
        System.out.println("\nTree3:");
        result = tree3.getElements();
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%4.1f  ", result[i]);
        }
    }
}
