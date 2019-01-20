package com.javapractice.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ZodiacKataTest {
    @Test
    void exampleTests(){
        assertEquals("Wood Snake", ZodiacKata.chineseZodiac(1965), "Wood Snake");
        assertEquals("Earth Tiger", ZodiacKata.chineseZodiac(1938), "Earth Tiger");
        assertEquals("Earth Tiger", ZodiacKata.chineseZodiac(1998), "Earth Tiger");
        assertEquals("Fire Monkey", ZodiacKata.chineseZodiac(2016), "Fire Monkey");
        assertEquals("Wood Rat", ZodiacKata.chineseZodiac(1924), "Wood Rat");
        assertEquals("Earth Monkey", ZodiacKata.chineseZodiac(1968), "Earth Monkey");
        assertEquals("Water Dog", ZodiacKata.chineseZodiac(2162), "Water Dog");
    }
}
