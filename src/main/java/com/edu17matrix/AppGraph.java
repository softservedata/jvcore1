package com.edu17matrix;

public class AppGraph {

    public static void main(String[] args) {
        int[][] matr0 = {
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0},};
        Matrix graph = new Matrix(matr0);
        graph.print("Original graph:");
        //
        Matrix graph2 =graph.mul(graph);
        graph2.print("graph2:");
        Matrix graph2plus1 =graph2.add(graph);
        graph2plus1.print("graph2plus1:");
        //
        //Matrix graph3 =graph2.mul(graph);
        //graph3.print("graph3:");
        //
        //Matrix graph4 =graph3.mul(graph);
        //graph4.print("graph4:");
    }

}
