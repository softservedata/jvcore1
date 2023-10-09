package com.edu13stack;

public class Stack {
    private final int MAX_ARR = 100;
    private double[] arr = null;
    private int ptr = -1;

    public Stack() {
        arr = new double[MAX_ARR];
        ptr = -1;
    }

    public Stack(int num) {
        arr = new double[num];
        ptr = -1;
    }

    public void push(double element) {
        ptr = ptr + 1;
        arr[ptr] = element;
    }

    public double pop() {
        double element = Double.MIN_VALUE;
        if (!isEmpty()) {
            element = arr[ptr];
            ptr = ptr - 1;
        }
        return element;
    }

    public boolean isEmpty() {
        return ptr < 0;
    }
}
