package com.uvglord.corejava.innerclass;

public class LocalInner1 {
	private int data=30;
	void display() {
		final int dat = 40;
		class Local {
			private int datat = 30;
			void msg() {System.out.println("local inner "+data+"-"+dat+"-"+datat);}
		}
		Local l = new Local();
		l.msg();
	}
	
	public static void main(String[] args) {
		LocalInner1 l1 = new LocalInner1();
		l1.display();
	}

}
