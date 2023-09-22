package com.edu24line;

public class ColorLine extends Line {
    private int red;
    private int green;
    private int blue;

    public ColorLine(Point begin, Point end, int red, int green, int blue) {
        super(begin, end);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public ColorLine(Line line, int red, int green, int blue) {
        super(line.getBegin(), line.getEnd());
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(" ColorLine: red %2d, green %2d, blue %2d", red, green, blue);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                ", " + super.toString() +
                '}';
    }
}
