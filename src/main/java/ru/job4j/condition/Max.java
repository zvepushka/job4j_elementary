package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int msg = max(12, 6);
        System.out.println(msg);
    }
}
