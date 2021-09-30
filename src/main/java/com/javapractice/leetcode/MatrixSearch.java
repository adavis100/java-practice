package com.javapractice.leetcode;

/**
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */
public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = findTargetColumn(matrix, target);
        return search(matrix[col], 0, matrix[col].length, target);
    }

    private int findTargetColumn(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid][0] == target) {
                return mid;
            } else if (matrix[mid][0] > target &&
                    (mid - 1) >= 0 && matrix[mid - 1][0] <= target) {
                return mid - 1;
            } else if (matrix[mid][0] < target &&
                    ((mid + 1) == matrix.length || matrix[mid + 1][0] > target)) {
                return mid;
            } else if (matrix[mid][0] > target) {
                end = mid - 1;
            } else if (matrix[mid][0] < target) {
                start = mid + 1;
            }
        }
        return 0;
    }

    private boolean search(int[] array, int start, int end, int target) {
        if (end < start) {
            return false;
        }

        int mid = start + (end - start) / 2;
        if (mid >= array.length) {
            return false;
        }
        if (array[mid] == target) {
            return true;
        } else if (array[mid] > target) {
            return search(array, start, mid - 1, target);
        } else { // if (array[mid] < target) {
            return search(array, mid + 1, end, target);
        }
    }
}
