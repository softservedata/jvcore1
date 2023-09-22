package com.edu21inher;

public class A { // extends Object {
    private int i = 123;

    // Overload
    public A() {
        System.out.println("Constructor A()");
    }

    // Overload
    public A(int i) {
        System.out.println("Constructor A(int i)");
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void m1() {
        System.out.println("class A m1()");
    }
}
