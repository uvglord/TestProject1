package com.uvglord.corejava.multithreading.synchronization;

class Table2{
	void printTable(int n) {//method not synchronized
	//synchronized void printTable(int n) {//method synchronized
		synchronized (this) {//synchronized block
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class TestSync2Anonymous {

	public static void main(String[] args) {
		
		Table2 obj = new Table2();//only one object
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				obj.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				obj.printTable(100);
			}
		};
		
		t1.start();
		t2.start();
	}
}
