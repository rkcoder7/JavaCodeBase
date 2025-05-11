package com.Tcf.Collections;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add(1, "C++");
        arrayList.remove("Python");
        arrayList.set(1, "JavaScript");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("Java"));
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.addFirst(5);
        linkedList.addLast(20);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.add(15);
        linkedList.set(0, 99);
        System.out.println(linkedList.contains(99));
        System.out.println(linkedList.getFirst());
        linkedList.clear();

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.remove("Two");
        vector.set(0, "Zero");
        System.out.println(vector.get(0));
        System.out.println(vector.contains("Zero"));
        System.out.println(vector.size());
        vector.clear();

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search(10));
        System.out.println(stack.empty());
        stack.clear();
    }
}