package com.javapractice.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String weights) {
        Comparator<String> compareDigitCount = (n1, n2) -> Integer.compare(sumDigits(n1), sumDigits(n2));
        return Arrays.stream(weights.split("\\s+"))
                .sorted(compareDigitCount.thenComparing(Function.identity()))
                .collect(Collectors.joining(" "));
    }

    private static int sumDigits(String n) {
        return n.chars().map(Character::getNumericValue).sum();
    }
}
