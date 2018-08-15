package com.uvglord.corejava.multithreading;

public class Priority2 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name "+Thread.currentThread().getName()+", Priority "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Thread p1 = new Thread(new Priority2(),"p1");
		Thread p2 = new Thread(new Priority2(),"p2");
		Thread p3 = new Thread(new Priority2(),"p3");
		Thread p4 = new Thread(new Priority2(),"p4");
		Thread p5 = new Thread(new Priority2(),"p5");
		p1.setPriority(1);
		p2.setPriority(5);
		p3.setPriority(8);
		p4.setPriority(2);
		p5.setPriority(10);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
