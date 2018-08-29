package com.uvglord.corejava.collections.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/*
 * Java LinkedHashSet class is a Hash table and Linked list implementation of the set interface. 
 * It inherits HashSet class and implements Set interface.
 * Additionally, it maintains insertion order
 */
public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("new");
		list.add("old");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("After");
		set.add("before");
		set.addAll(set);
		set.addAll(list);
		set.add("Present");
		set.add("Future");
		
		list.addAll(set);
		list.addAll(4,set);
		
		System.out.println("Set : ->");
		set.stream().forEach(e ->System.out.println(e));

		System.out.println("\n List : ->");
		list.forEach(e-> System.out.println(e));
	}

}
