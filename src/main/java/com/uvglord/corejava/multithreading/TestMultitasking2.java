package com.uvglord.corejava.multithreading;

public class TestMultitasking2 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("Task one..");
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("Task two..");
			}
		};
		
		t1.start();t2.start();
	}
}
