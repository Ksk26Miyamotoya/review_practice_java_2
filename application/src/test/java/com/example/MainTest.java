package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * サンプルテスト
 * @author A
 */
public class MainTest {
    @Test
    public void testFindMinimumValueWithEmptyArray() {
        int[] array = new int[0];
        int expected = Integer.MAX_VALUE;
        int actual = Main.findMinimumValue(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinimumValueWithSingleValue() {
        int[] array = {5};
        int expected = 5;
        int actual = Main.findMinimumValue(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinimumValueWithMultipleValues() {
        int[] array = {5, 2, 9, 1, 6};
        int expected = 1;
        int actual = Main.findMinimumValue(array);
        assertEquals(expected, actual);
    }
}
