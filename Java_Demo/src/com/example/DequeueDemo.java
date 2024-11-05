package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(78);
        deque.add(65);
        deque.add(98);

        deque.add(11);
        deque.add(28);

        deque.addFirst(3);
        deque.addLast(98);
        deque.offerLast(76);


//        deque.add(null);

//        deque.remove();//head of the queue will be removed, if empty gives error
//        deque.removeLastOccurrence(95);
//        deque.poll();
//        deque.peek();
//        deque.element();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        deque.offer(34);
        deque.offerFirst(29);
        System.out.println(deque);
    }
}
