package com.company.ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int firstAndSecond = first >= second ? first : second;
        int rsl = firstAndSecond >= third ? firstAndSecond : third;
        return rsl;
    }
}