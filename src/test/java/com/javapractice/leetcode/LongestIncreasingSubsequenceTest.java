package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestIncreasingSubsequenceTest {
    @Test
    void findsLongestSubsequence() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        assertThat(lis.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18})).isEqualTo(4);
    }
}