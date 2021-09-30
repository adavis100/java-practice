package com.javapractice.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TicTacToeTest {
    @Test
    void playsExampleGame() {
        TicTacToe ticTacToe = new TicTacToe(3);
        //[[3], [0, 0, 1], [0, 2, 2], [2, 2, 1], [1, 1, 2], [2, 0, 1], [1, 0, 2], [2, 1, 1]]
        //[null,0,0,0,0,0,0,1]
        assertThat(ticTacToe.move(0, 0, 1)).isEqualTo(0);
        assertThat(ticTacToe.move(0, 2, 2)).isEqualTo(0);
        assertThat(ticTacToe.move(2, 2, 1)).isEqualTo(0);
        assertThat(ticTacToe.move(1, 1, 2)).isEqualTo(0);
        assertThat(ticTacToe.move(2, 0, 1)).isEqualTo(0);
        assertThat(ticTacToe.move(1, 0, 2)).isEqualTo(0);
        assertThat(ticTacToe.move(2, 1, 1)).isEqualTo(1);
    }
}