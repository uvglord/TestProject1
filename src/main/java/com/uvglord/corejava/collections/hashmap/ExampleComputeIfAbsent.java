package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/*
 * HashMap computeIfAbsent method computes the value only if key is not present in the map. 
 * After computing the value, it’s put in the map if it’s not null.
 */
public class ExampleComputeIfAbsent {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "10");
        map.put("2", "20");
        map.put("3", null);
        map.put(null, "100");
        
        Function<String, String> function = new MyFunction();
        map.computeIfAbsent("4", function);//key not present
        map.computeIfAbsent("2", function);//key already present
        
        //lamda way
        map.computeIfAbsent("5", v->{return v;});
        map.computeIfAbsent("6", v->{return null;});//null value won't get inserted
        
        System.out.println(map);
    }

}

class MyFunction implements Function<String, String>{
    @Override
    public String apply(String t) {
        return t;
    }
}


