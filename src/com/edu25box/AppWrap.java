package com.edu25box;

public class AppWrap {
    public static void main(String[] args) {
        int i1 = 123;
        Integer i2 = 128; // i2 = new Integer(123);
        Integer i3 = 128;
        System.out.println("(i2 == i3) = " + (i2 == i3) );
        System.out.println("i2.equals(i3) = " + i2.equals(i3) ); // Ok
        //
        double d1 = 12.3;
        Double d2 = 12.3; // d2 = new Double(12.3);
    }
}
