package com.javapractice.leetcode;

class TicTacToe {
    private final int[] rows;
    private final int[] cols;
    private final int n;
    private int diagonal;
    private int reverseDiagonal;

    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];
        diagonal = 0;
        reverseDiagonal = 0;
        this.n = n;
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        switch (player) {
            case 1 -> {
                rows[row]++;
                cols[col]++;
                if (row == col) {
                    diagonal++;
                }
                if (row + col == n - 1) {
                    reverseDiagonal++;
                }
            }
            case 2 -> {
                rows[row]--;
                cols[col]--;
                if (row == col) {
                    diagonal--;
                }
                if (row + col == n - 1) {
                    reverseDiagonal--;
                }
            }
        }

        if (rows[row] == n || cols[col] == n || diagonal == n || reverseDiagonal == n) {
            return 1;
        } else if (rows[row] == -n || cols[col] == -n || diagonal == -n || reverseDiagonal == -n) {
            return 2;
        } else {
            return 0;
        }
    }
}