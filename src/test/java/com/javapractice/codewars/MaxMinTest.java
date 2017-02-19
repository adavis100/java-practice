package com.javapractice.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxMinTest {
    @Test
    public void testExamples() throws Exception {
        MaxMin maxMin = new MaxMin();
        assertEquals(maxMin.min(new int[]{-52, 56, 30, 29, -54, 0, -110}), -110);
        assertEquals(maxMin.min(new int[]{42, 54, 65, 87, 0}), 0);
        assertEquals(maxMin.max(new int[]{4,6,2,1,9,63,-134,566}), 566);
        assertEquals(maxMin.max(new int[]{5}), 5);
    }
}
