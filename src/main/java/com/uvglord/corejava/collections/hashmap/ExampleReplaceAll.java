package com.uvglord.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/*
 *  HashMap replaceAll method can be used to replace each entry’s value 
 *  with the result of invoking the given function on that entry. 
 *  This method is added in Java 8 and we can use lambda expressions for this method argument.
 *
 */
public class ExampleReplaceAll {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", null);
        map.put(null, "100");

        System.out.println("map before replaceAll = " + map);
        BiFunction<String, String, String> biFunction = new MyBiFunction();
        map.replaceAll(biFunction);
        System.out.println("map after replaceAll = " + map);

        // replace all using lambda
        map.replaceAll((k, v) -> {
            if (k != null)
                return k + v;
            return v;
        });

        System.out.println("map after replaceAll lambda function = " + map);
    }

}

class MyBiFunction implements BiFunction<String, String, String> {
    @Override
    public String apply(String t, String u) {
        if (t != null)
            return t + u;
        return u;
    }
}
