package com.uvglord.corejava.oopsbasic;

public class OverloadingCalculation2 {
	void sum(int a, long b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, int b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculation2 obj = new OverloadingCalculation2();
		obj.sum(20000L, 20000);// now long arg sum() method gets invoked
	}
}
