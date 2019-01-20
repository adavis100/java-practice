package com.javapractice.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MinArrayIncrementTest {
    static Stream<Arguments> provideArgs() {
        return Stream.of(arguments(new int[] {1, 2, 2}, 1),
                         arguments(new int[] {1, 1, 1, 1}, 6),
                         arguments(new int[] {3,2,1,2,1,7}, 6));
    }


    @ParameterizedTest
    @MethodSource("provideArgs")
    void computesMinArrayIncrement(int[] array, int expected) {
        MinArrayIncrement solver = new MinArrayIncrement();
        assertThat(solver.minIncrementForUnique(array)).isEqualTo(expected);
    }

}