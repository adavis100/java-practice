package com.javapractice.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxMinTest {
    @Test
    void testExamples()  {
        MaxMin maxMin = new MaxMin();
        assertEquals(-110, maxMin.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, maxMin.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, maxMin.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, maxMin.max(new int[]{5}));
    }
}
