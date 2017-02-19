package com.javapractice.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<T> {
    private Lock lock = new ReentrantLock();
    private Condition fullCondition = lock.newCondition();
    private Condition emptyCondition = lock.newCondition();

    private List<T> queue;
    private int size;

    public  MyBlockingQueue(int size) {
        queue = new ArrayList<>(size);
        this.size = size;
    }

    public void put(T val) {
        lock.lock();
        try {
            if (queue.size() > size) {
                try {
                    fullCondition.await();
                } catch (InterruptedException e) {}
                queue.add(val);
                emptyCondition.notifyAll();
            }
        } finally {
            lock.unlock();
        }
    }

    public T remove() {
        T val = null;
        lock.lock();
        try {
            try {
                emptyCondition.await();
            } catch (InterruptedException e) {}
            val = queue.remove(0);
            emptyCondition.notifyAll();
        } finally {
            lock.unlock();
        }
        return val;
    }
}
