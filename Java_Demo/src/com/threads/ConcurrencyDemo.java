package com.threads;

public class ConcurrencyDemo extends Thread{

    public int amount = 0;


    public void run(){
        System.out.println("from run method");
        amount++;
    }

    public static void main(String[] args) {
        ConcurrencyDemo demo = new ConcurrencyDemo();
        demo.start();
        try {
            demo.wait(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (demo.isAlive()){
            System.out.println("Waiting...");
        }
//        demo.join();
        System.out.println(demo.amount);//0
        demo.amount++;
        System.out.println(demo.amount);
    }



}
