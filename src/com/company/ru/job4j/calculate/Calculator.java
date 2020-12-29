package com.company.ru.job4j.calculate;

public class Calculator {
   public static void main(String[] args) {
        int six = 6;
        int five = 5;
        int four = 4;
        int two = 2;
        int sixDivTwo = six / two;
        System.out.println(sixDivTwo);
        int fiveMinusTwo = five - two;
        System.out.println(fiveMinusTwo);
        int fourTimeTwo = four * two;
        System.out.println(fourTimeTwo);

        int size =10;
        System.out.println(size);
        size = 100;
        System.out.println(size);
        size = size - 5;
        System.out.println(size);

       Calculator.plus(100, 500);
       Calculator.plus(4, 2);
       Calculator.plus(3, 5);
    }

    public static void plus(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}
