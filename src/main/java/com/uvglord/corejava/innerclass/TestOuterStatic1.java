package com.uvglord.corejava.innerclass;

public class TestOuterStatic1 {
	private static int data = 30;
	int dat = 40;
	static class Inner{
		// can not access dat, due to non static
		int datat=50;
		static int datata = 60;
		void msg() {System.out.println(data+"-"+datat+"-"+datata);}
		static void mg() {System.out.println(data+"-"+datata);}
	}
	
	public static void main(String[] args) {
		TestOuterStatic1.Inner.mg();//no object creating is required
		TestOuterStatic1.Inner t1 = new TestOuterStatic1.Inner();
		t1.msg();
	}

}
