package com.uvglord.corejava.multithreading.synchronization;

public class TestInterruptingThread2 extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Thread interruption handled..."+e);  
		}
		System.out.println("thread is running...");
	}
	
	public static void main(String[] args) {
		TestInterruptingThread2 t1 = new TestInterruptingThread2();
		t1.start();
		try {
			t1.interrupt();
		}catch(Exception e) {
			System.out.println("Exception handled -> "+e);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task complete");
	}
}
