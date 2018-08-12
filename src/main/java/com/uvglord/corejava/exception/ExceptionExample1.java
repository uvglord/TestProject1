package com.uvglord.corejava.exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		arithmeticEx();
		nullPointerEx();
		arrayIndexOutOfBoundEx();
		numberFormatEx();
	}
	
	static void arithmeticEx() {
		try {
			int data=100/0;
			System.out.println(data);
		}catch(ArithmeticException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
	}
	
	@SuppressWarnings("null")
	static void nullPointerEx() {
		try {
			String s=null;  
			System.out.println(s.length());//NullPointerException  
		}catch(NullPointerException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
	}
	
	static void numberFormatEx() {
		try {
			String s="abc";  
			int i=Integer.parseInt(s);//NumberFormatException    
			System.out.println(i);
		}catch(NumberFormatException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
	}
	
	static void arrayIndexOutOfBoundEx() {
		try {
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException   
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
	}

}
