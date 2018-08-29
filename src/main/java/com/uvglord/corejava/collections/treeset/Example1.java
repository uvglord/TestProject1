package com.uvglord.corejava.collections.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*
 * Java TreeSet class implements the Set interface that uses a tree for storage. 
 * It inherits AbstractSet class and implements NavigableSet interface. 
 * The objects of TreeSet class are stored in ascending order.
 * It maintains ascending order & access and retrieval times are quiet fast.
 */
public class Example1 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Dominos");
		tree.add("MacD");
		tree.add("Burger King");
		
		tree.forEach(e->System.out.println(e));
		
		List<String> list = new ArrayList<String>();
		list.add("KFC");
		list.add("Pizza Hut");
		list.add("Haristo");
		tree.addAll(list);tree.addAll(list);
		
		System.out.println("\nNew Tree");
		tree.forEach(e->System.out.println(e));
		
	}
}
