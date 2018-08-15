package com.uvglord.corejava.multithreading.synchronization;

public class TestInterruptingThread3 extends Thread{

	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		t1.start();
		t1.interrupt();
		System.out.println("normal task complete "+t1.isInterrupted());
	}
}
