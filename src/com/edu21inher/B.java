package com.edu21inher;

public class B extends A {
    public int j = 234;

    public B() {
        System.out.println("Constructor B()");
    }

    @Override
    public void m1() {
        System.out.println("class B m1()");
        super.m1();
    }
}
