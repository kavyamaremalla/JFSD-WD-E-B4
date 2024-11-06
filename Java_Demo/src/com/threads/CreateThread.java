package com.threads;

public class CreateThread extends Thread{

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        CreateThread thread = new CreateThread();
        thread.start();
        System.out.println("Running outside thread");
    }
}

class ThreadRun implements Runnable{

    public void run() {
        System.out.println("Running thread using Runnable");
    }

    public static void main(String[] args) {
        ThreadRun obj = new ThreadRun();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Running outside thread");
    }
}