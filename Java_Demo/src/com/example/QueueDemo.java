package com.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(65);
        priorityQueue.add(30);
//        priorityQueue.add(null);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());//first element
        System.out.println(priorityQueue.element());//throws error if queue is empty or operates like peek

        System.out.println(priorityQueue.remove());//removes first element, if empty throws error
        System.out.println(priorityQueue.poll());//works like remove, but returns null if queue is empty

        System.out.println(priorityQueue.offer(87));

        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue);


    }


}
