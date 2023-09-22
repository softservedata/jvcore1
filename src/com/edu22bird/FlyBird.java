package com.edu22bird;

public abstract class FlyBird extends Bird {
    private double speed;

    public FlyBird(String name, double speed) {
        super(name);
        this.speed = speed;
        System.out.println("\t\tclass FlyBird constructor done");
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public double getWeight() {
        throw new RuntimeException("Non Support");
    }

    @Override
    public String toString() {
        return "FlyBird { speed = " + speed + ", " + super.toString() + " }";
    }
}
