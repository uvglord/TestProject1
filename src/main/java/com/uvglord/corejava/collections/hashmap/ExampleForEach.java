package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
 * HashMap forEach method is introduced in Java 8. 
 * It’s a very useful method to perform the given action for each entry in the map 
 * until all entries have been processed or the action throws an exception.
 */
public class ExampleForEach {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");

        BiConsumer<String, String> action = new MyBiConsumer();
        map.forEach(action);

        // lambda expression example
        System.out.println("\nHashMap forEach lambda example\n");
        map.forEach((k, v) -> {
            System.out.println("Key = " + k + ", Value = " + v);
        });
    }

}

class MyBiConsumer implements BiConsumer<String, String>{
    @Override
    public void accept(String t, String u) {
        System.out.println("key "+t);
        System.out.println("value "+u);
    }
}
