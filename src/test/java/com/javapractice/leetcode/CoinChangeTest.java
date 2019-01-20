package com.javapractice.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CoinChangeTest {
    static Stream<Arguments> provideArgs() {
        return Stream.of(
            arguments(new int[] {1, 2, 5}, 11, 3),
            arguments(new int[] {2}, 1, -1)
            );
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    void findsMinCoins(int[] coins, int sum, int expected)  {
        CoinChange coinChange = new CoinChange();
        assertEquals(expected, coinChange.coinChange(coins, sum));
    }
}
