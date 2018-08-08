package com.uvglord.corejava.oopsbasic.modifiers.pack1;

public class A {
	private void l() {System.out.println("A-L");}
	void m() {l();System.out.println("A-M");}
	protected void n() {System.out.println("A-N");}
	public void o() {System.out.println("A-O");} 
}

class A1{
	private void l() {System.out.println("A1-L");}
	void m() {System.out.println("A1-M");}
	protected void n() {l(); System.out.println("A1-N");}
	public void o() {System.out.println("A1-O");} 
}