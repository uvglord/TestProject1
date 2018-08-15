package com.uvglord.corejava.multithreading;

public class Priority1 extends Thread{

	String name;
	public Priority1(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println("Name "+Thread.currentThread().getName());
		System.out.println("Priority "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Priority1 p1 = new Priority1("p1");
		Priority1 p2 = new Priority1("p2");
		Priority1 p3 = new Priority1("p3");
		Priority1 p4 = new Priority1("p4");
		Priority1 p5 = new Priority1("p5");
		p1.setPriority(MIN_PRIORITY);
		p2.setPriority(NORM_PRIORITY);
		p3.setPriority(8);
		p4.setPriority(2);
		p5.setPriority(MAX_PRIORITY);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
}
