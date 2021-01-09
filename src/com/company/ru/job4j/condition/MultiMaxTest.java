package com.company.ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int rsl = MultiMax.max(1,4,2);
        assertThat(rsl, is(4));
    }
    @Test
    public void whenThirdMax() {
        int rsl = MultiMax.max(2, 7, 12);
        assertThat(rsl, is(12));
    }
    @Test
    public void whenAreEquals() {
        int rsl = MultiMax.max(1, 1, 1);
        assertThat(rsl, is(1));
    }
}