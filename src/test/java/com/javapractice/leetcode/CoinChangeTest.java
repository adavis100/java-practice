package com.javapractice.leetcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CoinChangeTest {
    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][] {
            new Object[] {new int[] {1, 2, 5}, 11, 3},
            new Object[] {new int[] {2}, 1, -1},
        };
    }

    @Test (dataProvider = "provideArgs")
    public void findsMinCoins(int[] coins, int sum, int expected) throws Exception {
        CoinChange coinChange = new CoinChange();
        assertEquals(coinChange.coinChange(coins, sum), expected);
    }
}
