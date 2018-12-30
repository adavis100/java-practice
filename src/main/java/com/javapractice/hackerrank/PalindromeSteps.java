package com.javapractice.hackerrank;

public class PalindromeSteps {

    static int minimumStepsToPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isPalindrome(str.substring(i))) {
                return i;
            }
        }
        return str.length();
    }

    private static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
