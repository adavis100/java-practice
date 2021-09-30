package com.javapractice.scratch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircularQueueTest {
    @Test
    void addsQueueElements() {
        var queue = new CircularQueue<String>(4);
        queue.add("foo");
        queue.add("bar");
        assertThat(queue.size()).isEqualTo(2);
    }

    @Test
    void removesAddedQueueElements() {
        var queue = new CircularQueue<String>(4);
        queue.add("foo");
        queue.add("bar");
        assertThat(queue.remove()).isEqualTo("foo");
        assertThat(queue.remove()).isEqualTo("bar");
        assertThat(queue.size()).isEqualTo(0);
    }

    @Test
    void addsAndRemovesCircularly() {
        var queue = new CircularQueue<String>(3);
        queue.add("foo");
        queue.add("bar");
        queue.add("baz");
        assertThat(queue.remove()).isEqualTo("foo");
        assertThat(queue.remove()).isEqualTo("bar");
        assertThat(queue.remove()).isEqualTo("baz");
        queue.add("my");
        queue.add("word");
        assertThat(queue.remove()).isEqualTo("my");
        assertThat(queue.remove()).isEqualTo("word");
    }
}