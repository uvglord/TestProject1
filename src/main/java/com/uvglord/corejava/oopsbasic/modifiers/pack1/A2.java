package com.uvglord.corejava.oopsbasic.modifiers.pack1;

public class A2 extends A1{

	@Override
	protected void n() {
		super.n();
	}
	
	@Override
	void m() {
		super.m();
	}
	
	@Override
	public void o() {
		super.o();
	}
	
	public static void main(String[] args) {
		A a = new A();
		//a.l(); not accessible as its a private method
		a.m();
		a.n();
		a.o();
		
		A1 a1 = new A2();
		a1.m();
		a1.n();
		a1.o();
	}
}