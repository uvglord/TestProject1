package com.uvglord.corejava.controlstatements.programs;

public class FibonacciExample2 {

	static int n1=0,n2=1,n3=0;
	public static void main(String[] args) {
		System.out.print(n1+", "+n2);
		printFibonacci(8);
	}
	
	static void printFibonacci(int count) {
		if(count>0) {
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
			System.out.print(", "+n3);
			printFibonacci(count-1);
		}
	}
}
