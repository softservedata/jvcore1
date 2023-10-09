package com.edu30dialog;

public class MyThread extends Thread {

    public void run() {
        System.out.println("MyThread, id = " + Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
            System.out.print("o");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }

}
