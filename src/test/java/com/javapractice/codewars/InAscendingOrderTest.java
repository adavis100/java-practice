package com.javapractice.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InAscendingOrderTest {
    @Test
    public void reportsWhetherArrayIsInAscendingOrder() throws Exception {
        assertTrue(InAscendingOrder.isAscOrder(new int[] {1}));
        assertTrue(InAscendingOrder.isAscOrder(new int[] {1,2,4,7,19}));
        assertTrue(InAscendingOrder.isAscOrder(new int[] {1,2,3,4,5}));
        assertFalse(InAscendingOrder.isAscOrder(new int[] {1,6,10,18,2,4,20}));
        assertFalse(InAscendingOrder.isAscOrder(new int[] {9,8,7,6,5,4,3,2,1}));
    }
}