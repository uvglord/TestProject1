package com.uvglord.corejava.collections.enummap;

import java.util.EnumMap;

public class Example2 {
	
	public enum Key{
		One, Two, Three
	};
	
	public static void main(String[] args) {
		//create and populate enum map
		EnumMap<Key, Book> map = new EnumMap<>(Key.class);
		map.put(Key.One, new Book(101,"Let us C","Yashwant Kanetkar","BPB",8));
		map.put(Key.Two, new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
		map.put(Key.Three, new Book(103,"Operating System","Galvin","Wiley",6));
		
		//print the map
		map.entrySet().forEach(e->System.out.println(e.getKey().name()+"->"+e.getValue()));
	}

}

class Book {

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
	public String toString() {
		return id+" "+name+" "+author+" "+publisher+" "+quantity;
	}

}
