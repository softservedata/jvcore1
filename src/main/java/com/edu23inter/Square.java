package com.edu23inter;

public class Square extends Shape implements Vertexable {
    private double width;

    public Square(String name, double width) {
        super(name);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * width;
    }

    public int getVertexCount() {
        return 4;
    }

    @Override
    public String toString() {
        return "Square { " + super.toString()
                + ", width = " + getWidth()
                + ", vertex = " + getVertexCount() + " }";
    }
}
