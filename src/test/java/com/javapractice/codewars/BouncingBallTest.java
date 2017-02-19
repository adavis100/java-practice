package com.javapractice.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BouncingBallTest {

    @Test
    public void handlesBadInput() {
        assertEquals(BouncingBall.bouncingBall(3.0, 1.0, 1.5), -1);
        assertEquals(BouncingBall.bouncingBall(-3.0, 0.5, 1.5), -1);
        assertEquals(BouncingBall.bouncingBall(3.0, 0.5, 3.5), -1);
        assertEquals(BouncingBall.bouncingBall(3.0, 0.5, 3.0), -1);
        assertEquals(BouncingBall.bouncingBall(0, 0.5, 0), -1);
        assertEquals(BouncingBall.bouncingBall(3.0, 0, 1.0), -1);
    }

    @Test
    public void handlesSingleFall() throws Exception {
        assertEquals(BouncingBall.bouncingBall(3.0, 0.5, 2.0), 1);
    }

    @Test
    public void test1() {
        assertEquals(BouncingBall.bouncingBall(3.0, 0.66, 1.5), 3);
    }
    @Test
    public void test2() {
        assertEquals(BouncingBall.bouncingBall(30.0, 0.66, 1.5), 15);
    }
}
