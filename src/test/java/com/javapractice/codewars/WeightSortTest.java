package com.javapractice.codewars;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WeightSortTest {
    @DataProvider
    public Object[][] provideArgs() {
        return new Object[][]{
                {"2 10", "10 2"},
                {"103 123 4444 99 2000", "2000 103 123 4444 99"},
                {"2000 10003 1234000 44444444 9999 11 11 22 123", "11 11 2000 10003 22 123 1234000 44444444 9999"},
                {"56 65 74 100 99 68 86 180 90", "100 180 90 56 65 74 68 86 99"}
        };
    }

    @Test (dataProvider = "provideArgs")
    public void sortsInExpectedOrder(String weights, String result) {
        assertEquals(WeightSort.orderWeight(weights), result);
    }
}
