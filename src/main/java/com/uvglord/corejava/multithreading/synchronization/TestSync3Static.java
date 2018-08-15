package com.uvglord.corejava.multithreading.synchronization;

class Table3{
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

class MyStaticThread1 extends Thread{
	Table3 t;
	public MyStaticThread1(Table3 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		Table3.printTable(5);
	}
}

class MyStaticThread2 extends Thread{
	Table3 t;
	public MyStaticThread2(Table3 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		Table3.printTable(10);
	}
}

class MyStaticThread3 extends Thread{
	Table3 t;
	public MyStaticThread3(Table3 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		Table3.printTable(20);
	}
}

class MyStaticThread4 extends Thread{
	Table3 t;
	public MyStaticThread4(Table3 t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		Table3.printTable(30);
	}
}

public class TestSync3Static {

	public static void main(String[] args) {
		Table3 tab1 = new Table3();
		Table3 tab2 = new Table3();
		MyStaticThread1 t1 = new MyStaticThread1(tab1);
		MyStaticThread2 t2 = new MyStaticThread2(tab1);
		MyStaticThread3 t3 = new MyStaticThread3(tab2);
		MyStaticThread4 t4 = new MyStaticThread4(tab2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
