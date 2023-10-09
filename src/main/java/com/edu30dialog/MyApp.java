package com.edu30dialog;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("main thread, id = " + Thread.currentThread().getId());
        //
        MyThread t1 = new MyThread();
        //
        Thread t2 = new Thread(new MySecond());
        //
        t1.start(); // Running run()
        t2.start();
        //
        System.out.println("main thread DONE");
    }
}
