package com.javapractice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>(m*n);
        int row = 0;
        int col = 0;
        int right = n;
        int left = 0;
        int top = 0;
        int bottom = m;

        int visited = 0;
        while (visited < m * n) {
            // go right
            for (; col < right; col++) {
                list.add(matrix[row][col]);
                visited++;
            }
            col--;
            right--;

            // go down
            for(row++; visited < m*n && row < bottom; row++) {
                list.add(matrix[row][col]);
                visited++;
            }
            row--;
            bottom--;

            // go left
            for(col--; visited < m*n && col >= left; col--) {
                list.add(matrix[row][col]);
                visited++;
            }
            col++;
            left++;

            // go up
            for(row--; visited < m*n && row > top; row--) {
                list.add(matrix[row][col]);
                visited++;
            }
            row++;
            col++;
            top++;
        }
        return list;
    }

    /**
     *
     * Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
     *
     * Example 1:
     *
     *
     * Input: n = 3
     * Output: [[1,2,3],[8,9,4],[7,6,5]]
     * Example 2:
     *
     * Input: n = 1
     * Output: [[1]]
     *
     *
     * Constraints:
     *
     * 1 <= n <= 20
     */
    public int[][] generateMatrix(int n) {
        var matrix = new int[n][n];
        doGenerate(matrix, 0, 0, 1, n*n, false);
        return matrix;
    }

    private void doGenerate(int[][] matrix, int row, int col, int cur, int total, boolean goingUp) {
        int n = matrix.length;
        if (cur > total) {
            return;
        }
        matrix[row][col] = cur;
        if (!goingUp && col + 1 < n && matrix[row][col+1] == 0) {
            // right
            doGenerate(matrix, row, col + 1, cur + 1, total, false);
        } else if (row + 1 < n && matrix[row + 1][col] == 0) {
            // down
            doGenerate(matrix, row + 1, col, cur + 1, total, false);
        } else if (col - 1 >= 0 && matrix[row][col - 1] == 0) {
            // left
            doGenerate(matrix, row, col - 1, cur + 1, total, false);
        } else if (row - 1 >= 0 && matrix[row - 1][col] == 0) {
            // up
            doGenerate(matrix, row - 1, col, cur + 1, total, true);
        } else if (goingUp && col + 1 < n) {
            doGenerate(matrix, row, col + 1, cur + 1, total, false);
        }
    }
}
