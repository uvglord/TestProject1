package com.uvglord.corejava.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("1", "1");//put example
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", null);//null value
        map.put(null, "100");//null key
        
        System.out.println("Key = 3, value = "+map.get("3"));
        System.out.println("Key = 5, value = "+map.getOrDefault("5", "Default value"));
        System.out.println("keyExists=" + map.containsKey(null) + ", valueExists=" + map.containsValue(null));
        System.out.println("map size = "+map.size());
        
        Map<String, String> map1 = new HashMap<>(map);
        System.out.println("map1 mappings "+map1);
        System.out.println("map1 null key value = " + map1.remove(null));
        System.out.println("map1 after removing null key = " + map1);
        
        Set<String> set = map.keySet();
        System.out.println("Map keys : "+set);
        
        Collection<String> values = map.values();
        System.out.println("Map values : "+values);
        
        map.clear();
        System.out.println("map is empty = "+map.isEmpty());
        
    }

}
