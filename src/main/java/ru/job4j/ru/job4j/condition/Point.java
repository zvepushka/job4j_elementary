package ru.job4j.ru.job4j.condition;

public class Point {

    public static double distance(double x1, double x2, int y1, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
