package com.edu22bird;

public class Appl {
    public static void main(String[] args) {
        Bird[] birds = {new Swallow(), new Penguin(), new Kiwi(), new Eagle(), new Swallow()};
        //
        for (Bird current : birds) {
            System.out.println(current);
        }
        //
        System.out.println("getSpeed() = " + birds[0].getSpeed());
        //System.out.println("getWeight() = " + birds[0].getWeight());
    }
}
