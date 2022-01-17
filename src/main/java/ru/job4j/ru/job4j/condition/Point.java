package ru.job4j.ru.job4j.condition;

public class Point {

    public static double distance(double x1, double x2, int y1, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double two = Math.pow(y, 2);
        double firstPlusTwo = first + two;
        double result = Math.sqrt(firstPlusTwo);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
