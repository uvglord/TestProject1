package com.uvglord.corejava.multithreading;

public class TestShutdownHook2 {

	//test anonymous thread for shutdown hook
	public static void main(String[] args) throws InterruptedException {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("shutdown hook task completed..");
			}
		});
		System.out.println("Now main sleeping...");
		Thread.sleep(1000);
	}
}
