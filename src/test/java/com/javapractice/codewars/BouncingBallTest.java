package com.javapractice.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BouncingBallTest {

    @Test
    void handlesBadInput() {
        assertEquals(-1, BouncingBall.bouncingBall(3.0, 1.0, 1.5));
        assertEquals(-1, BouncingBall.bouncingBall(-3.0, 0.5, 1.5));
        assertEquals(-1, BouncingBall.bouncingBall(3.0, 0.5, 3.5));
        assertEquals(-1, BouncingBall.bouncingBall(3.0, 0.5, 3.0));
        assertEquals(-1, BouncingBall.bouncingBall(0, 0.5, 0));
        assertEquals(-1, BouncingBall.bouncingBall(3.0, 0, 1.0));
    }

    @Test
    void handlesSingleFall()  {
        assertEquals(1, BouncingBall.bouncingBall(3.0, 0.5, 2.0));
    }

    @Test
    void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
}
