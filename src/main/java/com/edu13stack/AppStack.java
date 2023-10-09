package com.edu13stack;

public class AppStack {
    public static void main(String[] args) {
        double element;
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 20};
        Stack stack = new Stack();
        //
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        //
        System.out.println("\nArray:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nStack:");
        while (!stack.isEmpty()) {
            element = stack.pop();
            System.out.print(element + "  ");
        }
    }
}
