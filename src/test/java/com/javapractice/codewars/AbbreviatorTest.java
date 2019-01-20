package com.javapractice.codewars;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbbreviatorTest {

    private Abbreviator abbreviator;

    @BeforeEach
    void setUp()  {
        abbreviator = new Abbreviator();

    }

    @Test
    void handlesLongWord()  {
        assertEquals("i18n", abbreviator.abbreviate("internationalization"));
    }

    @Test
    void handlesShortWord()  {
        assertEquals("foo", abbreviator.abbreviate("foo"));
    }

    @Test
    void handlesSentence()  {
        assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", abbreviator.abbreviate("You need, need not want, to complete this code-wars mission"));
    }
}
