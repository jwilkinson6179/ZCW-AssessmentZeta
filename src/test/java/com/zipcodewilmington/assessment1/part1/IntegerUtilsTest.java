package com.zipcodewilmington.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 15;

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer input = 5;
        Integer expected = 120;

        // : When
        Integer actual = IntegerUtils.getProductOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    /* Wilkinson: Tests for my own helper function -- edited out in case grading issues

    @Test
    public void pushOnArrayTest()
    {
        // GIVEN
        Integer[] expected = { 10, 5, 3, 9 };
        Integer[] startingArray = { 10, 5, 3 };
        Integer addedValue = 9;

        // WHEN

        Integer[] actual = IntegerUtils.pushIntegerOnArray(addedValue, startingArray);

        // THEN

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pushOnArrayTestTwo()
    {
        // GIVEN
        Integer[] expected = { 0, 9, -7 };
        Integer[] startingArray = { 0, 9 };
        Integer addedValue = -7;

        // WHEN

        Integer[] actual = IntegerUtils.pushIntegerOnArray(addedValue, startingArray);

        // THEN

        Assert.assertEquals(expected, actual);
    }

    */
}
