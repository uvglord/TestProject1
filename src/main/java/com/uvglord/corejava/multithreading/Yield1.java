package com.uvglord.corejava.multithreading;

public class Yield1 extends Thread{
	
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
	
	public static void main(String[] args) {
		Yield1 j1 = new Yield1();
		Yield1 j2 = new Yield1();
		Yield1 j3 = new Yield1();
		
		j1.start();
		j1.yield();
		j2.start();
		j3.start();
		
		
	}

}
