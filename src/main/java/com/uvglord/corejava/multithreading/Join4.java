package com.uvglord.corejava.multithreading;

public class Join4 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("First task started");
				System.out.println("Sleeping for 2 seconds");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("First task completed");
			}
		});

		Thread t2 = new Thread(() -> System.out.println("Second task completed"));
		
		t1.start();
		t1.join();
		System.out.println("t1 t2");
		t2.start();

	}

}
