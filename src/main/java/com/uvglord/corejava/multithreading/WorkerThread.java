package com.uvglord.corejava.multithreading;

import static java.lang.Thread.currentThread;

public class WorkerThread implements Runnable {

	private String msg;
	
	public WorkerThread(String message) {
		this.msg=message;
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"(Start) message "+msg);
		processMessage();
		System.out.println(currentThread().getName()+"(End) "+msg);
	}

	private void processMessage() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
