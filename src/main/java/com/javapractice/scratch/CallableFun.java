package com.javapractice.scratch;

import java.util.concurrent.*;

public class CallableFun {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = () -> 10;
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(callable);
        if (future.isDone())
            System.out.println(future.get());
    }
}
