package com.javapractice.hackerrank;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp()  {
        calculator = new Calculator();
    }

    Stream<Arguments> provideArguments() {
        return Stream.of(
            arguments("1+1", 2),
            arguments("1  +   1", 2),
            arguments("2 - 1", 1),
            arguments("2-1 + 2", 3),
            arguments("(1+(4+5+2)-3)+(6+8)", 23),
            arguments("2 - (5-6)", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    @Disabled // TODO: Broken
    void calculatesExpectedValue(String expr, int result)  {
        assertEquals(result, calculator.calculate(expr));
    }
}
