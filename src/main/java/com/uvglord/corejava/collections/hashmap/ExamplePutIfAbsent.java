package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExamplePutIfAbsent {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");

        System.out.println("map before putIfAbsent = " + map);
        String value = map.putIfAbsent("1", "4");
        System.out.println("map after putIfAbsent = " + map);
        System.out.println("putIfAbsent returns: " + value);

        System.out.println("map before putIfAbsent = " + map);
        value = map.putIfAbsent("3", "3");
        System.out.println("map after putIfAbsent = " + map);
        System.out.println("putIfAbsent returns: " + value);
    }

}
