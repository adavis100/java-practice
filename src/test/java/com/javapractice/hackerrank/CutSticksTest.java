package com.javapractice.hackerrank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CutSticksTest {
    @Test
    void performsSingleCut()  {
        List<Integer> startSticks = Arrays.asList(5, 2, 2, 6, 7);
        List<Integer> sticks = CutSticks.doCut(startSticks);
        assertEquals(3, sticks.size());
    }
}
