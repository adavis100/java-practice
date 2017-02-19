package com.javapractice.codewars;



import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "live", "arp", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertThat(WhichAreIn.inArray(a, b), is(r));
    }
}
