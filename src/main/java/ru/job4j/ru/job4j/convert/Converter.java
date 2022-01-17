package ru.job4j.ru.job4j.convert;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2. Test result : " + passed2);
    }
}
