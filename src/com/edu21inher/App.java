package com.edu21inher;

public class App {
    public static void main(String[] args) {
        /*
        B b = new B();
        System.out.println("i = " + b.getI());
        b.m1();
        b.j = 456;
        System.out.println("i = " + b.j);
        //
        int k = 1;
        double d = 2.5;
        System.out.println("1.  k = " + k + "  d = " + d);
        //d = k;
        //System.out.println("2.  k = " + k + "  d = " + d);
        // k = d; // Compile Error
        k = (int) d;
        System.out.println("3.  k = " + k + "  d = " + d);
        */
        A a = new A();
        B b = new B();
        //
        //a = b; // Down casting
        //b = a; // Compile Error
        //b = (B) a; // Runtime Error
        a.m1();
        //
        A a1 = new B();
        b = (B) a1; // Up casting
        System.out.println("b.j = " + b.j);
    }
}
