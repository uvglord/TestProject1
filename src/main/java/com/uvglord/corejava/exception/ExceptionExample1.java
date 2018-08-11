package com.uvglord.corejava.exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		try {
			int data=100/0;
			System.out.println(data);
		}catch(ArithmeticException e) {
			System.err.println(e);
			e.printStackTrace();
			System.out.println("rest of the code");
		}
	}

}
