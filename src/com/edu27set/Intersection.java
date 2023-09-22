package com.edu27set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        Integer[] arr0 = {0, 1, 0, 3, 0, 2, 1, 3, 2, 1, 5};
        Integer[] arr1 = {1, 3, 2, 1, 0, 2, 3, 1, 1, 3, 0, 2, 2, 1, 3, 4};
        //
        Set<Integer> set0 = new HashSet<>(Arrays.asList(arr0));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        //
        Set<Integer> common = new HashSet<>(set0);
        common.addAll(set1);
        System.out.println("Common = " + common);
        //
        Set<Integer> intersection = new HashSet<>(set0);
        intersection.retainAll(set1);
        System.out.println("intersection = " + intersection);
        //
        Set<Integer> unical0 = new HashSet<>(set0);
        Set<Integer> unical1= new HashSet<>(set1);
        unical0.removeAll(set1);
        unical1.removeAll(set0);
        System.out.println("unical0 = " + unical0);
        System.out.println("unical1 = " + unical1);
    }
}
