package com.company.ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        if ((n != 0) && (n != 1)) {
            for (int index = 1; index <= n; index++) {
                rsl = rsl * index;
            }
        }
        return rsl;
    }
}

