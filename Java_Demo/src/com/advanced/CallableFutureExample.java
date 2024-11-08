package com.advanced;

import java.util.concurrent.*;

public class CallableFutureExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> "Hello from Callable";

        Future<String> future = executor.submit(task);

        try {
            System.out.println(future.get());
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
