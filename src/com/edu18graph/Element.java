package com.edu18graph;

public class Element {
    private final int MAX_ELEMENTS = 100;
    private final String OUT_ARRAY_LENGHT = "Out of array lenght";
    private final String DATA_EMPTY = "Data not exist or empty";
    private int id; // hash [0-25]
    private String data;
    private Element[] elements;
    private int number;

    public Element(String data) {
        if ((data == null) || (data.length() == 0)) {
            throw new RuntimeException(DATA_EMPTY);
        }
        //
        this.data = data;
        id = (int) data.toLowerCase().charAt(0) - 97; // a ~ 97
        elements = new Element[MAX_ELEMENTS];
        number = 0;
        //
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            elements[i] = null;
        }
    }

    public Element addElement(Element element) {
        if (number >= MAX_ELEMENTS) {
            throw new RuntimeException(OUT_ARRAY_LENGHT);
        }
        elements[number] = element;
        number = number + 1;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Element[] getElements() {
        return elements;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String result = "Element:  data = " + data + "  id = " + id;
        if (number > 0) {
            result = result + "  arcs:";
        }
        for (int i = 0; i < number; i++) {
            result = result + " " + elements[i].getData();
        }
        return result;
    }
}
