package com.uvglord.corejava.oopsbasic;

public strictfp class CallByValue2 {

	int data = 50;
	
	strictfp void m() {}
	
	strictfp void change(CallByValue2 value) {
		value.data +=100;
		System.out.println(data);
	}
	
	//In case of call by reference original value is changed
	public strictfp static void main(String[] args) {
		CallByValue2 value = new CallByValue2();
		System.out.println("after "+value.data);
		value.change(value);
		System.out.println("before "+value.data);
	}
}
