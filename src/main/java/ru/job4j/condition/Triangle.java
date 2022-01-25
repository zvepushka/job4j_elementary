package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static boolean notExist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean result = exist(10, 15, 12);
        boolean result2 = notExist(10, 1, 1);
        System.out.println(result);
        System.out.println(result2);
    }
}
