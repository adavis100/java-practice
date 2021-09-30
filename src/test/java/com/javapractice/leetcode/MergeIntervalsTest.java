package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeIntervalsTest {
    @Test
    void merges() {
        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
        MergeIntervals merge = new MergeIntervals();
        int[][] merged = merge.merge(intervals);
        assertThat(merged).hasDimensions(3, 2);
        assertThat(merged[0]).containsExactly(1, 6);
        assertThat(merged[1]).containsExactly(8, 10);
        assertThat(merged[2]).containsExactly(15, 18);
    }
}