package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KSumTest {
    private KSum kSum = new KSum();

    @Test
    void findsTwoSum() {
        assertThat(kSum.twoSum(new int[] {2,7,11,15}, 9)).contains(0, 1);
    }
}