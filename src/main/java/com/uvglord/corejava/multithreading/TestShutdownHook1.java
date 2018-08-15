package com.uvglord.corejava.multithreading;

class MyShutdownThread extends Thread{
	@Override
	public void run() {
		System.out.println("shutdown hook task completed");
	}
}

public class TestShutdownHook1 {

	public static void main(String[] args) throws InterruptedException {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyShutdownThread());
		System.out.println("Now main sleeping...");
		Thread.sleep(1000);
	}
}
