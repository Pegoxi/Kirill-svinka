package com.company.ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class CycleCounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = CycleCounter.sumByEven(1,10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToFifteenThenFiftySix() {
        int rsl = CycleCounter.sumByEven(2, 15);
        int expected = 56;
        assertThat(rsl, is(expected));
    }
}