package com.javapractice.leetcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class PhoneLetterCombinationsTest {
    // Input:Digit string "23"
    // Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
    //String[] phoneLetters = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    @DataProvider
    public static Object[][] provideArgs() {
        return new Object[][] {
            new Object[] {"23", new String[] {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}},
            new Object[] {"234", new String[] {"adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi",
                                               "bdh", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi",
                                               "cdh", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi",
            }},
        };
    }

    @Test(dataProvider = "provideArgs")
    public void generatesExpectedCombinations(String s, String[] expected) throws Exception {
        PhoneLetterCombinations phone = new PhoneLetterCombinations();
        List<String> mappings = phone.letterCombinations(s);
        for (String mapping : expected) {
            assertTrue(mappings.contains(mapping), mapping + " not found in generated combinations: " + mappings);
        }
    }
}
