package com.uvglord.corejava.collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> langauges = new ArrayList<>();
        langauges.add("C");
        langauges.add("Core Java");
        langauges.add("Advanced Java");
        System.out.println("initial values");
        langauges.forEach(e->System.out.print(e+", "));
        Collections.addAll(langauges,"Servlet", "JSP");
        System.out.println("\nAfter adding elements collection value:");
        langauges.forEach(e->System.out.print(e+", "));
        String[] arr = {"C#", ".Net"};
        Collections.addAll(langauges, arr);
        System.out.println("\nAfter adding array collection value:");
        langauges.forEach(e->System.out.print(e+", "));
    }

}
