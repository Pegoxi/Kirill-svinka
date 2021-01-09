package com.company.ru.job4j.condition;

public class Max {
    public static int findMax (int left, int right) {
        int rsl = left >= right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = findMax(18, 20);
        System.out.println(rsl);
    }
}
