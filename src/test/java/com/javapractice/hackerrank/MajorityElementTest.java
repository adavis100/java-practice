package com.javapractice.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MajorityElementTest {
    @Test
    void findsMajorityElement()  {
        int[] nums = {1, 2, 3, 1, 4, 1, 2, 1, 1};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(1, majorityElement.find(nums));
    }

    @Test
    void findsMajorityWithSingleElement()  {
        int[] nums = {1};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(1, majorityElement.find(nums));
    }

    @Test
    void findsMajorityWithNegatives()  {
        int[] nums = {-1, -1, 2147483647};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(-1, majorityElement.find(nums));
    }
}
