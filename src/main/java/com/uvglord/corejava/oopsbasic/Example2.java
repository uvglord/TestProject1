package com.uvglord.corejava.oopsbasic;

/*
 * main method check
 */
public class Example2 {

	void print(){
		System.out.println("print");
	}
}
class Example3{
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.print();
	}
}
