package com.uvglord.corejava.multithreading;

public class Yield2 extends Thread {

	public static void main(String[] args) {
		Thread producer = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I am Producer : Produced Item " + i);
					Thread.yield();
				}
			}
		};
		Thread consumer = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I am Consumer : Consumed Item " + i);
					Thread.yield();
				}
			}
		};
		
		producer.setPriority(MIN_PRIORITY);
		consumer.setPriority(MAX_PRIORITY);
		
		producer.start();
		consumer.start();
	}

}
