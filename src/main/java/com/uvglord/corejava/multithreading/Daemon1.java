package com.uvglord.corejava.multithreading;

public class Daemon1 extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()) 
			System.out.println("Daemon Thread");
		else
			System.out.println("User Thread");
	}
	
	public static void main(String[] args) {
		Daemon1 t1 = new Daemon1();
		Daemon1 t2 = new Daemon1();
		Daemon1 t3 = new Daemon1();
		t2.setDaemon(true);
		t1.start();t2.start();t3.start();
	}
}
