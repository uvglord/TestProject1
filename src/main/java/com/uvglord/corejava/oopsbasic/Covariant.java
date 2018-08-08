package com.uvglord.corejava.oopsbasic;

class A{
	
	A(){
		System.out.println("parent");
	}
	A get() {
		return this;
	}
	void message() {System.out.println("A");}
}
public class Covariant extends A{
	
	public Covariant() {
		System.out.println("child");
	}
	
	public Covariant(int x){
		this();
		System.out.println("x "+x);
	}
	
	{System.out.println("instance");}
	
	static {System.out.println("static");}
	Covariant get() {
		return this;
	}
	void message() {System.out.println("Covariant");}
	public static void main(String[] args) {
		new Covariant(10).get().message();
	}
}
