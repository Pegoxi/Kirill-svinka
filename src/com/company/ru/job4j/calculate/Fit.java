package com.company.ru.job4j.calculate;

public class Fit {
    public static double manWeight(short heightMan) {
        double result = (heightMan - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short heightWomen) {
        double result = (heightWomen - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 189;
        short heightWomen = 155;
        double women = Fit.womanWeight(heightWomen);
        double man = Fit.manWeight(heightMan);
        System.out.println(" Man 189 is " + man);
        System.out.println(" Women 155 is " + women);
    }
}
