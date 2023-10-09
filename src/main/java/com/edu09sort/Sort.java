package com.edu09sort;

import java.util.Comparator;

public class Sort {

    public void bubbleInt(int[] a) {
        int t = 0;
        boolean isContinue = true;
        for (int i = 0; isContinue && i < a.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                //System.out.print(".");
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    isContinue = true;
                }
            }
        }
    }

    public void mergeInt(int[] a) {
        mergeInt(a, 0, a.length - 1);
    }

    private void mergeInt(int[] a, int idxBegin, int idxEnd) {
        if (idxBegin < idxEnd) {
            int idxAvg = (idxBegin + idxEnd) / 2;
            mergeInt(a, idxBegin, idxAvg);
            mergeInt(a, idxAvg + 1, idxEnd);
            mergeIntArray(a, idxBegin, idxAvg, idxEnd);
        }
    }

    private void mergeIntArray(int[] a, int idxBegin, int idxAvg, int idxEnd) {
        int n = idxEnd - idxBegin + 1;
        int[] temp = new int[n];
        int kBegin = idxBegin;
        int kEnd = idxAvg + 1;
        for (int i = 0; i < n; i++) {
            if ((kBegin <= idxAvg) && (kEnd <= idxEnd)) {
                if (a[kBegin] < a[kEnd]) {
                    temp[i] = a[kBegin];
                    kBegin++;
                } else {
                    temp[i] = a[kEnd];
                    kEnd++;
                }
            } else if (kBegin <= idxAvg) {
                temp[i] = a[kBegin];
                kBegin++;
            } else {
                temp[i] = a[kEnd];
                kEnd++;
            }
        }
        for (int i = 0; i < n; i++) {
            a[idxBegin + i] = temp[i];
        }
    }

    // Overload
    public void bubbleStudent(Student[] a) {
        Student t = null;
        boolean isContinue = true;
        for (int i = 0; isContinue && i < a.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                System.out.print(".");
                //if (a[j].getId() > a[j + 1].getId()) {
                //if (a[j].getMark() > a[j + 1].getMark()) {
                if (a[j].getName().compareTo(a[j + 1].getName()) > 0) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    isContinue = true;
                }
            }
        }
    }

    // Overload
    public void bubbleStudent(Student[] a, Comparator<Student> c) {
        Student t = null;
        boolean isContinue = true;
        for (int i = 0; isContinue && i < a.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                System.out.print(".");
                if (c.compare(a[j], a[j + 1]) > 0) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    isContinue = true;
                }
            }
        }
    }

    // Overload
    public void bubbleStudent(Student[] a, Comparator<Student> c, int[] index) {
        int t = -1;
        boolean isContinue = true;
        for (int i = 0; isContinue && i < a.length - 1; i++) {
            isContinue = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                System.out.print(".");
                if (c.compare(a[index[j]], a[index[j + 1]]) > 0) {
                    t = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = t;
                    isContinue = true;
                }
            }
        }
    }

    public Student findStudent(Student[] arr, Comparator<Student> c, int[] index, Student criterion) {
        Student student = null;
        int idxBegin = 0;
        int idxEnd = index.length - 1;
        int idxAvg = -1;
        while (idxBegin <= idxEnd) {
            idxAvg = (idxBegin + idxEnd) / 2;
            if (c.compare(arr[index[idxAvg]], criterion) == 0) {
                student = arr[index[idxAvg]];
                break;
            } else if (c.compare(arr[index[idxAvg]], criterion) > 0) {
                idxEnd = idxAvg - 1;
            } else {
                idxBegin = idxAvg + 1;
            }
        }
        //
        return student;
    }

    public Student findStudentRec(Student[] arr, Comparator<Student> c, int[] index, Student criterion, int idxBegin, int idxEnd) {
        if (idxBegin > idxEnd) {
            return null;
        }
        int idxAvg = (idxBegin + idxEnd) / 2;
        if (c.compare(arr[index[idxAvg]], criterion) == 0) {
            return arr[index[idxAvg]];
        }
        //
        if (c.compare(arr[index[idxAvg]], criterion) > 0) {
            return findStudentRec(arr, c, index, criterion, idxBegin, idxAvg - 1);
        } else {
            return findStudentRec(arr, c, index, criterion, idxAvg + 1, idxEnd);
        }
    }
}
