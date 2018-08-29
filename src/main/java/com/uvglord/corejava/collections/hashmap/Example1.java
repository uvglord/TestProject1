package com.uvglord.corejava.collections.hashmap;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
        
        HashMap<String, String> map = new HashMap<>();
        map = new HashMap<>(4^2);
        map = new HashMap<>(16, 0.9f);
        map.put("test", "123");
        Map<String,String> map4 = new HashMap<>(map);
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);
        Object[] table = (Object[]) tableField.get(map4);
        System.out.println(table == null ? 0 : table.length);
        
    }

}
