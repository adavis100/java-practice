package com.javapractice.hackerrank;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MajorityElementTest {
    @Test
    public void findsMajorityElement() throws Exception {
        int[] nums = {1, 2, 3, 1, 4, 1, 2, 1, 1};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(majorityElement.find(nums), 1);
    }

    @Test
    public void findsMajorityWithSingleElement() throws Exception {
        int[] nums = {1};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(majorityElement.find(nums), 1);
    }

    @Test
    public void findsMajorityWithNegatives() throws Exception {
        int[] nums = {-1, -1, 2147483647};
        MajorityElement majorityElement = new MajorityElement();
        assertEquals(majorityElement.find(nums), -1);
    }
}
