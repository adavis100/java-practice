package com.javapractice.misc;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        final int size = 10;
        List<Integer> sharedQueue = new ArrayList<>(size);
        Producer producer = new Producer(sharedQueue, size);
        Consumer consumer = new Consumer(sharedQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

class Producer implements Runnable {
    private final List<Integer> queue;
    private final int MAX_SIZE;

    Producer(List<Integer> sharedQueue, int size) {
        queue = sharedQueue;
        MAX_SIZE = size;
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                produce(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int count) throws InterruptedException {
        synchronized (queue) {
            while (queue.size() >= MAX_SIZE) {
                System.out.println("Queue is full -- " + Thread.currentThread().getName() + " is waiting. Size = " + queue.size());
                queue.wait();
            }
            queue.add(count);
            System.out.println("Produced " + count);
            queue.notifyAll();
        }
    }
}

class Consumer implements Runnable {
    private final List<Integer> queue;

    Consumer(List<Integer> sharedQueue) {
        queue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty -- " + Thread.currentThread().getName() + " is waiting");
                queue.wait();
            }

            int count = queue.remove(0);
            System.out.println("Consumed " + count);
            queue.notifyAll();
        }
    }
}
