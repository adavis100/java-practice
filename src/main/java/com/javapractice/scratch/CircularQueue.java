package com.javapractice.scratch;

public class CircularQueue <T> {
    private final T[] buf;
    private int head = 0;
    private int tail = -1;
    private int size = 0;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        buf = (T[])new Object[capacity];
        this.capacity = capacity;
    }

    void add(T item) {
        size++;
        if (size > capacity) {
            throw new IllegalStateException("Queue has exceeded capacity");
        }
        tail = (tail + 1) % capacity;
        buf[tail] = item;
    }

    public int size() {
        return size;
    }

    public T remove() {
        T elem = buf[head];
        head = (head + 1) % capacity;
        size--;
        return elem;
    }
}
