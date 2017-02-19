package com.javapractice.codewars;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class ShiftedArrayAddTest {
    @Test
    public void test1() {
        int[][] arrayOfArrays = new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 7, 7, 7, 7, 7}};
        int[] expected = new int[]{8, 9, 10, 11, 12, 13};
        int[] result = ShiftedArrayAdd.addingShifted(arrayOfArrays, 0);
        assertNotNull(result);
        assertEquals(Arrays.toString(result), Arrays.toString(expected));
    }

    @Test
    public void test2() {
        int[][] arrayOfArrays = new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 7, 7, 7, 7, 7}};
        int[] expected = new int[]{1, 2, 3, 11, 12, 13, 7, 7, 7};
        int[] result = ShiftedArrayAdd.addingShifted(arrayOfArrays, 3);
        assertNotNull(result);
        assertEquals(Arrays.toString(result), Arrays.toString(expected));
    }

    @Test
    public void test3() {
        int[][] arrayOfArrays = new int[][] { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 7, 7, 7, -7, 7, 7 }, new int[] { 1, 1, 1, 1, 1, 1 } };
        int[] expected = new int[] { 1, 2, 3, 11, 12, 13, -6, 8, 8, 1, 1, 1 };
        int[] result = ShiftedArrayAdd.addingShifted(arrayOfArrays, 3);
        assertNotNull(result);
        assertEquals(Arrays.toString(result), Arrays.toString(expected));
    }
}
