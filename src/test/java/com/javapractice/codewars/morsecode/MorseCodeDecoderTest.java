package com.javapractice.codewars.morsecode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MorseCodeDecoderTest {
    @Test
    public void decodesExampleString() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }

    @Test(enabled = false) // TODO: fix
    public void handlesLeadingAndTrailingWhitespace() throws Exception {
        assertEquals(MorseCodeDecoder.decode("     .... . -.--   .--- ..- -.. .    "), "HEY JUDE");
    }

    @Test(enabled = false) // TODO: fix
    public void handlesSplitWithSpaces() throws Exception {
        assertEquals(MorseCodeDecoder.decode("   ...."), "H");
    }
}
