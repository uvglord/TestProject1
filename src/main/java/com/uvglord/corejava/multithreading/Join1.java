package com.uvglord.corejava.multithreading;

public class Join1 extends Thread{
	
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
		Join1 j1 = new Join1();
		Join1 j2 = new Join1();
		Join1 j3 = new Join1();
		
		j1.start();
		try {
			j1.join();
		}catch(InterruptedException e) {
			System.err.println(e);
		}
		j2.start();
		j3.start();
		
		
	}

}
