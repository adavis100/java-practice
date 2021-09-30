package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {
    @Test
    void solvesFirstExample() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[] {2,7,11,15}, 9);
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(1);
    }

    @Test
    void solvesSecondExample() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[] {3,2,4}, 6);
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(2);
    }
}