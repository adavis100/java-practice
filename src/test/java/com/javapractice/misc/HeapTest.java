package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HeapTest {

    @Test
    void insertsIntoEmptyHeap() {
        var heap = new Heap();
        heap.insert(10);
        assertThat(heap.getMin()).isEqualTo(10);
    }

    @Test
    void insertsMultipleItemsAndGetsMin() {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        assertThat(heap.getMin()).isEqualTo(5);
        assertThat(heap.size()).isEqualTo(4);
    }

    @Test
    void removesMinItem() {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        assertThat(heap.remove()).isEqualTo(5);
        assertThat(heap.remove()).isEqualTo(10);
        assertThat(heap.remove()).isEqualTo(20);
        assertThat(heap.size()).isEqualTo(1);
    }

    @Test
    void expandsBuffer() {
        var heap = new Heap(2);
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
    }
}