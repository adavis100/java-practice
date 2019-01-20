package com.javapractice.codewars.morsecode;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MorseCodeDecoderTest {
    @Test
    void decodesExampleString() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    @Disabled // TODO: fix
    void handlesLeadingAndTrailingWhitespace()  {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode("     .... . -.--   .--- ..- -.. .    "));
    }

    @Test
    @Disabled // TODO: Fix
    void handlesSplitWithSpaces()  {
        assertEquals("H", MorseCodeDecoder.decode("   ...."));
    }
}
