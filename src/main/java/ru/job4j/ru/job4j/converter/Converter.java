package ru.job4j.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rubleToEuro = value / 70;
        return rubleToEuro;
    }

    public static float rubleToDollar(float value) {
        float dollar = value / 60;
        return dollar;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
