package com.javapractice.hackerrank;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AddedIntegersTest {
    @Test
    public void findsAddedInts() throws Exception {
        Integer[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] a2 = {8, 2, 4, 3, 5, 6};
        List<Integer> result = AddedIntegers.findAddedIntegers(Arrays.asList(a1), Arrays.asList(a2));
        Assert.assertEquals(result.size(), 2);
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(7));
    }
}
