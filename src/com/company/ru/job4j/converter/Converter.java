package com.company.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70 ;
        return result;

    }

    public static float rubleToDollar(float value) {
        float result = value / 60 ;
        return result;

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(200);
        float dollar = Converter.rubleToDollar(200);
        System.out.println("70 rubles are " + dollar + " dollar ");
        System.out.println("60 rubles are " + euro + " euro ");
    }
}
