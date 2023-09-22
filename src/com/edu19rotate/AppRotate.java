package com.edu19rotate;

public class AppRotate {

    public static void print(int[][] matr, String message) {
        System.out.println(message);
        int n = matr.length; // rows/columns number
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("  %2d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int n = matr1.length; // rows/columns number
        print(matr1, "Orinal Matrix");
        //
        // Create transparent matrix
        int[][] matr1t = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr1t[i][j] = matr1[j][i];
            }
        }
        print(matr1t, "Transparent Matrix");
        //
        // Create rotate matrix
        int[][] matr1r = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr1r[i][j] = matr1t[i][n - j - 1];
            }
        }
        print(matr1r, "Rotate Matrix");
    }
}
