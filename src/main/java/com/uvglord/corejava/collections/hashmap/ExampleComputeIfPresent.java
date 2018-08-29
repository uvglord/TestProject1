package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/*
 * Java HashMap computeIfPresent method recomputes the value if the specified key is present and value is not-null. 
 * If the function returns null, the mapping is removed.
 */
public class ExampleComputeIfPresent {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "10");
        map.put("2", "20");
        map.put(null, "100");
        map.put("10", null);
        System.out.println("map before computeIfPresent = " + map);
        
        BiFunction<String, String, String> bifunction = new MyBiFunction1();
        for(String key:map.keySet()){
            map.computeIfPresent(key, bifunction);
        }
        System.out.println("map after computeIfPresent = " + map);
        
        //lambda way
        map.computeIfPresent("1", (k,v)->{return k+v;});
        
        System.out.println("map after lambda computeIfPresent = " + map);
    }

}

class MyBiFunction1 implements BiFunction<String, String, String>{
    @Override
    public String apply(String t, String u) {
        return t+u;
    }
}


