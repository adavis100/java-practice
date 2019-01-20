package com.javapractice.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;


public class PhoneLetterCombinationsTest {
    // Input:Digit string "23"
    // Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    //String[] phoneLetters = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static Stream<Arguments> provideArgs() {
        return Stream.of(
            arguments("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
            arguments("234", List.of("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
                                               "bdh", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi",
                                               "cdh", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"
            ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgs")
    public void generatesExpectedCombinations(String s, List<String> expected)  {
        PhoneLetterCombinations phone = new PhoneLetterCombinations();
        List<String> mappings = phone.letterCombinations(s);
        for (String mapping : expected) {
            assertThat(mappings).describedAs(mapping + " not found in generated combinations: " + mappings)
                                .contains(mapping);
        }
    }
}
