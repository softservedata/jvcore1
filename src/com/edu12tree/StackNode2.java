package com.edu12tree;

public class StackNode2 {
    private final int MAX_ARR = 100;
    private Node2[] arr = null;
    private int ptr = -1;

    public StackNode2() {
        arr = new Node2[MAX_ARR];
        ptr = -1;
    }

    public StackNode2(int num) {
        arr = new Node2[num];
        ptr = -1;
    }

    public void push(Node2 element) {
        ptr = ptr + 1;
        arr[ptr] = element;
    }

    public Node2 pop() {
        Node2 element = null;
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
