package com.javapractice.hackerrank;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CutSticksTest {
    @Test
    public void performsSingleCut() throws Exception {
        List<Integer> startSticks = Arrays.asList(5, 2, 2, 6, 7);
        List<Integer> sticks = CutSticks.doCut(startSticks);
        Assert.assertEquals(sticks.size(), 3);
    }
}
