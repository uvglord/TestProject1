package com.uvglord.corejava.oopsbasic;

public class OverloadingCalculation {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculation obj = new OverloadingCalculation();
		obj.sum(20000, 20000L);// now long arg sum() method gets invoked
	}
}
