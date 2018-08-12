package com.uvglord.corejava.innerclass;

public class TestAnonymousInner1 {

	public static void main(String[] args) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("interface eatable");
			}
		};
		e.eat();
	}
}

interface Eatable{
	void eat();
}
