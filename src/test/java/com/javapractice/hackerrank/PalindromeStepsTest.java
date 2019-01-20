package com.javapractice.hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

class PalindromeStepsTest {
    static Stream<Arguments> provideArgs() {
        return Stream.of(
                arguments("abba", 0),
                arguments("ab", 1),
                arguments("abbotto", 3),
                arguments("foobar", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    void findsMinimumSteps(String str, int expected)  {
        assertEquals(expected, PalindromeSteps.minimumStepsToPalindrome(str));
    }
}