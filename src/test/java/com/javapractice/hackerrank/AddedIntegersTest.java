package com.javapractice.hackerrank;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AddedIntegersTest {
    @Test
    public void findsAddedInts()  {
        Integer[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] a2 = {8, 2, 4, 3, 5, 6};
        List<Integer> result = AddedIntegers.findAddedIntegers(Arrays.asList(a1), Arrays.asList(a2));
        assertEquals(2, result.size());
        assertThat(result).contains(1);
        assertThat(result).contains(7);
    }
}
