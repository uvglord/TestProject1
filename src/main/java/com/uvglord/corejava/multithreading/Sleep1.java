package com.uvglord.corejava.multithreading;

public class Sleep1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.err.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" ->"+ i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sleep1 s1 = new Sleep1();
		Sleep1 s2 = new Sleep1();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		Thread.sleep(2500);
		//below run method will execute as main thread and will run 1 by 1
		System.out.println(t1.isAlive()?"Thread t1 alive":"Thread t1 dead");
		t1.run();
		System.out.println(t2.isAlive()?"Thread t2 alive":"Thread t2 dead");
		t2.run();
		System.out.println("daemon "+t2.isDaemon());
	}
}
