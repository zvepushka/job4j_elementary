package ru.job4j.ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = a + b + c;
        p = p / 2;
        double first = p - a;
        double second = p - b;
        double third = p - c;
        double result = first * second;
        result = result * third;
        result = result * p;
        double rsl = Math.sqrt(result);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
