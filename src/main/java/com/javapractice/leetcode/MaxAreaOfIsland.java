package com.javapractice.leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;

/**
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 *
 * The area of an island is the number of cells with a value 1 in the island.
 *
 * Return the maximum area of an island in grid. If there is no island, return 0.
 */
public class MaxAreaOfIsland {
    private int m;
    private int n;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, bfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int bfs(int[][] grid, int i, int j) {
        int count = 0;
        var queueRow = new ArrayDeque<Integer>();
        var queueCol = new ArrayDeque<Integer>();
        queueRow.add(i);
        queueCol.add(j);
        grid[i][j] = -1;

        while (queueRow.size() > 0) {
            int row = queueRow.remove();
            int col = queueCol.remove();

            count++;

            if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                queueRow.add(row - 1);
                queueCol.add(col);
                grid[row - 1][col] = -1;
            }

            if (row + 1 < m && grid[row + 1][col] == 1) {
                queueRow.add(row + 1);
                queueCol.add(col);
                grid[row +  1][col] = -1;
            }

            if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                queueRow.add(row);
                queueCol.add(col - 1);
                grid[row][col - 1] = -1;
            }

            if (col + 1 < n && grid[row][col + 1] == 1) {
                queueRow.add(row);
                queueCol.add(col + 1);
                grid[row][col + 1] = -1;
            }
        }
        return count;
    }
}
