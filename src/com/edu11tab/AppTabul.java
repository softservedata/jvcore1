package com.edu11tab;

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%6.2f  %6.2f", x, y);
    }
}


public class AppTabul {

    public double f(double x) {
        return Math.log(x);
    }

    public Point[] tab(double a, double b, int n) {
        Point[] result = new Point[n + 1];
        double h = (b - a) / n;
        double x, y;
        for (int i = 0; i <= n; i++) {
            x = a + i * h;
            y = f(x);
            result[i] = new Point(x, y);
        }
        return result;
    }

    public void printPoints(Point[] arr) {
        System.out.println("  x       y");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        AppTabul app = new AppTabul();
        app.printPoints(app.tab(1,5,10));
    }
}
