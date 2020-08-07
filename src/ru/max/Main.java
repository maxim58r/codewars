package ru.max;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Boolean[] arrayOfSheeps = {
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        Boolean[] arrayOfSheeps1 = {null};
        int[] a = new int[]{};
        int[] b = new int[0];
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(AreSame.comp(a, b));
        System.out.println(YesOrNo.boolToWord(true));
        System.out.println(Counter.countSheeps(arrayOfSheeps1));
    }
}

class YesOrNo {
    public static String boolToWord(boolean b) {
//        String s;
//        if (b) s = "Yes";
//        else s = "No";
//        return s;
        return b ? "Yes" : "No";
    }
}

class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        if (arrayOfSheeps != null) {
            for (Boolean arrayOfSheep : arrayOfSheeps) {
                if (arrayOfSheep != null && arrayOfSheep) {
                    count++;
                }
            }
        } else throw new NullPointerException();
        return count;
    }
}

class AreSame {
    public static boolean comp(int[] a, int[] b) {
        int[] w;
        int[] q;
        if ((a != null && b != null) && (a.length == b.length)) {
            w = Arrays.stream(a).sorted().map(x -> x * x).toArray();
            q = Arrays.stream(b).sorted().toArray();
        }
        else return false;
        return Arrays.equals(w, q);
    }
}
