package com.uvglord.corejava.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Java HashMap values method returns a Collection view of the values in the Map. 
 * This collection is backed by HashMap, 
 * so any changes in HashMap will reflect in values collection and vice versa
 */
public class ExampleKeyValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", null);
        map.put("4", null);
        map.put(null, "100");

        Collection<String> values = map.values();
        System.out.println("map values = " + values);

        map.remove(null);
        System.out.println("map values after removing null key = " + values);

        map.put("5", "5");
        System.out.println("map values after put = " + values);

        System.out.println(map);
        values.remove("1"); // changing values collection
        System.out.println(map); // updates in map too}
    }
}
