package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RottenOrangesTest {
    /**
     Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
     Output: 4
     */
    @Test
    void solvesExample() {
        RottenOranges rottenOranges = new RottenOranges();
        int[][] grid = new int[][]  {{2,1,1},{1,1,0},{0,1,1}};
        assertThat(rottenOranges.orangesRotting(grid)).isEqualTo(4);
    }
}