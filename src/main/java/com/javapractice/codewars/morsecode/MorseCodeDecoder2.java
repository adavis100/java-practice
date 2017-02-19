package com.javapractice.codewars.morsecode;

public class MorseCodeDecoder2 {
    public static String decode(String morseCode) {
        StringBuilder sb = new StringBuilder();
        for (String morseWord : morseCode.trim().split("   ")) {
            for (String morseChar : morseWord.split(" ")) {
                sb.append(MorseCode.get(morseChar));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
