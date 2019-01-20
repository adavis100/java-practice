package com.javapractice.codewars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class WhichAreInTest {
    @Test
    void test1() {
        String a[] = new String[]{ "live", "arp", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertThat(WhichAreIn.inArray(a, b)).contains(r);
    }
}
