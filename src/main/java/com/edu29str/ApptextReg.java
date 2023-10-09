package com.edu29str;

import java.util.Arrays;

public class ApptextReg {
    public static final int MAXN = 100;

    public static void main(String[] args) {
        String text = "  Java   is a high-level,     class-based,     object-oriented programming    language    that is designed    to have as few implementation    dependencies as   possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile.  ";
        System.out.println("Original:\n" + text);
        //
        String[] words = new String[MAXN];
        text = text.replaceAll("[\\.,\\- ]+", " ").trim().toLowerCase();
        //
        System.out.println("Updated:\n" + text);
        //
        words = text.split(" ");
        //
        System.out.println("Array = " + Arrays.toString(words));
    }

}
