package com.edu19rotate;

public class Cardano {

    int[][] matrix = null;

    public Cardano() {
        matrix = new int[][]{
                {0, 1, 0, 0},
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 1}
        };
    }

    public Cardano(int[][] matrix) {
        this.matrix = matrix;
    }

    private void rotate() {
        int n = matrix.length;
        int[][] tempMatr = new int[n][n];
        //
        // Create transparent matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempMatr[i][j] = matrix[j][i];
            }
        }
        //
        // Create rotate matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = tempMatr[i][n - j - 1];
            }
        }
    }

    public String Encrypt(String openText) {
        String cryptoText = "";
        if ((openText == null) || (openText.length() == 0)) {
            throw new RuntimeException("Error. Open text is empty.");
        }
        int n = matrix.length;
        int k = openText.length() / (n * n); // k = block numbers
        if (openText.length() % (n * n) > 0) {
            k = k + 1;
        }
        String[][] block = new String[n][n];
        int index = -1;
        for (int i = 0; i < k; i++) {
            // Init block
            for (int p = 0; p < n; p++) {
                for (int q = 0; q < n; q++) {
                    block[p][q] = "_";
                }
            }
            // Fill block
            for (int p = 0; ((p < n) && (index < openText.length() - 1)); p++) {
                for (int q = 0; ((q < n) && (index < openText.length() - 1)); q++) {
                    index = index + 1;
                    block[p][q] = openText.substring(index, index + 1);
                }
            }
            for (int j = 0; j < 4; j++) {
                for (int p = 0; p < n; p++) {
                    for (int q = 0; q < n; q++) {
                        if (matrix[p][q] != 0) {
                            cryptoText = cryptoText + block[p][q];
                        }
                    }
                }
                rotate();
            }
        }
        return cryptoText;
    }

    public String Decrypt(String cryptoText) {
        String openText = "";
        if ((cryptoText == null) || (cryptoText.length() == 0)) {
            throw new RuntimeException("Error. Crypto text is empty.");
        }
        int n = matrix.length;
        int k = cryptoText.length() / (n * n); // k = block numbers
        if (cryptoText.length() % (n * n) > 0) {
            k = k + 1;
        }
        String[][] block = new String[n][n];
        int index = -1;
        for (int i = 0; i < k; i++) {
            // Init block
            for (int p = 0; p < n; p++) {
                for (int q = 0; q < n; q++) {
                    block[p][q] = "_";
                }
            }
            //
            for (int j = 0; j < 4; j++) {
                for (int p = 0; ((p < n) && (index < cryptoText.length() - 1)); p++) {
                    for (int q = 0; ((q < n) && (index < cryptoText.length() - 1)); q++) {
                        if (matrix[p][q] != 0) {
                            index = index + 1;
                            block[p][q] = cryptoText.substring(index, index + 1);
                        }
                    }
                }
                rotate();
            }
            //
            for (int p = 0; p < n; p++) {
                for (int q = 0; q < n; q++) {
                    openText = openText + block[p][q];
                }
            }

        }
        return openText.replace("_","");
    }

}
