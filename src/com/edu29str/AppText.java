package com.edu29str;

import java.util.Arrays;
import java.util.Locale;

public class AppText {
    public static final int MAXN = 100;

    public static void main(String[] args) {
        //String text = "  Java   .  ";
        String text = "  Java   is a high-level,     class-based,     object-oriented programming    language    that is designed    to have as few implementation    dependencies as   possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to recompile.  ";
        System.out.println("Original:\n" + text);
        //
        String[] words = new String[MAXN];
        text = text.replace("-", " ");
        text = text.replace(".", " ");
        text = text.replace(",", " ");
        text = text.trim();
        //text = text.replaceAll(" {2,}", " ");
        while (text.indexOf("  ") >= 0) {
            text = text.replace("  ", " ");
        }
        text = text.toLowerCase();
        //
        System.out.println("Updated:\n" + text);
        //
        text = text + " ";
        int k = 0;
        int n = 0;
        while (text.length() > 0) {
            n = text.indexOf(" ");
            words[k] = text.substring(0, n);
            text = text.substring(n + 1);
            k = k + 1;
        }
        //
        System.out.println("text = " + text);
        System.out.println("Array = " + Arrays.toString(words));
    }
}
