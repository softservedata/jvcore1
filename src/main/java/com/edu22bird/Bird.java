package com.edu22bird;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
        System.out.println("\t\t\tclass Bird constructor done");
    }

    public String getName() {
        return name;
    }

    public abstract double getSpeed();

    public abstract double getWeight();

    @Override
    public String toString() {
        return "Bird { name = " + name + " }";
    }
}
