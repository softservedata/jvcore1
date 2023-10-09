package com.edu23inter;

public class Cube extends Shape implements Vertexable, Volumetric {
    private double width;

    public Cube(String name, double width) {
        super(name);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return 6 * width * width;
    }

    public int getVertexCount() {
        return 8;
    }

    public double getVolume() {
        return width * width * width;
    }

    @Override
    public String toString() {
        return "Cube { " + super.toString()
                + ", width = " + getWidth()
                + ", vertex = " + getVertexCount()
                + ", volume = " + getVolume()
                + " }";
    }
}
