package com.uvglord.corejava.innerclass;

public class TestAnonymousInner {

	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void eat() {
				System.out.println("custom eat");
			}
		};
		p.eat();
	}
}

abstract class Person{
	abstract void eat();
}
