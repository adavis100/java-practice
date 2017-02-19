package com.javapractice.codewars.morsecode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.split("   "))
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String morseWord) {
        return Arrays.stream(morseWord.split(" "))
                .map(MorseCode::get)
                .collect(Collectors.joining());
    }
}
