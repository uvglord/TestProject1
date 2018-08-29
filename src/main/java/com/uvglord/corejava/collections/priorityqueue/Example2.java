package com.uvglord.corejava.collections.priorityqueue;

import java.util.PriorityQueue;

public class Example2 {
	/*
	 * For custom class, the class should implement comparable
	 */
	public static void main(String[] args) {
		PriorityQueue<Book> queue = new PriorityQueue<>();
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		queue.add(b1);
		queue.add(b3);
		queue.add(b2);
		System.out.println("top element -> "+queue.element()+"\nlist");
		queue.forEach(e->System.out.println(e));

	}

}

class Book implements Comparable<Book> {

	int id, quantity;
	String name, author, publisher;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book o) {
		if (id > o.id)
			return 1;
		else if (id < o.id)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+author+" "+publisher+" "+quantity;
	}

}