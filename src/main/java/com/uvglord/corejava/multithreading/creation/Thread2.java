package com.uvglord.corejava.multithreading.creation;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread t1 is running");
	}
	
	public static void main(String[] args) {
		Thread2 target = new Thread2();
		//t1.run(); will run directly, not creating a thread
		Thread t = new Thread(target);
		t.start();//always call start
		
	}
}
