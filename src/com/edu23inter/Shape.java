package com.edu23inter;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape { name = " + getName() + " }";
    }
}
