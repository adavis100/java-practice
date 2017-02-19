package com.javapractice.codewars;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ZodiacKataTest {
    @Test
    public void exampleTests(){
        assertEquals(ZodiacKata.chineseZodiac(1965), "Wood Snake", "Wood Snake");
        assertEquals(ZodiacKata.chineseZodiac(1938), "Earth Tiger", "Earth Tiger");
        assertEquals(ZodiacKata.chineseZodiac(1998), "Earth Tiger", "Earth Tiger");
        assertEquals(ZodiacKata.chineseZodiac(2016), "Fire Monkey", "Fire Monkey");
        assertEquals(ZodiacKata.chineseZodiac(1924), "Wood Rat", "Wood Rat");
        assertEquals(ZodiacKata.chineseZodiac(1968), "Earth Monkey", "Earth Monkey");
        assertEquals(ZodiacKata.chineseZodiac(2162), "Water Dog", "Water Dog");
    }
}
