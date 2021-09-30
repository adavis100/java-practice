package com.javapractice.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * You are given an m x n grid where each cell can have one of three values:
 *
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 * Example 2:
 *
 * Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
 * Example 3:
 *
 * Input: grid = [[0,2]]
 * Output: 0
 * Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 *
 *
 * Constraints:
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 10
 * grid[i][j] is 0, 1, or 2.
 */
public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        var rotten = new HashSet<Coord>();
        var fresh = new HashSet<Coord>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh.add(new Coord(i, j));
                } else if (grid[i][j] == 2) {
                    rotten.add(new Coord(i, j));
                }
            }
        }

        if (rotten.isEmpty()) {
            return -1;
        }

        int minutes = 0;
        boolean changing = true;
        while (changing && fresh.size() > 0) {
            int sizeStart = fresh.size() - rotten.size();

            Set<Coord> rotting = fresh.stream().filter(it -> hasRottenNeighbor(it, rotten, m, n)).collect(Collectors.toSet());
            fresh.removeAll(rotting);
            rotten.addAll(rotting);

            minutes++;
            int sizeEnd = fresh.size() - rotten.size();
            changing = sizeStart != sizeEnd;
        }

        if (fresh.size() > 0) {
            return -1;
        } else {
            return minutes;
        }
    }

    private boolean hasRottenNeighbor(Coord cell, Set<Coord> rotten, int m, int n) {
        int x = cell.x;
        int y = cell.y;

        return (x > 0 && rotten.contains(new Coord(x - 1, y))) ||
                (x < m - 1 && rotten.contains(new Coord(x + 1, y))) ||
                (y > 0 && rotten.contains(new Coord(x, y - 1))) ||
                (y < n - 1 && rotten.contains(new Coord(x, y + 1)));
    }

    static class Coord {
        int x;
        int y;

        Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object other) {
            if (other == null) {
                return false;
            }
            if (this == other) {
                return true;
            }

            if (other.getClass() != this.getClass()) {
                return false;
            }

            Coord that = (Coord) other;
            return this.x == that.x && this.y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
