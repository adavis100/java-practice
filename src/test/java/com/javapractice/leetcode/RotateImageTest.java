package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateImageTest {
    @Test
    void solvesExample1() {
        var matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);

        assertThat(matrix[0]).containsExactly(7, 4, 1);
        assertThat(matrix[1]).containsExactly(8, 5, 2);
        assertThat(matrix[2]).containsExactly(9, 6, 3);
    }

    @Test
    void solvesExample4() {
        var matrix = new int[][] {{1,2},{3, 4}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);

        assertThat(matrix[0]).containsExactly(3, 1);
        assertThat(matrix[1]).containsExactly(4, 2);
    }

    @Test
    void checksValidRotation() {
        var matrix = new int[][] {{0,0},{0, 1}};
        var target = new int[][] {{0, 0}, {1, 0}};
        RotateImage rotateImage = new RotateImage();

        assertThat(rotateImage.findRotation(matrix, target)).isTrue();
    }
}