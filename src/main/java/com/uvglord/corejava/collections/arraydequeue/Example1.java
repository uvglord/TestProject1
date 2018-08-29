package com.uvglord.corejava.collections.arraydequeue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>(getNameList());
		deque.addLast("last");
		deque.addFirst("First");
		deque.forEach(e -> System.out.println(e));
	}

	private static List<String> getNameList() {
		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Cat");
		list.add("Ball");
		list.add("Doll");
		list.add("Frog");
		list.add("Elephant");

		return list;
	}
}
