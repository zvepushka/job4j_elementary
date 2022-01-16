package ru.job4j.ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double first = k + 1;
        first = first * 2;
        first = p / first;
        double second = k * first;
        double result1 = second * first;
        return result1;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
