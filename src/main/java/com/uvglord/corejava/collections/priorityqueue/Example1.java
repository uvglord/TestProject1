package com.uvglord.corejava.collections.priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Example1 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();

		// element&peek retrieves but do not remove, but poll/remove removes as well
		// peek and poll return null, if queue is empty
		// remove/element throws NoSuchElementEx if queue is empty
		System.out.println("peek : " + queue.peek());
		System.out.println("poll : " + queue.poll());
		try {System.out.println("element: " + queue.element());
		} catch (NoSuchElementException e) {System.err.println("element " + e);}
		try {System.out.println("remove : " + queue.remove());
		} catch (NoSuchElementException e) {System.err.println("remove " + e);}
		// add calls offer, for adding this element to queue
		queue.add("Zebra");
		queue.offer("Toast");
		// null not allowed
		try {queue.offer(null);
		} catch (NullPointerException e) {System.err.println("offer null " + e);}
		try {queue.addAll(getNameList());
		} catch (NullPointerException e) {System.err.println("add all including null " + e);}

		System.out.println("head element: " + queue.element());
		System.out.println("head peek: " + queue.peek());
		System.out.println("\niterate");
		queue.forEach(e -> System.out.println(e));
		System.out.println("size :" + queue.size());

		queue.removeAll(getNameList());
		System.out.println("\nupdated queue");
		queue.forEach(e -> System.out.println(e));

	}

	private static List<String> getNameList() {
		List<String> list = new ArrayList<>();

		list.add("Apple");
		list.add("Cat");
		list.add("Ball");
		list.add(null);
		list.add("Doll");
		list.add("Frog");
		list.add("Elephant");

		return list;
	}

}
