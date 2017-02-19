package com.javapractice.hackerrank;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @DataProvider
    public Object[][] provideArguments() {
        return new Object[][] {
            {"1+1", 2},
            {"1  +   1", 2},
            {"2 - 1", 1},
            {"2-1 + 2", 3},
            {"(1+(4+5+2)-3)+(6+8)", 23},
            {"2 - (5-6)", 3}
        };
    }

    // TODO: broken
    @Test (dataProvider = "provideArguments", enabled = false)
    public void calculatesExpectedValue(String expr, int result) throws Exception {
        assertEquals(calculator.calculate(expr), result);
    }
}
