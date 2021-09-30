package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HashTableTest {
    @Test
    void canPutAndGet() {
        HashTable<String, String> table = new HashTable<>();
        table.put("foo", "bar");
        table.put("food", "bad");
        table.put("good", "food");
        table.put("fire", "bad");

        assertThat(table.get("foo")).isEqualTo("bar");
        assertThat(table.get("food")).isEqualTo("bad");
        assertThat(table.get("good")).isEqualTo("food");
        assertThat(table.get("fire")).isEqualTo("bad");
    }
}