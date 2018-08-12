package com.uvglord.corejava.innerclass;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}


public class TestNestedInterface1 implements Showable.Message{

	@Override
	public void msg() {
		System.out.println("Message");
	}
	
	public static void main(String[] args) {
		Showable.Message message = new TestNestedInterface1();
		message.msg();
	}
}

