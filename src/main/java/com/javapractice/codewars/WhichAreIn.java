package com.javapractice.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WhichAreIn {
    public static String [] inArray(String[] a1, String[] a2) {
        return Arrays.stream(a1).
                filter(s -> Arrays.stream(a2).anyMatch(str -> str.contains(s)))
                .sorted()
                .collect(Collectors.toList()).toArray(new String[0]);
    }

}
