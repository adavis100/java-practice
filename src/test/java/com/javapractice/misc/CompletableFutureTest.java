package com.javapractice.misc;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CompletableFutureTest {
    @Test
    void canGetValueFromCompletableFuture() throws ExecutionException, InterruptedException {
        var future = CompletableFuture.supplyAsync(() -> "Hello");

        assertThat(future.get()).isEqualTo("Hello");
    }

    @Test
    void canProcessResultOfCompletableFutures() throws ExecutionException, InterruptedException {
        var completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
        var future = completableFuture.thenApply(s -> s + " world");

        assertThat(future.get()).isEqualTo("Hello world");
    }

    @Test
    void canComposeCompletableFutures() throws ExecutionException, InterruptedException {
        var future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " world"));
        assertThat(future.get()).isEqualTo("Hello world");
    }

    @Test
    void canCombineCompletableFutures() throws ExecutionException, InterruptedException {
        var future = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(() -> " world"), (s1, s2) -> s1 + s2);
        assertThat(future.get()).isEqualTo("Hello world");
    }

    @Test
    void canJoinCompletableFutures() {
        var future1 = CompletableFuture.supplyAsync(() -> "Hi");
        var future2 = CompletableFuture.supplyAsync(() -> "there");
        var future3 = CompletableFuture.supplyAsync(() -> "Bob");

        var combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        assertThat(combined).isEqualTo("Hi there Bob");
    }
}