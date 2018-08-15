package com.uvglord.corejava.multithreading;

public class Join2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " ->" + i);
		}
	}

	public static void main(String[] args) {
		Thread j1 = new Thread(new Join2());
		Thread j2 = new Thread(new Join2());
		Thread j3 = new Thread(new Join2());

		System.out.println("Name of j1:" + j1.getName());
		System.out.println("Name of j2:" + j2.getName());
		System.out.println("Name of j3:" + j3.getName());

		j1.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		j2.start();
		j3.start();
	}
}