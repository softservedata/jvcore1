package com.edu16magic;

public class ApplMagic {
    public static void main(String[] args) {
        /*
        int[][] matr = {
                {4, 14, 15, 1},
                {9, 7, 6, 12},
                {5, 11, 10, 8},
                {16, 2, 3, 13}};
        */
        //
        int[][] matr = {
                {17, 24, 1, 8, 15},
                {23, 5, 7, 14, 16},
                {4, 6, 13, 20, 22},
                {10, 12, 19, 21, 3},
                {11, 18, 25, 2, 9}
        };
        //
        boolean isMagic = true;
        int sumExpected = 0;
        int sum = 0;
        //
        System.out.println("Original Matrix");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("%4d", matr[i][j]);
            }
            System.out.println();
        }
        //
        sumExpected = 0;
        for (int j = 0; j < matr[0].length; j++) {
            sumExpected = sumExpected + matr[0][j];
        }
        System.out.println("sumExpected = " + sumExpected);
        //
        // rows
        for (int i = 0; isMagic && (i < matr.length); i++) {
            sum = 0;
            for (int j = 0; j < matr[i].length; j++) {
                sum = sum + matr[i][j];
            }
            isMagic = sum == sumExpected;
//            if (sum != sumExpected) {
//                isMagic = false;
//                break;
//            }
        }
        System.out.println("isRow = " + isMagic);
        //
        // column
        for (int j = 0; isMagic && (j < matr[0].length); j++) {
            sum = 0;
            for (int i = 0; i < matr.length; i++) {
                sum = sum + matr[i][j];
            }
            isMagic = sum == sumExpected;
        }
        System.out.println("isColumn = " + isMagic);
        //
        // base diagonal
        sum = 0;
        for (int i = 0; isMagic && (i < matr.length); i++) {
            sum = sum + matr[i][i];
        }
        isMagic = sum == sumExpected;
        System.out.println("is base diagonal = " + isMagic);
        //
        // side diagonal
        sum = 0;
        for (int i = 0; isMagic && (i < matr.length); i++) {
            System.out.print("+ matr[" + i+"]["+(matr.length - i - 1)+"] ");
            sum = sum + matr[i][matr.length - i - 1];
        }
        isMagic = sum == sumExpected;
        System.out.println("is side diagonal = " + isMagic);
        //
        System.out.println("isMagic = " + isMagic);
    }

}
