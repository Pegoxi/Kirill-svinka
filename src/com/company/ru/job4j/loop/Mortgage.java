package com.company.ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double sum = amount;
        while (sum > 0) {
            sum = sum + sum * (percent / 100) - salary;
            year += 1;
        }
        return year;
    }
}
