package com.uvglord.corejava.oopsbasic.wrapper;

public class WrapperExample1 {

	//Primitive to Wrapper
	public static void main(String[] args) {
		
		//Converting int to Integer
		int a=20;
		Integer i = Integer.valueOf(a);//converting int into Integer
		Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);
	}
}
