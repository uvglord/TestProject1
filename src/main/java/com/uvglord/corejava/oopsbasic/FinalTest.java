package com.uvglord.corejava.oopsbasic;

public class FinalTest extends Bike{
	
	final int speedLimit;
	static final int data;
	FinalTest() {
		//speedLimit=30;
	}
	{speedLimit=20;}
	static {data=30;}
	
//void run(){};
}
//final
class Bike {
	final void run() {System.out.println("run ");};
}
