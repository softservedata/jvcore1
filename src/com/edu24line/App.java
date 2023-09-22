package com.edu24line;

public class App {

    public static void main(String[] args) {
        Line line = new Line(new Point(-1, -2), new Point(1, 1));
        Line[] lines = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(new Point(10, 20), new Point(30, 40), 150, 200, 250),
                new ColorLine(line, 250, 100, 150)
        };
        //
        for (Line currentLine : lines) {
            //System.out.println(currentLine);
            currentLine.print();
        }
    }
}
