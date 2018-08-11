package com.uvglord.corejava.oopsbasic.wrapper;

public class WrapperExample2 {

	//Wrapper to Primitive
	public static void main(String[] args) {
		
		//Converting Integer to int
		Integer a = new Integer(3);
		int i = a.intValue();//converting Integer to int 
		int j = a;//unboxing, now compiler will write a.intValue() internally
		
		System.out.println(a+", "+i+", "+j);
		System.out.println(a.hashCode());
	}
}
