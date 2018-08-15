package com.uvglord.corejava.multithreading.synchronization;

class Table4{
	synchronized static void printTable(int n) {//now class level lock
	//void printTable(int n) {//method not synchronized
	//synchronized void printTable(int n) {//method synchronized
		//synchronized (this) {//synchronized block
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		//}
	}
}

public class TestSync4StaticAnonymous {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				Table4.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				Table4.printTable(10);
			}
		};
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				Table4.printTable(20);
			}
		};
		
		Thread t4 = new Thread() {
			@Override
			public void run() {
				Table4.printTable(30);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
