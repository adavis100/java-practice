package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CombinationSumTest {
    @Test
    void solvesExample() {
        CombinationSum sum = new CombinationSum();
        var sums = sum.combinationSum(new int[] {1,2}, 4);
        assertThat(sums).hasSize(3);
    }
}