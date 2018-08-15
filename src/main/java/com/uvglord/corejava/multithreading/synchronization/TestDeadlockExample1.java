package com.uvglord.corejava.multithreading.synchronization;

public class TestDeadlockExample1 {
	public static void main(String[] args) {
		final String resource1 = "resource1";
		final String resource2 = "resource2";

		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("locked resource1, going to lock resource2");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("locked resource2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("locked resource2, going to lock resource1");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("locked resource1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}