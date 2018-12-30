package com.javapractice.hackerrank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromeStepsTest {
    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][] {
                {"abba", 0},
                {"ab", 1},
                {"abbotto", 3},
                {"foobar", 5}
        };
    }

    @Test(dataProvider = "provideArgs")
    public void findsMinimumSteps(String str, int expected) throws Exception {
        assertEquals(PalindromeSteps.minimumStepsToPalindrome(str), expected);
    }
}