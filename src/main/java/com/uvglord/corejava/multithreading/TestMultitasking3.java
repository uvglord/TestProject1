package com.uvglord.corejava.multithreading;

public class TestMultitasking3 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task one..");
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task two..");
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);		
		
		t1.start();
		t2.start();
	}
}
