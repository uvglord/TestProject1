package com.uvglord.corejava.multithreading;

public class Join2LongMillis extends Thread{
	
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
		Join2LongMillis j1 = new Join2LongMillis();
		Join2LongMillis j2 = new Join2LongMillis();
		Join2LongMillis j3 = new Join2LongMillis();
		
		j1.start();
		try {
			//both join and sleep working here in same fashion
			j1.join(1500);
			//Thread.sleep(1500);
		}catch(InterruptedException e) {
			System.err.println(e);
		}
		j2.start();
		j3.start();
		
		
	}

}
