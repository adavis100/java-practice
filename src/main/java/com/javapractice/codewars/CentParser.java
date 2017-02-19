package com.javapractice.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CentParser {
    public static Integer toCents(String price) {
        Matcher matcher = Pattern.compile("^\\$(\\d+)\\.(\\d\\d)$").matcher(price);
        Integer result = null;
        if (matcher.matches()) {
            String dollars = matcher.group(1);
            String cents = matcher.group(2);
            result = Integer.valueOf(dollars) * 100 + Integer.valueOf(cents);
        }
        return result;
    }
}
