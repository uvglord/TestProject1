package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

/*
 * If the specified key is not present or is associated with null, 
 * then associates it with the given non-null value. 
 * Otherwise, replaces the associated value with the results of the given re mapping function, 
 * or removes if the result is null.
 */
public class ExampleMerge{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put(null, "10");
        map.put("10", null);
        System.out.println("map before "+map);
        for(String key:map.keySet()){
            String value = map.get(key);
            //merge throws NullPointerException if key or value is null
            if(key != null && value != null) 
                map.merge(key, value, (k,v)->{return k+v;});
        }
        System.out.println("map after "+map);
    }

}
