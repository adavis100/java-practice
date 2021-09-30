package com.javapractice.leetcode;

public class ReverseWords {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            char tmp = str[str.length - i - 1];
            str[str.length - i - 1] = str[i];
            str[i] = tmp;
        }

        int i = 0;
        while (i < str.length) {
            if (str[i] != ' ') {
                int j = i;
                while (j < str.length && str[j] != ' ') {
                    j++;
                }
                reverseWord(str, i, j);
                i = j;
            }
            i++;
        }

        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (; start < str.length && str[start] == ' '; start++) {
        }
        int end = str.length - 1;
        for (; end >= 0 && str[end] == ' '; end--) {
        }

        boolean first =true;
        for (i = start; i <= end; i++) {
            if (str[i] != ' ') {
                sb.append(str[i]);
                first = true;
            } else {
                if (first) {
                    sb.append(' ');
                }
                first = false;
            }
        }
        return sb.toString();
    }

    private void reverseWord(char[] buf, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            char tmp = buf[end - i - 1];
            buf[end - i - 1] = buf[start + i];
            buf[start + i] = tmp;
        }
    }

    public void reverseWords(char[] s) {
        reverse(s, 0, s.length);

        for (int i = 0; i < s.length; i++) {
            int j = i;
            while (j < s.length && s[j] != ' ') {
                j++;
            }
            reverse(s, i, j);
            i = j;
        }
    }

    private void reverse(char[] s, int start, int end) {
        for (int i = start; i < start + (end - start) / 2; i++) {
            char tmp = s[i];
            s[i] = s[start + end - i - 1];
            s[start + end - i - 1] = tmp;
        }
    }
}
