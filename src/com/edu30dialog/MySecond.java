package com.edu30dialog;

public class MySecond implements Runnable {

    public void run() {
        System.out.println("MySecond, id = " + Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
            System.out.print("_");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }

}
