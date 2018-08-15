package com.uvglord.corejava.multithreading.synchronization;

class Table1{
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

class MyThread1 extends Thread{
	Table1 t;
	public MyThread1(Table1 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table1 t;
	public MyThread2(Table1 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		t.printTable(100);
	}
}

public class TestSync1 {

	public static void main(String[] args) {
		Table1 t = new Table1();
		MyThread1 t1 = new MyThread1(t);
		MyThread2 t2 = new MyThread2(t);
		t1.start();
		t2.start();
	}
}
