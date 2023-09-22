package com.edu22bird;

public abstract class NonFlyBird extends Bird {
    private double weight;

    public NonFlyBird(String name, double weight) {
        super(name);
        this.weight = weight;
        System.out.println("\t\tclass NonFlyBird constructor done");
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getSpeed() {
        throw new RuntimeException("Non Support");
    }

    @Override
    public String toString() {
        return "NonFlyBird { weight=" + weight + ", " + super.toString() + " }";
    }
}
