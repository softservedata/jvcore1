package com.edu14temp;

public class StackTemp {
    private final int MAX_NUMBERS = 100;

    private Element[] elements;
    private int ptr;

    public StackTemp() {
        elements = new Element[MAX_NUMBERS];
        ptr = -1;
    }

    public void push(Element element) {
        ptr = ptr + 1;
        elements[ptr] = element;
    }

    public Element pop() {
        Element element = null;
        if (!isEmpty()) {
            element = elements[ptr];
            ptr = ptr - 1;
        }
        return element;
    }

    public boolean isEmpty() {
        return ptr < 0;
    }
}
