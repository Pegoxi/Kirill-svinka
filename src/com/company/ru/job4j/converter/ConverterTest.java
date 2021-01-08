package com.company.ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert700RblThen10Euro() {
        int in = 700;
        int expected = 10;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert700RblThen11Dlr() {
        int in = 700;
        int expected = 11;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}