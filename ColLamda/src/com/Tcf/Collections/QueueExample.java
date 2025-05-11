package com.Tcf.Collections;
import java.util.*;
class QueueExample {
    public static void main(String[] args) {
        // PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.offer(20);
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        priorityQueue.clear();

        // ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("A");
        arrayDeque.addFirst("B");
        arrayDeque.addLast("C");
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        arrayDeque.offer("D");
        arrayDeque.clear();

        // LinkedList as Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("X");
        queue.offer("Y");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        queue.clear();
    }
}
