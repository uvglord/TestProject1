package com.uvglord.corejava.multithreading.synchronization.interthreadcommunication;

class Customer2{
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw.."+amount);
		System.out.println("current balance "+this.amount);
		boolean withdrawn=false;
		while(!withdrawn) {
			if(this.amount<amount) {
				System.out.println("Less balance, waiting for deposit...");
				try {
					wait();
					withdraw(amount);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.amount-=amount;
				withdrawn=true;
				System.out.println("withdraw completed");
			}else {
				this.amount-=amount;
				withdrawn=true;
				System.out.println("withdraw completed");
			}
		}
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit.."+amount);
		System.out.println("current balance. "+this.amount);
		this.amount+=amount;
		System.out.println("deposit completed...");
		System.out.println("updated balance. "+this.amount);
		notify();
	}
}
public class Test2 {
	public static void main(String[] args) {
		final Customer2 c = new Customer2();
		new Thread() {
			@Override
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c.deposit(1000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c.deposit(1000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c.deposit(1000);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c.deposit(4000);
			}
		}.start();
	}

}
