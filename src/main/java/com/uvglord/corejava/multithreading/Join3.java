package com.uvglord.corejava.multithreading;

public class Join3 extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running...");
	}

	public static void main(String[] args) {
		Join3 t1 = new Join3();
		Join3 t2 = new Join3();

		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());

		t1.start();
		t2.start();

		t1.setName("Oracle password");
		System.out.println("After changing name of t1:" + t1.getName());

	}

}
