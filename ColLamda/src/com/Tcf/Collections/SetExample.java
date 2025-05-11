package com.Tcf.Collections;

import java.util.*;

class SetExample {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.remove("Blue");
        System.out.println(hashSet.contains("Red"));
        hashSet.addAll(List.of("Green", "Yellow"));
        hashSet.clear();

        // LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.remove(10);
        System.out.println(linkedHashSet.contains(20));
        linkedHashSet.clear();

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.ceiling(30));
        System.out.println(treeSet.floor(45));
        System.out.println(treeSet.headSet(40));
        System.out.println(treeSet.tailSet(40));
    }
}
