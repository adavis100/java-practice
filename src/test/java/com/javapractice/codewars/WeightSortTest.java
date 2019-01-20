package com.javapractice.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class WeightSortTest {
    static Stream<Arguments> provideArgs() {
        return Stream.of(
                arguments("2 10", "10 2"),
                arguments("103 123 4444 99 2000", "2000 103 123 4444 99"),
                arguments("2000 10003 1234000 44444444 9999 11 11 22 123", "11 11 2000 10003 22 123 1234000 44444444 9999"),
                arguments("56 65 74 100 99 68 86 180 90", "100 180 90 56 65 74 68 86 99")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    void sortsInExpectedOrder(String weights, String result) {
        assertEquals(WeightSort.orderWeight(weights), result);
    }
}
