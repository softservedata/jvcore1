package com.edu09sort;

import java.util.Arrays;
import java.util.Comparator;

public class AppSort {

    public int[] getIndex(int n) {
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        return index;
    }

    // overload
    public void printStudents(Student[] arr, String msg) {
        System.out.print("\n" + msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // overload
    public void printStudents(Student[] arr, int[] index, String msg) {
        System.out.print("\n" + msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[index[i]]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*
        Sort sort = new Sort();
        int[] arr = {4, 2, 7, 1, 8, 3, 9, 5}; // new int[] {4, 2, 7, 1, 8, 3, 9, 5};
        //int[] arr = {4, 3, 2, 1};
        //int[] arr = {1, 2, 3, 4};
        System.out.println("Original: " + Arrays.toString(arr));
        //sort.bubbleInt(arr);
        Arrays.sort(arr);
        System.out.println("  Sorted: " + Arrays.toString(arr));
        */
        //
        AppSort appSort = new AppSort();
        //
        Sort sort = new Sort();
        Student[] arr = {
                new Student(12, "Ira", 4.4),
                new Student(22, "Ivan", 4.8),
                new Student(15, "Petro", 4.7),
                new Student(11, "Stepan", 4.1),
                new Student(32, "Olha", 4.0),
                new Student(28, "Ihor", 3.9),
                new Student(17, "Orest", 4.9),
                new Student(15, "Andriy", 4.2),
                new Student(18, "Anna", 3.8),
                new Student(14, "Youra", 4.9),
                new Student(19, "Anna", 3.7),
        };
        int[] indexName = appSort.getIndex(arr.length);
        int[] indexId = appSort.getIndex(arr.length);
        //
        //System.out.println("arr[0]: " + arr[0].toString());
        //System.out.println("Original: " + Arrays.toString(arr));
        appSort.printStudents(arr, "Original: ");
        //
        //sort.bubbleStudent(arr);
        //sort.bubbleStudent(arr, new StudentId());
        //sort.bubbleStudent(arr, new StudentName());
        sort.bubbleStudent(arr, new StudentName(), indexName);
        //sort.bubbleStudent(arr, new StudentId(), indexId);
        //sort.bubbleStudent(arr, new StudentNameAndId(), indexName);
        //
        //Arrays.sort(arr);
        //Comparator<Student> compId = new StudentId();
        //Arrays.sort(arr, compId);
        //Arrays.sort(arr, new StudentId());
        //Arrays.sort(arr, new StudentName());
        //
        //System.out.println("\n  Sorted: " + Arrays.toString(arr));
        appSort.printStudents(arr, indexName, "  Sorted by Name: ");
        //appSort.printStudents(arr, indexId, "  Sorted by Id: ");
        //appSort.printStudents(arr, "Original: ");
        //
        // Find element
        //Student criterion = new Student(-1, "Anna", -1);
        Student criterion = new Student(-1, "Ira", -1);
        //Student criterion = new Student(19, "Anna", -1);
        //Student result = sort.findStudent(arr, new StudentName(), indexName, criterion);
        //Student result = sort.findStudent(arr, new StudentNameAndId(), indexName, criterion);
        Student result = sort.findStudentRec(arr, new StudentName(), indexName, criterion, 0, indexName.length - 1);
        //Student result = sort.findStudentRec(arr, new StudentNameAndId(), indexName, criterion, 0, indexName.length - 1);
        if (result != null) {
            System.out.println("\nfindStudent = " + result);
        } else {
            System.out.println("\nWARNING: findStudent not found.");
        }
    }
}
