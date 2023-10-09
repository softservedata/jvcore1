package com.edu23stud;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class AppSort {
    public static void main(String[] args) {
        /*
        int n = 20;
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n);
        }
        //
        System.out.println("Original Arrays: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted Arrays: " + Arrays.toString(arr));
        */
        //
        int n = 10;
        Student[] students = new Student[n];
        students[0] = new Student("Oksana", 26);
        students[1] = new Student("Bogdan", 27);
        students[2] = new Student("Orest", 24);
        students[3] = new Student("Ira", 23);
        students[4] = new Student("Yarko", 21);
        students[5] = new Student("Bogdan", 30);
        students[6] = new Student("Bogdan", 22);
        students[7] = new Student("Igor", 25);
        students[8] = new Student("Ivan", 29);
        students[9] = new Student("Petro", 28);
        //
        System.out.println("Original Students: " + Arrays.toString(students));
        //Arrays.sort(students);
        Comparator<Student> comparator = new Student.ByNameAndAge();
        Arrays.sort(students, comparator);
        System.out.println("Sorted Students: " + Arrays.toString(students));
        //
    }
}
