package com.uvglord.corejava.oopsbasic;

public class CallByValue {

	int data = 50;
	
	void change(int data) {
		data +=100;
		System.out.println(data);
	}
	
	//In case of call by value original value is not changed
	public static void main(String[] args) {
		CallByValue value = new CallByValue();
		System.out.println("after "+value.data);
		value.change(value.data);
		System.out.println("before "+value.data);
	}
}
