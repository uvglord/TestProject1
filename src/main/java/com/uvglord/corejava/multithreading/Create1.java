package com.uvglord.corejava.multithreading;

public class Create1 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread t1 is running");
		System.out.println(Thread.currentThread().getState().name());
	}
	
	public static void main(String[] args) {
		Create1 t1 = new Create1();
		t1.run();//this will not create a thread
		t1.start();
		System.out.println(Thread.currentThread().getState().name());
	}
}
