package com.edu17matrix;

public class Matrix {

    private int[][] matr;
    private int m ;         // Row number
    private int n ;         // Column number


    public Matrix(int rows, int columns) {
        initMatr(m, n);
    }

    public Matrix(int[][] matrix) {
        initMatr(matrix);
    }

    private void initMatr(int rows, int columns) {
        m = rows;
        n = columns;
        //
        matr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = 0;
            }
        }
    }

    private void initMatr(int[][] matrix) {
        m = matrix.length; // Row number
        n = matrix[0].length; // Column number
        //
        matr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = matrix[i][j];
            }
        }
    }

    public int[][] getMatr() {
        return matr;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public void print(String message) {
        System.out.println(message);
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf("%4d",matr[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix matrix) {
        if ((m != matrix.getM()) || (n != matrix.getN())) {
            throw new RuntimeException("Invalid Matrix Size.");
        }
        int[][] matrRes = new int[m][n];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matrRes[i][j] = matr[i][j] + matrix.getMatr()[i][j];
            }
        }
        return new Matrix(matrRes);
    }

    public Matrix mul(Matrix matrix) { // Matrix C = A * B
        if (n != matrix.getM()) { // n column of A; matrix.getM() rows of B;
            throw new RuntimeException("Invalid Matrix Size.");
        }
        int mC = m; // m rows of A
        int nC = matrix.getN(); // matrix.getN() column of B
        int sum = 0;
        int[][] matrRes = new int[mC][nC];
        for (int i = 0; i < mC; i++) {
            for (int j = 0; j < nC; j++) {
                sum = 0;
                for (int l = 0; l < n; l++) { // n column of A
                    sum = sum + matr[i][l] * matrix.getMatr()[l][j];
                }
                matrRes[i][j] = sum;
            }
        }
        return new Matrix(matrRes);
    }

}
