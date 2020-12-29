package com.company.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result =Math.sqrt((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double resultDop = Point.distance(0, 1, 5, 6);
        System.out.println("result (0, 1) to (5, 6)" + resultDop);
    }
}
