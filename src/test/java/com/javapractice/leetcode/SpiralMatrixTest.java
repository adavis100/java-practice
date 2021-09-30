package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class SpiralMatrixTest {
    @Test
    void solvesTestCase() {
        var matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        assertThat(spiralMatrix.spiralOrder(matrix)).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }

    @Test
    void solvesBiggerTestCase() {
        var matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        assertThat(spiralMatrix.spiralOrder(matrix)).containsExactly(1,2,3,4,8,12,11,10,9,5,6,7);
    }

    @Test
    void canGenerateSpiralMatrix() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        var matrix = spiralMatrix.generateMatrix(3);
        assertThat(matrix.length).isEqualTo(3);
        assertThat(matrix[0]).containsExactly(1, 2, 3);
        assertThat(matrix[1]).containsExactly(8, 9, 4);
        assertThat(matrix[2]).containsExactly(7, 6, 5);
    }

    @Test
    void canGenerateSpiralMatrixSize4() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        var matrix = spiralMatrix.generateMatrix(4);
        assertThat(matrix.length).isEqualTo(4);
        assertThat(matrix[0]).containsExactly(1, 2, 3, 4);
        assertThat(matrix[1]).containsExactly(12, 13, 14, 5);
        assertThat(matrix[2]).containsExactly(11,16,15,6);
        assertThat(matrix[3]).containsExactly(10, 9, 8, 7);
    }
}