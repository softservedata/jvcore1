package com.edu20cls;

class A {
    private int i = 123;

    public void myprint() {
        System.out.println("i = " + i);
    }

    public A() {
        i = 456;
    }

    // Overload
    public A(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        System.out.println("Hello, this is class, name = " + A.class.getName());
        //
        A a1 = new A();
        a1.i = 111;
        a1.myprint();
        //
        A a2 = new A(555);
        a2.myprint();
    }
}
