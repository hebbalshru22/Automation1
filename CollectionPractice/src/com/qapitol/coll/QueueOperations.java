package com.qapitol.day3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

    public static void main(String[] args) {

        // Queue Operation ;
        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(8);
        queue.offer(2);
        queue.offer(5);

        deque.addAll(queue);
        System.out.println(queue);

        queue.poll();


        System.out.println(queue);
        System.out.println(queue.peek());
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque);




    }
}
