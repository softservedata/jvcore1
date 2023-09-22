package com.edu17matrix;

public class AppMatrix {

    public static void main(String[] args) {
        /*
        int[][] matr4 = {
                {4, 14, 15, 1},
                {9, 7, 6, 12},
                {5, 11, 10, 8},
                {16, 2, 3, 13}};
        */
        /*
        int[][] matr41 = {
                {1, 0, 0, 2},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {3, 0, 0, 1}};
        //
        int[][] matr42 = {
                {0, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 1, 0, 0},
                {1, 0, 0, 0}};
        //
        */
        int[][] matr41 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        //
        int[][] matr42 = {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}};
        //
        Matrix matrix41 = new Matrix(matr41);
        matrix41.print("Original matrix41:");
        Matrix matrix42 = new Matrix(matr42);
        matrix42.print("Original matrix42:");
        //
        //Matrix matrix43sum = matrix41.add(matrix42);
        Matrix matrix43sum = matrix41.mul(matrix42);
        matrix43sum = matrix41.mul(matrix42);
        //
        matrix43sum.print("Sum matrix:");
        //
        //matrix43sum = matrix43sum.mul(matrix42);
        //matrix43sum.print("Sum matrix:");
    }
}
