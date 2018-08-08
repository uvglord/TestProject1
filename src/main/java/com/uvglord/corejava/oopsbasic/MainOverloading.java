package com.uvglord.corejava.oopsbasic;

public class MainOverloading {

	public static void main(String[] args) {
		System.out.println("[]args");
		main("");
	}
	
	public static void main(String args) {
		System.out.println("args");
		main();
	}
	
	public static void main() {
		System.out.println("no args");
	}
}
