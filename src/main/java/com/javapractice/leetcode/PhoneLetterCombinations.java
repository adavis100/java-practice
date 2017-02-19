package com.javapractice.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.

 A mapping of digit to letters (just like on the telephone buttons) is given below.


 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 1 -> a


 */
public class PhoneLetterCombinations {
    String[] phoneLetters = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

//    public List<String> letterCombinations(String digits) {
//        List<String> combinations = new ArrayList<>();
//        if (digits.isEmpty())
//            return combinations;
//        int num = digits.charAt(0) - '0';
//        String remaining = digits.substring(1);
//        List<String> tailCombinations = letterCombinations(remaining);
//        String letters = phoneLetters[num];
//        for (char letter : letters.toCharArray()) {
//            if (tailCombinations.isEmpty())
//                combinations.add(String.valueOf(letter));
//            else
//                combinations.addAll(tailCombinations.stream()
//                    .map(s -> letter + s)
//                    .collect(Collectors.toList()));
//        }
//        return combinations;
//    }
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits.isEmpty())
            return combinations;
        dfsHelper(digits, 0, "", combinations);
        return combinations;
    }

    private void dfsHelper(String digits, int start, String prefix, List<String> combinations) {
        if (prefix.length() == digits.length()) {
            combinations.add(prefix);
            return;
        }
        int i = digits.charAt(start) - '0';
        for (char letter : phoneLetters[i].toCharArray()) {
           dfsHelper(digits, start+1, prefix + letter, combinations);
        }
    }

}
