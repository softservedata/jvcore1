package com.edu24line;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void print() {
        System.out.printf("\nLine: begin %s end %s", begin.getPoint(), end.getPoint());
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +  // begin.toString()
                ", end=" + end +
                '}';
    }
}
