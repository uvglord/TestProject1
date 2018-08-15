package com.uvglord.corejava.multithreading;

public class Sleep2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.err.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Sleep2 s1 = new Sleep2();
		Sleep2 s2 = new Sleep2();
		s1.start();
		s2.start();
	}
}
