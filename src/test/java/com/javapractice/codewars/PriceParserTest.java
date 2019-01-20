package com.javapractice.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class PriceParserTest {
    @Test
    void parsesCentsInPrice()  {
        assertNull(CentParser.toCents(""));
        assertNull(CentParser.toCents("1"));
        assertNull(CentParser.toCents("1.23"));
        assertNull(CentParser.toCents("$1"));
        assertEquals(CentParser.toCents("$1.23"), Integer.valueOf(123));
        assertEquals(CentParser.toCents("$99.99"), Integer.valueOf(9999));
        assertEquals(CentParser.toCents("$12345678.90"), Integer.valueOf(1234567890));
        assertEquals(CentParser.toCents("$9.69"), Integer.valueOf(969));
        assertEquals(CentParser.toCents("$9.70"), Integer.valueOf(970));
        assertEquals(CentParser.toCents("$9.71"), Integer.valueOf(971));
        assertNull(CentParser.toCents("$1.23\n"));
        assertNull(CentParser.toCents("\n$1.23"));
        assertEquals(CentParser.toCents("$0.69"), Integer.valueOf(69));
        assertNull(CentParser.toCents("$9.69$4.3.7"));
        assertNull(CentParser.toCents("$9.692"));
    }
}
