package com.company.ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int result = value / 70 ;
        return result;

    }

    public static int rubleToDollar(int value) {
        int result = value / 60 ;
        return result;

    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(200);
        int dollar = Converter.rubleToDollar(200);
        System.out.println("70 rubles are" + dollar + "dollar");
        System.out.println("60 rubles are" + euro + "euro");
    }
    }
