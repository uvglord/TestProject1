package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * If you want to apply a function on all the mappings based on it’s key and value, then compute method should be used. 
 * If there is no mapping and this method is used, value will be null for compute function.
 */
public class ExampleCompute {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put(null, "10");
        map.put("10", null);
        System.out.println("map before "+map);
        for(String key:map.keySet()){
            map.compute(key, (k,v)->{return k+v;});
        }
        map.compute("5", (k,v)->{return k+v;});//key not present, v = null
        System.out.println("map after "+map);
    }

}
