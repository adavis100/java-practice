package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MatrixSearchTest {
    @Test
    void handlesTestInput() {
        MatrixSearch matrixSearch = new MatrixSearch();
        int[][] matrix = new int[][] {new int[] {1,3,5,7}, new int[] {10,11,16,20}, new int[] {23,30,34,60}};

        assertThat(matrixSearch.searchMatrix(matrix, 16)).isTrue();

        matrix = new int[][] {new int[] {1}};
        assertThat(matrixSearch.searchMatrix(matrix, 2)). isFalse();
    }
}