package com.edu09sort;

import java.util.Comparator;

class StudentId implements Comparator<Student> {

    public int compare(Student s0, Student s1) {
        return s0.getId() - s1.getId(); // if >0 then s0>s1;
    }
}

class StudentName implements Comparator<Student> {

    public int compare(Student s0, Student s1) {
        return s0.getName().compareTo(s1.getName());
    }
}

class StudentNameAndId implements Comparator<Student> {

    public int compare(Student s0, Student s1) {
        int result0 = s0.getName().compareTo(s1.getName());
        return result0 == 0 ? s0.getId() - s1.getId() : result0;
    }
}

public class Student { // extends Object { // extends by default
    private int id;
    private String name;
    private double mark;

    public Student(int id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "\n\tStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

}
