package com.uvglord.corejava.multithreading.creation;

public class Thread1 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread t1 is running");
	}
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.run();//this will not create a thread
		t1.start();
	}
}
