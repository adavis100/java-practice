package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonSubsequenceTest {
    @Test
    void solvesFirstExample() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        assertThat(lcs.longestCommonSubsequence("abcde", "ace")).isEqualTo(3);
        assertThat(lcs.longestCommonSubsequenceDp("abcde", "ace")).isEqualTo(3);
    }

    @Test
    void solvesLongestCommonSubstring() {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        assertThat(lcs.longestCommonSubstring("abcde", "bc")).isEqualTo(2);
    }
}