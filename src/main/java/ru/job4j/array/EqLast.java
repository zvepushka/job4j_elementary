package ru.job4j.array;

public class EqLast {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length - 1; i++) {
            if (left[left.length - 1] == right[right.length - 1]) {
                return true;
            }
        }
        return false;
    }
}