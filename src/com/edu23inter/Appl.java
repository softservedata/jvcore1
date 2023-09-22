package com.edu23inter;

public class Appl {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("circle", 5),
                new Cube("cube", 3),
                new Square("square", 7),
                new Cube("cube2", 5)
        };
        //
        for (Shape shape : shapes) {
            System.out.println(shape + "\n\tarea = " + shape.getArea());
            if (shape instanceof Vertexable) {
                System.out.println("\t\tvertexCount = " + ((Vertexable) shape).getVertexCount());
            }
            if (shape instanceof Volumetric volumetric) {
                System.out.println("\t\tvolume = " + volumetric.getVolume());
            }
        }
    }
}
