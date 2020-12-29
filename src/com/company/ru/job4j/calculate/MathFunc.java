package com.company.ru.job4j.calculate;

public class MathFunc {
    public static int finc1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int finc2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.finc1(100);
        int result2 = MathFunc.finc1(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}
