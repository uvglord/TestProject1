package com.uvglord.corejava.collections.stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		//create new stack
		Stack<Integer> lifo = new Stack<>();
		
		//let's add some int to it
		for(int i=1;i<11;i++) {
			lifo.push(i);
		}
		
		//last in first out menas reverse order
		while(!lifo.isEmpty()) {
			System.out.print(lifo.pop()+", ");
		}
		
		//empty
		System.err.print("\nempty");

	}

}
