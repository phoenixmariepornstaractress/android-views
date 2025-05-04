package com.zarinpal.views;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for basic arithmetic.
 *
 * See: http://d.android.com/tools/testing
 */
public class ExampleUnitTest {

    @Test
    public void testAddition_isCorrect() {
        int expected = 4;
        int actual = 2 + 2;
        assertEquals("Addition result should be 4", expected, actual);
    }

    @Test
    public void testSubtraction_isCorrect() {
        int expected = 0;
        int actual = 2 - 2;
        assertEquals("Subtraction result should be 0", expected, actual);
    }

    @Test
    public void testMultiplication_isCorrect() {
        int expected = 4;
        int actual = 2 * 2;
        assertEquals("Multiplication result should be 4", expected, actual);
    }

    @Test
    public void testDivision_isCorrect() {
        int expected = 1;
        int actual = 2 / 2;
        assertEquals("Division result should be 1", expected, actual);
    }
} 
