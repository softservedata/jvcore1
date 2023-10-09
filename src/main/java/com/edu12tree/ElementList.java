package com.edu12tree;

public class ElementList {
    double[] arr;
    int max; // Max of elements
    int len; // Real length
    //
    public ElementList(int max) {
        arr = new double[max];
        this.max = max;
        len = 0;
    }

    public void add(double element) {
        arr[len] = element;
        len = len + 1;
    }
}
