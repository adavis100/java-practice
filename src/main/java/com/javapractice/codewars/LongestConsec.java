package com.javapractice.codewars;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (n < 0 || k > n || k <= 0)
            return "";

        String longest = "";
        for (int i = 0; i < n - k + 1; i++) {
            String s = concatStrs(strarr, i, k);
            if (s.length() > longest.length())
                longest = s;
        }
        return longest;
    }

    private static String concatStrs(String[] strarr, int start, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < start + k; i++) {
            sb.append(strarr[i]);
        }
        return sb.toString();
    }
}
