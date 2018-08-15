package com.uvglord.corejava.multithreading;

public class Create2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread t1 is running");
	}
	
	public static void main(String[] args) {
		Create2 target = new Create2();
		//t1.run(); will run directly, not creating a thread
		Thread t = new Thread(target);
		t.start();//always call start
		new Thread(target).start();
	}
}
