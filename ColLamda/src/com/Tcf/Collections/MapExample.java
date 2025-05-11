package com.Tcf.Collections;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        System.out.println(hashMap.get(1));
        hashMap.remove(2);
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Apple"));
        hashMap.clear();

        // LinkedHashMap
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("India", "Delhi");
        linkedHashMap.put("USA", "DC");
        System.out.println(linkedHashMap.get("India"));
        linkedHashMap.replace("India", "New Delhi");
        linkedHashMap.clear();

        // TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Math", 90);
        treeMap.put("Science", 85);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        treeMap.clear();

        // Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Pen");
        hashtable.put(2, "Pencil");
        hashtable.remove(2);
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.contains("Pen"));
        hashtable.clear();
    }
}


