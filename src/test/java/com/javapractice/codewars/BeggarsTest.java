package com.javapractice.codewars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BeggarsTest {
    @Test
    void tester()  {
        // Basic tests
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
        assertThat(Beggars.beggars(test, 1)).containsExactly(a1);
        assertThat(Beggars.beggars(test, 2)).containsExactly(a2);
        assertThat(Beggars.beggars(test, 3)).containsExactly(a3);
        assertThat(Beggars.beggars(test, 6)).containsExactly(a4);
        assertThat(Beggars.beggars(test, 0)).containsExactly(a5);
    }
}
