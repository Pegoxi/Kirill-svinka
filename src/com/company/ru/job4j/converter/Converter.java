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
        int in = 700;
        int expectedEuro = 10;
        int expectedDollars = 11;
        int outEuro = rubleToEuro(in);
        int outDollars = rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollars = expectedDollars == outDollars;
        int euro = Converter.rubleToEuro(700);
        int dollars = Converter.rubleToDollar(700);
        System.out.println("700 rubles are " + euro + " euro; " + dollars + " dollars" + " Test result Euro/Dollars: " + passedEuro + " / " + passedDollars);
}

    }

