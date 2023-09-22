package com.edu23stud;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    public static class ByNameAndAge implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            int resName = student1.getName().compareTo(student2.getName());
            return resName == 0 ? (student1.getAge() - student2.getAge()) : resName;
        }
    }

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
        //return age - student.getAge();
    }

    @Override
    public String toString() {
        return "\n\tStudent { "
                + " name = " + name
                + ", age = " + age
                + " }";
    }
}
