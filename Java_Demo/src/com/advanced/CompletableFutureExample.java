package com.advanced;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello, this is from Completable Future!")
                .thenApply(result -> result + " Welcome to the session!")
                .thenAccept(System.out::println);
    }
}
