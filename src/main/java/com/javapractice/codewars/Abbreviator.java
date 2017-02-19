package com.javapractice.codewars;

public class Abbreviator {

    public String abbreviate(String string) {
        // ...
        String [] words = string.split("[^a-zA-Z]+");
        StringBuilder sb = new StringBuilder();
        if (words.length > 0) {
            char[] chars = string.toCharArray();
            int wordCount = 0;
            int i = 0;
            while (i < chars.length) {
                if (!Character.isAlphabetic(chars[i])) {
                    sb.append(chars[i++]);
                } else {
                    sb.append(abbreviateWord(words[wordCount++]));
                    do {
                        i++;
                    } while (i < chars.length && Character.isAlphabetic(chars[i]));
                }
            }
        }
        return sb.toString();
    }

    private String abbreviateWord(String string) {
        if (string != null && string.length() > 3)
            return string.charAt(0) + String.valueOf(string.length() - 2) + string.charAt(string.length() - 1);
        else
            return string;
    }

}
