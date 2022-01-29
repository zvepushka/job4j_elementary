package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.loop.Factorial.calc;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int result = calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int result = calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}