package com.javapractice.codewars;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AbbreviatorTest {

    private Abbreviator abbreviator;

    @BeforeMethod
    public void setUp() throws Exception {
        abbreviator = new Abbreviator();

    }

    @Test
    public void handlesLongWord() throws Exception {
        assertEquals(abbreviator.abbreviate("internationalization"), "i18n");
    }

    @Test
    public void handlesShortWord() throws Exception {
        assertEquals(abbreviator.abbreviate("foo"), "foo");
    }

    @Test
    public void handlesSentence() throws Exception {
        assertEquals(abbreviator.abbreviate("You need, need not want, to complete this code-wars mission"), "You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n");
    }
}
