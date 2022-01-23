package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax12To6Then12() {
        int left = 12;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To12Then12() {
        int left = 12;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To12Then12() {
        int left = 6;
        int right = 12;
        int result = Max.max(left, right);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}