package com.javapractice.misc;

public class Heap {
    private int[] buffer;
    private int maxSize;
    private int size;
    private static final int INITIAL_SIZE = 64;

    public Heap() {
        this(INITIAL_SIZE);
    }

    public Heap(int initialMaxSize) {
        buffer = new int[initialMaxSize];
        size = 0;
        maxSize = initialMaxSize;
    }

    public int size() {
        return size;
    }

    public void insert(int num) {
        if (size == maxSize) {
           maxSize = maxSize * 2;
           var newBuffer = new int[maxSize];
           System.arraycopy(buffer, 0, newBuffer, 0, size);
           buffer = newBuffer;
        }

        if (size == 0) {
            buffer[0] = num;
        } else {
            int i = size;
            buffer[i] = num;
            while (i > 0 && buffer[i] < buffer[getParent(i)]) {
                swap(i, getParent(i));
                i = getParent(i);
            }
        }
        size++;
    }

    private int getParent(int i) {
        return (i + 1) / 2 - 1;
    }

    private void swap(int i, int j) {
        int tmp = buffer[i];
        buffer[i] = buffer[j];
        buffer[j] = tmp;
    }

    public int getMin() {
        return buffer[0];
    }

    public int remove() {
        int min = buffer[0];
        buffer[0] = buffer[size - 1];
        size--;
        heapify(0);
        return min;
    }

    private void heapify(int root) {
        int l = getLeftChild(root);
        int r = getRightChild(root);
        if (l < size && r < size &&
                buffer[root] > buffer[l] && buffer[l] <= buffer[r]) {
            swap(root, l);
            heapify(l);
        } else if (l < size && r < size &&
                buffer[root] > buffer[r] && buffer[l] > buffer[r]) {
            swap(root, r);
            heapify(r);
        } else if(l < size && buffer[root] > buffer[l]) {
            swap(root, l);
            heapify(l);
        }
    }

    private int getLeftChild(int i) {
        return 2 * i + 1;
    }

    private int getRightChild(int i) {
        return 2 * i + 2;
    }
}
