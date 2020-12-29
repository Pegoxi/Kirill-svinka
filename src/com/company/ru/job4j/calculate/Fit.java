package com.company.ru.job4j.calculate;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 189;
        height = 155;
        double women = Fit.womanWeight(height);
        double man = Fit.manWeight(height);
        System.out.println("Man 189 is " + man);
        System.out.println("Women 155 is " + women);
    }
}
