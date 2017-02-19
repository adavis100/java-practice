package com.javapractice.codewars;

public class ZodiacKata {
    private static String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
    private static String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};
    public static String chineseZodiac(int year) {
        int yearsSinceEpoch = year - 1924;
        return elements[(yearsSinceEpoch / 2) % 5] + " " + animals[yearsSinceEpoch % 12];
    }
}
