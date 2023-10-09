package com.edu18graph;

public class Graph {

    private final int MAX_ELEMENTS = 100;
    private final String OUT_ARRAY_LENGHT = "Out of array lenght";
    private Element[] elements;
    private int number;

    public Graph() {
        elements = new Element[MAX_ELEMENTS];
        number = 0;
    }

    public Graph addElement(Element element) {
        if (number >= MAX_ELEMENTS) {
            throw new RuntimeException(OUT_ARRAY_LENGHT);
        }
        elements[number] = element;
        number = number + 1;
        return this;
    }

    public Element[] getElements() {
        return elements;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String result = "This is Graph.";
        if (number > 0) {
            result = result + " Elements:";
        }
        for (int i = 0; i < number; i++) {
            result = result + "\n" + elements[i].toString();
        }
        return result;
    }
}
